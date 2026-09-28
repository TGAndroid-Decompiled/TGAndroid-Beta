package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f16366a;
    public final BaseController f16367b;
    public final int f16368c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f16366a = i11;
        this.f16367b = baseController;
        this.f16368c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16366a) {
            case 0:
                ((MessagesController) this.f16367b).lambda$migrateDialogs$216(this.f16368c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16367b).lambda$loadPinnedDialogs$367(this.f16368c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16367b).lambda$loadGlobalNotificationsSettings$201(this.f16368c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f16367b).lambda$loadPrivacySettings$65(this.f16368c, tLObject, tL_error);
                return;
        }
    }
}
