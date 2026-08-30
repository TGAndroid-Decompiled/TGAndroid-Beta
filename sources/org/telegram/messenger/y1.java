package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class y1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19013a;
    public final Object f19014b;

    public y1(Object obj, int i10) {
        this.f19013a = i10;
        this.f19014b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19013a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19014b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19014b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
