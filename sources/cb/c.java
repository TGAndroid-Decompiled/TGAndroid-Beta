package cb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final b6.h f2404a = new b6.h("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e6) {
            String concat = "Exception thrown when trying to get app version ".concat(e6.toString());
            b6.h hVar = f2404a;
            if (Log.isLoggable(hVar.f1728b, 6)) {
                String str = hVar.f1729c;
                if (str != null) {
                    concat = str.concat(concat);
                }
                Log.e("CommonUtils", concat);
                return "";
            }
            return "";
        }
    }
}
