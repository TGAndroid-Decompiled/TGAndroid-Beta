package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class tt implements PushListenerController.IPushListenerServiceProvider {
    public static final tt f25661b = new Object();
    public Boolean f25662a;

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
        if (this.f25662a == null) {
            try {
                if (n6.d.f20498e.d(t0.f25566b, n6.e.f20500a) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f25662a = Boolean.valueOf(z9);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25662a = Boolean.FALSE;
            }
        }
        return this.f25662a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(iz.f23402g)) {
            boolean z9 = r2.f25212a;
        } else if (r2.f25212a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f21336e.c(new ds(this, 3));
    }
}
