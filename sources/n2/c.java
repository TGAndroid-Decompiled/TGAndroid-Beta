package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.WeakHashMap;
public abstract class c {
    public static final boolean f14219a;
    public static final WeakHashMap f14220b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f14219a = true;
        f14220b = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
