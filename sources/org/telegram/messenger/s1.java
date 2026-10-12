package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f18832a;
    public final ContactsController f18833b;
    public final TLRPC.TL_error f18834c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18832a = i10;
        this.f18833b = contactsController;
        this.f18834c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                this.f18833b.lambda$loadGlobalPrivacySetting$60(this.f18834c, this.d);
                return;
            default:
                this.f18833b.lambda$loadPrivacySettings$62(this.f18834c, this.d);
                return;
        }
    }
}
