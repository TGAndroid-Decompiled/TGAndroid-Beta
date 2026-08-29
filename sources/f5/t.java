package f5;

import android.content.Context;
import android.telephony.TelephonyManager;
public abstract class t {
    public static void a(Context context, u uVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            s sVar = new s(uVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), sVar);
            telephonyManager.unregisterTelephonyCallback(sVar);
        } catch (RuntimeException unused) {
            u.c(uVar, 5);
        }
    }
}
