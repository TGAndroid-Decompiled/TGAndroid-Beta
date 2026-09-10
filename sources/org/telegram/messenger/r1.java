package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f16184a;
    public final ContactsController f16185b;
    public final TLRPC.TL_error f16186c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16184a = i10;
        this.f16185b = contactsController;
        this.f16186c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16184a) {
            case 0:
                this.f16185b.lambda$loadGlobalPrivacySetting$60(this.f16186c, this.d);
                return;
            default:
                this.f16185b.lambda$loadPrivacySettings$62(this.f16186c, this.d);
                return;
        }
    }
}
