package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class j implements Runnable {
    public final int f19009a;
    public final Intent f19010b;

    public j(Intent intent, int i10) {
        this.f19009a = i10;
        this.f19010b = intent;
    }

    @Override
    public final void run() {
        switch (this.f19009a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f19010b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f19010b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f19010b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f19010b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f19010b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f19010b);
                return;
        }
    }
}
