package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17339a;
    public final ContactsController f17340b;
    public final ArrayList f17341c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17339a = i10;
        this.f17340b = contactsController;
        this.f17341c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                this.f17340b.lambda$deleteContact$55(this.f17341c);
                return;
            case 1:
                this.f17340b.lambda$performWriteContactsToPhoneBook$45(this.f17341c);
                return;
            default:
                this.f17340b.lambda$deleteContactsUndoable$54(this.f17341c);
                return;
        }
    }
}
