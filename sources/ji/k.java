package ji;

import a3.l0;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c3.i0;
import ig.c0;
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
import org.telegram.messenger.f8;
import org.telegram.messenger.u0;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.web.r1;
public final class k implements m00 {
    public static k A;
    public static final Object f10451y = new Object();
    public static k f10452z;
    public final String f10454b;
    public final String f10455c;
    public final String d;
    public final String e;
    public final String f10456f;
    public final String f10457g;
    public final String h;
    public final ServerSocket f10458i;
    public WebView f10464o;
    public b5.h f10465p;
    public boolean f10466q;
    public boolean f10467r;
    public boolean f10468s;
    public boolean f10469t;
    public boolean f10470u;
    public boolean v;
    public int f10471w;
    public d f10472x;
    public final Object f10453a = new Object();
    public final ExecutorService f10459j = Executors.newCachedThreadPool();
    public final ExecutorService f10460k = Executors.newSingleThreadExecutor();
    public final AtomicInteger f10461l = new AtomicInteger(1);
    public final HashMap f10462m = new HashMap();
    public final ArrayDeque f10463n = new ArrayDeque();

    public k(a0 a0Var, String str, byte[] bArr) {
        String n10;
        this.f10454b = (String) a0Var.d;
        String str2 = (String) a0Var.f875b;
        this.f10455c = str2;
        String str3 = (String) a0Var.f876c;
        String n11 = str3.isEmpty() ? "/" : a1.g.n("/", str3, "/");
        this.d = n11;
        this.e = str;
        String concat = "https://".concat(str2);
        this.f10456f = concat;
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        String encodeToString = Base64.encodeToString(bArr2, 11);
        this.h = encodeToString;
        if (str3.isEmpty()) {
            n10 = "tdesktop-web-proxy-bridge-v1\n".concat(str2);
        } else {
            n10 = i0.n("tdesktop-web-proxy-bridge-v2\n", str2, "\n", str3);
        }
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        String encodeToString2 = Base64.encodeToString(mac.doFinal(n10.getBytes(StandardCharsets.UTF_8)), 11);
        this.f10457g = concat + n11 + "?bridge=" + encodeToString2 + "#android=" + encodeToString;
        this.f10458i = new ServerSocket(0, 64, InetAddress.getByName("127.0.0.1"));
    }

    public static void c(k kVar) {
        boolean z10;
        synchronized (kVar.f10453a) {
            try {
                if (!kVar.f10470u && kVar.f10464o == null) {
                    u0 u0Var = u0.f18330f;
                    if (u0Var != null) {
                        if (u0Var.f18331a == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            kVar.v = true;
                            return;
                        }
                    }
                    kVar.v = false;
                    kVar.g();
                    try {
                        WebView webView = new WebView(w0.f18945b);
                        kVar.f10464o = webView;
                        kVar.f10466q = a.a.a("WEB_MESSAGE_ARRAY_BUFFER");
                        kVar.f10467r = false;
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
                        hashSet.add(kVar.f10456f);
                        a5.c.a(webView, "TelegramWebProxy", hashSet, new c0(kVar, 17));
                        webView.loadUrl(kVar.f10457g);
                    } catch (Exception e) {
                        f8.g(e, true);
                        kVar.h();
                    }
                }
            } finally {
            }
        }
    }

