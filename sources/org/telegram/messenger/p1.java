package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f18837a;
    public final ContactsController f18838b;
    public final TLRPC.TL_error f18839c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18837a = i10;
        this.f18838b = contactsController;
        this.f18839c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18837a) {
            case 0:
                this.f18838b.lambda$loadGlobalPrivacySetting$60(this.f18839c, this.d);
                return;
            default:
                this.f18838b.lambda$loadPrivacySettings$62(this.f18839c, this.d);
                return;
        }
    }
}
