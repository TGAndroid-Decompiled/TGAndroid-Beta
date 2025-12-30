package org.telegram.messenger.support.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.FileLog;

public abstract class FingerprintManagerCompatApi23 {
    private static FingerprintManager getFingerprintManager(Context context) {
        return FingerprintManagerCompatApi23$$ExternalSyntheticApiModelOutline2.m(context.getSystemService("fingerprint"));
    }

    public static boolean hasEnrolledFingerprints(Context context) {
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.hasEnrolledFingerprints();
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static boolean isHardwareDetected(Context context) {
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager == null) {
                return false;
            }
            return fingerprintManager.isHardwareDetected();
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }
}
