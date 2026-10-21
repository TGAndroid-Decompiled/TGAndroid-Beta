package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
public final class p1 implements Comparator {
    public final int f19186a;
    public final Collator f19187b;

    public p1(Collator collator, int i10) {
        this.f19186a = i10;
        this.f19187b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f19186a) {
            case 0:
                return ContactsController.lambda$buildContactsSectionsArrays$44(this.f19187b, (String) obj, (String) obj2);
            case 1:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f19187b, obj, obj2);
            case 2:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f19187b, (String) obj, (String) obj2);
            case 3:
                return ContactsController.lambda$processLoadedContacts$31(this.f19187b, (String) obj, (String) obj2);
            case 4:
                return ContactsController.lambda$processLoadedContacts$32(this.f19187b, (String) obj, (String) obj2);
            default:
                return ContactsController.lambda$updateUnregisteredContacts$42(this.f19187b, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        }
    }
}
