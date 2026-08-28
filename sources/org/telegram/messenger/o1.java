package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f21102a;
    public final ContactsController f21103b;
    public final TLRPC.TL_error f21104c;
    public final TLObject d;

    public o1(int i9, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21102a = i9;
        this.f21103b = contactsController;
        this.f21104c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21102a) {
            case 0:
                this.f21103b.lambda$loadGlobalPrivacySetting$60(this.f21104c, this.d);
                return;
            default:
                this.f21103b.lambda$loadPrivacySettings$62(this.f21104c, this.d);
                return;
        }
    }
}
