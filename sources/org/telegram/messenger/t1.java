package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t1 implements Runnable {
    public final int f21260a;
    public final ContactsController f21261b;
    public final TLRPC.TL_error f21262c;
    public final TLObject d;

    public t1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21260a = i10;
        this.f21261b = contactsController;
        this.f21262c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21260a) {
            case 0:
                this.f21261b.lambda$loadGlobalPrivacySetting$60(this.f21262c, this.d);
                return;
            default:
                this.f21261b.lambda$loadPrivacySettings$62(this.f21262c, this.d);
                return;
        }
    }
}
