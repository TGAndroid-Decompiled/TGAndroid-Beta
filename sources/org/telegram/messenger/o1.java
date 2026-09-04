package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f18526a;
    public final ContactsController f18527b;
    public final ArrayList f18528c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18526a = i10;
        this.f18527b = contactsController;
        this.f18528c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18526a) {
            case 0:
                this.f18527b.lambda$deleteContact$55(this.f18528c);
                return;
            case 1:
                this.f18527b.lambda$performWriteContactsToPhoneBook$45(this.f18528c);
                return;
            default:
                this.f18527b.lambda$deleteContactsUndoable$54(this.f18528c);
                return;
        }
    }
}
