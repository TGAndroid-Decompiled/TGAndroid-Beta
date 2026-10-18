package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f19460a;
    public final ContactsController f19461b;
    public final ArrayList f19462c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19460a = i10;
        this.f19461b = contactsController;
        this.f19462c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19460a) {
            case 0:
                this.f19461b.lambda$deleteContact$55(this.f19462c);
                return;
            case 1:
                this.f19461b.lambda$performWriteContactsToPhoneBook$45(this.f19462c);
                return;
            default:
                this.f19461b.lambda$deleteContactsUndoable$54(this.f19462c);
                return;
        }
    }
}
