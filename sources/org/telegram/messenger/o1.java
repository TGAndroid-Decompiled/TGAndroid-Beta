package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f18561a;
    public final ContactsController f18562b;
    public final ArrayList f18563c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18561a = i10;
        this.f18562b = contactsController;
        this.f18563c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                this.f18562b.lambda$deleteContact$55(this.f18563c);
                return;
            case 1:
                this.f18562b.lambda$performWriteContactsToPhoneBook$45(this.f18563c);
                return;
            default:
                this.f18562b.lambda$deleteContactsUndoable$54(this.f18563c);
                return;
        }
    }
}
