package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18944a;
    public final ContactsController f18945b;
    public final ArrayList f18946c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18944a = i10;
        this.f18945b = contactsController;
        this.f18946c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18944a) {
            case 0:
                this.f18945b.lambda$deleteContact$55(this.f18946c);
                return;
            case 1:
                this.f18945b.lambda$performWriteContactsToPhoneBook$45(this.f18946c);
                return;
            default:
                this.f18945b.lambda$deleteContactsUndoable$54(this.f18946c);
                return;
        }
    }
}
