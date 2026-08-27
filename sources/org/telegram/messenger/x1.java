package org.telegram.messenger;

public final class x1 implements NotificationCenter.NotificationCenterDelegate {

    public final int f22093a;

    public final Object f22094b;

    public x1(Object obj, int i10) {
        this.f22093a = i10;
        this.f22094b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f22093a) {
            case 0:
                ((ContactsLoadingObserver) this.f22094b).lambda$new$0(i10, i11, objArr);
                break;
            default:
                ((TelegramMediaSession) this.f22094b).lambda$new$0(i10, i11, objArr);
                break;
        }
    }
}
