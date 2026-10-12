package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f17833a;
    public final Intent f17834b;

    public i(Intent intent, int i10) {
        this.f17833a = i10;
        this.f17834b = intent;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f17834b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f17834b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f17834b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f17834b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f17834b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f17834b);
                return;
        }
    }
}
