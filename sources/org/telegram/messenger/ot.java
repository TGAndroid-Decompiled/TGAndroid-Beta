package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class ot implements PushListenerController.IPushListenerServiceProvider {
    public static final ot f26129b = new Object();
    public Boolean f26130a;

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
        if (this.f26130a == null) {
            try {
                if (n6.d.f21425e.d(t0.f26895b, n6.e.f21427a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26130a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f26130a = Boolean.FALSE;
            }
        }
        return this.f26130a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(cz.f23371g)) {
            boolean z10 = s2.f26694a;
        } else if (s2.f26694a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22774e.c(new yr(this, 3));
    }
}
