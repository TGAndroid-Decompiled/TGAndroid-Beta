package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements RequestDelegate {
    public final int f19081a;
    public final ContactsController f19082b;

    public n1(ContactsController contactsController, int i10) {
        this.f19081a = i10;
        this.f19082b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19081a) {
            case 0:
                this.f19082b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f19082b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f19082b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
