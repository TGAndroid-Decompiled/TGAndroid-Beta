package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f19512a;
    public final ContactsController f19513b;
    public final TLRPC.TL_error f19514c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19512a = i10;
        this.f19513b = contactsController;
        this.f19514c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19512a) {
            case 0:
                this.f19513b.lambda$loadGlobalPrivacySetting$60(this.f19514c, this.d);
                return;
            default:
                this.f19513b.lambda$loadPrivacySettings$62(this.f19514c, this.d);
                return;
        }
    }
}
