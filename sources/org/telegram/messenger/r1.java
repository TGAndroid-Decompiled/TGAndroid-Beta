package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f21362a;
    public final ContactsController f21363b;
    public final HashMap f21364c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i9) {
        this.f21362a = i9;
        this.f21363b = contactsController;
        this.f21364c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21362a) {
            case 0:
                this.f21363b.lambda$processLoadedContacts$35(this.f21364c, this.d);
                return;
            default:
                this.f21363b.lambda$processLoadedContacts$34(this.f21364c, this.d);
                return;
        }
    }
}
