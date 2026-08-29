package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f21297a;
    public final ContactsController f21298b;
    public final HashMap f21299c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f21297a = i10;
        this.f21298b = contactsController;
        this.f21299c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21297a) {
            case 0:
                this.f21298b.lambda$processLoadedContacts$35(this.f21299c, this.d);
                return;
            default:
                this.f21298b.lambda$processLoadedContacts$34(this.f21299c, this.d);
                return;
        }
    }
}
