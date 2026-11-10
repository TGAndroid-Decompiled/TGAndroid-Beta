package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class tt implements PushListenerController.IPushListenerServiceProvider {
    public static final tt f25665b = new Object();
    public Boolean f25666a;

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
        if (this.f25666a == null) {
            try {
                if (n6.d.f20503e.d(t0.f25570b, n6.e.f20505a) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f25666a = Boolean.valueOf(z9);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f25666a = Boolean.FALSE;
            }
        }
        return this.f25666a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(iz.f23406g)) {
            boolean z9 = r2.f25216a;
        } else if (r2.f25216a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f21341e.c(new ds(this, 3));
    }
}
