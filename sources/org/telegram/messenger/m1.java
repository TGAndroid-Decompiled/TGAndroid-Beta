package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m1 implements RequestDelegate {
    public final int f18911a;
    public final ContactsController f18912b;

    public m1(ContactsController contactsController, int i10) {
        this.f18911a = i10;
        this.f18912b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18911a) {
            case 0:
                this.f18912b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f18912b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f18912b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
