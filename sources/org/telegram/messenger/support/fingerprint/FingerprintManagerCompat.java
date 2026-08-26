package org.telegram.messenger.support.fingerprint;

import android.content.Context;
import android.os.Build;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.iv.RichEditor;

public final class FingerprintManagerCompat {
    public static final FingerprintManagerCompatImpl IMPL;

    public interface FingerprintManagerCompatImpl {
        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new RichEditor.AnonymousClass12(23);
        } else {
            IMPL = new ChatActivity.AnonymousClass40(23);
        }
    }
}
