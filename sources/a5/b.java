package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
import m4.w;
import pb.c;
public abstract class b {
    public static final boolean f301a;
    public static final WeakHashMap f302b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f301a = true;
        f302b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, w wVar) {
        if (m.f3772c.b()) {
            c(webView).f3775a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new te.a(new c(wVar, 8)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.f3773e.b() && f301a) {
            WeakHashMap weakHashMap = f302b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f3774a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f3774a.createWebView(webView));
    }
}
