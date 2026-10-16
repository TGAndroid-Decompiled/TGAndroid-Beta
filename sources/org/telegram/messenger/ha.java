package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ha implements RequestDelegate {
    public final int f17097a;
    public final BaseController f17098b;
    public final int f17099c;

    public ha(BaseController baseController, int i10, int i11) {
        this.f17097a = i11;
        this.f17098b = baseController;
        this.f17099c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17097a) {
            case 0:
                ((MessagesController) this.f17098b).lambda$migrateDialogs$215(this.f17099c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17098b).lambda$loadPinnedDialogs$366(this.f17099c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17098b).lambda$loadGlobalNotificationsSettings$200(this.f17099c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17098b).lambda$loadPrivacySettings$65(this.f17099c, tLObject, tL_error);
                return;
        }
    }
}
