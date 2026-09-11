package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f18766a;
    public final ContactsController f18767b;
    public final HashMap f18768c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18766a = i10;
        this.f18767b = contactsController;
        this.f18768c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18766a) {
            case 0:
                this.f18767b.lambda$processLoadedContacts$35(this.f18768c, this.d);
                return;
            default:
                this.f18767b.lambda$processLoadedContacts$34(this.f18768c, this.d);
                return;
        }
    }
}
