package oi;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.vision.e2;
import gg.t;
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
import m.f3;
import m4.w;
import m4.x;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.z10;
import org.telegram.ui.web.a2;
public final class k implements y10 {
    public static k A;
    public static final Object f16938y = new Object();
    public static k f16939z;
    public final String f16941b;
    public final String f16942c;
    public final String d;
    public final String f16943e;
    public final String f16944f;
    public final String f16945g;
    public final String h;
    public final ServerSocket f16946i;
    public WebView f16952o;
    public b5.h f16953p;
    public boolean f16954q;
    public boolean f16955r;
    public boolean f16956s;
    public boolean f16957t;
    public boolean f16958u;
    public boolean v;
    public int f16959w;
    public d f16960x;
    public final Object f16940a = new Object();
    public final ExecutorService f16947j = Executors.newCachedThreadPool();
    public final ExecutorService f16948k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f16949l = new AtomicInteger(1);
    public final HashMap f16950m = new HashMap();
    public final ArrayDeque f16951n = new ArrayDeque();

    public k(f3 f3Var, String str, byte[] bArr) {
        String j3;
        this.f16941b = (String) f3Var.d;
        String str2 = (String) f3Var.f15424b;
        this.f16942c = str2;
        String str3 = (String) f3Var.f15425c;
        String q6 = str3.isEmpty() ? "/" : a1.g.q("/", str3, "/");
        this.d = q6;
        this.f16943e = str;
        String concat = "https://".concat(str2);
        this.f16944f = concat;
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
        this.f16945g = concat + q6 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f16946i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void a(k kVar) {
        synchronized (kVar.f16940a) {
            try {
                if (!kVar.f16958u && kVar.f16952o == null) {
                    z10 z10Var = z10.getInstance();
                    if (z10Var != null && z10Var.isBackground()) {
                        kVar.v = true;
                        return;
                    }
                    kVar.v = false;
                    kVar.e();
                    try {
                        WebView webView = new WebView(ApplicationLoader.applicationContext);
                        kVar.f16952o = webView;
                        kVar.f16954q = o.a("WEB_MESSAGE_ARRAY_BUFFER");
                        kVar.f16955r = false;
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
                        hashSet.add(kVar.f16944f);
                        a5.b.a(webView, "TelegramWebProxy", hashSet, new x(kVar, 8));
                        webView.loadUrl(kVar.f16945g);
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
                Socket accept = kVar.f16946i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f16940a) {
                    if (!kVar.f16958u && kVar.f16950m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f16949l, new Object());
                            if (andUpdate != 0 && !kVar.f16950m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f16950m.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f16957t) {
                            jVar.f16937e = true;
                            kVar.l(1, andUpdate, null);
                        }
                        kVar.f16947j.execute(new w(8, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e7) {
                synchronized (kVar.f16940a) {
                    try {
                        if (!kVar.f16958u) {
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

    public static f3 i(String str) {
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
                return new f3(j3, str3);
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

    public static int m(String str, String str2) {
        boolean z10;
        f3 i10 = i(str);
        byte[] d = d(str2);
        if (i10 != null && d != null) {
            try {
                z10 = o.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                FileLog.e(th2);
                z10 = false;
            }
            if (z10) {
                synchronized (f16938y) {
                    try {
                        k kVar = f16939z;
                        if (kVar != null && !kVar.f16946i.isClosed() && f16939z.f16941b.equals((String) i10.d) && f16939z.f16943e.equals(str2)) {
                            return f16939z.f16946i.getLocalPort();
                        }
                        k kVar2 = f16939z;
                        if (kVar2 != null) {
                            kVar2.o();
                            f16939z = null;
                        }
                        try {
                            k kVar3 = new k(i10, str2, d);
                            f16939z = kVar3;
                            z10 z10Var = z10.getInstance();
                            if (z10Var != null) {
                                z10Var.addListener(kVar3);
                            }
                            kVar3.f16947j.execute(new g(kVar3, 1));
                            AndroidUtilities.runOnUIThread(new g(kVar3, 2));
                            return f16939z.f16946i.getLocalPort();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            k kVar4 = f16939z;
                            if (kVar4 != null) {
                                kVar4.o();
                                f16939z = null;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        return 0;
    }

    public static void n() {
        synchronized (f16938y) {
            try {
                k kVar = f16939z;
                if (kVar != null) {
                    kVar.o();
                    f16939z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f16940a) {
            try {
                if (this.f16950m.get(Integer.valueOf(jVar.f16934a)) != jVar) {
                    return;
                }
                this.f16950m.remove(Integer.valueOf(jVar.f16934a));
                if (z10 && this.f16957t && jVar.f16937e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f16940a.notifyAll();
                try {
                    jVar.f16935b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    l(3, jVar.f16934a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        WebView webView = this.f16952o;
        this.f16952o = null;
        this.f16953p = null;
        this.f16955r = false;
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
        synchronized (this.f16940a) {
            if (!this.f16958u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f16957t = false;
                this.f16953p = null;
                this.f16951n.clear();
                this.f16959w = 0;
                ArrayList arrayList = new ArrayList(this.f16950m.values());
                this.f16950m.clear();
                this.f16940a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f16935b.close();
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
                synchronized (this.f16940a) {
                    if (!this.f16958u && this.f16953p == null) {
                        this.f16953p = hVar;
                        if (this.f16954q) {
                            this.f16955r = true;
                            l(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f16952o;
                        t tVar = new t(this, webView, hVar, 26);
                        AndroidUtilities.runOnUIThread(tVar, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new a2(this, tVar, webView, hVar));
                        } catch (Exception e7) {
                            AndroidUtilities.cancelRunOnUIThread(tVar);
                            FileLog.e(e7);
                            FileLog.e("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                            o();
                        }
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                f();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean h(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f16942c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void k(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: oi.k.k(byte[]):void");
    }

    public final void l(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f16940a) {
            if (!this.f16958u && this.f16951n.size() < 8192 && this.f16959w <= 67108864 - array.length) {
                this.f16951n.add(array);
                this.f16959w += array.length;
                AndroidUtilities.runOnUIThread(new g(this, 4));
                return;
            }
            f();
        }
    }

    public final void o() {
        synchronized (this.f16940a) {
            try {
                if (this.f16958u) {
                    return;
                }
                this.f16958u = true;
                int i10 = 0;
                this.f16957t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f16950m.values());
                this.f16950m.clear();
                this.f16951n.clear();
                this.f16959w = 0;
                this.f16940a.notifyAll();
                try {
                    this.f16946i.close();
                } catch (Exception unused) {
                }
                z10 z10Var = z10.getInstance();
                if (z10Var != null) {
                    z10Var.removeListener(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f16935b.close();
                    } catch (Exception unused2) {
                    }
                }
                AndroidUtilities.runOnUIThread(new g(this, 0));
                this.f16947j.shutdownNow();
                this.f16948k.shutdownNow();
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
