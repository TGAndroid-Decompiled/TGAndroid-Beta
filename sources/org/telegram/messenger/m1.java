package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f17831a;
    public final ContactsController f17832b;

    public m1(ContactsController contactsController, int i10) {
        this.f17831a = i10;
        this.f17832b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17831a) {
            case 0:
                this.f17832b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f17832b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f17832b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
