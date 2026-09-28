package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17346a;
    public final ContactsController f17347b;
    public final ArrayList f17348c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17346a = i10;
        this.f17347b = contactsController;
        this.f17348c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17346a) {
            case 0:
                this.f17347b.lambda$deleteContact$55(this.f17348c);
                return;
            case 1:
                this.f17347b.lambda$performWriteContactsToPhoneBook$45(this.f17348c);
                return;
            default:
                this.f17347b.lambda$deleteContactsUndoable$54(this.f17348c);
                return;
        }
    }
}
