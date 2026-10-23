package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f18529a;
    public final BaseController f18530b;
    public final int f18531c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f18529a = i11;
        this.f18530b = baseController;
        this.f18531c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18529a) {
            case 0:
                ((MessagesController) this.f18530b).lambda$migrateDialogs$215(this.f18531c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18530b).lambda$loadPinnedDialogs$366(this.f18531c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18530b).lambda$loadGlobalNotificationsSettings$200(this.f18531c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18530b).lambda$loadPrivacySettings$65(this.f18531c, tLObject, tL_error);
                return;
        }
    }
}
