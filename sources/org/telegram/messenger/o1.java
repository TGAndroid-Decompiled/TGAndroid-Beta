package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o1 implements Runnable {
    public final int f17138a;
    public final ContactsController f17139b;
    public final TLRPC.TL_error f17140c;
    public final TLObject d;

    public o1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17138a = i10;
        this.f17139b = contactsController;
        this.f17140c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17138a) {
            case 0:
                this.f17139b.lambda$loadGlobalPrivacySetting$60(this.f17140c, this.d);
                return;
            default:
                this.f17139b.lambda$loadPrivacySettings$62(this.f17140c, this.d);
                return;
        }
    }
}
