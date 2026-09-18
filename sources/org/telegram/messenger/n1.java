package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f16823a;
    public final ContactsController f16824b;
    public final TLRPC.TL_error f16825c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16823a = i10;
        this.f16824b = contactsController;
        this.f16825c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16823a) {
            case 0:
                this.f16824b.lambda$loadGlobalPrivacySetting$60(this.f16825c, this.d);
                return;
            default:
                this.f16824b.lambda$loadPrivacySettings$62(this.f16825c, this.d);
                return;
        }
    }
}
