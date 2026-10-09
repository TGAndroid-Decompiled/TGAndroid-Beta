package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f18790a;
    public final ContactsController f18791b;
    public final TLRPC.TL_error f18792c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18790a = i10;
        this.f18791b = contactsController;
        this.f18792c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$loadGlobalPrivacySetting$60(this.f18792c, this.d);
                return;
            default:
                this.f18791b.lambda$loadPrivacySettings$62(this.f18792c, this.d);
                return;
        }
    }
}
