package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f19459a;
    public final ContactsController f19460b;
    public final ArrayList f19461c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19459a = i10;
        this.f19460b = contactsController;
        this.f19461c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19459a) {
            case 0:
                this.f19460b.lambda$deleteContact$55(this.f19461c);
                return;
            case 1:
                this.f19460b.lambda$performWriteContactsToPhoneBook$45(this.f19461c);
                return;
            default:
                this.f19460b.lambda$deleteContactsUndoable$54(this.f19461c);
                return;
        }
    }
}
