package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f19467a;
    public final ContactsController f19468b;
    public final ArrayList f19469c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19467a = i10;
        this.f19468b = contactsController;
        this.f19469c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19467a) {
            case 0:
                this.f19468b.lambda$deleteContact$55(this.f19469c);
                return;
            case 1:
                this.f19468b.lambda$performWriteContactsToPhoneBook$45(this.f19469c);
                return;
            default:
                this.f19468b.lambda$deleteContactsUndoable$54(this.f19469c);
                return;
        }
    }
}
