package a8;

import android.content.Context;
import android.util.Log;
public abstract class n1 {
    public static String a(Context context, int i7) {
        if (context == null) {
            return "";
        }
        if (i7 != 1) {
            if (i7 != 7) {
                switch (i7) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131689613);
                    case 11:
                        return context.getString(2131689612);
                    case 12:
                        return context.getString(2131689610);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i7);
                        return context.getString(2131689578);
                }
            }
            return context.getString(2131689611);
        }
        return context.getString(2131689609);
    }
}
