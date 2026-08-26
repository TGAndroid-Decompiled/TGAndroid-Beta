package org.telegram.messenger;

public final class TelegramMediaSession$$ExternalSyntheticLambda4 implements NotificationCenter.NotificationCenterDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public TelegramMediaSession$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object[] objArr) {
        switch (this.$r8$classId) {
            case 0:
                ((TelegramMediaSession) this.f$0).lambda$new$0(i, i2, objArr);
                break;
            default:
                ((ContactsLoadingObserver) this.f$0).lambda$new$0(i, i2, objArr);
                break;
        }
    }
}
