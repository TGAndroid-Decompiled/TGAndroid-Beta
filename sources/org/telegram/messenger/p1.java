package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f16994a;
    public final ContactsController f16995b;
    public final TLRPC.TL_error f16996c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16994a = i10;
        this.f16995b = contactsController;
        this.f16996c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16994a) {
            case 0:
                this.f16995b.lambda$loadGlobalPrivacySetting$60(this.f16996c, this.d);
                return;
            default:
                this.f16995b.lambda$loadPrivacySettings$62(this.f16996c, this.d);
                return;
        }
    }
}
