package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class y1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f20667a;
    public final Object f20668b;

    public y1(Object obj, int i10) {
        this.f20667a = i10;
        this.f20668b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f20667a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f20668b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f20668b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
