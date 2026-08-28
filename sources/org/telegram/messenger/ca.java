package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ca implements RequestDelegate {
    public final int f19932a;
    public final BaseController f19933b;
    public final int f19934c;

    public ca(BaseController baseController, int i9, int i10) {
        this.f19932a = i10;
        this.f19933b = baseController;
        this.f19934c = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19932a) {
            case 0:
                ((MessagesController) this.f19933b).lambda$migrateDialogs$216(this.f19934c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19933b).lambda$loadPinnedDialogs$367(this.f19934c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19933b).lambda$loadGlobalNotificationsSettings$201(this.f19934c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f19933b).lambda$loadPrivacySettings$65(this.f19934c, tLObject, tL_error);
                return;
        }
    }
}
