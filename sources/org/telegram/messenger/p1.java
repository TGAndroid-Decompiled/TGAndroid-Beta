package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f17247a;
    public final ContactsController f17248b;
    public final TLRPC.TL_error f17249c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17247a = i10;
        this.f17248b = contactsController;
        this.f17249c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17247a) {
            case 0:
                this.f17248b.lambda$loadGlobalPrivacySetting$60(this.f17249c, this.d);
                return;
            default:
                this.f17248b.lambda$loadPrivacySettings$62(this.f17249c, this.d);
                return;
        }
    }
}
