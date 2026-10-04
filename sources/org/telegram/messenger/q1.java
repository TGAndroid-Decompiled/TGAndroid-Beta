package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18939a;
    public final ContactsController f18940b;
    public final ArrayList f18941c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18939a = i10;
        this.f18940b = contactsController;
        this.f18941c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18939a) {
            case 0:
                this.f18940b.lambda$deleteContact$55(this.f18941c);
                return;
            case 1:
                this.f18940b.lambda$performWriteContactsToPhoneBook$45(this.f18941c);
                return;
            default:
                this.f18940b.lambda$deleteContactsUndoable$54(this.f18941c);
                return;
        }
    }
}
