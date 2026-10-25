package org.telegram.messenger;

import java.util.HashMap;
public final class w1 implements Runnable {
    public final int f21722a;
    public final ContactsController f21723b;
    public final HashMap f21724c;
    public final HashMap d;

    public w1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f21722a = i10;
        this.f21723b = contactsController;
        this.f21724c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21722a) {
            case 0:
                this.f21723b.lambda$processLoadedContacts$35(this.f21724c, this.d);
                return;
            default:
                this.f21723b.lambda$processLoadedContacts$34(this.f21724c, this.d);
                return;
        }
    }
}
