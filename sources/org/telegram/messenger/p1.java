package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17268a;
    public final ContactsController f17269b;
    public final TLRPC.TL_error f17270c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17268a = i10;
        this.f17269b = contactsController;
        this.f17270c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17268a) {
            case 0:
                this.f17269b.lambda$loadGlobalPrivacySetting$60(this.f17270c, this.d);
                return;
            default:
                this.f17269b.lambda$loadPrivacySettings$62(this.f17270c, this.d);
                return;
        }
    }
}
