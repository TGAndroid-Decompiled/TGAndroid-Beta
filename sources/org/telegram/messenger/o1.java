package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f16896a;
    public final ContactsController f16897b;
    public final TLRPC.TL_error f16898c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16896a = i10;
        this.f16897b = contactsController;
        this.f16898c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16896a) {
            case 0:
                this.f16897b.lambda$loadGlobalPrivacySetting$60(this.f16898c, this.d);
                return;
            default:
                this.f16897b.lambda$loadPrivacySettings$62(this.f16898c, this.d);
                return;
        }
    }
}
