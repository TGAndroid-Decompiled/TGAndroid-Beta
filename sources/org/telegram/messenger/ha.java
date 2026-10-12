package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f17781a;
    public final BaseController f17782b;
    public final int f17783c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f17781a = i11;
        this.f17782b = baseController;
        this.f17783c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17781a) {
            case 0:
                ((MessagesController) this.f17782b).lambda$migrateDialogs$215(this.f17783c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17782b).lambda$loadPinnedDialogs$366(this.f17783c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17782b).lambda$loadGlobalNotificationsSettings$200(this.f17783c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17782b).lambda$loadPrivacySettings$65(this.f17783c, tLObject, tL_error);
                return;
        }
    }
}
