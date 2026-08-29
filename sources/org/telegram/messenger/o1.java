package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f21109a;
    public final ContactsController f21110b;
    public final ArrayList f21111c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f21109a = i10;
        this.f21110b = contactsController;
        this.f21111c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f21109a) {
            case 0:
                this.f21110b.lambda$deleteContact$55(this.f21111c);
                return;
            case 1:
                this.f21110b.lambda$performWriteContactsToPhoneBook$45(this.f21111c);
                return;
            default:
                this.f21110b.lambda$deleteContactsUndoable$54(this.f21111c);
                return;
        }
    }
}
