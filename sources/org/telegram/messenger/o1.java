package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f16900a;
    public final ContactsController f16901b;
    public final ArrayList f16902c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f16900a = i10;
        this.f16901b = contactsController;
        this.f16902c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16900a) {
            case 0:
                this.f16901b.lambda$deleteContact$55(this.f16902c);
                return;
            case 1:
                this.f16901b.lambda$performWriteContactsToPhoneBook$45(this.f16902c);
                return;
            default:
                this.f16901b.lambda$deleteContactsUndoable$54(this.f16902c);
                return;
        }
    }
}
