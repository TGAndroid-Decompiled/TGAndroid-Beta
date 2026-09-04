package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f18746a;
    public final ContactsController f18747b;
    public final HashMap f18748c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18746a = i10;
        this.f18747b = contactsController;
        this.f18748c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                this.f18747b.lambda$processLoadedContacts$35(this.f18748c, this.d);
                return;
            default:
                this.f18747b.lambda$processLoadedContacts$34(this.f18748c, this.d);
                return;
        }
    }
}
