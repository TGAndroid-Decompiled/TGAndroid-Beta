package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f16108a;
    public final BaseController f16109b;
    public final int f16110c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f16108a = i11;
        this.f16109b = baseController;
        this.f16110c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16108a) {
            case 0:
                ((MessagesController) this.f16109b).lambda$migrateDialogs$216(this.f16110c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16109b).lambda$loadPinnedDialogs$367(this.f16110c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16109b).lambda$loadGlobalNotificationsSettings$201(this.f16110c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f16109b).lambda$loadPrivacySettings$65(this.f16110c, tLObject, tL_error);
                return;
        }
    }
}
