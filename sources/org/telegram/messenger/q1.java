package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f18793a;
    public final ContactsController f18794b;
    public final HashMap f18795c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18793a = i10;
        this.f18794b = contactsController;
        this.f18795c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18793a) {
            case 0:
                this.f18794b.lambda$processLoadedContacts$35(this.f18795c, this.d);
                return;
            default:
                this.f18794b.lambda$processLoadedContacts$34(this.f18795c, this.d);
                return;
        }
    }
}
