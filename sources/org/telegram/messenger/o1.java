package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f17975a;
    public final ContactsController f17976b;
    public final TLRPC.TL_error f17977c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17975a = i10;
        this.f17976b = contactsController;
        this.f17977c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17975a) {
            case 0:
                this.f17976b.lambda$loadGlobalPrivacySetting$60(this.f17977c, this.d);
                return;
            default:
                this.f17976b.lambda$loadPrivacySettings$62(this.f17977c, this.d);
                return;
        }
    }
}
