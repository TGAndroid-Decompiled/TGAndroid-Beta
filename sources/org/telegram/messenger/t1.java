package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f18943a;
    public final ContactsController f18944b;
    public final ArrayList f18945c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18943a = i10;
        this.f18944b = contactsController;
        this.f18945c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18943a) {
            case 0:
                this.f18944b.lambda$deleteContact$55(this.f18945c);
                return;
            case 1:
                this.f18944b.lambda$performWriteContactsToPhoneBook$45(this.f18945c);
                return;
            default:
                this.f18944b.lambda$deleteContactsUndoable$54(this.f18945c);
                return;
        }
    }
}
