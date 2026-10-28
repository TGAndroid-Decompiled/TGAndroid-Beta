package org.telegram.messenger;

import java.util.ArrayList;
public final class u1 implements Runnable {
    public final int f21364a;
    public final ContactsController f21365b;
    public final ArrayList f21366c;

    public u1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f21364a = i10;
        this.f21365b = contactsController;
        this.f21366c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21364a) {
            case 0:
                this.f21365b.lambda$deleteContact$55(this.f21366c);
                return;
            case 1:
                this.f21365b.lambda$performWriteContactsToPhoneBook$45(this.f21366c);
                return;
            default:
                this.f21365b.lambda$deleteContactsUndoable$54(this.f21366c);
                return;
        }
    }
}
