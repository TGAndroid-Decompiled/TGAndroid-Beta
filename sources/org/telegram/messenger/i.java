package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f18097a;
    public final Intent f18098b;

    public i(Intent intent, int i10) {
        this.f18097a = i10;
        this.f18098b = intent;
    }

    @Override
    public final void run() {
        switch (this.f18097a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f18098b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f18098b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f18098b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f18098b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f18098b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f18098b);
                return;
        }
    }
}
