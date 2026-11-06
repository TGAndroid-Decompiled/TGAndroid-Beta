package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class tt implements PushListenerController.IPushListenerServiceProvider {
    public static final tt f25652b = new Object();
    public Boolean f25653a;

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
        boolean z9;
        if (this.f25653a == null) {
            try {
                if (n6.d.f20495e.d(t0.f25555b, n6.e.f20497a) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f25653a = Boolean.valueOf(z9);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25653a = Boolean.FALSE;
            }
        }
        return this.f25653a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(iz.f23374g)) {
            boolean z9 = r2.f25191a;
        } else if (r2.f25191a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f21333e.c(new ds(this, 3));
    }
}
