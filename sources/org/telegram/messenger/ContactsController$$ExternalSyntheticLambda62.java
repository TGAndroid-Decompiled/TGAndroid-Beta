package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ContactsController$$ExternalSyntheticLambda62 implements RequestDelegate {
    public static final ContactsController$$ExternalSyntheticLambda62 INSTANCE = new ContactsController$$ExternalSyntheticLambda62();

    private ContactsController$$ExternalSyntheticLambda62() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ContactsController.lambda$resetImportedContacts$9(tLObject, tLRPC$TL_error);
    }
}
