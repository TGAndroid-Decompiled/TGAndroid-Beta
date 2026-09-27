package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f16355a;
    public final BaseController f16356b;
    public final int f16357c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f16355a = i11;
        this.f16356b = baseController;
        this.f16357c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16355a) {
            case 0:
                ((MessagesController) this.f16356b).lambda$migrateDialogs$216(this.f16357c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16356b).lambda$loadPinnedDialogs$367(this.f16357c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16356b).lambda$loadGlobalNotificationsSettings$201(this.f16357c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f16356b).lambda$loadPrivacySettings$65(this.f16357c, tLObject, tL_error);
                return;
        }
    }
}
