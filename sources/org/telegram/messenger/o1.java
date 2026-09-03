package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f17952a;
    public final ContactsController f17953b;
    public final TLRPC.TL_error f17954c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17952a = i10;
        this.f17953b = contactsController;
        this.f17954c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                this.f17953b.lambda$loadGlobalPrivacySetting$60(this.f17954c, this.d);
                return;
            default:
                this.f17953b.lambda$loadPrivacySettings$62(this.f17954c, this.d);
                return;
        }
    }
}
