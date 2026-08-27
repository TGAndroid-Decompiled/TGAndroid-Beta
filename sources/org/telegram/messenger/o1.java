package org.telegram.messenger;

import java.util.ArrayList;

public final class o1 implements Runnable {

    public final int f21118a;

    public final ContactsController f21119b;

    public final ArrayList f21120c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f21118a = i10;
        this.f21119b = contactsController;
        this.f21120c = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21118a) {
            case 0:
                this.f21119b.lambda$deleteContact$55(this.f21120c);
                break;
            case 1:
                this.f21119b.lambda$performWriteContactsToPhoneBook$45(this.f21120c);
                break;
            default:
                this.f21119b.lambda$deleteContactsUndoable$54(this.f21120c);
                break;
        }
    }
}
