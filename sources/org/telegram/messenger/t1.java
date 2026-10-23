package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19570a;
    public final ContactsController f19571b;
    public final ArrayList f19572c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19570a = i10;
        this.f19571b = contactsController;
        this.f19572c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19570a) {
            case 0:
                this.f19571b.lambda$deleteContact$55(this.f19572c);
                return;
            case 1:
                this.f19571b.lambda$performWriteContactsToPhoneBook$45(this.f19572c);
                return;
            default:
                this.f19571b.lambda$deleteContactsUndoable$54(this.f19572c);
                return;
        }
    }
}
