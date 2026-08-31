package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f19622a;
    public final ContactsController f19623b;
    public final ArrayList f19624c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19622a = i10;
        this.f19623b = contactsController;
        this.f19624c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19622a) {
            case 0:
                this.f19623b.lambda$deleteContact$55(this.f19624c);
                return;
            case 1:
                this.f19623b.lambda$performWriteContactsToPhoneBook$45(this.f19624c);
                return;
            default:
                this.f19623b.lambda$deleteContactsUndoable$54(this.f19624c);
                return;
        }
    }
}
