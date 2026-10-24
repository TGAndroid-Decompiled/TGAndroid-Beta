package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19623a;
    public final ContactsController f19624b;
    public final ArrayList f19625c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19623a = i10;
        this.f19624b = contactsController;
        this.f19625c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                this.f19624b.lambda$deleteContact$55(this.f19625c);
                return;
            case 1:
                this.f19624b.lambda$performWriteContactsToPhoneBook$45(this.f19625c);
                return;
            default:
                this.f19624b.lambda$deleteContactsUndoable$54(this.f19625c);
                return;
        }
    }
}
