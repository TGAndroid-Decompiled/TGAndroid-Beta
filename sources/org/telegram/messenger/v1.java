package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19725a;
    public final ContactsController f19726b;
    public final HashMap f19727c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19725a = i10;
        this.f19726b = contactsController;
        this.f19727c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                this.f19726b.lambda$processLoadedContacts$35(this.f19727c, this.d);
                return;
            default:
                this.f19726b.lambda$processLoadedContacts$34(this.f19727c, this.d);
                return;
        }
    }
}
