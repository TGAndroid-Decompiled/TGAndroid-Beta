package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i1 implements RequestDelegate {
    public final int f17951a;
    public final ContactsController f17952b;

    public i1(ContactsController contactsController, int i10) {
        this.f17951a = i10;
        this.f17952b = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17951a) {
            case 0:
                this.f17952b.lambda$checkInviteText$3(tLObject, tL_error);
                return;
            case 1:
                this.f17952b.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                return;
            default:
                this.f17952b.lambda$loadPrivacySettings$63(tLObject, tL_error);
                return;
        }
    }
}
