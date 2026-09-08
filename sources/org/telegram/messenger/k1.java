package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
public final class k1 implements Comparator {
    public final int f18136a;
    public final Collator f18137b;

    public k1(Collator collator, int i10) {
        this.f18136a = i10;
        this.f18137b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$44;
        int lambda$mergePhonebookAndTelegramContacts$38;
        int lambda$mergePhonebookAndTelegramContacts$39;
        int lambda$processLoadedContacts$31;
        int lambda$processLoadedContacts$32;
        int lambda$updateUnregisteredContacts$42;
        switch (this.f18136a) {
            case 0:
                lambda$buildContactsSectionsArrays$44 = ContactsController.lambda$buildContactsSectionsArrays$44(this.f18137b, (String) obj, (String) obj2);
                return lambda$buildContactsSectionsArrays$44;
            case 1:
                lambda$mergePhonebookAndTelegramContacts$38 = ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f18137b, obj, obj2);
                return lambda$mergePhonebookAndTelegramContacts$38;
            case 2:
                lambda$mergePhonebookAndTelegramContacts$39 = ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f18137b, (String) obj, (String) obj2);
                return lambda$mergePhonebookAndTelegramContacts$39;
            case 3:
                lambda$processLoadedContacts$31 = ContactsController.lambda$processLoadedContacts$31(this.f18137b, (String) obj, (String) obj2);
                return lambda$processLoadedContacts$31;
            case 4:
                lambda$processLoadedContacts$32 = ContactsController.lambda$processLoadedContacts$32(this.f18137b, (String) obj, (String) obj2);
                return lambda$processLoadedContacts$32;
            default:
                lambda$updateUnregisteredContacts$42 = ContactsController.lambda$updateUnregisteredContacts$42(this.f18137b, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
                return lambda$updateUnregisteredContacts$42;
        }
    }
}
