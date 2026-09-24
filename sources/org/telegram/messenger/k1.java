package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k1 implements RequestDelegate {
    public final int f16766a;
    public final ContactsController f16767b;

    public k1(ContactsController contactsController, int i10) {
        this.f16766a = i10;
        this.f16767b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16766a) {
            case 0:
                this.f16767b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f16767b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f16767b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
