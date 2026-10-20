package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f18350a;
    public final BaseController f18351b;
    public final int f18352c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f18350a = i11;
        this.f18351b = baseController;
        this.f18352c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18350a) {
            case 0:
                ((MessagesController) this.f18351b).lambda$migrateDialogs$215(this.f18352c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18351b).lambda$loadPinnedDialogs$366(this.f18352c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18351b).lambda$loadGlobalNotificationsSettings$200(this.f18352c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18351b).lambda$loadPrivacySettings$65(this.f18352c, tLObject, tL_error);
                return;
        }
    }
}
