package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f21192a;
    public final ContactsController f21193b;
    public final ArrayList f21194c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i9) {
        this.f21192a = i9;
        this.f21193b = contactsController;
        this.f21194c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21192a) {
            case 0:
                this.f21193b.lambda$deleteContact$55(this.f21194c);
                return;
            case 1:
                this.f21193b.lambda$performWriteContactsToPhoneBook$45(this.f21194c);
                return;
            default:
                this.f21193b.lambda$deleteContactsUndoable$54(this.f21194c);
                return;
        }
    }
}
