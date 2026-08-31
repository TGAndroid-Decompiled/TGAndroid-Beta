package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ja implements RequestDelegate {
    public final int f19052a;
    public final BaseController f19053b;
    public final int f19054c;

    public ja(BaseController baseController, int i10, int i11) {
        this.f19052a = i11;
        this.f19053b = baseController;
        this.f19054c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19052a) {
            case 0:
                ((MessagesController) this.f19053b).lambda$migrateDialogs$216(this.f19054c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19053b).lambda$loadPinnedDialogs$367(this.f19054c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19053b).lambda$loadGlobalNotificationsSettings$201(this.f19054c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f19053b).lambda$loadPrivacySettings$65(this.f19054c, tLObject, tL_error);
                return;
        }
    }
}
