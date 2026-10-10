package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p1 implements Runnable {
    public final int f18794a;
    public final ContactsController f18795b;
    public final TLRPC.TL_error f18796c;
    public final TLObject d;

    public p1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18794a = i10;
        this.f18795b = contactsController;
        this.f18796c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18794a) {
            case 0:
                this.f18795b.lambda$loadGlobalPrivacySetting$60(this.f18796c, this.d);
                return;
            default:
                this.f18795b.lambda$loadPrivacySettings$62(this.f18796c, this.d);
                return;
        }
    }
}
