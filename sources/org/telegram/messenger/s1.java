package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f19470a;
    public final ContactsController f19471b;
    public final ArrayList f19472c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19470a = i10;
        this.f19471b = contactsController;
        this.f19472c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                this.f19471b.lambda$deleteContact$55(this.f19472c);
                return;
            case 1:
                this.f19471b.lambda$performWriteContactsToPhoneBook$45(this.f19472c);
                return;
            default:
                this.f19471b.lambda$deleteContactsUndoable$54(this.f19472c);
                return;
        }
    }
}
