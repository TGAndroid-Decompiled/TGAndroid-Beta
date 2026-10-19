package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final int f18579a;
    public final int f18580b;
    public final int f18581c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f18579a = i12;
        this.d = notificationCenterDelegate;
        this.f18580b = i10;
        this.f18581c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18579a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f18580b, this.f18581c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f18580b, this.f18581c, tLObject, tL_error);
                return;
        }
    }
}
