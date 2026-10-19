package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f19618a;
    public final ContactsController f19619b;
    public final HashMap f19620c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19618a = i10;
        this.f19619b = contactsController;
        this.f19620c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19618a) {
            case 0:
                this.f19619b.lambda$processLoadedContacts$35(this.f19620c, this.d);
                return;
            default:
                this.f19619b.lambda$processLoadedContacts$34(this.f19620c, this.d);
                return;
        }
    }
}
