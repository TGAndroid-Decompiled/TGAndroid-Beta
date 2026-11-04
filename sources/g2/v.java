package g2;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.concurrent.Executor;
public abstract class v {
    public static void a(Context context, x xVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            u uVar = new u(xVar);
            telephonyManager.registerTelephonyCallback((Executor) xVar.f11918c, uVar);
            telephonyManager.unregisterTelephonyCallback(uVar);
        } catch (RuntimeException unused) {
            xVar.c(5);
        }
    }
}
