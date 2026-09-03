package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ja implements RequestDelegate {
    public final int f19054a;
    public final BaseController f19055b;
    public final int f19056c;

    public ja(BaseController baseController, int i10, int i11) {
        this.f19054a = i11;
        this.f19055b = baseController;
        this.f19056c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19054a) {
            case 0:
                ((MessagesController) this.f19055b).lambda$migrateDialogs$216(this.f19056c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19055b).lambda$loadPinnedDialogs$367(this.f19056c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19055b).lambda$loadGlobalNotificationsSettings$201(this.f19056c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f19055b).lambda$loadPrivacySettings$65(this.f19056c, tLObject, tL_error);
                return;
        }
    }
}
