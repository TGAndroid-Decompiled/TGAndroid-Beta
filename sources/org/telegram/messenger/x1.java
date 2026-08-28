package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f22070a;
    public final Object f22071b;

    public x1(Object obj, int i9) {
        this.f22070a = i9;
        this.f22071b = obj;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object[] objArr) {
        switch (this.f22070a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f22071b, i9, i10, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f22071b).lambda$new$0(i9, i10, objArr);
                return;
        }
    }
}
