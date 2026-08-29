package org.telegram.messenger;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c10;
public final class WebProxyTransport implements b10 {
    private static final String BRIDGE_OBJECT = "TelegramWebProxy";
    private static final int DATA_CHUNK = 65536;
    private static final int FRAME_BYE = 31;
    private static final int FRAME_CLOSE = 3;
    private static final int FRAME_DATA = 2;
    private static final int FRAME_HEADER = 8;
    private static final int FRAME_HELLO = 16;
    private static final int FRAME_MAX_PAYLOAD = 1048576;
    private static final int FRAME_OPEN = 1;
    private static final int FRAME_PING = 5;
    private static final int FRAME_PONG = 6;
    private static final int FRAME_WELCOME = 17;
    private static final int FRAME_WINDOW = 4;
    private static final long INITIAL_WINDOW = 4194304;
    private static final int MAX_OUTBOUND_BYTES = 67108864;
    private static final int MAX_OUTBOUND_ITEMS = 8192;
    private static final int MAX_STREAMS = 64;
    private static WebProxyTransport instance;
    private static final Object staticLock = new Object();
    private final String androidNonce;
    private final String bridgeUrl;
    private boolean carrierConnected;
    private final String host;
    private final String origin;
    private int outboundBytes;
    private n2.a replyProxy;
    private boolean restartScheduled;
    private final String secret;
    private final ServerSocket serverSocket;
    private boolean stopped;
    private WebView webView;
    private final Object lock = new Object();
    private final ExecutorService ioExecutor = Executors.newCachedThreadPool();
    private final ExecutorService carrierExecutor = Executors.newSingleThreadExecutor();
    private final AtomicInteger nextStreamId = new AtomicInteger(1);
    private final Map<Integer, Stream> streams = new HashMap();
    private final ArrayDeque<byte[]> outbound = new ArrayDeque<>();

    public static final class Stream {
        private final int f19647id;
        private boolean opened;
        private long receiveWindow;
        private long sendWindow;
        private final Socket socket;

        public static long access$414(Stream stream, long j10) {
            long j11 = stream.sendWindow + j10;
            stream.sendWindow = j11;
            return j11;
        }

        public static long access$422(Stream stream, long j10) {
            long j11 = stream.sendWindow - j10;
            stream.sendWindow = j11;
            return j11;
        }

        public static long access$714(Stream stream, long j10) {
            long j11 = stream.receiveWindow + j10;
            stream.receiveWindow = j11;
            return j11;
        }

        public static long access$722(Stream stream, long j10) {
            long j11 = stream.receiveWindow - j10;
            stream.receiveWindow = j11;
            return j11;
        }

        private Stream(int i10, Socket socket) {
            this.sendWindow = 4194304L;
            this.receiveWindow = 4194304L;
            this.f19647id = i10;
            this.socket = socket;
        }
    }

