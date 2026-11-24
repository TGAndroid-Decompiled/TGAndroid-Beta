package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;
public abstract class juc {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, iuc iucVar) {
        if (muc.c.b()) {
            c(webView).a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new gy0(new u39(iucVar, (byte) 23)));
            return;
        }
        fyb.i("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static ouc c(WebView webView) {
        if (muc.e.b() && a) {
            WeakHashMap weakHashMap = b;
            ouc oucVar = (ouc) weakHashMap.get(webView);
            if (oucVar == null) {
                ouc oucVar2 = new ouc(nuc.a.createWebView(webView));
                weakHashMap.put(webView, oucVar2);
                return oucVar2;
            }
            return oucVar;
        }
        return new ouc(nuc.a.createWebView(webView));
    }
}
