package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class y1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18997a;
    public final Object f18998b;

    public y1(Object obj, int i10) {
        this.f18997a = i10;
        this.f18998b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18997a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18998b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18998b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