    private WebProxyTransport(String str, String str2, byte[] bArr) {
        this.host = str;
        this.secret = str2;
        String e10 = u3.c.e("https://", str);
        this.origin = e10;
        String randomToken = randomToken(32);
        this.androidNonce = randomToken;
        String e11 = u3.c.e("tdesktop-web-proxy-bridge-v1\n", str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString = Base64.encodeToString(mac.doFinal(e11.getBytes(StandardCharsets.UTF_8)), 11);
        this.bridgeUrl = e10 + "/?bridge=" + encodeToString + "#android=" + randomToken;
        this.serverSocket = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public void acceptLoop() {
        while (true) {
            try {
                Socket accept = this.serverSocket.accept();
                accept.setTcpNoDelay(true);
                synchronized (this.lock) {
                    if (!this.stopped && this.streams.size() < 64) {
                        int allocateStreamId = allocateStreamId();
                        Stream stream = new Stream(allocateStreamId, accept);
                        this.streams.put(Integer.valueOf(allocateStreamId), stream);
                        if (this.carrierConnected) {
                            stream.opened = true;
                            sendFrame(1, allocateStreamId, null);
                        }
                        this.ioExecutor.execute(new d3(11, this, stream));
                    }
                    closeSocket(accept);
                }
            } catch (Exception e10) {
                synchronized (this.lock) {
                    try {
                        if (this.stopped) {
                            return;
                        }
                        FileLog.e(e10);
                        failCarrier();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private int allocateStreamId() {
        while (true) {
            int andUpdate = DesugarAtomicInteger.getAndUpdate(this.nextStreamId, new Object());
            if (andUpdate != 0 && !this.streams.containsKey(Integer.valueOf(andUpdate))) {
                return andUpdate;
            }
        }
    }

    private static void closeSocket(Socket socket) {
        try {
            socket.close();
        } catch (Exception unused) {
        }
    }

    private void closeStream(Stream stream, boolean z10) {
        boolean z11;
        synchronized (this.lock) {
            try {
                if (this.streams.get(Integer.valueOf(stream.f19647id)) != stream) {
                    return;
                }
                this.streams.remove(Integer.valueOf(stream.f19647id));
                if (z10 && this.carrierConnected && stream.opened) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.lock.notifyAll();
                closeSocket(stream.socket);
                if (z11) {
                    sendFrame(3, stream.f19647id, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void createWebView() {
        o2.m mVar;
        synchronized (this.lock) {
            try {
                if (!this.stopped && this.webView == null) {
                    c10 c10Var = c10.getInstance();
                    if (c10Var != null && c10Var.isBackground()) {
                        this.restartScheduled = true;
                        return;
                    }
                    this.restartScheduled = false;
                    destroyWebView();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        this.webView = webView;
                        webView.setBackgroundColor(0);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(false);
                        settings.setDatabaseEnabled(false);
                        settings.setAllowFileAccess(false);
                        settings.setAllowContentAccess(false);
                        settings.setCacheMode(2);
                        settings.setJavaScriptCanOpenWindowsAutomatically(false);
                        settings.setSupportMultipleWindows(false);
                        settings.setGeolocationEnabled(false);
                        settings.setMediaPlaybackRequiresUserGesture(true);
                        int i10 = Build.VERSION.SDK_INT;
                        settings.setMixedContentMode(1);
                        if (i10 >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new WebViewClient() {
                            {
                                WebProxyTransport.this = this;
                            }

                            @Override
                            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                                if (webResourceRequest.isForMainFrame()) {
                                    WebProxyTransport.this.failWebView(webView2);
                                }
                            }

                            @Override
                            public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                                if (webResourceRequest.isForMainFrame()) {
                                    WebProxyTransport.this.failWebView(webView2);
                                }
                            }

                            @Override
                            public void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                                sslErrorHandler.cancel();
                                WebProxyTransport.this.failWebView(webView2);
                            }

                            @Override
                            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                                WebProxyTransport.this.failWebView(webView2);
                                return true;
                            }

                            @Override
                            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                                if (webResourceRequest.isForMainFrame() && !WebProxyTransport.this.isBridgeNavigation(webResourceRequest.getUrl())) {
                                    return true;
                                }
                                return false;
                            }
                        });
                        HashSet hashSet = new HashSet();
                        hashSet.add(this.origin);
                        d dVar = new d(this, 15);
                        boolean z10 = n2.c.f17094a;
                        if (o2.k.f19065c.b()) {
                            if (o2.k.d.b() && n2.c.f17094a) {
                                WeakHashMap weakHashMap = n2.c.f17095b;
                                mVar = (o2.m) weakHashMap.get(webView);
                                if (mVar == null) {
                                    mVar = new o2.m(o2.l.f19066a.createWebView(webView));
                                    weakHashMap.put(webView, mVar);
                                }
                            } else {
                                mVar = new o2.m(o2.l.f19066a.createWebView(webView));
                            }
                            mVar.f19067a.addWebMessageListener("TelegramWebProxy", (String[]) hashSet.toArray(new String[0]), new ce.a(new m5.i(dVar, 29)));
                            webView.loadUrl(this.bridgeUrl);
                            return;
                        }
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        failCarrier();
                    }
                }
            } finally {
            }
        }
    }

    private static byte[] decodeSecret(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if ((trim.length() == 32 || trim.length() == 34) && trim.matches("[0-9a-fA-F]+")) {
            int length = trim.length() / 2;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) Integer.parseInt(trim.substring(i11, i11 + 2), 16);
            }
        } else {
            try {
                bArr = Base64.decode(trim, 10);
            } catch (Exception unused) {
                return null;
            }
        }
        if (bArr.length != 16 && (bArr.length != 17 || (bArr[0] & 255) != 221)) {
            return null;
        }
        return bArr;
    }

    private void destroyWebView() {
        WebView webView = this.webView;
        this.webView = null;
        this.replyProxy = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public void drainOutbound() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WebProxyTransport.drainOutbound():void");
    }

    private void failCarrier() {
        synchronized (this.lock) {
            if (!this.stopped && !this.restartScheduled) {
                this.restartScheduled = true;
                int i10 = 0;
                this.carrierConnected = false;
                this.replyProxy = null;
                this.outbound.clear();
                this.outboundBytes = 0;
                ArrayList arrayList = new ArrayList(this.streams.values());
                this.streams.clear();
                this.lock.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    closeSocket(((Stream) obj).socket);
                }
                AndroidUtilities.runOnUIThread(new wl(this, 3));
            }
        }
    }

    public void failWebView(WebView webView) {
        if (webView == this.webView) {
            failCarrier();
        }
    }

    private void handleControl(String str, n2.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.androidNonce.equals(jSONObject.optString("nonce"))) {
                synchronized (this.lock) {
                    if (!this.stopped && this.replyProxy == null) {
                        this.replyProxy = aVar;
                        sendFrame(16, 0, new byte[]{1});
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                failCarrier();
            }
        } catch (Exception unused) {
        }
    }

    public boolean isBridgeNavigation(Uri uri) {
        if (uri != null && "https".equals(uri.getScheme()) && this.host.equals(uri.getHost()) && uri.getPort() == -1 && "/".equals(uri.getPath()) && uri.getQueryParameterNames().size() == 1 && uri.getQueryParameterNames().contains("bridge")) {
            return true;
        }
        return false;
    }

    public static boolean isSupported() {
        try {
            if (i7.d0.a("WEB_MESSAGE_LISTENER")) {
                if (i7.d0.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static boolean isValidSecret(String str) {
        if (decodeSecret(str) != null) {
            return true;
        }
        return false;
    }

    public static int lambda$allocateStreamId$2(int i10) {
        if (i10 >= 16777215) {
            return 1;
        }
        return i10 + 1;
    }

    public void lambda$failCarrier$4() {
        destroyWebView();
        synchronized (this.lock) {
            try {
                if (this.stopped) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new wl(this, 0), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void lambda$stopInternal$0() {
        n2.a aVar = this.replyProxy;
        if (aVar != null) {
            try {
                o2.f fVar = (o2.f) aVar;
                if (o2.k.f19065c.b()) {
                    fVar.f19059a.postMessage("{\"t\":\"close\"}");
                } else {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception unused) {
            }
        }
        destroyWebView();
    }

    public static String normalizeHost(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = com.google.android.recaptcha.internal.a.m(trim, 1, 0);
        }
        try {
            String lowerCase = IDN.toASCII(trim, 2).toLowerCase(Locale.US);
            if (lowerCase.length() <= 253 && lowerCase.indexOf(46) > 0 && !lowerCase.contains(":") && !lowerCase.matches("[0-9.]+")) {
                for (String str2 : lowerCase.split("\\.", -1)) {
                    if (str2.isEmpty() || str2.length() > 63 || str2.startsWith("-") || str2.endsWith("-")) {
                        return "";
                    }
                }
                return lowerCase;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void onWebMessage(WebView webView, n2.b bVar, Uri uri, boolean z10, n2.a aVar) {
        n2.a aVar2;
        if (webView == this.webView && z10 && this.origin.equals(uri.toString())) {
            int i10 = bVar.f17093c;
            if (i10 == 0) {
                bVar.a(0);
                handleControl(bVar.f17091a, aVar);
            } else if (i10 == 1) {
                synchronized (this.lock) {
                    if (!this.stopped && (aVar2 = this.replyProxy) != null && aVar2 == aVar) {
                        bVar.a(1);
                        byte[] bArr = bVar.f17092b;
                        Objects.requireNonNull(bArr);
                        this.carrierExecutor.execute(new vg(17, this, bArr));
                    }
                }
            }
        }
    }

    private boolean processFrame(int i10, int i11, byte[] bArr) {
        boolean z10 = true;
        int i12 = 0;
        if (i11 == 0) {
            if (i10 == 17 && bArr.length == 0) {
                synchronized (this.lock) {
                    try {
                        if (!this.stopped && !this.carrierConnected) {
                            this.carrierConnected = true;
                            ArrayList arrayList = new ArrayList(this.streams.values());
                            int size = arrayList.size();
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                Stream stream = (Stream) obj;
                                stream.opened = true;
                                sendFrame(1, stream.f19647id, null);
                            }
                            this.lock.notifyAll();
                            return true;
                        }
                        return false;
                    } finally {
                    }
                }
            } else if (i10 == 5 && bArr.length <= 64) {
                sendFrame(6, 0, bArr);
                return true;
            } else {
                if (i10 == 31) {
                    int length = bArr.length;
                }
                return false;
            }
        }
        synchronized (this.lock) {
            try {
                Stream stream2 = this.streams.get(Integer.valueOf(i11));
                if (stream2 == null) {
                    if (i10 != 2 && i10 != 4 && i10 != 3) {
                        z10 = false;
                    }
                    return z10;
                } else if (i10 == 2) {
                    if (bArr.length == 0) {
                        return false;
                    }
                    synchronized (this.lock) {
                        try {
                            if (stream2.receiveWindow < bArr.length) {
                                return false;
                            }
                            Stream.access$722(stream2, bArr.length);
                            try {
                                stream2.socket.getOutputStream().write(bArr);
                                synchronized (this.lock) {
                                    if (this.streams.get(Integer.valueOf(stream2.f19647id)) == stream2) {
                                        Stream.access$714(stream2, bArr.length);
                                        sendFrame(4, stream2.f19647id, uint32(bArr.length));
                                    }
                                }
                            } catch (Exception unused) {
                                closeStream(stream2, true);
                            }
                            return true;
                        } finally {
                        }
                    }
                } else if (i10 == 4 && bArr.length == 4) {
                    long j10 = ByteBuffer.wrap(bArr).getInt() & 4294967295L;
                    if (j10 == 0) {
                        return false;
                    }
                    synchronized (this.lock) {
                        try {
                            if (stream2.sendWindow > 4294967295L - j10) {
                                return false;
                            }
                            Stream.access$414(stream2, j10);
                            this.lock.notifyAll();
                            return true;
                        } finally {
                        }
                    }
                } else if (i10 != 3 || bArr.length != 0) {
                    return false;
                } else {
                    closeStream(stream2, false);
                    return true;
                }
            } finally {
            }
        }
    }

    public void lambda$onWebMessage$3(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            if (bArr.length - i10 < 8) {
                failCarrier();
                return;
            }
            int i11 = bArr[i10] & 255;
            int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8) | (bArr[i10 + 3] & 255);
            long j10 = ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8) | (255 & bArr[i10 + 7]);
            int i13 = i10 + 8;
            long j11 = i13 + j10;
            if (j10 <= 1048576 && j11 <= bArr.length) {
                int i14 = (int) j10;
                byte[] bArr2 = new byte[i14];
                System.arraycopy(bArr, i13, bArr2, 0, i14);
                if (!processFrame(i11, i12, bArr2)) {
                    failCarrier();
                    return;
                }
                i10 = (int) j11;
            } else {
                failCarrier();
                return;
            }
        }
    }

    private static String randomToken(int i10) {
        byte[] bArr = new byte[i10];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public void lambda$acceptLoop$1(org.telegram.messenger.WebProxyTransport.Stream r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WebProxyTransport.lambda$acceptLoop$1(org.telegram.messenger.WebProxyTransport$Stream):void");
    }

    private void sendFrame(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.lock) {
            if (!this.stopped && this.outbound.size() < 8192 && this.outboundBytes <= 67108864 - array.length) {
                this.outbound.add(array);
                this.outboundBytes += array.length;
                AndroidUtilities.runOnUIThread(new wl(this, 1));
                return;
            }
            failCarrier();
        }
    }

    public static int start(String str, String str2) {
        String normalizeHost = normalizeHost(str);
        byte[] decodeSecret = decodeSecret(str2);
        if (TextUtils.isEmpty(normalizeHost) || decodeSecret == null || !isSupported()) {
            return 0;
        }
        synchronized (staticLock) {
            try {
                WebProxyTransport webProxyTransport = instance;
                if (webProxyTransport != null && webProxyTransport.host.equals(normalizeHost) && instance.secret.equals(str2)) {
                    return instance.serverSocket.getLocalPort();
                }
                WebProxyTransport webProxyTransport2 = instance;
                if (webProxyTransport2 != null) {
                    webProxyTransport2.stopInternal();
                    instance = null;
                }
                try {
                    WebProxyTransport webProxyTransport3 = new WebProxyTransport(normalizeHost, str2, decodeSecret);
                    instance = webProxyTransport3;
                    webProxyTransport3.startInternal();
                    return instance.serverSocket.getLocalPort();
                } catch (Exception e10) {
                    FileLog.e(e10);
                    WebProxyTransport webProxyTransport4 = instance;
                    if (webProxyTransport4 != null) {
                        webProxyTransport4.stopInternal();
                        instance = null;
                    }
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void startInternal() {
        c10 c10Var = c10.getInstance();
        if (c10Var != null) {
            c10Var.addListener(this);
        }
        this.ioExecutor.execute(new wl(this, 4));
        AndroidUtilities.runOnUIThread(new wl(this, 0));
    }

    public static void stop() {
        synchronized (staticLock) {
            try {
                WebProxyTransport webProxyTransport = instance;
                if (webProxyTransport != null) {
                    webProxyTransport.stopInternal();
                    instance = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void stopInternal() {
        synchronized (this.lock) {
            try {
                if (this.stopped) {
                    return;
                }
                this.stopped = true;
                int i10 = 0;
                this.carrierConnected = false;
                this.restartScheduled = false;
                ArrayList arrayList = new ArrayList(this.streams.values());
                this.streams.clear();
                this.outbound.clear();
                this.outboundBytes = 0;
                this.lock.notifyAll();
                try {
                    this.serverSocket.close();
                } catch (Exception unused) {
                }
                c10 c10Var = c10.getInstance();
                if (c10Var != null) {
                    c10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    closeSocket(((Stream) obj).socket);
                }
                AndroidUtilities.runOnUIThread(new wl(this, 2));
                this.ioExecutor.shutdownNow();
                this.carrierExecutor.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static byte[] uint32(int i10) {
        return ByteBuffer.allocate(4).putInt(i10).array();
    }

    @Override
    public void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new wl(this, 0));
    }

    @Override
    public void onBecameBackground() {
    }
}
