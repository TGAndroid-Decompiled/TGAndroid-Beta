package org.telegram.messenger;

import java.util.ArrayList;
public final class o1 implements Runnable {
    public final int f16909a;
    public final ContactsController f16910b;
    public final ArrayList f16911c;

    public o1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f16909a = i10;
        this.f16910b = contactsController;
        this.f16911c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16909a) {
            case 0:
                this.f16910b.lambda$deleteContact$55(this.f16911c);
                return;
            case 1:
                this.f16910b.lambda$performWriteContactsToPhoneBook$45(this.f16911c);
                return;
            default:
                this.f16910b.lambda$deleteContactsUndoable$54(this.f16911c);
                return;
        }
    }
}
