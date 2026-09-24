package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18065a;
    public final Object f18066b;

    public x1(Object obj, int i10) {
        this.f18065a = i10;
        this.f18066b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18065a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18066b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18066b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
