package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class nt implements PushListenerController.IPushListenerServiceProvider {
    public static final nt f26062b = new Object();
    public Boolean f26063a;

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
        if (this.f26063a == null) {
            try {
                if (n6.d.f21524e.d(t0.f27013b, n6.e.f21526a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26063a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f26063a = Boolean.FALSE;
            }
        }
        return this.f26063a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(bz.f23287g)) {
            boolean z10 = s2.f26829a;
        } else if (s2.f26829a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22877e.c(new xr(this, 3));
    }
}
