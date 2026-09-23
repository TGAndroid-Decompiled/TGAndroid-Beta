package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17252a;
    public final ContactsController f17253b;
    public final HashMap f17254c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17252a = i10;
        this.f17253b = contactsController;
        this.f17254c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17252a) {
            case 0:
                this.f17253b.lambda$processLoadedContacts$35(this.f17254c, this.d);
                return;
            default:
                this.f17253b.lambda$processLoadedContacts$34(this.f17254c, this.d);
                return;
        }
    }
}
