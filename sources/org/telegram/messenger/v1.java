package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class v1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19194a;
    public final Object f19195b;

    public v1(Object obj, int i10) {
        this.f19194a = i10;
        this.f19195b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19194a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19195b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19195b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
