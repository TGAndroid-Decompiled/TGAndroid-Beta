package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 implements RequestDelegate {
    public final int f17655a;
    public final int f17656b;
    public final int f17657c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public d6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10, int i11, int i12) {
        this.f17655a = i12;
        this.d = notificationCenterDelegate;
        this.f17656b = i10;
        this.f17657c = i11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17655a) {
            case 0:
                ((MediaController) this.d).lambda$loadMoreMusic$12(this.f17656b, this.f17657c, tLObject, tL_error);
                return;
            default:
                ((MessagesController) this.d).lambda$getDifference$358(this.f17656b, this.f17657c, tLObject, tL_error);
                return;
        }
    }
}
