package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17251a;
    public final ContactsController f17252b;
    public final TLRPC.TL_error f17253c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17251a = i10;
        this.f17252b = contactsController;
        this.f17253c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17251a) {
            case 0:
                this.f17252b.lambda$loadGlobalPrivacySetting$60(this.f17253c, this.d);
                return;
            default:
                this.f17252b.lambda$loadPrivacySettings$62(this.f17253c, this.d);
                return;
        }
    }
}
