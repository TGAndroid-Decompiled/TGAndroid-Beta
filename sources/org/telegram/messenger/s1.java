package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19484a;
    public final ContactsController f19485b;
    public final TLRPC.TL_error f19486c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19484a = i10;
        this.f19485b = contactsController;
        this.f19486c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19484a) {
            case 0:
                this.f19485b.lambda$loadGlobalPrivacySetting$60(this.f19486c, this.d);
                return;
            default:
                this.f19485b.lambda$loadPrivacySettings$62(this.f19486c, this.d);
                return;
        }
    }
}
