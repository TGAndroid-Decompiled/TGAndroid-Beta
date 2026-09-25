package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17343a;
    public final ContactsController f17344b;
    public final ArrayList f17345c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17343a = i10;
        this.f17344b = contactsController;
        this.f17345c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17343a) {
            case 0:
                this.f17344b.lambda$deleteContact$55(this.f17345c);
                return;
            case 1:
                this.f17344b.lambda$performWriteContactsToPhoneBook$45(this.f17345c);
                return;
            default:
                this.f17344b.lambda$deleteContactsUndoable$54(this.f17345c);
                return;
        }
    }
}
