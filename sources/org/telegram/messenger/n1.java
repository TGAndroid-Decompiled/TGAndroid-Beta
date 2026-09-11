package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f18448a;
    public final ContactsController f18449b;
    public final TLRPC.TL_error f18450c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18448a = i10;
        this.f18449b = contactsController;
        this.f18450c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18448a) {
            case 0:
                this.f18449b.lambda$loadGlobalPrivacySetting$60(this.f18450c, this.d);
                return;
            default:
                this.f18449b.lambda$loadPrivacySettings$62(this.f18450c, this.d);
                return;
        }
    }
}
