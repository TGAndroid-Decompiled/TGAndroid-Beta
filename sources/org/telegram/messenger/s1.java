package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19549a;
    public final ContactsController f19550b;
    public final TLRPC.TL_error f19551c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19549a = i10;
        this.f19550b = contactsController;
        this.f19551c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19549a) {
            case 0:
                this.f19550b.lambda$loadGlobalPrivacySetting$60(this.f19551c, this.d);
                return;
            default:
                this.f19550b.lambda$loadPrivacySettings$62(this.f19551c, this.d);
                return;
        }
    }
}
