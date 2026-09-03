package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f18050a;
    public final ContactsController f18051b;
    public final ArrayList f18052c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18050a = i10;
        this.f18051b = contactsController;
        this.f18052c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18050a) {
            case 0:
                this.f18051b.lambda$deleteContact$55(this.f18052c);
                return;
            case 1:
                this.f18051b.lambda$performWriteContactsToPhoneBook$45(this.f18052c);
                return;
            default:
                this.f18051b.lambda$deleteContactsUndoable$54(this.f18052c);
                return;
        }
    }
}
