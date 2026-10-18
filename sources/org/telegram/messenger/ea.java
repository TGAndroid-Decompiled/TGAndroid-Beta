package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ea implements RequestDelegate {
    public final int f18255a;
    public final BaseController f18256b;
    public final int f18257c;

    public ea(BaseController baseController, int i10, int i11) {
        this.f18255a = i11;
        this.f18256b = baseController;
        this.f18257c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18255a) {
            case 0:
                ((MessagesController) this.f18256b).lambda$migrateDialogs$215(this.f18257c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18256b).lambda$loadPinnedDialogs$366(this.f18257c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18256b).lambda$loadGlobalNotificationsSettings$200(this.f18257c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18256b).lambda$loadPrivacySettings$65(this.f18257c, tLObject, tL_error);
                return;
        }
    }
}
