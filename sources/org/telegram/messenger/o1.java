package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f18588a;
    public final ContactsController f18589b;
    public final ArrayList f18590c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18588a = i10;
        this.f18589b = contactsController;
        this.f18590c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18588a) {
            case 0:
                this.f18589b.lambda$deleteContact$55(this.f18590c);
                return;
            case 1:
                this.f18589b.lambda$performWriteContactsToPhoneBook$45(this.f18590c);
                return;
            default:
                this.f18589b.lambda$deleteContactsUndoable$54(this.f18590c);
                return;
        }
    }
}
