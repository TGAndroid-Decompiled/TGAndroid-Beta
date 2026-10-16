package org.telegram.messenger;

import java.util.ArrayList;
public final class s1 implements Runnable {
    public final int f18052a;
    public final ContactsController f18053b;
    public final ArrayList f18054c;

    public s1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18052a = i10;
        this.f18053b = contactsController;
        this.f18054c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18052a) {
            case 0:
                this.f18053b.lambda$deleteContact$55(this.f18054c);
                return;
            case 1:
                this.f18053b.lambda$performWriteContactsToPhoneBook$45(this.f18054c);
                return;
            default:
                this.f18053b.lambda$deleteContactsUndoable$54(this.f18054c);
                return;
        }
    }
}
