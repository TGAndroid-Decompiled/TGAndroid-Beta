package org.telegram.messenger;

import android.content.Intent;
import org.telegram.messenger.NotificationBadge;
public final class j implements Runnable {
    public final int f19011a;
    public final Intent f19012b;

    public j(Intent intent, int i10) {
        this.f19011a = i10;
        this.f19012b = intent;
    }

    @Override
    public final void run() {
        switch (this.f19011a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f19012b);
                return;
            case 1:
                NotificationBadge.AdwHomeBadger.a(this.f19012b);
                return;
            case 2:
                NotificationBadge.ApexHomeBadger.a(this.f19012b);
                return;
            case 3:
                NotificationBadge.AsusHomeBadger.a(this.f19012b);
                return;
            case 4:
                NotificationBadge.DefaultBadger.a(this.f19012b);
                return;
            default:
                NotificationBadge.SonyHomeBadger.a(this.f19012b);
                return;
        }
    }
}
