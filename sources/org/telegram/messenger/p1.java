package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f18841a;
    public final ContactsController f18842b;
    public final TLRPC.TL_error f18843c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18841a = i10;
        this.f18842b = contactsController;
        this.f18843c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18841a) {
            case 0:
                this.f18842b.lambda$loadGlobalPrivacySetting$60(this.f18843c, this.d);
                return;
            default:
                this.f18842b.lambda$loadPrivacySettings$62(this.f18843c, this.d);
                return;
        }
    }
}
