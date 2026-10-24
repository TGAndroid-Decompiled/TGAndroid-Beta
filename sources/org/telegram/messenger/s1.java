package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19510a;
    public final ContactsController f19511b;
    public final TLRPC.TL_error f19512c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19510a = i10;
        this.f19511b = contactsController;
        this.f19512c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19510a) {
            case 0:
                this.f19511b.lambda$loadGlobalPrivacySetting$60(this.f19512c, this.d);
                return;
            default:
                this.f19511b.lambda$loadPrivacySettings$62(this.f19512c, this.d);
                return;
        }
    }
}
