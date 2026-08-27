package g7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

public abstract class o {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.h0.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean b(Context context) {
        KeyguardManager keyguardManagerA = a(context);
        if (keyguardManagerA == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 ? androidx.biometric.h0.b(keyguardManagerA) : androidx.biometric.g0.a(keyguardManagerA);
    }
}
