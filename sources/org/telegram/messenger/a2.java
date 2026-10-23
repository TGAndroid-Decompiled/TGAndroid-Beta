package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class a2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17894a;
    public final Object f17895b;

    public a2(Object obj, int i10) {
        this.f17894a = i10;
        this.f17895b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17894a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17895b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17895b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
