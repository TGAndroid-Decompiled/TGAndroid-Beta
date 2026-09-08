package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class v1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19221a;
    public final Object f19222b;

    public v1(Object obj, int i10) {
        this.f19221a = i10;
        this.f19222b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19221a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19222b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19222b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
