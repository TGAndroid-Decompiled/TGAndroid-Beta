package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f17579a;
    public final BaseController f17580b;
    public final int f17581c;

    public ea(BaseController baseController, int i10, int i11) {
        this.f17579a = i11;
        this.f17580b = baseController;
        this.f17581c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17579a) {
            case 0:
                ((MessagesController) this.f17580b).lambda$migrateDialogs$216(this.f17581c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17580b).lambda$loadPinnedDialogs$367(this.f17581c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17580b).lambda$loadGlobalNotificationsSettings$201(this.f17581c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17580b).lambda$loadPrivacySettings$65(this.f17581c, tLObject, tL_error);
                return;
        }
    }
}
