package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j1 implements RequestDelegate {
    public final int f16443a;
    public final ContactsController f16444b;

    public j1(ContactsController contactsController, int i10) {
        this.f16443a = i10;
        this.f16444b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16443a) {
            case 0:
                this.f16444b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f16444b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f16444b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
