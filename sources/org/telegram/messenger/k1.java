package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k1 implements RequestDelegate {
    public final int f18312a;
    public final ContactsController f18313b;

    public k1(ContactsController contactsController, int i10) {
        this.f18312a = i10;
        this.f18313b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18312a) {
            case 0:
                this.f18313b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f18313b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f18313b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
