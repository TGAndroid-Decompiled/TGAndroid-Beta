package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
import k6.h;
public abstract class c {
    public static final boolean f283a;
    public static final WeakHashMap f284b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f283a = true;
        f284b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, b bVar) {
        if (m.f2499c.b()) {
            c(webView).f2501a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new me.a(new h(bVar, 8)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.e.b() && f283a) {
            WeakHashMap weakHashMap = f284b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f2500a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f2500a.createWebView(webView));
    }
}
