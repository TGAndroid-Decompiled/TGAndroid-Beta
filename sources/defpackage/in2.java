package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
public abstract class in2 {
    public static final j5 a = new j5("CommonUtils", "", (byte) 2);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            j5 j5Var = a;
            if (Log.isLoggable(j5Var.b, 6)) {
                String str = j5Var.c;
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
