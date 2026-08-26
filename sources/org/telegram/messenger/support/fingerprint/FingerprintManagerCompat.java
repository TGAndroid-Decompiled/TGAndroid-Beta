package org.telegram.messenger.support.fingerprint;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.dynamite.zzk;
import org.telegram.ui.iv.RichMediaCell;

public final class FingerprintManagerCompat {
    public static final FingerprintManagerCompatImpl IMPL;

    public interface FingerprintManagerCompatImpl {
        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new zzk(22);
        } else {
            IMPL = new RichMediaCell.AnonymousClass2(23);
        }
    }
}
