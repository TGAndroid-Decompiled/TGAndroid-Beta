package org.telegram.messenger;

import java.util.HashMap;
public final class w1 implements Runnable {
    public final int f21710a;
    public final ContactsController f21711b;
    public final HashMap f21712c;
    public final HashMap d;

    public w1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f21710a = i10;
        this.f21711b = contactsController;
        this.f21712c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21710a) {
            case 0:
                this.f21711b.lambda$processLoadedContacts$35(this.f21712c, this.d);
                return;
            default:
                this.f21711b.lambda$processLoadedContacts$34(this.f21712c, this.d);
                return;
        }
    }
}
