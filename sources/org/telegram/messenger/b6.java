package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b6 implements RequestDelegate {
    public final int f19807a;
    public final int f19808b;
    public final int f19809c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public b6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9, int i10, int i11) {
        this.f19807a = i11;
        this.d = notificationCenterDelegate;
        this.f19808b = i9;
        this.f19809c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19807a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f19808b, this.f19809c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f19808b, this.f19809c, tLObject, tL_error);
                return;
        }
    }
}
