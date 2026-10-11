package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f17738a;
    public final BaseController f17739b;
    public final int f17740c;

    public ea(BaseController baseController, int i10, int i11) {
        this.f17738a = i11;
        this.f17739b = baseController;
        this.f17740c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17738a) {
            case 0:
                ((MessagesController) this.f17739b).lambda$migrateDialogs$215(this.f17740c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17739b).lambda$loadPinnedDialogs$366(this.f17740c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17739b).lambda$loadGlobalNotificationsSettings$200(this.f17740c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17739b).lambda$loadPrivacySettings$65(this.f17740c, tLObject, tL_error);
                return;
        }
    }
}
