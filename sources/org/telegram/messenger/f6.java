package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f6 implements RequestDelegate {
    public final int f18629a;
    public final int f18630b;
    public final int f18631c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public f6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f18629a = i12;
        this.d = notificationCenterDelegate;
        this.f18630b = i10;
        this.f18631c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18629a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f18630b, this.f18631c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f18630b, this.f18631c, tLObject, tL_error);
                return;
        }
    }
}
