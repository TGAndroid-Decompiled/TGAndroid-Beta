package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.WeakHashMap;
public abstract class a {
    public static final boolean f15192a;
    public static final WeakHashMap f15193b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f15192a = true;
        f15193b = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
