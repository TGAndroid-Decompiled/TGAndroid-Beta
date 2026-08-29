package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class k implements Runnable {
    public final int f20719a;
    public final Intent f20720b;

    public k(Intent intent, int i10) {
        this.f20719a = i10;
        this.f20720b = intent;
    }

    @Override
    public final void run() {
        switch (this.f20719a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f20720b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f20720b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f20720b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f20720b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f20720b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f20720b);
                return;
        }
    }
}
