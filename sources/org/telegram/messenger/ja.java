package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ja implements RequestDelegate {
    public final int f17548a;
    public final BaseController f17549b;
    public final int f17550c;

    public ja(BaseController baseController, int i10, int i11) {
        this.f17548a = i11;
        this.f17549b = baseController;
        this.f17550c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17548a) {
            case 0:
                ((MessagesController) this.f17549b).lambda$migrateDialogs$216(this.f17550c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17549b).lambda$loadPinnedDialogs$367(this.f17550c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17549b).lambda$loadGlobalNotificationsSettings$201(this.f17550c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17549b).lambda$loadPrivacySettings$65(this.f17550c, tLObject, tL_error);
                return;
        }
    }
}
