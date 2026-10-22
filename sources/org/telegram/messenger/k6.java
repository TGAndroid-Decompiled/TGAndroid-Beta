package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k6 implements RequestDelegate {
    public final int f18752a;
    public final int f18753b;
    public final int f18754c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f18752a = i12;
        this.d = notificationCenterDelegate;
        this.f18753b = i10;
        this.f18754c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18752a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f18753b, this.f18754c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f18753b, this.f18754c, tLObject, tL_error);
                return;
        }
    }
}
