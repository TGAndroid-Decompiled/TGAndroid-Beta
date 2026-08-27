package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class d6 implements RequestDelegate {

    public final int f20022a;

    public final int f20023b;

    public final int f20024c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public d6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f20022a = i12;
        this.d = notificationCenterDelegate;
        this.f20023b = i10;
        this.f20024c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20022a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f20023b, this.f20024c, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f20023b, this.f20024c, tLObject, tL_error);
                break;
        }
    }
}
