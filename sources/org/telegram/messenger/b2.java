package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class b2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19665a;
    public final Object f19666b;

    public b2(Object obj, int i10) {
        this.f19665a = i10;
        this.f19666b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19665a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19666b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19666b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
