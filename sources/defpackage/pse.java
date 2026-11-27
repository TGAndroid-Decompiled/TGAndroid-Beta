package defpackage;

import android.os.Build;
import android.util.Log;
public abstract class pse {
    public static void a(Object obj, String str, String str2) {
        String c = c(str);
        if (Log.isLoggable(c, 3)) {
            Log.d(c, String.format(str2, obj));
        }
    }

    public static void b(String str, String str2, Exception exc) {
        String c = c(str);
        if (Log.isLoggable(c, 6)) {
            Log.e(c, str2, exc);
        }
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }
}
