package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f16814a;
    public final ContactsController f16815b;
    public final TLRPC.TL_error f16816c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f16814a = i10;
        this.f16815b = contactsController;
        this.f16816c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f16814a) {
            case 0:
                this.f16815b.lambda$loadGlobalPrivacySetting$60(this.f16816c, this.d);
                return;
            default:
                this.f16815b.lambda$loadPrivacySettings$62(this.f16816c, this.d);
                return;
        }
    }
}
