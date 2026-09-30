package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17252a;
    public final ContactsController f17253b;
    public final TLRPC.TL_error f17254c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17252a = i10;
        this.f17253b = contactsController;
        this.f17254c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17252a) {
            case 0:
                this.f17253b.lambda$loadGlobalPrivacySetting$60(this.f17254c, this.d);
                return;
            default:
                this.f17253b.lambda$loadPrivacySettings$62(this.f17254c, this.d);
                return;
        }
    }
}
