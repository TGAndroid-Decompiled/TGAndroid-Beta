package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class a2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17831a;
    public final Object f17832b;

    public a2(Object obj, int i10) {
        this.f17831a = i10;
        this.f17832b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17831a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17832b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17832b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
