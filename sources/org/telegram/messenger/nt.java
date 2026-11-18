package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class nt implements PushListenerController.IPushListenerServiceProvider {
    public static final nt f25968b = new Object();
    public Boolean f25969a;

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
        if (this.f25969a == null) {
            try {
                if (n6.d.f21431e.d(t0.f26915b, n6.e.f21433a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25969a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25969a = Boolean.FALSE;
            }
        }
        return this.f25969a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(bz.f23165g)) {
            boolean z10 = s2.f26723a;
        } else if (s2.f26723a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22782e.c(new xr(this, 3));
    }
}
