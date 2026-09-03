package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 implements RequestDelegate {
    public final int f17167a;
    public final int f17168b;
    public final int f17169c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17167a = i12;
        this.d = notificationCenterDelegate;
        this.f17168b = i10;
        this.f17169c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17167a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17168b, this.f17169c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17168b, this.f17169c, tLObject, tL_error);
                return;
        }
    }
}
