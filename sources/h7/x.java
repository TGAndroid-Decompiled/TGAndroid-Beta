package h7;

import android.content.Context;
import android.util.Log;
public abstract class x {
    public static String a(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 7) {
                switch (i10) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(2131701350);
                    case 11:
                        return context.getString(2131701349);
                    case 12:
                        return context.getString(2131701347);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        return context.getString(2131701342);
                }
            }
            return context.getString(2131701348);
        }
        return context.getString(2131701346);
    }
}
