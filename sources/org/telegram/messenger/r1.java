package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f18259a;
    public final ContactsController f18260b;
    public final HashMap f18261c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18259a = i10;
        this.f18260b = contactsController;
        this.f18261c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.lambda$processLoadedContacts$35(this.f18261c, this.d);
                return;
            default:
                this.f18260b.lambda$processLoadedContacts$34(this.f18261c, this.d);
                return;
        }
    }
}
