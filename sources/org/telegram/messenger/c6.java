package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c6 implements RequestDelegate {
    public final int f15999a;
    public final int f16000b;
    public final int f16001c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f15999a = i12;
        this.d = notificationCenterDelegate;
        this.f16000b = i10;
        this.f16001c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15999a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f16000b, this.f16001c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$359(this.f16000b, this.f16001c, tLObject, tL_error);
                return;
        }
    }
}
