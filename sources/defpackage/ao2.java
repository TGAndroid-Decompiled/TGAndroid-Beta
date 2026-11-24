package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class ao2 {
    public static final s13 a = new s13("CommonUtils", "", (byte) 1);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            s13 s13Var = a;
            if (Log.isLoggable(s13Var.b, 6)) {
                String str = s13Var.c;
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
