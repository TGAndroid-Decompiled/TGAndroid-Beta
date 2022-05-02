package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$TL_contact;

public final class ContactsController$$ExternalSyntheticLambda50 implements Comparator {
    public static final ContactsController$$ExternalSyntheticLambda50 INSTANCE = new ContactsController$$ExternalSyntheticLambda50();

    private ContactsController$$ExternalSyntheticLambda50() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getContactsHash$25;
        lambda$getContactsHash$25 = ContactsController.lambda$getContactsHash$25((TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
        return lambda$getContactsHash$25;
    }
}
