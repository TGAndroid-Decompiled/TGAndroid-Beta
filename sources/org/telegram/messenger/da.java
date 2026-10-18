package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class da implements RequestDelegate {
    public final int f18180a;
    public final BaseController f18181b;
    public final int f18182c;

    public da(BaseController baseController, int i10, int i11) {
        this.f18180a = i11;
        this.f18181b = baseController;
        this.f18182c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18180a) {
            case 0:
                ((MessagesController) this.f18181b).lambda$migrateDialogs$215(this.f18182c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18181b).lambda$loadPinnedDialogs$366(this.f18182c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18181b).lambda$loadGlobalNotificationsSettings$200(this.f18182c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18181b).lambda$loadPrivacySettings$65(this.f18182c, tLObject, tL_error);
                return;
        }
    }
}
