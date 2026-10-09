package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18890a;
    public final ContactsController f18891b;
    public final ArrayList f18892c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18890a = i10;
        this.f18891b = contactsController;
        this.f18892c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                this.f18891b.lambda$deleteContact$55(this.f18892c);
                return;
            case 1:
                this.f18891b.lambda$performWriteContactsToPhoneBook$45(this.f18892c);
                return;
            default:
                this.f18891b.lambda$deleteContactsUndoable$54(this.f18892c);
                return;
        }
    }
}
