package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class b2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19676a;
    public final Object f19677b;

    public b2(Object obj, int i10) {
        this.f19676a = i10;
        this.f19677b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19676a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19677b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19677b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
