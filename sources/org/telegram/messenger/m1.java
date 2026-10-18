package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f18908a;
    public final ContactsController f18909b;

    public m1(ContactsController contactsController, int i10) {
        this.f18908a = i10;
        this.f18909b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18908a) {
            case 0:
                this.f18909b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f18909b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f18909b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
