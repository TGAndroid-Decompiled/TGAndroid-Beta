package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class a2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17033a;
    public final Object f17034b;

    public a2(Object obj, int i10) {
        this.f17033a = i10;
        this.f17034b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17033a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17034b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17034b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
