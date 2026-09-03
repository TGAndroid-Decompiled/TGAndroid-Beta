package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j1 implements RequestDelegate {
    public final int f19017a;
    public final ContactsController f19018b;

    public j1(ContactsController contactsController, int i10) {
        this.f19017a = i10;
        this.f19018b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19017a) {
            case 0:
                this.f19018b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f19018b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f19018b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
