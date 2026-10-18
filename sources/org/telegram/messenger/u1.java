package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f19615a;
    public final ContactsController f19616b;
    public final HashMap f19617c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19615a = i10;
        this.f19616b = contactsController;
        this.f19617c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19615a) {
            case 0:
                this.f19616b.lambda$processLoadedContacts$35(this.f19617c, this.d);
                return;
            default:
                this.f19616b.lambda$processLoadedContacts$34(this.f19617c, this.d);
                return;
        }
    }
}
