package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f19514a;
    public final ContactsController f19515b;
    public final TLRPC.TL_error f19516c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19514a = i10;
        this.f19515b = contactsController;
        this.f19516c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19514a) {
            case 0:
                this.f19515b.lambda$loadGlobalPrivacySetting$60(this.f19516c, this.d);
                return;
            default:
                this.f19515b.lambda$loadPrivacySettings$62(this.f19516c, this.d);
                return;
        }
    }
}
