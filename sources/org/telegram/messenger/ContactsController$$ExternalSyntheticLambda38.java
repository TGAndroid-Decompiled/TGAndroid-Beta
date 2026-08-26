package org.telegram.messenger;

import java.util.ArrayList;

public final class ContactsController$$ExternalSyntheticLambda38 implements Runnable {
    public final int $r8$classId;
    public final ContactsController f$0;
    public final ArrayList f$1;

    public ContactsController$$ExternalSyntheticLambda38(ContactsController contactsController, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = contactsController;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteContact$55(this.f$1);
                break;
            case 1:
                this.f$0.lambda$performWriteContactsToPhoneBook$45(this.f$1);
                break;
            default:
                this.f$0.lambda$deleteContactsUndoable$54(this.f$1);
                break;
        }
    }
}
