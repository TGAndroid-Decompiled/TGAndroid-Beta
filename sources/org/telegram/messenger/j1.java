package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j1 implements RequestDelegate {
    public final int f19015a;
    public final ContactsController f19016b;

    public j1(ContactsController contactsController, int i10) {
        this.f19015a = i10;
        this.f19016b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19015a) {
            case 0:
                this.f19016b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f19016b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f19016b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
