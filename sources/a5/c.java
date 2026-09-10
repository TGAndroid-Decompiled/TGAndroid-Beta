package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
public abstract class c {
    public static final boolean f277a;
    public static final WeakHashMap f278b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f277a = true;
        f278b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, b bVar) {
        if (m.f2119c.b()) {
            c(webView).f2121a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new se.a(new xa.c(bVar, 7)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.e.b() && f277a) {
            WeakHashMap weakHashMap = f278b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f2120a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f2120a.createWebView(webView));
    }
}
