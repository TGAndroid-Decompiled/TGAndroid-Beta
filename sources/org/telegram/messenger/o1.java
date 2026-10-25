package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements RequestDelegate {
    public final int f20821a;
    public final ContactsController f20822b;

    public o1(ContactsController contactsController, int i10) {
        this.f20821a = i10;
        this.f20822b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20821a) {
            case 0:
                this.f20822b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f20822b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f20822b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
