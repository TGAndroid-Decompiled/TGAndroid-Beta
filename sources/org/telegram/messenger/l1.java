package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l1 implements RequestDelegate {
    public final int f15664a;
    public final ContactsController f15665b;

    public l1(ContactsController contactsController, int i10) {
        this.f15664a = i10;
        this.f15665b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15664a) {
            case 0:
                this.f15665b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f15665b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f15665b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
