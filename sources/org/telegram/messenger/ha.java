package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f18595a;
    public final BaseController f18596b;
    public final int f18597c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f18595a = i11;
        this.f18596b = baseController;
        this.f18597c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18595a) {
            case 0:
                ((MessagesController) this.f18596b).lambda$migrateDialogs$215(this.f18597c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18596b).lambda$loadPinnedDialogs$366(this.f18597c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18596b).lambda$loadGlobalNotificationsSettings$200(this.f18597c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18596b).lambda$loadPrivacySettings$65(this.f18597c, tLObject, tL_error);
                return;
        }
    }
}
