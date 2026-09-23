package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17819a;
    public final Object f17820b;

    public x1(Object obj, int i10) {
        this.f17819a = i10;
        this.f17820b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17819a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17820b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17820b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
