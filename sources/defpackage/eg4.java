package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
public abstract class eg4 {
    public static boolean a(Context context) {
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.hasEnrolledFingerprints();
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    public static boolean b(Context context) {
        try {
            FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.isHardwareDetected();
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }
}
