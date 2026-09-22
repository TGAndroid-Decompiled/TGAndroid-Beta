package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
import k2.v;
import pb.c;
public abstract class b {
    public static final boolean f278a;
    public static final WeakHashMap f279b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f278a = true;
        f279b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, v vVar) {
        if (m.f3425c.b()) {
            c(webView).f3427a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new se.a(new c(vVar, 8)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.e.b() && f278a) {
            WeakHashMap weakHashMap = f279b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f3426a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f3426a.createWebView(webView));
    }
}
