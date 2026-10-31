package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class eu implements PushListenerController.IPushListenerServiceProvider {
    public static final eu f15451b = new Object();
    public Boolean f15452a;

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
        if (this.f15452a == null) {
            try {
                if (k6.d.d.d(w0.f19025b, k6.e.f10935a) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15452a = Boolean.valueOf(z10);
            } catch (Exception e) {
                f8.g(e, true);
                this.f15452a = Boolean.FALSE;
            }
        }
        return this.f15452a.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(tz.f18147g)) {
            boolean z10 = v2.f18448a;
        } else if (v2.f18448a) {
            f8.b("FCM Registration not found.");
        }
        Utilities.e.c(new ms(this, 4));
    }
}
