package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ContactsController$$ExternalSyntheticLambda18 implements RequestDelegate {
    public final int $r8$classId;
    public final ContactsController f$0;

    public ContactsController$$ExternalSyntheticLambda18(ContactsController contactsController, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkInviteText$3(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$loadGlobalPrivacySetting$61(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadPrivacySettings$63(tLObject, tL_error);
                break;
        }
    }
}
