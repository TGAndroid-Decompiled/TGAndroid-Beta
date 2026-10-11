package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19792a;
    public final Object f19793b;

    public x1(Object obj, int i10) {
        this.f19792a = i10;
        this.f19793b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19792a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19793b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19793b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
