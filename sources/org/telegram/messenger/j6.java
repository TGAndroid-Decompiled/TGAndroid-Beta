package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j6 implements RequestDelegate {
    public final int f18742a;
    public final int f18743b;
    public final int f18744c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f18742a = i12;
        this.d = notificationCenterDelegate;
        this.f18743b = i10;
        this.f18744c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18742a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f18743b, this.f18744c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f18743b, this.f18744c, tLObject, tL_error);
                return;
        }
    }
}
