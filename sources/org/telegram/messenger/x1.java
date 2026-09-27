package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18074a;
    public final Object f18075b;

    public x1(Object obj, int i10) {
        this.f18074a = i10;
        this.f18075b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18074a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18075b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18075b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
