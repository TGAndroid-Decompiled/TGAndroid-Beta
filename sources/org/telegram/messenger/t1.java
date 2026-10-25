package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements Runnable {
    public final int f21284a;
    public final ContactsController f21285b;
    public final TLRPC.TL_error f21286c;
    public final TLObject d;

    public t1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21284a = i10;
        this.f21285b = contactsController;
        this.f21286c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21284a) {
            case 0:
                this.f21285b.lambda$loadGlobalPrivacySetting$60(this.f21286c, this.d);
                return;
            default:
                this.f21285b.lambda$loadPrivacySettings$62(this.f21286c, this.d);
                return;
        }
    }
}
