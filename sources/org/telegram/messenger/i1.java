package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class i1 implements RequestDelegate {

    public final int f20539a;

    public final ContactsController f20540b;

    public i1(ContactsController contactsController, int i10) {
        this.f20539a = i10;
        this.f20540b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20539a) {
            case 0:
                this.f20540b.lambda$checkInviteText$3(tLObject, tL_error);
                break;
            case 1:
                this.f20540b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                break;
            default:
                this.f20540b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                break;
        }
    }
}
