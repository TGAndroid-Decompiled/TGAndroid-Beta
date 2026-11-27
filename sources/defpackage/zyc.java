package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
public abstract class zyc {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, yyc yycVar) {
        if (czc.c.b()) {
            c(webView).a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new oy0(new ve9(yycVar, (byte) 20)));
            return;
        }
        qyc.c("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static ezc c(WebView webView) {
        if (czc.e.b() && a) {
            WeakHashMap weakHashMap = b;
            ezc ezcVar = (ezc) weakHashMap.get(webView);
            if (ezcVar == null) {
                ezc ezcVar2 = new ezc(dzc.a.createWebView(webView));
                weakHashMap.put(webView, ezcVar2);
                return ezcVar2;
            }
            return ezcVar;
        }
        return new ezc(dzc.a.createWebView(webView));
    }
}
