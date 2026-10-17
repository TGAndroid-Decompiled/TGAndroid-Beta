package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h6 implements RequestDelegate {
    public final int f18503a;
    public final int f18504b;
    public final int f18505c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public h6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f18503a = i12;
        this.d = notificationCenterDelegate;
        this.f18504b = i10;
        this.f18505c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18503a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f18504b, this.f18505c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f18504b, this.f18505c, tLObject, tL_error);
                return;
        }
    }
}
