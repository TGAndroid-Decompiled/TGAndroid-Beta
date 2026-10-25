package b5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import c5.m;
import c5.n;
import c5.o;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.ui.Components.voip.j1;
import za.c;
public abstract class a {
    public static final boolean f3646a;
    public static final WeakHashMap f3647b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f3646a = true;
        f3647b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, j1 j1Var) {
        if (m.f6150c.b()) {
            c(webView).f6152a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ve.a(new c(j1Var, 9)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (m.e.b() && f3646a) {
            WeakHashMap weakHashMap = f3647b;
            o oVar = (o) weakHashMap.get(webView);
            if (oVar == null) {
                o oVar2 = new o(n.f6151a.createWebView(webView));
                weakHashMap.put(webView, oVar2);
                return oVar2;
            }
            return oVar;
        }
        return new o(n.f6151a.createWebView(webView));
    }
}
