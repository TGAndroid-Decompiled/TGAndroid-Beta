package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class j implements Runnable {
    public final int f17511a;
    public final Intent f17512b;

    public j(Intent intent, int i10) {
        this.f17511a = i10;
        this.f17512b = intent;
    }

    @Override
    public final void run() {
        switch (this.f17511a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f17512b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f17512b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f17512b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f17512b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f17512b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f17512b);
                return;
        }
    }
}
