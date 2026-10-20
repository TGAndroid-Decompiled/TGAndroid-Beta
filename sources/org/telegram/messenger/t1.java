package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19562a;
    public final ContactsController f19563b;
    public final ArrayList f19564c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19562a = i10;
        this.f19563b = contactsController;
        this.f19564c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19562a) {
            case 0:
                this.f19563b.lambda$deleteContact$55(this.f19564c);
                return;
            case 1:
                this.f19563b.lambda$performWriteContactsToPhoneBook$45(this.f19564c);
                return;
            default:
                this.f19563b.lambda$deleteContactsUndoable$54(this.f19564c);
                return;
        }
    }
}
