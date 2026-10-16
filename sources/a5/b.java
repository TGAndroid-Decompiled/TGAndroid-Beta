package a5;

import a4.l;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;
import ji.m5;
public abstract class b {
    public static final boolean f283a;
    public static final WeakHashMap f284b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f283a = true;
        f284b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, m5 m5Var) {
        if (m.f2598c.b()) {
            c(webView).f2600a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ue.a(new l(m5Var, 7)));
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
                o oVar2 = new o(n.f2599a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f2599a.createWebView(webView));
    }
}
