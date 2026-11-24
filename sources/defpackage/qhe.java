package defpackage;

import android.content.Context;
import android.util.Log;
public abstract class qhe {
    public static String a(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131689613);
                    case 11:
                        return context.getString(2131689612);
                    case 12:
                        return context.getString(2131689610);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i);
                        return context.getString(2131689578);
                }
            }
            return context.getString(2131689611);
        }
        return context.getString(2131689609);
    }
}
