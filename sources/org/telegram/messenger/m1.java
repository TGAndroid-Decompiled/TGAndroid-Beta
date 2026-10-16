package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f17527a;
    public final ContactsController f17528b;

    public m1(ContactsController contactsController, int i10) {
        this.f17527a = i10;
        this.f17528b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17527a) {
            case 0:
                this.f17528b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f17528b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f17528b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
