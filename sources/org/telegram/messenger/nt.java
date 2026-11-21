package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class nt implements PushListenerController.IPushListenerServiceProvider {
    public static final nt f25994b = new Object();
    public Boolean f25995a;

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
        if (this.f25995a == null) {
            try {
                if (n6.d.f21456e.d(t0.f26941b, n6.e.f21458a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25995a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25995a = Boolean.FALSE;
            }
        }
        return this.f25995a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(bz.f23190g)) {
            boolean z10 = s2.f26749a;
        } else if (s2.f26749a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22807e.c(new xr(this, 3));
    }
}
