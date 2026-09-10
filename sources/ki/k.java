package ki;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import fg.s1;
import hi.y1;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.o10;
public final class k implements n10 {
    public static final Object f12548t = new Object();
    public static k f12549u;
    public static k v;
    public final String f12551b;
    public final String f12552c;
    public final String d;
    public final String e;
    public final String f12553f;
    public final ServerSocket f12554g;
    public WebView f12559m;
    public b5.h f12560n;
    public boolean f12561o;
    public boolean f12562p;
    public boolean f12563q;
    public int f12564r;
    public d f12565s;
    public final Object f12550a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService f12555i = Executors.newSingleThreadExecutor();
    public final AtomicInteger f12556j = new AtomicInteger(1);
    public final HashMap f12557k = new HashMap();
    public final ArrayDeque f12558l = new ArrayDeque();

    public k(String str, String str2, byte[] bArr) {
        this.f12551b = str;
        this.f12552c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f12553f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11);
        this.e = concat + "/?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f12554g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f12550a) {
            try {
                if (!kVar.f12562p && kVar.f12559m == null) {
                    o10 o10Var = o10.getInstance();
                    if (o10Var != null && o10Var.isBackground()) {
                        kVar.f12563q = true;
                        return;
                    }
                    kVar.f12563q = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f12559m = webView;
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
                        settings.setMixedContentMode(1);
                        if (Build.VERSION.SDK_INT >= 26) {
                            settings.setSafeBrowsingEnabled(true);
                        }
                        webView.setWebViewClient(new i(kVar, 0));
                        HashSet hashSet = new HashSet();
                        hashSet.add(kVar.d);
                        a5.c.a(webView, "TelegramWebProxy", hashSet, new y1(kVar, 22));
                        webView.loadUrl(kVar.e);
                    } catch (Exception e) {
                        FileLog.e(e);
                        kVar.f();
                    }
                }
            } finally {
            }
        }
    }

    public static void b(k kVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = kVar.f12554g.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f12550a) {
                    if (!kVar.f12562p && kVar.f12557k.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f12556j, new Object());
                            if (andUpdate != 0 && !kVar.f12557k.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f12557k.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f12561o) {
                            jVar.e = true;
                            kVar.j(1, andUpdate, null);
                        }
                        kVar.h.execute(new s1(28, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.f12550a) {
                    try {
                        if (!kVar.f12562p) {
                            FileLog.e(e);
                            kVar.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] d(String str) {
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

    public static boolean h() {
        try {
            if (o.a("WEB_MESSAGE_LISTENER")) {
                if (o.a("WEB_MESSAGE_ARRAY_BUFFER")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static String i(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = e2.h(1, 0, trim);
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

    public static int k(String str, String str2) {
        String i10 = i(str);
        byte[] d = d(str2);
        if (!TextUtils.isEmpty(i10) && d != null && h()) {
            synchronized (f12548t) {
                try {
                    k kVar = f12549u;
                    if (kVar != null && kVar.f12551b.equals(i10) && f12549u.f12552c.equals(str2)) {
                        return f12549u.f12554g.getLocalPort();
                    }
                    k kVar2 = f12549u;
                    if (kVar2 != null) {
                        kVar2.m();
                        f12549u = null;
                    }
                    try {
                        k kVar3 = new k(i10, str2, d);
                        f12549u = kVar3;
                        o10 o10Var = o10.getInstance();
                        if (o10Var != null) {
                            o10Var.addListener(kVar3);
                        }
                        kVar3.h.execute(new g(kVar3, 1));
                        AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                        return f12549u.f12554g.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        k kVar4 = f12549u;
                        if (kVar4 != null) {
                            kVar4.m();
                            f12549u = null;
                        }
                        return 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return 0;
    }

    public static void l() {
        synchronized (f12548t) {
            try {
                k kVar = f12549u;
                if (kVar != null) {
                    kVar.m();
                    f12549u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f12550a) {
            try {
                if (this.f12557k.get(Integer.valueOf(jVar.f12545a)) != jVar) {
                    return;
                }
                this.f12557k.remove(Integer.valueOf(jVar.f12545a));
                if (z10 && this.f12561o && jVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f12550a.notifyAll();
                try {
                    jVar.f12546b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    j(3, jVar.f12545a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f12559m;
        this.f12559m = null;
        this.f12560n = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void f() {
        synchronized (this.f12550a) {
            if (!this.f12562p && !this.f12563q) {
                this.f12563q = true;
                int i10 = 0;
                this.f12561o = false;
                this.f12560n = null;
                this.f12558l.clear();
                this.f12564r = 0;
                ArrayList arrayList = new ArrayList(this.f12557k.values());
                this.f12557k.clear();
                this.f12550a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f12546b.close();
                    } catch (Exception unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 3));
            }
        }
    }

    public final void g(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.f12553f.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f12550a) {
                    if (!this.f12562p && this.f12560n == null) {
                        this.f12560n = hVar;
                        j(16, 0, new byte[]{1});
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final void j(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f12550a) {
            if (!this.f12562p && this.f12558l.size() < 8192 && this.f12564r <= 67108864 - array.length) {
                this.f12558l.add(array);
                this.f12564r += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.f12550a) {
            try {
                if (this.f12562p) {
                    return;
                }
                this.f12562p = true;
                int i10 = 0;
                this.f12561o = false;
                this.f12563q = false;
                ArrayList arrayList = new ArrayList(this.f12557k.values());
                this.f12557k.clear();
                this.f12558l.clear();
                this.f12564r = 0;
                this.f12550a.notifyAll();
                try {
                    this.f12554g.close();
                } catch (Exception unused) {
                }
                o10 o10Var = o10.getInstance();
                if (o10Var != null) {
                    o10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f12546b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.h.shutdownNow();
                this.f12555i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 2));
    }

    @Override
    public final void onBecameBackground() {
    }
}
