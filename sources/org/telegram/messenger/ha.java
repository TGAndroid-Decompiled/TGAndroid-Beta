package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f20245a;
    public final BaseController f20246b;
    public final int f20247c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f20245a = i11;
        this.f20246b = baseController;
        this.f20247c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20245a) {
            case 0:
                ((MessagesController) this.f20246b).lambda$migrateDialogs$215(this.f20247c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20246b).lambda$loadPinnedDialogs$368(this.f20247c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20246b).lambda$loadGlobalNotificationsSettings$200(this.f20247c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f20246b).lambda$loadPrivacySettings$65(this.f20247c, tLObject, tL_error);
                return;
        }
    }
}
