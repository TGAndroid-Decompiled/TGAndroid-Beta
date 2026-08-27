package g7;

import android.util.Log;

public abstract class f0 {
    public static void a(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            if (Log.isLoggable("Vision", 3)) {
                Log.e("Vision", String.format(str, objArr), exc);
                return;
            }
            String str2 = String.format(str, objArr);
            String strValueOf = String.valueOf(exc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + str2.length() + 2);
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(strValueOf);
            Log.e("Vision", sb2.toString());
        }
    }
}
