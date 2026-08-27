package d5;

import android.content.Context;
import android.telephony.TelephonyManager;

public abstract class w {
    public static void a(Context context, x xVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            v vVar = new v(xVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), vVar);
            telephonyManager.unregisterTelephonyCallback(vVar);
        } catch (RuntimeException unused) {
            x.a(xVar, 5);
        }
    }
}
