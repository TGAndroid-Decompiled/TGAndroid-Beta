package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f19387a;
    public final ContactsController f19388b;
    public final TLRPC.TL_error f19389c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19387a = i10;
        this.f19388b = contactsController;
        this.f19389c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19387a) {
            case 0:
                this.f19388b.lambda$loadGlobalPrivacySetting$60(this.f19389c, this.d);
                return;
            default:
                this.f19388b.lambda$loadPrivacySettings$62(this.f19389c, this.d);
                return;
        }
    }
}
