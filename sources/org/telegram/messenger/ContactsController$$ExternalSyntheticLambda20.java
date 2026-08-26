package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;

public final class ContactsController$$ExternalSyntheticLambda20 implements Comparator {
    public final int $r8$classId;
    public final Collator f$0;

    public ContactsController$$ExternalSyntheticLambda20(Collator collator, int i) {
        this.$r8$classId = i;
        this.f$0 = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ContactsController.lambda$buildContactsSectionsArrays$44(this.f$0, (String) obj, (String) obj2);
            case 1:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f$0, obj, obj2);
            case 2:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f$0, (String) obj, (String) obj2);
            case 3:
                return ContactsController.lambda$processLoadedContacts$31(this.f$0, (String) obj, (String) obj2);
            case 4:
                return ContactsController.lambda$processLoadedContacts$32(this.f$0, (String) obj, (String) obj2);
            default:
                return ContactsController.lambda$updateUnregisteredContacts$42(this.f$0, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        }
    }
}
