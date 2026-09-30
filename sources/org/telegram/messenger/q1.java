package org.telegram.messenger;

import java.util.ArrayList;
public final class q1 implements Runnable {
    public final int f17347a;
    public final ContactsController f17348b;
    public final ArrayList f17349c;

    public q1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17347a = i10;
        this.f17348b = contactsController;
        this.f17349c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17347a) {
            case 0:
                this.f17348b.lambda$deleteContact$55(this.f17349c);
                return;
            case 1:
                this.f17348b.lambda$performWriteContactsToPhoneBook$45(this.f17349c);
                return;
            default:
                this.f17348b.lambda$deleteContactsUndoable$54(this.f17349c);
                return;
        }
    }
}
