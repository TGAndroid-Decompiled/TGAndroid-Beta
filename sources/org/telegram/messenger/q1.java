package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f18899a;
    public final ContactsController f18900b;
    public final ArrayList f18901c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18899a = i10;
        this.f18900b = contactsController;
        this.f18901c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18899a) {
            case 0:
                this.f18900b.lambda$deleteContact$55(this.f18901c);
                return;
            case 1:
                this.f18900b.lambda$performWriteContactsToPhoneBook$45(this.f18901c);
                return;
            default:
                this.f18900b.lambda$deleteContactsUndoable$54(this.f18901c);
                return;
        }
    }
}
