package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class qt implements PushListenerController.IPushListenerServiceProvider {
    public static final qt f26137b = new Object();
    public Boolean f26138a;

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
        if (this.f26138a == null) {
            try {
                if (n6.d.f21067e.d(t0.f26609b, n6.e.f21069a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f26138a = Boolean.valueOf(z10);
            } catch (Exception e10) {
                a8.g(e10, true);
                this.f26138a = Boolean.FALSE;
            }
        }
        return this.f26138a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(gz.f23949g)) {
            boolean z10 = r2.f26206a;
        } else if (r2.f26206a) {
            a8.b("FCM Registration not found.");
        }
        Utilities.f22416e.c(new as(this, 3));
    }
}
