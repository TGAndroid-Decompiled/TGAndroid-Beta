package ab;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class c {
    public static final d9.c f304a = new d9.c("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            d9.c cVar = f304a;
            if (Log.isLoggable(cVar.f5536b, 6)) {
                String str = cVar.f5537c;
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
