package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ContactsController$$ExternalSyntheticLambda32 implements Runnable {
    public final int $r8$classId;
    public final ContactsController f$0;
    public final TLRPC.TL_error f$1;
    public final TLObject f$2;

    public ContactsController$$ExternalSyntheticLambda32(int i, ContactsController contactsController, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
        this.f$1 = tL_error;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadGlobalPrivacySetting$60(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadPrivacySettings$62(this.f$1, this.f$2);
                break;
        }
    }
}
