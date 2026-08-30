package h7;

import android.content.Context;
import android.util.Log;
public abstract class s {
    public static r f7033a;

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
                        return context.getString(2131701362);
                    case 11:
                        return context.getString(2131701361);
                    case 12:
                        return context.getString(2131701359);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        return context.getString(2131701342);
                }
            }
            return context.getString(2131701360);
        }
        return context.getString(2131701358);
    }

    public static synchronized q b(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (f7033a == null) {
                    f7033a = new r(0);
                }
                qVar = (q) f7033a.F(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
