package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19788a;
    public final ContactsController f19789b;
    public final HashMap f19790c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19788a = i10;
        this.f19789b = contactsController;
        this.f19790c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19788a) {
            case 0:
                this.f19789b.lambda$processLoadedContacts$35(this.f19790c, this.d);
                return;
            default:
                this.f19789b.lambda$processLoadedContacts$34(this.f19790c, this.d);
                return;
        }
    }
}
