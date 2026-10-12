package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f18346a;
    public final ContactsController f18347b;
    public final ArrayList f18348c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18346a = i10;
        this.f18347b = contactsController;
        this.f18348c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18346a) {
            case 0:
                this.f18347b.lambda$deleteContact$55(this.f18348c);
                return;
            case 1:
                this.f18347b.lambda$performWriteContactsToPhoneBook$45(this.f18348c);
                return;
            default:
                this.f18347b.lambda$deleteContactsUndoable$54(this.f18348c);
                return;
        }
    }
}
