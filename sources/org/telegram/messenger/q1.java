package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
public final class q1 implements Comparator {
    public final int f21003a;
    public final Collator f21004b;

    public q1(Collator collator, int i10) {
        this.f21003a = i10;
        this.f21004b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21003a) {
            case 0:
                return ContactsController.lambda$buildContactsSectionsArrays$44(this.f21004b, (String) obj, (String) obj2);
            case 1:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f21004b, obj, obj2);
            case 2:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f21004b, (String) obj, (String) obj2);
            case 3:
                return ContactsController.lambda$processLoadedContacts$31(this.f21004b, (String) obj, (String) obj2);
            case 4:
                return ContactsController.lambda$processLoadedContacts$32(this.f21004b, (String) obj, (String) obj2);
            default:
                return ContactsController.lambda$updateUnregisteredContacts$42(this.f21004b, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        }
    }
}
