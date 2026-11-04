package c5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.support.v4.media.c;
import android.webkit.WebView;
import d5.l;
import d5.m;
import d5.n;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e3;
public abstract class a {
    public static final boolean f4210a;
    public static final WeakHashMap f4211b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f4210a = true;
        f4211b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, e3 e3Var) {
        if (l.f8580c.b()) {
            c(webView).f8583a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new xe.a(new c(e3Var, 12)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static n c(WebView webView) {
        if (l.f8581e.b() && f4210a) {
            WeakHashMap weakHashMap = f4211b;
            n nVar = (n) weakHashMap.get(webView);
            if (nVar == null) {
                n nVar2 = new n(m.f8582a.createWebView(webView));
                weakHashMap.put(webView, nVar2);
                return nVar2;
            }
            return nVar;
        }
        return new n(m.f8582a.createWebView(webView));
    }
}
