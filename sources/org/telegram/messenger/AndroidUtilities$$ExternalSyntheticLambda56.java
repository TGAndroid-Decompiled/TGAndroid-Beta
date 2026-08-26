package org.telegram.messenger;

import android.content.Intent;

public final class AndroidUtilities$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final Intent f$0;

    public AndroidUtilities$$ExternalSyntheticLambda56(int i, Intent intent) {
        this.$r8$classId = i;
        this.f$0 = intent;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.lambda$googleVoiceClientService_performAction$2(this.f$0);
                break;
            case 1:
                NotificationBadge.AdwHomeBadger.lambda$executeBadge$0(this.f$0);
                break;
            case 2:
                NotificationBadge.ApexHomeBadger.lambda$executeBadge$0(this.f$0);
                break;
            case 3:
                NotificationBadge.AsusHomeBadger.lambda$executeBadge$0(this.f$0);
                break;
            case 4:
                NotificationBadge.DefaultBadger.lambda$executeBadge$0(this.f$0);
                break;
            default:
                NotificationBadge.SonyHomeBadger.lambda$executeBadgeByBroadcast$0(this.f$0);
                break;
        }
    }
}
