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
import k2.v;
import ki.c0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.g10;
public final class k implements f10 {
    public static final Object v = new Object();
    public static k f15726w;
    public static k f15727x;
    public final String f15729b;
    public final String f15730c;
    public final String d;
    public final String e;
    public final String f15731f;
    public final String f15732g;
    public final String h;
    public final ServerSocket f15733i;
    public WebView f15739o;
    public b5.h f15740p;
    public boolean f15741q;
    public boolean f15742r;
    public boolean f15743s;
    public int f15744t;
    public d f15745u;
    public final Object f15728a = new Object();
    public final ExecutorService f15734j = Executors.newCachedThreadPool();
    public final ExecutorService f15735k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f15736l = new AtomicInteger(1);
    public final HashMap f15737m = new HashMap();
    public final ArrayDeque f15738n = new ArrayDeque();

    public k(lf.i iVar, String str, byte[] bArr) {
        String j3;
        this.f15729b = (String) iVar.d;
        String str2 = (String) iVar.f14179b;
        this.f15730c = str2;
        String str3 = (String) iVar.f14180c;
        String p5 = str3.isEmpty() ? "/" : a4.a.p("/", str3, "/");
        this.d = p5;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f15731f = concat;
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
        this.f15732g = concat + p5 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f15733i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f15728a) {
            try {
                if (!kVar.f15742r && kVar.f15739o == null) {
                    g10 g10Var = g10.getInstance();
                    if (g10Var != null && g10Var.isBackground()) {
                        kVar.f15743s = true;
                        return;
                    }
                    kVar.f15743s = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f15739o = webView;
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
                        hashSet.add(kVar.f15731f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new v(kVar, 8));
                        webView.loadUrl(kVar.f15732g);
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
                Socket accept = kVar.f15733i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f15728a) {
                    if (!kVar.f15742r && kVar.f15737m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f15736l, new Object());
                            if (andUpdate != 0 && !kVar.f15737m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f15737m.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f15741q) {
                            jVar.e = true;
                            kVar.k(1, andUpdate, null);
                        }
                        kVar.f15734j.execute(new c0(10, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.f15728a) {
                    try {
                        if (!kVar.f15742r) {
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

    public static lf.i i(String str) {
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
                return new lf.i(j3, str3);
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
        lf.i i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null && h()) {
            synchronized (v) {
                try {
                    k kVar = f15726w;
                    if (kVar != null && kVar.f15729b.equals((String) i10.d) && f15726w.e.equals(str2)) {
                        return f15726w.f15733i.getLocalPort();
                    }
                    k kVar2 = f15726w;
                    if (kVar2 != null) {
                        kVar2.n();
                        f15726w = null;
                    }
                    try {
                        k kVar3 = new k(i10, str2, d);
                        f15726w = kVar3;
                        g10 g10Var = g10.getInstance();
                        if (g10Var != null) {
                            g10Var.addListener(kVar3);
                        }
                        kVar3.f15734j.execute(new g(kVar3, 1));
                        AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                        return f15726w.f15733i.getLocalPort();
                    } catch (Exception e) {
                        FileLog.e(e);
                        k kVar4 = f15726w;
                        if (kVar4 != null) {
                            kVar4.n();
                            f15726w = null;
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
                k kVar = f15726w;
                if (kVar != null) {
                    kVar.n();
                    f15726w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f15728a) {
            try {
                if (this.f15737m.get(Integer.valueOf(jVar.f15723a)) != jVar) {
                    return;
                }
                this.f15737m.remove(Integer.valueOf(jVar.f15723a));
                if (z10 && this.f15741q && jVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f15728a.notifyAll();
                try {
                    jVar.f15724b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    k(3, jVar.f15723a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f15739o;
        this.f15739o = null;
        this.f15740p = null;
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
        synchronized (this.f15728a) {
            if (!this.f15742r && !this.f15743s) {
                this.f15743s = true;
                int i10 = 0;
                this.f15741q = false;
                this.f15740p = null;
                this.f15738n.clear();
                this.f15744t = 0;
                ArrayList arrayList = new ArrayList(this.f15737m.values());
                this.f15737m.clear();
                this.f15728a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f15724b.close();
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
                synchronized (this.f15728a) {
                    if (!this.f15742r && this.f15740p == null) {
                        this.f15740p = hVar;
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
        synchronized (this.f15728a) {
            if (!this.f15742r && this.f15738n.size() < 8192 && this.f15744t <= 67108864 - array.length) {
                this.f15738n.add(array);
                this.f15744t += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void n() {
        synchronized (this.f15728a) {
            try {
                if (this.f15742r) {
                    return;
                }
                this.f15742r = true;
                int i10 = 0;
                this.f15741q = false;
                this.f15743s = false;
                ArrayList arrayList = new ArrayList(this.f15737m.values());
                this.f15737m.clear();
                this.f15738n.clear();
                this.f15744t = 0;
                this.f15728a.notifyAll();
                try {
                    this.f15733i.close();
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
                        ((j) obj).f15724b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f15734j.shutdownNow();
                this.f15735k.shutdownNow();
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
