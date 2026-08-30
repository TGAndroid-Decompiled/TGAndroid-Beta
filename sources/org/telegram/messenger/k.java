package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class k implements Runnable {
    public final int f17614a;
    public final Intent f17615b;

    public k(Intent intent, int i10) {
        this.f17614a = i10;
        this.f17615b = intent;
    }

    @Override
    public final void run() {
        switch (this.f17614a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f17615b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f17615b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f17615b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f17615b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f17615b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f17615b);
                return;
        }
    }
}
