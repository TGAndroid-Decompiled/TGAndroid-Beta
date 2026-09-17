package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f17108a;
    public final ContactsController f17109b;
    public final HashMap f17110c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17108a = i10;
        this.f17109b = contactsController;
        this.f17110c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17108a) {
            case 0:
                this.f17109b.lambda$processLoadedContacts$35(this.f17110c, this.d);
                return;
            default:
                this.f17109b.lambda$processLoadedContacts$34(this.f17110c, this.d);
                return;
        }
    }
}
