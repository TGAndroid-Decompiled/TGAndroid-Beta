package org.telegram.messenger;

import java.util.ArrayList;
public final class t1 implements Runnable {
    public final int f19560a;
    public final ContactsController f19561b;
    public final ArrayList f19562c;

    public t1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f19560a = i10;
        this.f19561b = contactsController;
        this.f19562c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f19560a) {
            case 0:
                this.f19561b.lambda$deleteContact$55(this.f19562c);
                return;
            case 1:
                this.f19561b.lambda$performWriteContactsToPhoneBook$45(this.f19562c);
                return;
            default:
                this.f19561b.lambda$deleteContactsUndoable$54(this.f19562c);
                return;
        }
    }
}
