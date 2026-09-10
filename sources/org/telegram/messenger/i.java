package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f15409a;
    public final Intent f15410b;

    public i(Intent intent, int i10) {
        this.f15409a = i10;
        this.f15410b = intent;
    }

    @Override
    public final void run() {
        switch (this.f15409a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f15410b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f15410b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f15410b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f15410b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f15410b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f15410b);
                return;
        }
    }
}
