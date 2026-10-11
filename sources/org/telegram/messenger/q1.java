package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18935a;
    public final ContactsController f18936b;
    public final ArrayList f18937c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18935a = i10;
        this.f18936b = contactsController;
        this.f18937c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18935a) {
            case 0:
                this.f18936b.lambda$deleteContact$55(this.f18937c);
                return;
            case 1:
                this.f18936b.lambda$performWriteContactsToPhoneBook$45(this.f18937c);
                return;
            default:
                this.f18936b.lambda$deleteContactsUndoable$54(this.f18937c);
                return;
        }
    }
}
