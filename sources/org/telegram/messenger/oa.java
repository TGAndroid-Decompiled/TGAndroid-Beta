package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oa implements RequestDelegate {
    public final int f20849a;
    public final BaseController f20850b;
    public final int f20851c;

    public oa(BaseController baseController, int i10, int i11) {
        this.f20849a = i11;
        this.f20850b = baseController;
        this.f20851c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20849a) {
            case 0:
                ((MessagesController) this.f20850b).lambda$migrateDialogs$215(this.f20851c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20850b).lambda$loadPinnedDialogs$368(this.f20851c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20850b).lambda$loadGlobalNotificationsSettings$200(this.f20851c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f20850b).lambda$loadPrivacySettings$65(this.f20851c, tLObject, tL_error);
                return;
        }
    }
}
