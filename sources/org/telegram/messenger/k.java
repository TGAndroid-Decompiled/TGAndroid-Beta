package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class k implements Runnable {
    public final int f20472a;
    public final Intent f20473b;

    public k(Intent intent, int i10) {
        this.f20472a = i10;
        this.f20473b = intent;
    }

    @Override
    public final void run() {
        switch (this.f20472a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f20473b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f20473b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f20473b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f20473b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f20473b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f20473b);
                return;
        }
    }
}
