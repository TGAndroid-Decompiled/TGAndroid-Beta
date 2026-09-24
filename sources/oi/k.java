package oi;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
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
import ki.n;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
public final class k implements g10 {
    public static final Object v = new Object();
    public static k f15754w;
    public static k f15755x;
    public final String f15757b;
    public final String f15758c;
    public final String d;
    public final String e;
    public final String f15759f;
    public final String f15760g;
    public final String h;
    public final ServerSocket f15761i;
    public WebView f15767o;
    public b5.h f15768p;
    public boolean f15769q;
    public boolean f15770r;
    public boolean f15771s;
    public int f15772t;
    public d f15773u;
    public final Object f15756a = new Object();
    public final ExecutorService f15762j = Executors.newCachedThreadPool();
    public final ExecutorService f15763k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f15764l = new AtomicInteger(1);
    public final HashMap f15765m = new HashMap();
    public final ArrayDeque f15766n = new ArrayDeque();

    public k(la.h hVar, String str, byte[] bArr) {
        String j3;
        this.f15757b = (String) hVar.d;
        String str2 = (String) hVar.f14151b;
        this.f15758c = str2;
        String str3 = (String) hVar.f14152c;
        String q6 = str3.isEmpty() ? "/" : a4.a.q("/", str3, "/");
        this.d = q6;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f15759f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            j3 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            j3 = e2.j("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(j3.getBytes(StandardCharsets.UTF_8)), 11);
        this.f15760g = concat + q6 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f15761i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f15756a) {
            try {
                if (!kVar.f15770r && kVar.f15767o == null) {
                    h10 h10Var = h10.getInstance();
                    if (h10Var != null && h10Var.isBackground()) {
                        kVar.f15771s = true;
                        return;
                    }
                    kVar.f15771s = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f15767o = webView;
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
                        hashSet.add(kVar.f15759f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new le.b(kVar, 8));
                        webView.loadUrl(kVar.f15760g);
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
                Socket accept = kVar.f15761i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f15756a) {
                    if (!kVar.f15770r && kVar.f15765m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f15764l, new Object());
                            if (andUpdate != 0 && !kVar.f15765m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f15765m.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f15769q) {
                            jVar.e = true;
                            kVar.k(1, andUpdate, null);
                        }
                        kVar.f15762j.execute(new n(12, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.f15756a) {
                    try {
                        if (!kVar.f15770r) {
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

    public static la.h i(String str) {
        String str2;
        String str3;
        String[] split;
        if (str != null) {
            int indexOf = str.indexOf(47);
            if (indexOf >= 0) {
                str2 = str.substring(0, indexOf);
            } else {
                str2 = str;
            }
            String j3 = j(str2);
            if (indexOf >= 0) {
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(j3) && str3.length() <= 128) {
                if (!str3.isEmpty()) {
                    for (String str4 : str3.split("/", -1)) {
                        if (!str4.isEmpty() && Character.isLetterOrDigit(str4.charAt(0))) {
                            for (int i10 = 0; i10 < str4.length(); i10++) {
                                char charAt = str4.charAt(i10);
                                if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-'))) {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                }
                return new la.h(j3, str3);
            }
            return null;
        }
        return null;
    }

    public static String j(String str) {
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

    public static int l(String str, String str2) {
        la.h i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null && h()) {
            synchronized (v) {
                try {
                    k kVar = f15754w;
                    if (kVar != null && kVar.f15757b.equals((String) i10.d) && f15754w.e.equals(str2)) {
                        return f15754w.f15761i.getLocalPort();
                    }
                    k kVar2 = f15754w;
                    if (kVar2 != null) {
                        kVar2.n();
                        f15754w = null;
                    }
                    try {
                        k kVar3 = new k(i10, str2, d);
                        f15754w = kVar3;
                        h10 h10Var = h10.getInstance();
                        if (h10Var != null) {
                            h10Var.addListener(kVar3);
                        }
                        kVar3.f15762j.execute(new g(kVar3, 1));
                        AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                        return f15754w.f15761i.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        k kVar4 = f15754w;
                        if (kVar4 != null) {
                            kVar4.n();
                            f15754w = null;
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

    public static void m() {
        synchronized (v) {
            try {
                k kVar = f15754w;
                if (kVar != null) {
                    kVar.n();
                    f15754w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f15756a) {
            try {
                if (this.f15765m.get(Integer.valueOf(jVar.f15751a)) != jVar) {
                    return;
                }
                this.f15765m.remove(Integer.valueOf(jVar.f15751a));
                if (z10 && this.f15769q && jVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f15756a.notifyAll();
                try {
                    jVar.f15752b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    k(3, jVar.f15751a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f15767o;
        this.f15767o = null;
        this.f15768p = null;
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
        synchronized (this.f15756a) {
            if (!this.f15770r && !this.f15771s) {
                this.f15771s = true;
                int i10 = 0;
                this.f15769q = false;
                this.f15768p = null;
                this.f15766n.clear();
                this.f15772t = 0;
                ArrayList arrayList = new ArrayList(this.f15765m.values());
                this.f15765m.clear();
                this.f15756a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f15752b.close();
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
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f15756a) {
                    if (!this.f15770r && this.f15768p == null) {
                        this.f15768p = hVar;
                        k(16, 0, new byte[]{1});
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final void k(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f15756a) {
            if (!this.f15770r && this.f15766n.size() < 8192 && this.f15772t <= 67108864 - array.length) {
                this.f15766n.add(array);
                this.f15772t += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void n() {
        synchronized (this.f15756a) {
            try {
                if (this.f15770r) {
                    return;
                }
                this.f15770r = true;
                int i10 = 0;
                this.f15769q = false;
                this.f15771s = false;
                ArrayList arrayList = new ArrayList(this.f15765m.values());
                this.f15765m.clear();
                this.f15766n.clear();
                this.f15772t = 0;
                this.f15756a.notifyAll();
                try {
                    this.f15761i.close();
                } catch (Exception unused) {
                }
                h10 h10Var = h10.getInstance();
                if (h10Var != null) {
                    h10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f15752b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f15762j.shutdownNow();
                this.f15763k.shutdownNow();
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
