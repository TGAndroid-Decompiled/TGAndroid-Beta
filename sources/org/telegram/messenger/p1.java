package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f17177a;
    public final ContactsController f17178b;
    public final ArrayList f17179c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17177a = i10;
        this.f17178b = contactsController;
        this.f17179c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17177a) {
            case 0:
                this.f17178b.lambda$deleteContact$55(this.f17179c);
                return;
            case 1:
                this.f17178b.lambda$performWriteContactsToPhoneBook$45(this.f17179c);
                return;
            default:
                this.f17178b.lambda$deleteContactsUndoable$54(this.f17179c);
                return;
        }
    }
}
