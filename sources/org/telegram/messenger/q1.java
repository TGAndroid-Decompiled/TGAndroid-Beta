package org.telegram.messenger;

import java.util.HashMap;

public final class q1 implements Runnable {

    public final int f21308a;

    public final ContactsController f21309b;

    public final HashMap f21310c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap map, HashMap map2, int i10) {
        this.f21308a = i10;
        this.f21309b = contactsController;
        this.f21310c = map;
        this.d = map2;
    }

    @Override
    public final void run() {
        switch (this.f21308a) {
            case 0:
                this.f21309b.lambda$processLoadedContacts$35(this.f21310c, this.d);
                break;
            default:
                this.f21309b.lambda$processLoadedContacts$34(this.f21310c, this.d);
                break;
        }
    }
}
