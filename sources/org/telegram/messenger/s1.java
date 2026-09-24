package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17484a;
    public final ContactsController f17485b;
    public final HashMap f17486c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17484a = i10;
        this.f17485b = contactsController;
        this.f17486c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17484a) {
            case 0:
                this.f17485b.lambda$processLoadedContacts$35(this.f17486c, this.d);
                return;
            default:
                this.f17485b.lambda$processLoadedContacts$34(this.f17486c, this.d);
                return;
        }
    }
}
