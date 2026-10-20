package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19705a;
    public final ContactsController f19706b;
    public final HashMap f19707c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19705a = i10;
        this.f19706b = contactsController;
        this.f19707c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19705a) {
            case 0:
                this.f19706b.lambda$processLoadedContacts$35(this.f19707c, this.d);
                return;
            default:
                this.f19706b.lambda$processLoadedContacts$34(this.f19707c, this.d);
                return;
        }
    }
}
