package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19635a;
    public final ContactsController f19636b;
    public final ArrayList f19637c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19635a = i10;
        this.f19636b = contactsController;
        this.f19637c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                this.f19636b.lambda$deleteContact$55(this.f19637c);
                return;
            case 1:
                this.f19636b.lambda$performWriteContactsToPhoneBook$45(this.f19637c);
                return;
            default:
                this.f19636b.lambda$deleteContactsUndoable$54(this.f19637c);
                return;
        }
    }
}
