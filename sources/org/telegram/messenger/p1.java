package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f18795a;
    public final ContactsController f18796b;
    public final TLRPC.TL_error f18797c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18795a = i10;
        this.f18796b = contactsController;
        this.f18797c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18795a) {
            case 0:
                this.f18796b.lambda$loadGlobalPrivacySetting$60(this.f18797c, this.d);
                return;
            default:
                this.f18796b.lambda$loadPrivacySettings$62(this.f18797c, this.d);
                return;
        }
    }
}
