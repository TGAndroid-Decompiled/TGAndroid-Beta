package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f19394a;
    public final ContactsController f19395b;
    public final TLRPC.TL_error f19396c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19394a = i10;
        this.f19395b = contactsController;
        this.f19396c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19394a) {
            case 0:
                this.f19395b.lambda$loadGlobalPrivacySetting$60(this.f19396c, this.d);
                return;
            default:
                this.f19395b.lambda$loadPrivacySettings$62(this.f19396c, this.d);
                return;
        }
    }
}
