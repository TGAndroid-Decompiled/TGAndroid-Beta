package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f18072a;
    public final ContactsController f18073b;
    public final ArrayList f18074c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18072a = i10;
        this.f18073b = contactsController;
        this.f18074c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                this.f18073b.lambda$deleteContact$55(this.f18074c);
                return;
            case 1:
                this.f18073b.lambda$performWriteContactsToPhoneBook$45(this.f18074c);
                return;
            default:
                this.f18073b.lambda$deleteContactsUndoable$54(this.f18074c);
                return;
        }
    }
}