    public static void d(k kVar) {
        int andUpdate;
        while (true) {
            try {
                Socket accept = kVar.f10458i.accept();
                accept.setTcpNoDelay(true);
                synchronized (kVar.f10453a) {
                    if (!kVar.f10470u && kVar.f10462m.size() < 64) {
                        while (true) {
                            andUpdate = DesugarAtomicInteger.getAndUpdate(kVar.f10461l, new Object());
                            if (andUpdate != 0 && !kVar.f10462m.containsKey(Integer.valueOf(andUpdate))) {
                                break;
                            }
                        }
                        j jVar = new j(andUpdate, accept);
                        kVar.f10462m.put(Integer.valueOf(andUpdate), jVar);
                        if (kVar.f10469t) {
                            jVar.e = true;
                            kVar.n(1, andUpdate, null);
                        }
                        kVar.f10459j.execute(new d1.e(27, kVar, jVar));
                    }
                    try {
                        accept.close();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                synchronized (kVar.f10453a) {
                    try {
                        if (!kVar.f10470u) {
                            f8.g(e, true);
                            kVar.h();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            }
        }
    }

    public static byte[] f(String str) {
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

    public static a0 k(String str) {
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
            String l4 = l(str2);
            if (indexOf >= 0) {
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(l4) && str3.length() <= 128) {
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
                return new a0(l4, str3);
            }
            return null;
        }
        return null;
    }

    public static String l(String str) {
        String[] split;
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.endsWith(".")) {
            trim = i0.m(1, 0, trim);
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

    public static int o(String str, String str2) {
        boolean z10;
        a0 k10 = k(str);
        byte[] f7 = f(str2);
        if (k10 != null && f7 != null) {
            try {
                z10 = a.a.a("WEB_MESSAGE_LISTENER");
            } catch (Throwable th2) {
                f8.g(th2, true);
                z10 = false;
            }
            if (z10) {
                synchronized (f10451y) {
                    try {
                        k kVar = f10452z;
                        if (kVar != null && !kVar.f10458i.isClosed() && f10452z.f10454b.equals((String) k10.d) && f10452z.e.equals(str2)) {
                            return f10452z.f10458i.getLocalPort();
                        }
                        k kVar2 = f10452z;
                        if (kVar2 != null) {
                            kVar2.q();
                            f10452z = null;
                        }
                        try {
                            k kVar3 = new k(k10, str2, f7);
                            f10452z = kVar3;
                            u0 u0Var = u0.f18330f;
                            if (u0Var != null) {
                                u0Var.d.add(kVar3);
                            }
                            kVar3.f10459j.execute(new g(kVar3, 1));
                            org.telegram.messenger.i0.g3(new g(kVar3, 2));
                            return f10452z.f10458i.getLocalPort();
                        } catch (Exception e) {
                            f8.g(e, true);
                            k kVar4 = f10452z;
                            if (kVar4 != null) {
                                kVar4.q();
                                f10452z = null;
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

    public static void p() {
        synchronized (f10451y) {
            try {
                k kVar = f10452z;
                if (kVar != null) {
                    kVar.q();
                    f10452z = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void b() {
        org.telegram.messenger.i0.g3(new g(this, 2));
    }

    public final void e(j jVar, boolean z10) {
        boolean z11;
        synchronized (this.f10453a) {
            try {
                if (this.f10462m.get(Integer.valueOf(jVar.f10448a)) != jVar) {
                    return;
                }
                this.f10462m.remove(Integer.valueOf(jVar.f10448a));
                if (z10 && this.f10469t && jVar.e) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f10453a.notifyAll();
                try {
                    jVar.f10449b.close();
                } catch (Exception unused) {
                }
                if (z11) {
                    n(3, jVar.f10448a, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        WebView webView = this.f10464o;
        this.f10464o = null;
        this.f10465p = null;
        this.f10467r = false;
        if (webView != null) {
            try {
                webView.stopLoading();
                webView.loadUrl("about:blank");
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void h() {
        synchronized (this.f10453a) {
            if (!this.f10470u && !this.v) {
                this.v = true;
                int i10 = 0;
                this.f10469t = false;
                this.f10465p = null;
                this.f10463n.clear();
                this.f10471w = 0;
                ArrayList arrayList = new ArrayList(this.f10462m.values());
                this.f10462m.clear();
                this.f10453a.notifyAll();
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f10449b.close();
                    } catch (Exception unused) {
                    }
                }
                org.telegram.messenger.i0.g3(new g(this, 3));
            }
        }
    }

    public final void i(String str, b5.h hVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("t");
            if ("tproxy-android-init".equals(optString) && jSONObject.optInt("v") == 1 && this.h.equals(jSONObject.optString("nonce"))) {
                synchronized (this.f10453a) {
                    if (!this.f10470u && this.f10465p == null) {
                        this.f10465p = hVar;
                        if (this.f10466q) {
                            this.f10467r = true;
                            n(16, 0, new byte[]{1});
                            return;
                        }
                        WebView webView = this.f10464o;
                        l0 l0Var = new l0(this, webView, hVar, 25);
                        org.telegram.messenger.i0.h3(l0Var, 5000L);
                        try {
                            webView.evaluateJavascript("(function(){\n'use strict';\ntry {\n var bridge=window.TelegramWebProxy;\n if(!bridge||typeof bridge.postMessage!=='function'||typeof bridge.onmessage!=='function')return false;\n var nativePost=bridge.postMessage;\n var receive=bridge.onmessage;\n var prefix='tproxy-base64:';\n var maxBytes=1048584;\n var maxChars=1398112;\n function post(value){\n  if(value instanceof ArrayBuffer){\n   if(value.byteLength>maxBytes)throw new Error('WEB proxy frame too large');\n   var bytes=new Uint8Array(value),parts=[];\n   for(var i=0;i<bytes.length;i+=8192){\n    parts.push(String.fromCharCode.apply(null,bytes.subarray(i,Math.min(i+8192,bytes.length))));\n   }\n   nativePost.call(bridge,prefix+btoa(parts.join('')));\n  }else nativePost.call(bridge,value);\n }\n function onmessage(event){\n  var data=event.data;\n  if(typeof data==='string'&&data.indexOf(prefix)===0){\n   try {\n    var encoded=data.substring(prefix.length);\n    if(encoded.length>maxChars)throw new Error('WEB proxy frame too large');\n    var binary=atob(encoded);\n    if(binary.length>maxBytes)throw new Error('WEB proxy frame too large');\n    var bytes=new Uint8Array(binary.length);\n    for(var i=0;i<binary.length;i++)bytes[i]=binary.charCodeAt(i);\n    receive.call(bridge,{data:bytes.buffer});\n   }catch(error){nativePost.call(bridge,'{\"t\":\"close\"}');}\n  }else receive.call(bridge,event);\n }\n bridge.postMessage=post;\n bridge.onmessage=onmessage;\n return bridge.postMessage===post&&bridge.onmessage===onmessage;\n}catch(error){return false;}\n})()\n", new r1(this, l0Var, webView, hVar));
                        } catch (Exception e) {
                            org.telegram.messenger.i0.r(l0Var);
                            f8.g(e, true);
                            f8.d("WEB proxy: Base64 bridge installation threw an exception; transport stopped");
                            q();
                        }
                    }
                }
            } else if ("close".equals(optString) || "failed".equals(jSONObject.optString("state"))) {
                h();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean j(WebView webView) {
        String url = webView.getUrl();
        if (url == null) {
            return false;
        }
        Uri parse = Uri.parse(url);
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !this.f10455c.equalsIgnoreCase(parse.getHost()) || parse.getUserInfo() != null || parse.getPort() != -1 || !this.d.equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void m(byte[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: ji.k.m(byte[]):void");
    }

    public final void n(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] array = ByteBuffer.allocate(bArr.length + 8).put((byte) i10).put((byte) (i11 >> 16)).put((byte) (i11 >> 8)).put((byte) i11).putInt(bArr.length).put(bArr).array();
        synchronized (this.f10453a) {
            if (!this.f10470u && this.f10463n.size() < 8192 && this.f10471w <= 67108864 - array.length) {
                this.f10463n.add(array);
                this.f10471w += array.length;
                org.telegram.messenger.i0.g3(new g(this, 4));
                return;
            }
            h();
        }
    }

    public final void q() {
        synchronized (this.f10453a) {
            try {
                if (this.f10470u) {
                    return;
                }
                this.f10470u = true;
                int i10 = 0;
                this.f10469t = false;
                this.v = false;
                ArrayList arrayList = new ArrayList(this.f10462m.values());
                this.f10462m.clear();
                this.f10463n.clear();
                this.f10471w = 0;
                this.f10453a.notifyAll();
                try {
                    this.f10458i.close();
                } catch (Exception unused) {
                }
                u0 u0Var = u0.f18330f;
                if (u0Var != null) {
                    u0Var.d.remove(this);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    try {
                        ((j) obj).f10449b.close();
                    } catch (Exception unused2) {
                    }
                }
                org.telegram.messenger.i0.g3(new g(this, 0));
                this.f10459j.shutdownNow();
                this.f10460k.shutdownNow();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void a() {
    }
}
