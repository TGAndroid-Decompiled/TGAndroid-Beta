package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17090a;
    public final ContactsController f17091b;
    public final ArrayList f17092c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17090a = i10;
        this.f17091b = contactsController;
        this.f17092c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17090a) {
            case 0:
                this.f17091b.lambda$deleteContact$55(this.f17092c);
                return;
            case 1:
                this.f17091b.lambda$performWriteContactsToPhoneBook$45(this.f17092c);
                return;
            default:
                this.f17091b.lambda$deleteContactsUndoable$54(this.f17092c);
                return;
        }
    }
}
