package org.telegram.messenger;

import android.content.Intent;

public final class k implements Runnable {

    public final int f20722a;

    public final Intent f20723b;

    public k(Intent intent, int i10) {
        this.f20722a = i10;
        this.f20723b = intent;
    }

    @Override
    public final void run() {
        switch (this.f20722a) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f20723b);
                break;
            case 1:
                NotificationBadge.AdwHomeBadger.lambda$executeBadge$0(this.f20723b);
                break;
            case 2:
                NotificationBadge.ApexHomeBadger.lambda$executeBadge$0(this.f20723b);
                break;
            case 3:
                NotificationBadge.AsusHomeBadger.lambda$executeBadge$0(this.f20723b);
                break;
            case 4:
                NotificationBadge.DefaultBadger.lambda$executeBadge$0(this.f20723b);
                break;
            default:
                NotificationBadge.SonyHomeBadger.lambda$executeBadgeByBroadcast$0(this.f20723b);
                break;
        }
    }
}
