package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.WeakHashMap;
public abstract class c {
    public static final boolean f17094a;
    public static final WeakHashMap f17095b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f17094a = true;
        f17095b = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
