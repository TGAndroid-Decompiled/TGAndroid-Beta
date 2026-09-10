package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f16274a;
    public final ContactsController f16275b;
    public final ArrayList f16276c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f16274a = i10;
        this.f16275b = contactsController;
        this.f16276c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16274a) {
            case 0:
                this.f16275b.lambda$deleteContact$55(this.f16276c);
                return;
            case 1:
                this.f16275b.lambda$performWriteContactsToPhoneBook$45(this.f16276c);
                return;
            default:
                this.f16275b.lambda$deleteContactsUndoable$54(this.f16276c);
                return;
        }
    }
}
