package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19760a;
    public final Object f19761b;

    public x1(Object obj, int i10) {
        this.f19760a = i10;
        this.f19761b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19760a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19761b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19761b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
