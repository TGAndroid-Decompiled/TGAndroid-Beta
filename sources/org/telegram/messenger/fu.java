package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class fu implements PushListenerController.IPushListenerServiceProvider {
    public static final fu f15792b = new Object();
    public Boolean f15793a;

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
        if (this.f15793a == null) {
            try {
                if (k6.d.d.d(w0.f18945b, k6.e.f10936a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15793a = Boolean.valueOf(z10);
            } catch (Exception e) {
                f8.g(e, true);
                this.f15793a = Boolean.FALSE;
            }
        }
        return this.f15793a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(uz.f18516g)) {
            boolean z10 = v2.f18578a;
        } else if (v2.f18578a) {
            f8.b("FCM Registration not found.");
        }
        Utilities.e.c(new ns(this, 4));
    }
}
