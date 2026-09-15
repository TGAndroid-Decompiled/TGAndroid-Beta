package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f16362a;
    public final Intent f16363b;

    public i(Intent intent, int i10) {
        this.f16362a = i10;
        this.f16363b = intent;
    }

    @Override
    public final void run() {
        switch (this.f16362a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f16363b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f16363b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f16363b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f16363b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f16363b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f16363b);
                return;
        }
    }
}
