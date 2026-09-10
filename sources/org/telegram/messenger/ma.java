package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ma implements RequestDelegate {
    public final int f15769a;
    public final BaseController f15770b;
    public final int f15771c;

    public ma(BaseController baseController, int i10, int i11) {
        this.f15769a = i11;
        this.f15770b = baseController;
        this.f15771c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15769a) {
            case 0:
                ((MessagesController) this.f15770b).lambda$migrateDialogs$216(this.f15771c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f15770b).lambda$loadPinnedDialogs$367(this.f15771c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f15770b).lambda$loadGlobalNotificationsSettings$201(this.f15771c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f15770b).lambda$loadPrivacySettings$65(this.f15771c, tLObject, tL_error);
                return;
        }
    }
}
