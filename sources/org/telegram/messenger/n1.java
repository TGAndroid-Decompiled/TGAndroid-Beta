package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n1 implements Runnable {
    public final int f18475a;
    public final ContactsController f18476b;
    public final TLRPC.TL_error f18477c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f18475a = i10;
        this.f18476b = contactsController;
        this.f18477c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f18475a) {
            case 0:
                this.f18476b.lambda$loadGlobalPrivacySetting$60(this.f18477c, this.d);
                return;
            default:
                this.f18476b.lambda$loadPrivacySettings$62(this.f18477c, this.d);
                return;
        }
    }
}
