package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.ContactsController;

public final class ContactsController$$ExternalSyntheticLambda49 implements Comparator {
    public static final ContactsController$$ExternalSyntheticLambda49 INSTANCE = new ContactsController$$ExternalSyntheticLambda49();

    private ContactsController$$ExternalSyntheticLambda49() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$updateUnregisteredContacts$42;
        lambda$updateUnregisteredContacts$42 = ContactsController.lambda$updateUnregisteredContacts$42((ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        return lambda$updateUnregisteredContacts$42;
    }
}
