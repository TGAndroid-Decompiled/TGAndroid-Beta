package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17244a;
    public final ContactsController f17245b;
    public final TLRPC.TL_error f17246c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17244a = i10;
        this.f17245b = contactsController;
        this.f17246c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17244a) {
            case 0:
                this.f17245b.lambda$loadGlobalPrivacySetting$60(this.f17246c, this.d);
                return;
            default:
                this.f17245b.lambda$loadPrivacySettings$62(this.f17246c, this.d);
                return;
        }
    }
}
