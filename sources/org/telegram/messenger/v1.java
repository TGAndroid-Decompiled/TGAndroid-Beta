package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class v1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17502a;
    public final Object f17503b;

    public v1(Object obj, int i10) {
        this.f17502a = i10;
        this.f17503b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17502a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17503b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17503b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
