package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f16606a;
    public final Intent f16607b;

    public i(Intent intent, int i10) {
        this.f16606a = i10;
        this.f16607b = intent;
    }

    @Override
    public final void run() {
        switch (this.f16606a) {
            case 0:
                AndroidUtilities.A(this.f16607b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f16607b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f16607b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f16607b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f16607b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f16607b);
                return;
        }
    }
}
