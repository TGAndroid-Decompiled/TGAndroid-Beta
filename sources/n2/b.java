package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import ja.c;
import java.util.Set;
import java.util.WeakHashMap;
import o2.l;
import o2.m;
import o2.n;
public abstract class b {
    public static final boolean f14204a;
    public static final WeakHashMap f14205b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f14204a = true;
        f14205b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (l.f16198c.b()) {
            c(webView).f16200a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ee.a(new c(aVar, 23)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static n c(WebView webView) {
        if (l.e.b() && f14204a) {
            WeakHashMap weakHashMap = f14205b;
            n nVar = (n) weakHashMap.get(webView);
            if (nVar == null) {
                n nVar2 = new n(m.f16199a.createWebView(webView));
                weakHashMap.put(webView, nVar2);
                return nVar2;
            }
            return nVar;
        }
        return new n(m.f16199a.createWebView(webView));
    }
}
