package org.telegram.messenger;

import java.util.HashMap;

public final class ContactsController$$ExternalSyntheticLambda46 implements Runnable {
    public final int $r8$classId;
    public final ContactsController f$0;
    public final HashMap f$1;
    public final HashMap f$2;

    public ContactsController$$ExternalSyntheticLambda46(ContactsController contactsController, HashMap map, HashMap map2, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
        this.f$1 = map;
        this.f$2 = map2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processLoadedContacts$35(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processLoadedContacts$34(this.f$1, this.f$2);
                break;
        }
    }
}
