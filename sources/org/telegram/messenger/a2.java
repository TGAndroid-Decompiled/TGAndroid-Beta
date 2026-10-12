package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class a2 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17034a;
    public final Object f17035b;

    public a2(Object obj, int i10) {
        this.f17034a = i10;
        this.f17035b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17034a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17035b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17035b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
