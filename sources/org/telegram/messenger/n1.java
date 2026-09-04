package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f18431a;
    public final ContactsController f18432b;
    public final TLRPC.TL_error f18433c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18431a = i10;
        this.f18432b = contactsController;
        this.f18433c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18431a) {
            case 0:
                this.f18432b.lambda$loadGlobalPrivacySetting$60(this.f18433c, this.d);
                return;
            default:
                this.f18432b.lambda$loadPrivacySettings$62(this.f18433c, this.d);
                return;
        }
    }
}
