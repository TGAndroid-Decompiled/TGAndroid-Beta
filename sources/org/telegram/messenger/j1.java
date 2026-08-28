package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j1 implements RequestDelegate {
    public final int f20638a;
    public final ContactsController f20639b;

    public j1(ContactsController contactsController, int i9) {
        this.f20638a = i9;
        this.f20639b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20638a) {
            case 0:
                this.f20639b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f20639b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f20639b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
