package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17232a;
    public final ContactsController f17233b;
    public final TLRPC.TL_error f17234c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17232a = i10;
        this.f17233b = contactsController;
        this.f17234c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17232a) {
            case 0:
                this.f17233b.lambda$loadGlobalPrivacySetting$60(this.f17234c, this.d);
                return;
            default:
                this.f17233b.lambda$loadPrivacySettings$62(this.f17234c, this.d);
                return;
        }
    }
}
