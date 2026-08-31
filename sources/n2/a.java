package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.WeakHashMap;
public abstract class a {
    public static final boolean f15190a;
    public static final WeakHashMap f15191b;

    static {
        Uri.parse("*");
        Uri.parse("");
        f15190a = true;
        f15191b = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
