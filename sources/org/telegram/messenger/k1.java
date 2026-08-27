package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;

public final class k1 implements Comparator {

    public final int f20725a;

    public final Collator f20726b;

    public k1(Collator collator, int i10) {
        this.f20725a = i10;
        this.f20726b = collator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f20725a) {
            case 0:
                return ContactsController.lambda$buildContactsSectionsArrays$44(this.f20726b, (String) obj, (String) obj2);
            case 1:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$38(this.f20726b, obj, obj2);
            case 2:
                return ContactsController.lambda$mergePhonebookAndTelegramContacts$39(this.f20726b, (String) obj, (String) obj2);
            case 3:
                return ContactsController.lambda$processLoadedContacts$31(this.f20726b, (String) obj, (String) obj2);
            case 4:
                return ContactsController.lambda$processLoadedContacts$32(this.f20726b, (String) obj, (String) obj2);
            default:
                return ContactsController.lambda$updateUnregisteredContacts$42(this.f20726b, (ContactsController.Contact) obj, (ContactsController.Contact) obj2);
        }
    }
}
