package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ga implements RequestDelegate {

    public final int f20368a;

    public final BaseController f20369b;

    public final int f20370c;

    public ga(BaseController baseController, int i10, int i11) {
        this.f20368a = i11;
        this.f20369b = baseController;
        this.f20370c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20368a) {
            case 0:
                ((MessagesController) this.f20369b).lambda$migrateDialogs$216(this.f20370c, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f20369b).lambda$loadPinnedDialogs$367(this.f20370c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f20369b).lambda$loadGlobalNotificationsSettings$201(this.f20370c, tLObject, tL_error);
                break;
            default:
                ((ContactsController) this.f20369b).lambda$loadPrivacySettings$65(this.f20370c, tLObject, tL_error);
                break;
        }
    }
}
