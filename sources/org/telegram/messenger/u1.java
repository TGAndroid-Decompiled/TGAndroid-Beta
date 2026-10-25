package org.telegram.messenger;

import java.util.ArrayList;
public final class u1 implements Runnable {
    public final int f21379a;
    public final ContactsController f21380b;
    public final ArrayList f21381c;

    public u1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f21379a = i10;
        this.f21380b = contactsController;
        this.f21381c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21379a) {
            case 0:
                this.f21380b.lambda$deleteContact$55(this.f21381c);
                return;
            case 1:
                this.f21380b.lambda$performWriteContactsToPhoneBook$45(this.f21381c);
                return;
            default:
                this.f21380b.lambda$deleteContactsUndoable$54(this.f21381c);
                return;
        }
    }
}
