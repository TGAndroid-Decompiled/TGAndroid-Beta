package org.telegram.messenger.support.fingerprint;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.FileLog;
@TargetApi(23)
public final class FingerprintManagerCompatApi23 {
    private static FingerprintManager getFingerprintManager(Context context) {
        return (FingerprintManager) context.getSystemService("fingerprint");
    }

    public static boolean hasEnrolledFingerprints(Context context) {
        boolean hasEnrolledFingerprints;
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager == null) {
                return false;
            }
            hasEnrolledFingerprints = fingerprintManager.hasEnrolledFingerprints();
            return hasEnrolledFingerprints;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isHardwareDetected(Context context) {
        boolean isHardwareDetected;
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager == null) {
                return false;
            }
            isHardwareDetected = fingerprintManager.isHardwareDetected();
            return isHardwareDetected;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }
}
