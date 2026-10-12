package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f17400a;
    public final BaseController f17401b;
    public final int f17402c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f17400a = i11;
        this.f17401b = baseController;
        this.f17402c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17400a) {
            case 0:
                ((MessagesController) this.f17401b).lambda$migrateDialogs$215(this.f17402c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17401b).lambda$loadPinnedDialogs$366(this.f17402c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17401b).lambda$loadGlobalNotificationsSettings$200(this.f17402c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17401b).lambda$loadPrivacySettings$65(this.f17402c, tLObject, tL_error);
                return;
        }
    }
}
