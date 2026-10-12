package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f18259a;
    public final ContactsController f18260b;
    public final TLRPC.TL_error f18261c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18259a = i10;
        this.f18260b = contactsController;
        this.f18261c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.lambda$loadGlobalPrivacySetting$60(this.f18261c, this.d);
                return;
            default:
                this.f18260b.lambda$loadPrivacySettings$62(this.f18261c, this.d);
                return;
        }
    }
}
