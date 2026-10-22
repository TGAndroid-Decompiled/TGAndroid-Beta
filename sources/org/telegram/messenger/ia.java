package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ia implements RequestDelegate {
    public final int f18601a;
    public final BaseController f18602b;
    public final int f18603c;

    public ia(BaseController baseController, int i10, int i11) {
        this.f18601a = i11;
        this.f18602b = baseController;
        this.f18603c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18601a) {
            case 0:
                ((MessagesController) this.f18602b).lambda$migrateDialogs$215(this.f18603c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18602b).lambda$loadPinnedDialogs$366(this.f18603c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18602b).lambda$loadGlobalNotificationsSettings$200(this.f18603c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f18602b).lambda$loadPrivacySettings$65(this.f18603c, tLObject, tL_error);
                return;
        }
    }
}
