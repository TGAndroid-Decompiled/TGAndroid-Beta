package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.messenger.PushListenerController;
public final class b implements PushListenerController.IPushListenerServiceProvider {
    public static final b b = new Object();
    public Boolean a;

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
        boolean z;
        Boolean bool = this.a;
        if (bool == null) {
            try {
                if (cy4.e.c(a.b, dy4.a) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.a = valueOf;
                bool = valueOf;
            } catch (Exception e) {
                fa4.g(e, true);
                bool = Boolean.FALSE;
                this.a = bool;
            }
        }
        return bool.booleanValue();
    }

    @Override
    public final void onRequestPushToken() {
        if (!TextUtils.isEmpty(gba.f)) {
            boolean z = w01.a;
        } else if (w01.a) {
            fa4.b("FCM Registration not found.");
        }
        Utilities.e.c(new sr8(this, (byte) 4));
    }
}
