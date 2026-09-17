package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class j implements Runnable {
    public final int f18055a;
    public final Intent f18056b;

    public j(Intent intent, int i10) {
        this.f18055a = i10;
        this.f18056b = intent;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f18056b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f18056b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f18056b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f18056b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f18056b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f18056b);
                return;
        }
    }
}
