package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class w1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17978a;
    public final Object f17979b;

    public w1(Object obj, int i10) {
        this.f17978a = i10;
        this.f17979b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17978a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17979b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17979b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
