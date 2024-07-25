package org.telegram.messenger.support.fingerprint;

import android.content.Context;
import android.os.Build;
public final class FingerprintManagerCompat {
    static final FingerprintManagerCompatImpl IMPL;
    private Context mContext;

    private interface FingerprintManagerCompatImpl {
        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    private static class LegacyFingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override
        public boolean hasEnrolledFingerprints(Context context) {
            return false;
        }

        @Override
        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new Api23FingerprintManagerCompatImpl();
        } else {
            IMPL = new LegacyFingerprintManagerCompatImpl();
        }
    }

    public boolean hasEnrolledFingerprints() {
        return IMPL.hasEnrolledFingerprints(this.mContext);
    }

    public boolean isHardwareDetected() {
        return IMPL.isHardwareDetected(this.mContext);
    }

    private static class Api23FingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override
        public boolean hasEnrolledFingerprints(Context context) {
            return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
        }

        @Override
        public boolean isHardwareDetected(Context context) {
            return FingerprintManagerCompatApi23.isHardwareDetected(context);
        }
    }
}
