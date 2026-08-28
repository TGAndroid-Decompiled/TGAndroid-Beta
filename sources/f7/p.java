package f7;

import android.content.Context;
import android.util.Log;
public abstract class p {
    public static String a(Context context, int i9) {
        if (context == null) {
            return "";
        }
        if (i9 != 1) {
            if (i9 != 7) {
                switch (i9) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131701348);
                    case 11:
                        return context.getString(2131701347);
                    case 12:
                        return context.getString(2131701345);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i9);
                        return context.getString(2131701340);
                }
            }
            return context.getString(2131701346);
        }
        return context.getString(2131701344);
    }
}
