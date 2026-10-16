package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f17148a;
    public final Intent f17149b;

    public i(Intent intent, int i10) {
        this.f17148a = i10;
        this.f17149b = intent;
    }

    @Override
    public final void run() {
        switch (this.f17148a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f17149b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f17149b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f17149b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f17149b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f17149b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f17149b);
                return;
        }
    }
}
