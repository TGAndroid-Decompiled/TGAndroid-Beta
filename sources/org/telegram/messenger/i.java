package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f18099a;
    public final Intent f18100b;

    public i(Intent intent, int i10) {
        this.f18099a = i10;
        this.f18100b = intent;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f18100b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f18100b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f18100b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f18100b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f18100b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f18100b);
                return;
        }
    }
}
