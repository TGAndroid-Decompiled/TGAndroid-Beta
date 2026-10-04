package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18940a;
    public final ContactsController f18941b;
    public final ArrayList f18942c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18940a = i10;
        this.f18941b = contactsController;
        this.f18942c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18940a) {
            case 0:
                this.f18941b.lambda$deleteContact$55(this.f18942c);
                return;
            case 1:
                this.f18941b.lambda$performWriteContactsToPhoneBook$45(this.f18942c);
                return;
            default:
                this.f18941b.lambda$deleteContactsUndoable$54(this.f18942c);
                return;
        }
    }
}
