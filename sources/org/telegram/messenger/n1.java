package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f21012a;
    public final ContactsController f21013b;
    public final TLRPC.TL_error f21014c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21012a = i10;
        this.f21013b = contactsController;
        this.f21014c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21012a) {
            case 0:
                this.f21013b.lambda$loadGlobalPrivacySetting$60(this.f21014c, this.d);
                return;
            default:
                this.f21013b.lambda$loadPrivacySettings$62(this.f21014c, this.d);
                return;
        }
    }
}
