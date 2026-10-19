package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f19457a;
    public final ContactsController f19458b;
    public final ArrayList f19459c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19457a = i10;
        this.f19458b = contactsController;
        this.f19459c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19457a) {
            case 0:
                this.f19458b.lambda$deleteContact$55(this.f19459c);
                return;
            case 1:
                this.f19458b.lambda$performWriteContactsToPhoneBook$45(this.f19459c);
                return;
            default:
                this.f19458b.lambda$deleteContactsUndoable$54(this.f19459c);
                return;
        }
    }
}
