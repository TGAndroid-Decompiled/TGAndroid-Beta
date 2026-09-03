package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f19624a;
    public final ContactsController f19625b;
    public final ArrayList f19626c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19624a = i10;
        this.f19625b = contactsController;
        this.f19626c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19624a) {
            case 0:
                this.f19625b.lambda$deleteContact$55(this.f19626c);
                return;
            case 1:
                this.f19625b.lambda$performWriteContactsToPhoneBook$45(this.f19626c);
                return;
            default:
                this.f19625b.lambda$deleteContactsUndoable$54(this.f19626c);
                return;
        }
    }
}
