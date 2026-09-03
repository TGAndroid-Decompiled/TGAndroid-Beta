package h7;

import android.content.Context;
import android.util.Log;
public abstract class s {
    public static r f7020a;

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
                        return context.getString(2131689597);
                    case 11:
                        return context.getString(2131689596);
                    case 12:
                        return context.getString(2131689594);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i10);
                        return context.getString(2131689577);
                }
            }
            return context.getString(2131689595);
        }
        return context.getString(2131689593);
    }

    public static synchronized q b(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (f7020a == null) {
                    f7020a = new r(0);
                }
                qVar = (q) f7020a.F(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
