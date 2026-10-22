package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19556a;
    public final ContactsController f19557b;
    public final ArrayList f19558c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19556a = i10;
        this.f19557b = contactsController;
        this.f19558c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19556a) {
            case 0:
                this.f19557b.lambda$deleteContact$55(this.f19558c);
                return;
            case 1:
                this.f19557b.lambda$performWriteContactsToPhoneBook$45(this.f19558c);
                return;
            default:
                this.f19557b.lambda$deleteContactsUndoable$54(this.f19558c);
                return;
        }
    }
}
