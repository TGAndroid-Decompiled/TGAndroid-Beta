package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

public final class ContactsController$$ExternalSyntheticLambda23 implements Runnable {
    public final int $r8$classId;
    public final ContactsController f$0;
    public final HashMap f$1;
    public final ArrayList f$2;
    public final HashMap f$3;

    public ContactsController$$ExternalSyntheticLambda23(ArrayList arrayList, HashMap map, HashMap map2, ContactsController contactsController) {
        this.$r8$classId = 1;
        this.f$0 = contactsController;
        this.f$2 = arrayList;
        this.f$1 = map;
        this.f$3 = map2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$performSyncPhoneBook$15(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$mergePhonebookAndTelegramContacts$40(this.f$2, this.f$1, this.f$3);
                break;
            case 2:
                this.f$0.lambda$performSyncPhoneBook$21(this.f$1, this.f$2, this.f$3);
                break;
            case 3:
                this.f$0.lambda$performSyncPhoneBook$17(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$performSyncPhoneBook$23(this.f$1, this.f$2, this.f$3);
                break;
        }
    }

    public ContactsController$$ExternalSyntheticLambda23(ContactsController contactsController, HashMap map, ArrayList arrayList, HashMap map2, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
        this.f$1 = map;
        this.f$2 = arrayList;
        this.f$3 = map2;
    }
}
