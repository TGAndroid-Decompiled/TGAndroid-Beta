package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class n1 implements Runnable {

    public final int f21022a;

    public final ContactsController f21023b;

    public final TLRPC.TL_error f21024c;
    public final TLObject d;

    public n1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f21022a = i10;
        this.f21023b = contactsController;
        this.f21024c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f21022a) {
            case 0:
                this.f21023b.lambda$loadGlobalPrivacySetting$60(this.f21024c, this.d);
                break;
            default:
                this.f21023b.lambda$loadPrivacySettings$62(this.f21024c, this.d);
                break;
        }
    }
}
