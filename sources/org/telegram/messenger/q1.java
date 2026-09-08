package org.telegram.messenger;

import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f18773a;
    public final ContactsController f18774b;
    public final HashMap f18775c;
    public final HashMap d;

    public q1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18773a = i10;
        this.f18774b = contactsController;
        this.f18775c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18773a) {
            case 0:
                this.f18774b.lambda$processLoadedContacts$35(this.f18775c, this.d);
                return;
            default:
                this.f18774b.lambda$processLoadedContacts$34(this.f18775c, this.d);
                return;
        }
    }
}
