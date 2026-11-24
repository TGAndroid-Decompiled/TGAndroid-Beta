package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.webrtc.JniCommon;
public final class px6 implements Runnable {
    public final byte a;
    public final long b;

    public px6(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                JniCommon.nativeReleaseRef(j);
                return;
            case 1:
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(mu1.W9(j));
                    return;
                }
                return;
            case 2:
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    S2.presentFragment(mu1.W9(j));
                    return;
                }
                return;
            case 3:
                gb8.d.remove(Long.valueOf(j));
                return;
            case 4:
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    S3.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            default:
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    S4.presentFragment(mu1.W9(j));
                    return;
                }
                return;
        }
    }
}
