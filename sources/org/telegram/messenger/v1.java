package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19724a;
    public final ContactsController f19725b;
    public final HashMap f19726c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19724a = i10;
        this.f19725b = contactsController;
        this.f19726c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19724a) {
            case 0:
                this.f19725b.lambda$processLoadedContacts$35(this.f19726c, this.d);
                return;
            default:
                this.f19725b.lambda$processLoadedContacts$34(this.f19726c, this.d);
                return;
        }
    }
}
