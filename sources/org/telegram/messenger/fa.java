package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f17665a;
    public final BaseController f17666b;
    public final int f17667c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f17665a = i11;
        this.f17666b = baseController;
        this.f17667c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17665a) {
            case 0:
                ((MessagesController) this.f17666b).lambda$migrateDialogs$216(this.f17667c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17666b).lambda$loadPinnedDialogs$367(this.f17667c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17666b).lambda$loadGlobalNotificationsSettings$201(this.f17667c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17666b).lambda$loadPrivacySettings$65(this.f17667c, tLObject, tL_error);
                return;
        }
    }
}
