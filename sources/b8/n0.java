package b8;

import android.content.Context;
import android.util.Log;
public abstract class n0 {
    public static String a(Context context, int i3) {
        if (context == null) {
            return "";
        }
        if (i3 != 1) {
            if (i3 != 7) {
                switch (i3) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131689613);
                    case 11:
                        return context.getString(2131689612);
                    case 12:
                        return context.getString(2131689610);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i3);
                        return context.getString(2131689578);
                }
            }
            return context.getString(2131689611);
        }
        return context.getString(2131689609);
    }
}
