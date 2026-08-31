package j7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
public abstract class n {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.k0.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean b(Context context) {
        KeyguardManager a2 = a(context);
        if (a2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.k0.b(a2);
        }
        return androidx.biometric.j0.a(a2);
    }
}
