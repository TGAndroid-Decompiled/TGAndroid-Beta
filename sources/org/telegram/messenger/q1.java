package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f17099a;
    public final ContactsController f17100b;
    public final HashMap f17101c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17099a = i10;
        this.f17100b = contactsController;
        this.f17101c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17099a) {
            case 0:
                this.f17100b.lambda$processLoadedContacts$35(this.f17101c, this.d);
                return;
            default:
                this.f17100b.lambda$processLoadedContacts$34(this.f17101c, this.d);
                return;
        }
    }
}
