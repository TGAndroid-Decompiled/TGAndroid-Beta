package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f19487a;
    public final ContactsController f19488b;
    public final TLRPC.TL_error f19489c;
    public final TLObject d;

    public s1(int i10, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f19487a = i10;
        this.f19488b = contactsController;
        this.f19489c = tL_error;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f19487a) {
            case 0:
                this.f19488b.lambda$loadGlobalPrivacySetting$60(this.f19489c, this.d);
                return;
            default:
                this.f19488b.lambda$loadPrivacySettings$62(this.f19489c, this.d);
                return;
        }
    }
}
