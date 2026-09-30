package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17363a;
    public final ContactsController f17364b;
    public final ArrayList f17365c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17363a = i10;
        this.f17364b = contactsController;
        this.f17365c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17363a) {
            case 0:
                this.f17364b.lambda$deleteContact$55(this.f17365c);
                return;
            case 1:
                this.f17364b.lambda$performWriteContactsToPhoneBook$45(this.f17365c);
                return;
            default:
                this.f17364b.lambda$deleteContactsUndoable$54(this.f17365c);
                return;
        }
    }
}
