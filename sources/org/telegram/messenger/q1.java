package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18894a;
    public final ContactsController f18895b;
    public final ArrayList f18896c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18894a = i10;
        this.f18895b = contactsController;
        this.f18896c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18894a) {
            case 0:
                this.f18895b.lambda$deleteContact$55(this.f18896c);
                return;
            case 1:
                this.f18895b.lambda$performWriteContactsToPhoneBook$45(this.f18896c);
                return;
            default:
                this.f18895b.lambda$deleteContactsUndoable$54(this.f18896c);
                return;
        }
    }
}
