package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f16123a;
    public final BaseController f16124b;
    public final int f16125c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f16123a = i11;
        this.f16124b = baseController;
        this.f16125c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16123a) {
            case 0:
                ((MessagesController) this.f16124b).lambda$migrateDialogs$216(this.f16125c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16124b).lambda$loadPinnedDialogs$367(this.f16125c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16124b).lambda$loadGlobalNotificationsSettings$201(this.f16125c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f16124b).lambda$loadPrivacySettings$65(this.f16125c, tLObject, tL_error);
                return;
        }
    }
}
