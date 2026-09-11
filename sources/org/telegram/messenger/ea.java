package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f17552a;
    public final BaseController f17553b;
    public final int f17554c;

    public ea(BaseController baseController, int i10, int i11) {
        this.f17552a = i11;
        this.f17553b = baseController;
        this.f17554c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17552a) {
            case 0:
                ((MessagesController) this.f17553b).lambda$migrateDialogs$216(this.f17554c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17553b).lambda$loadPinnedDialogs$367(this.f17554c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17553b).lambda$loadGlobalNotificationsSettings$201(this.f17554c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17553b).lambda$loadPrivacySettings$65(this.f17554c, tLObject, tL_error);
                return;
        }
    }
}
