package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f18942a;
    public final ContactsController f18943b;
    public final ArrayList f18944c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18942a = i10;
        this.f18943b = contactsController;
        this.f18944c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18942a) {
            case 0:
                this.f18943b.lambda$deleteContact$55(this.f18944c);
                return;
            case 1:
                this.f18943b.lambda$performWriteContactsToPhoneBook$45(this.f18944c);
                return;
            default:
                this.f18943b.lambda$deleteContactsUndoable$54(this.f18944c);
                return;
        }
    }
}
