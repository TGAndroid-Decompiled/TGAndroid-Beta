package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f22137a;
    public final Object f22138b;

    public x1(Object obj, int i10) {
        this.f22137a = i10;
        this.f22138b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f22137a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f22138b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f22138b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
