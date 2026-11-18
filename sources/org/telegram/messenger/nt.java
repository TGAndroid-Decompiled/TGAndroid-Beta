package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class nt implements PushListenerController.IPushListenerServiceProvider {
    public static final nt f25966b = new Object();
    public Boolean f25967a;

    @Override
    public final String getLogTitle() {
        return "Google Play Services";
    }

    @Override
    public final int getPushType() {
        return 2;
    }

    @Override
    public final boolean hasServices() {
        boolean z10;
        if (this.f25967a == null) {
            try {
                if (n6.d.f21428e.d(t0.f26913b, n6.e.f21430a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25967a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25967a = Boolean.FALSE;
            }
        }
        return this.f25967a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(bz.f23162g)) {
            boolean z10 = s2.f26721a;
        } else if (s2.f26721a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22779e.c(new xr(this, 3));
    }
}
