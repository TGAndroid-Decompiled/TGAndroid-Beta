package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class i implements Runnable {
    public final int f16543a;
    public final Intent f16544b;

    public i(Intent intent, int i10) {
        this.f16543a = i10;
        this.f16544b = intent;
    }

    @Override
    public final void run() {
        switch (this.f16543a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f16544b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f16544b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f16544b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f16544b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f16544b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f16544b);
                return;
        }
    }
}
