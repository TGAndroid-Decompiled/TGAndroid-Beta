package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class j implements Runnable {
    public final int f18010a;
    public final Intent f18011b;

    public j(Intent intent, int i10) {
        this.f18010a = i10;
        this.f18011b = intent;
    }

    @Override
    public final void run() {
        switch (this.f18010a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f18011b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f18011b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f18011b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f18011b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f18011b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f18011b);
                return;
        }
    }
}
