package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ContactsController$$ExternalSyntheticLambda61 implements RequestDelegate {
    public final int $r8$classId;
    public final BaseController f$0;
    public final int f$1;

    public ContactsController$$ExternalSyntheticLambda61(BaseController baseController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((ContactsController) this.f$0).lambda$loadPrivacySettings$65(this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$migrateDialogs$216(this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$loadPinnedDialogs$367(this.f$1, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f$0).lambda$loadGlobalNotificationsSettings$201(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
