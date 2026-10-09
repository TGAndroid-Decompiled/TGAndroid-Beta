package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19096a;
    public final ContactsController f19097b;
    public final HashMap f19098c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19096a = i10;
        this.f19097b = contactsController;
        this.f19098c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19096a) {
            case 0:
                this.f19097b.lambda$processLoadedContacts$35(this.f19098c, this.d);
                return;
            default:
                this.f19097b.lambda$processLoadedContacts$34(this.f19098c, this.d);
                return;
        }
    }
}
