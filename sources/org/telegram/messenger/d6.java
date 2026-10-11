package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 implements RequestDelegate {
    public final int f17619a;
    public final int f17620b;
    public final int f17621c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public d6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17619a = i12;
        this.d = notificationCenterDelegate;
        this.f17620b = i10;
        this.f17621c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17619a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17620b, this.f17621c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f17620b, this.f17621c, tLObject, tL_error);
                return;
        }
    }
}
