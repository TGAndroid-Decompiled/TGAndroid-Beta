package org.telegram.messenger.ringtone;

import org.telegram.messenger.NotificationCenter;

public final class RingtoneDataStore$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final RingtoneDataStore f$0;

    public RingtoneDataStore$$ExternalSyntheticLambda1(RingtoneDataStore ringtoneDataStore, int i) {
        this.$r8$classId = i;
        this.f$0 = ringtoneDataStore;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.loadUserRingtones(false);
                break;
            default:
                NotificationCenter.getInstance(this.f$0.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                break;
        }
    }
}
