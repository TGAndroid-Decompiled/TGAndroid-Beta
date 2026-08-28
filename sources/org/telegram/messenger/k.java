package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class k implements Runnable {
    public final int f20737a;
    public final Intent f20738b;

    public k(Intent intent, int i9) {
        this.f20737a = i9;
        this.f20738b = intent;
    }

    @Override
    public final void run() {
        switch (this.f20737a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f20738b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f20738b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f20738b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f20738b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f20738b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f20738b);
                return;
        }
    }
}
