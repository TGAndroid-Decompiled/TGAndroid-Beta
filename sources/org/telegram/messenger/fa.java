package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f18347a;
    public final BaseController f18348b;
    public final int f18349c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f18347a = i11;
        this.f18348b = baseController;
        this.f18349c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18347a) {
            case 0:
                ((MessagesController) this.f18348b).lambda$migrateDialogs$215(this.f18349c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18348b).lambda$loadPinnedDialogs$366(this.f18349c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18348b).lambda$loadGlobalNotificationsSettings$200(this.f18349c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18348b).lambda$loadPrivacySettings$65(this.f18349c, tLObject, tL_error);
                return;
        }
    }
}
