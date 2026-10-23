package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19481a;
    public final ContactsController f19482b;
    public final TLRPC.TL_error f19483c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19481a = i10;
        this.f19482b = contactsController;
        this.f19483c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19481a) {
            case 0:
                this.f19482b.lambda$loadGlobalPrivacySetting$60(this.f19483c, this.d);
                return;
            default:
                this.f19482b.lambda$loadPrivacySettings$62(this.f19483c, this.d);
                return;
        }
    }
}
