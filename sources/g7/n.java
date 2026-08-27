package g7;

import android.content.Context;
import android.util.Log;

public abstract class n {
    public static String a(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 == 1) {
            return context.getString(2131701344);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                    return context.getString(2131701348);
                case 11:
                    return context.getString(2131701347);
                case 12:
                    return context.getString(2131701345);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i10);
                    return context.getString(2131701340);
            }
        }
        return context.getString(2131701346);
    }
}
