package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
public final class m1 implements Comparator {
    public final int f16977a;
    public final Collator f16978b;

    public m1(Collator collator, int i10) {
        this.f16977a = i10;
        this.f16978b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f16977a) {
            case 0:
                return ContactsController.lambda$buildContactsSectionsArrays$44(this.f16978b, (String) obj, (String) obj2);
            case 1:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f16978b, obj, obj2);
            case 2:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f16978b, (String) obj, (String) obj2);
            case 3:
                return ContactsController.lambda$processLoadedContacts$31(this.f16978b, (String) obj, (String) obj2);
            case 4:
                return ContactsController.lambda$processLoadedContacts$32(this.f16978b, (String) obj, (String) obj2);
            default:
                return ContactsController.lambda$updateUnregisteredContacts$42(this.f16978b, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        }
    }
}
