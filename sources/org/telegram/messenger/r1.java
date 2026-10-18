package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f19390a;
    public final ContactsController f19391b;
    public final TLRPC.TL_error f19392c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19390a = i10;
        this.f19391b = contactsController;
        this.f19392c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19390a) {
            case 0:
                this.f19391b.lambda$loadGlobalPrivacySetting$60(this.f19392c, this.d);
                return;
            default:
                this.f19391b.lambda$loadPrivacySettings$62(this.f19392c, this.d);
                return;
        }
    }
}
