package d5;

import android.content.Context;
import android.telephony.TelephonyManager;
public abstract class v {
    public static void a(Context context, w wVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            u uVar = new u(wVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), uVar);
            telephonyManager.unregisterTelephonyCallback(uVar);
        } catch (RuntimeException unused) {
            w.a(wVar, 5);
        }
    }
}
