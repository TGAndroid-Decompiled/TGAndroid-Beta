package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class v1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17511a;
    public final Object f17512b;

    public v1(Object obj, int i10) {
        this.f17511a = i10;
        this.f17512b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17511a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17512b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17512b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
