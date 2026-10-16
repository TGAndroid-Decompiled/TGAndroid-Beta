package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r1 implements Runnable {
    public final int f17961a;
    public final ContactsController f17962b;
    public final TLRPC.TL_error f17963c;
    public final TLObject d;

    public r1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f17961a = i10;
        this.f17962b = contactsController;
        this.f17963c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                this.f17962b.lambda$loadGlobalPrivacySetting$60(this.f17963c, this.d);
                return;
            default:
                this.f17962b.lambda$loadPrivacySettings$62(this.f17963c, this.d);
                return;
        }
    }
}
