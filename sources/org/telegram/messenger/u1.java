package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f19614a;
    public final ContactsController f19615b;
    public final HashMap f19616c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19614a = i10;
        this.f19615b = contactsController;
        this.f19616c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                this.f19615b.lambda$processLoadedContacts$35(this.f19616c, this.d);
                return;
            default:
                this.f19615b.lambda$processLoadedContacts$34(this.f19616c, this.d);
                return;
        }
    }
}
