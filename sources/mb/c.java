package mb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import org.telegram.messenger.m6;
public abstract class c {
    public static final m6 f19225a = new m6("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            String concat = "Exception thrown when trying to get app version ".concat(e10.toString());
            m6 m6Var = f19225a;
            if (Log.isLoggable(m6Var.f24168a, 6)) {
                String str = m6Var.f24169b;
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
