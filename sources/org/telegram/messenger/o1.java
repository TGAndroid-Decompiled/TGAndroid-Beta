package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f18553a;
    public final ContactsController f18554b;
    public final ArrayList f18555c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f18553a = i10;
        this.f18554b = contactsController;
        this.f18555c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18553a) {
            case 0:
                this.f18554b.lambda$deleteContact$55(this.f18555c);
                return;
            case 1:
                this.f18554b.lambda$performWriteContactsToPhoneBook$45(this.f18555c);
                return;
            default:
                this.f18554b.lambda$deleteContactsUndoable$54(this.f18555c);
                return;
        }
    }
}
