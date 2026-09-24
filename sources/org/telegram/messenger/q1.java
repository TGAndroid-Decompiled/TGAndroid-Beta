package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17328a;
    public final ContactsController f17329b;
    public final ArrayList f17330c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17328a = i10;
        this.f17329b = contactsController;
        this.f17330c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17328a) {
            case 0:
                this.f17329b.lambda$deleteContact$55(this.f17330c);
                return;
            case 1:
                this.f17329b.lambda$performWriteContactsToPhoneBook$45(this.f17330c);
                return;
            default:
                this.f17329b.lambda$deleteContactsUndoable$54(this.f17330c);
                return;
        }
    }
}
