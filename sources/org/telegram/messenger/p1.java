package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f16997a;
    public final ContactsController f16998b;
    public final ArrayList f16999c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f16997a = i10;
        this.f16998b = contactsController;
        this.f16999c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16997a) {
            case 0:
                this.f16998b.lambda$deleteContact$55(this.f16999c);
                return;
            case 1:
                this.f16998b.lambda$performWriteContactsToPhoneBook$45(this.f16999c);
                return;
            default:
                this.f16998b.lambda$deleteContactsUndoable$54(this.f16999c);
                return;
        }
    }
}
