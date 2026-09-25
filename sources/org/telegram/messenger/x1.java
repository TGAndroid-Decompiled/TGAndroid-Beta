package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18080a;
    public final Object f18081b;

    public x1(Object obj, int i10) {
        this.f18080a = i10;
        this.f18081b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18080a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18081b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18081b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
