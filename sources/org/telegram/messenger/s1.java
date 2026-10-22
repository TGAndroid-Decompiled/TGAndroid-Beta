package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19441a;
    public final ContactsController f19442b;
    public final TLRPC.TL_error f19443c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19441a = i10;
        this.f19442b = contactsController;
        this.f19443c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                this.f19442b.lambda$loadGlobalPrivacySetting$60(this.f19443c, this.d);
                return;
            default:
                this.f19442b.lambda$loadPrivacySettings$62(this.f19443c, this.d);
                return;
        }
    }
}
