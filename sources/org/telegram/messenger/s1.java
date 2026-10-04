package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19121a;
    public final ContactsController f19122b;
    public final HashMap f19123c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19121a = i10;
        this.f19122b = contactsController;
        this.f19123c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19121a) {
            case 0:
                this.f19122b.lambda$processLoadedContacts$35(this.f19123c, this.d);
                return;
            default:
                this.f19122b.lambda$processLoadedContacts$34(this.f19123c, this.d);
                return;
        }
    }
}
