package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f18458a;
    public final ContactsController f18459b;
    public final TLRPC.TL_error f18460c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18458a = i10;
        this.f18459b = contactsController;
        this.f18460c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18458a) {
            case 0:
                this.f18459b.lambda$loadGlobalPrivacySetting$60(this.f18460c, this.d);
                return;
            default:
                this.f18459b.lambda$loadPrivacySettings$62(this.f18460c, this.d);
                return;
        }
    }
}
