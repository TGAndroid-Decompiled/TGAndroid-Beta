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
    public static final boolean f7847a;
    public static final WeakHashMap f7848b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f7847a = true;
        f7848b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (k.f10856c.b()) {
            c(webView).f10859a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new af.a(new i(aVar, 16)));
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static m c(WebView webView) {
        if (k.f10857e.b() && f7847a) {
            WeakHashMap weakHashMap = f7848b;
            m mVar = (m) weakHashMap.get(webView);
            if (mVar == null) {
                m mVar2 = new m(l.f10858a.createWebView(webView));
                weakHashMap.put(webView, mVar2);
                return mVar2;
            }
            return mVar;
        }
        return new m(l.f10858a.createWebView(webView));
    }
}
