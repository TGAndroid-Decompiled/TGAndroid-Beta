package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da implements RequestDelegate {
    public final int f18177a;
    public final BaseController f18178b;
    public final int f18179c;

    public da(BaseController baseController, int i10, int i11) {
        this.f18177a = i11;
        this.f18178b = baseController;
        this.f18179c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18177a) {
            case 0:
                ((MessagesController) this.f18178b).lambda$migrateDialogs$215(this.f18179c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18178b).lambda$loadPinnedDialogs$366(this.f18179c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18178b).lambda$loadGlobalNotificationsSettings$200(this.f18179c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18178b).lambda$loadPrivacySettings$65(this.f18179c, tLObject, tL_error);
                return;
        }
    }
}
