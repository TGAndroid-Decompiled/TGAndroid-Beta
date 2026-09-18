package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f17076a;
    public final ContactsController f17077b;
    public final TLRPC.TL_error f17078c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17076a = i10;
        this.f17077b = contactsController;
        this.f17078c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17076a) {
            case 0:
                this.f17077b.lambda$loadGlobalPrivacySetting$60(this.f17078c, this.d);
                return;
            default:
                this.f17077b.lambda$loadPrivacySettings$62(this.f17078c, this.d);
                return;
        }
    }
}
