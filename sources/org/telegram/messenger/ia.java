package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ia implements RequestDelegate {
    public final int f20546a;
    public final BaseController f20547b;
    public final int f20548c;

    public ia(BaseController baseController, int i10, int i11) {
        this.f20546a = i11;
        this.f20547b = baseController;
        this.f20548c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20546a) {
            case 0:
                ((MessagesController) this.f20547b).lambda$migrateDialogs$216(this.f20548c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20547b).lambda$loadPinnedDialogs$367(this.f20548c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20547b).lambda$loadGlobalNotificationsSettings$201(this.f20548c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f20547b).lambda$loadPrivacySettings$65(this.f20548c, tLObject, tL_error);
                return;
        }
    }
}
