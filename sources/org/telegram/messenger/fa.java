package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fa implements RequestDelegate {
    public final int f17638a;
    public final BaseController f17639b;
    public final int f17640c;

    public fa(BaseController baseController, int i10, int i11) {
        this.f17638a = i11;
        this.f17639b = baseController;
        this.f17640c = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17638a) {
            case 0:
                ((MessagesController) this.f17639b).lambda$migrateDialogs$216(this.f17640c, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17639b).lambda$loadPinnedDialogs$367(this.f17640c, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17639b).lambda$loadGlobalNotificationsSettings$201(this.f17640c, tLObject, tL_error);
                return;
            default:
                ((ContactsController) this.f17639b).lambda$loadPrivacySettings$65(this.f17640c, tLObject, tL_error);
                return;
        }
    }
}
