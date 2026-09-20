package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f17218a;
    public final ContactsController f17219b;
    public final ArrayList f17220c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17218a = i10;
        this.f17219b = contactsController;
        this.f17220c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17218a) {
            case 0:
                this.f17219b.lambda$deleteContact$55(this.f17220c);
                return;
            case 1:
                this.f17219b.lambda$performWriteContactsToPhoneBook$45(this.f17220c);
                return;
            default:
                this.f17219b.lambda$deleteContactsUndoable$54(this.f17220c);
                return;
        }
    }
}
