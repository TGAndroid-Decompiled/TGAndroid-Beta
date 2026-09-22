package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f16347a;
    public final BaseController f16348b;
    public final int f16349c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f16347a = i11;
        this.f16348b = baseController;
        this.f16349c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16347a) {
            case 0:
                ((MessagesController) this.f16348b).lambda$migrateDialogs$216(this.f16349c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16348b).lambda$loadPinnedDialogs$367(this.f16349c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16348b).lambda$loadGlobalNotificationsSettings$201(this.f16349c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f16348b).lambda$loadPrivacySettings$65(this.f16349c, tLObject, tL_error);
                return;
        }
    }
}
