package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
public abstract class kwc {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, jwc jwcVar) {
        if (nwc.c.b()) {
            c(webView).a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new nz0(new x59(jwcVar, (byte) 23)));
            return;
        }
        rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static pwc c(WebView webView) {
        if (nwc.e.b() && a) {
            WeakHashMap weakHashMap = b;
            pwc pwcVar = (pwc) weakHashMap.get(webView);
            if (pwcVar == null) {
                pwc pwcVar2 = new pwc(owc.a.createWebView(webView));
                weakHashMap.put(webView, pwcVar2);
                return pwcVar2;
            }
            return pwcVar;
        }
        return new pwc(owc.a.createWebView(webView));
    }
}
