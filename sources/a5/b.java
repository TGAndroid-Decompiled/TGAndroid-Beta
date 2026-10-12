package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
import ji.m5;
import k6.h;
public abstract class b {
    public static final boolean f281a;
    public static final WeakHashMap f282b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f281a = true;
        f282b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, m5 m5Var) {
        if (m.f2594c.b()) {
            c(webView).f2596a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ue.a(new h(m5Var, 8)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.e.b() && f281a) {
            WeakHashMap weakHashMap = f282b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f2595a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f2595a.createWebView(webView));
    }
}
