package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 implements RequestDelegate {
    public final int f17187a;
    public final int f17188b;
    public final int f17189c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17187a = i12;
        this.d = notificationCenterDelegate;
        this.f17188b = i10;
        this.f17189c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17187a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17188b, this.f17189c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f17188b, this.f17189c, tLObject, tL_error);
                return;
        }
    }
}
