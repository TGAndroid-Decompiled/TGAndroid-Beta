package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements RequestDelegate {
    public final int f19070a;
    public final ContactsController f19071b;

    public n1(ContactsController contactsController, int i10) {
        this.f19070a = i10;
        this.f19071b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19070a) {
            case 0:
                this.f19071b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f19071b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f19071b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
