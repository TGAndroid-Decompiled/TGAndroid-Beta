package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements RequestDelegate {
    public final int f20822a;
    public final ContactsController f20823b;

    public o1(ContactsController contactsController, int i10) {
        this.f20822a = i10;
        this.f20823b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20822a) {
            case 0:
                this.f20823b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f20823b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f20823b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
