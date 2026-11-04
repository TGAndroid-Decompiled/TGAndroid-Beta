package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class lt implements PushListenerController.IPushListenerServiceProvider {
    public static final lt f24103b = new Object();
    public Boolean f24104a;

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
        if (this.f24104a == null) {
            try {
                if (m6.d.f19186e.d(t0.f25457b, m6.e.f19188a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f24104a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f24104a = Boolean.FALSE;
            }
        }
        return this.f24104a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(az.f21629g)) {
            boolean z10 = r2.f25040a;
        } else if (r2.f25040a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f21387e.c(new vs(this, 3));
    }
}
