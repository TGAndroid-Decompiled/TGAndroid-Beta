package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f17740a;
    public final BaseController f17741b;
    public final int f17742c;

    public ea(BaseController baseController, int i10, int i11) {
        this.f17740a = i11;
        this.f17741b = baseController;
        this.f17742c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17740a) {
            case 0:
                ((MessagesController) this.f17741b).lambda$migrateDialogs$215(this.f17742c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17741b).lambda$loadPinnedDialogs$366(this.f17742c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17741b).lambda$loadGlobalNotificationsSettings$200(this.f17742c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17741b).lambda$loadPrivacySettings$65(this.f17742c, tLObject, tL_error);
                return;
        }
    }
}
