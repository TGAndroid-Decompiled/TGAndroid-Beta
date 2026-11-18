package d5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import d6.i;
import e5.k;
import e5.l;
import e5.m;
import java.util.Set;
import java.util.WeakHashMap;
public abstract class b {
    public static final boolean f7853a;
    public static final WeakHashMap f7854b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f7853a = true;
        f7854b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (k.f10863c.b()) {
            c(webView).f10866a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new af.a(new i(aVar, 15)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static m c(WebView webView) {
        if (k.f10864e.b() && f7853a) {
            WeakHashMap weakHashMap = f7854b;
            m mVar = (m) weakHashMap.get(webView);
            if (mVar == null) {
                m mVar2 = new m(l.f10865a.createWebView(webView));
                weakHashMap.put(webView, mVar2);
                return mVar2;
            }
            return mVar;
        }
        return new m(l.f10865a.createWebView(webView));
    }
}
