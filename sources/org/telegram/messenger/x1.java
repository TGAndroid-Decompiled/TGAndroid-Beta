package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18089a;
    public final Object f18090b;

    public x1(Object obj, int i10) {
        this.f18089a = i10;
        this.f18090b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18089a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18090b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18090b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
