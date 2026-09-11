package fg;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import di.b7;
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
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.g10;
public final class k implements f10 {
    public static final Object f9503t = new Object();
    public static k f9504u;
    public static k v;
    public final String f9506b;
    public final String f9507c;
    public final String d;
    public final String f9508e;
    public final String f9509f;
    public final ServerSocket f9510g;
    public WebView f9515m;
    public b5.h f9516n;
    public boolean f9517o;
    public boolean f9518p;
    public boolean f9519q;
    public int f9520r;
    public d f9521s;
    public final Object f9505a = new Object();
    public final ExecutorService h = Executors.newCachedThreadPool();
    public final ExecutorService f9511i = Executors.newSingleThreadExecutor();
    public final AtomicInteger f9512j = new AtomicInteger(1);
    public final HashMap f9513k = new HashMap();
    public final ArrayDeque f9514l = new ArrayDeque();

    public k(String str, String str2, byte[] bArr) {
        this.f9506b = str;
        this.f9507c = str2;
        String concat = "https://".concat(str);
        this.d = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.f9509f = encodeToString;
        String concat2 = "tdesktop-web-proxy-bridge-v1\n".concat(str);
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(concat2.getBytes(StandardCharsets.UTF_8)), 11);
        this.f9508e = concat + "/?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f9510g = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f9505a) {
            try {
                if (!kVar.f9518p && kVar.f9515m == null) {
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null && g10Var.isBackground()) {
                        kVar.f9519q = true;
                        return;
                    }
                    kVar.f9519q = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f9515m = webView;
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
                        a5.c.a(webView, "TelegramWebProxy", hashSet, new a1.c(kVar, 29));
                        webView.loadUrl(kVar.f9508e);
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                Socket accept = kVar.f9510g.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f9505a) {
                    if (!kVar.f9518p && kVar.f9513k.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f9512j, new Object());
                            if (andUpdate != 0 && !kVar.f9513k.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f9513k.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f9517o) {
                            jVar.f9502e = true;
                            kVar.j(1, andUpdate, null);
                        }
                        kVar.h.execute(new b7(21, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e7) {
                synchronized (kVar.f9505a) {
                    try {
                        if (!kVar.f9518p) {
                            FileLog.e(e7);
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
            trim = e2.i(1, 0, trim);
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
            synchronized (f9503t) {
                try {
                    k kVar = f9504u;
                    if (kVar != null && kVar.f9506b.equals(i10) && f9504u.f9507c.equals(str2)) {
                        return f9504u.f9510g.getLocalPort();
                    }
                    k kVar2 = f9504u;
                    if (kVar2 != null) {
                        kVar2.m();
                        f9504u = null;
                    }
                    try {
                        k kVar3 = new k(i10, str2, d);
                        f9504u = kVar3;
                        g10 g10Var = g10.getInstance();
                        if (g10Var != null) {
                            g10Var.addListener(kVar3);
                        }
                        kVar3.h.execute(new g(kVar3, 2));
                        AndroidUtilities.runOnUIThread(new g(kVar3, 1));
                        return f9504u.f9510g.getLocalPort();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        k kVar4 = f9504u;
                        if (kVar4 != null) {
                            kVar4.m();
                            f9504u = null;
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
        synchronized (f9503t) {
            try {
                k kVar = f9504u;
                if (kVar != null) {
                    kVar.m();
                    f9504u = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f9505a) {
            try {
                if (this.f9513k.get(Integer.valueOf(jVar.f9499a)) != jVar) {
                    return;
                }
                this.f9513k.remove(Integer.valueOf(jVar.f9499a));
                if (z10 && this.f9517o && jVar.f9502e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f9505a.notifyAll();
                try {
                    jVar.f9500b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    j(3, jVar.f9499a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f9515m;
        this.f9515m = null;
        this.f9516n = null;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void f() {
        synchronized (this.f9505a) {
            if (!this.f9518p && !this.f9519q) {
                this.f9519q = true;
                int i10 = 0;
                this.f9517o = false;
                this.f9516n = null;
                this.f9514l.clear();
                this.f9520r = 0;
                ArrayList arrayList = new ArrayList(this.f9513k.values());
                this.f9513k.clear();
                this.f9505a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f9500b.close();
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
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.f9509f.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f9505a) {
                    if (!this.f9518p && this.f9516n == null) {
                        this.f9516n = hVar;
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
        synchronized (this.f9505a) {
            if (!this.f9518p && this.f9514l.size() < 8192 && this.f9520r <= 67108864 - array.length) {
                this.f9514l.add(array);
                this.f9520r += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void m() {
        synchronized (this.f9505a) {
            try {
                if (this.f9518p) {
                    return;
                }
                this.f9518p = true;
                int i10 = 0;
                this.f9517o = false;
                this.f9519q = false;
                ArrayList arrayList = new ArrayList(this.f9513k.values());
                this.f9513k.clear();
                this.f9514l.clear();
                this.f9520r = 0;
                this.f9505a.notifyAll();
                try {
                    this.f9510g.close();
                } catch (Exception unused) {
                }
                g10 g10Var = g10.getInstance();
                if (g10Var != null) {
                    g10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f9500b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.h.shutdownNow();
                this.f9511i.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBecameForeground() {
        AndroidUtilities.runOnUIThread(new g(this, 1));
    }

    @Override
    public final void onBecameBackground() {
    }
}
