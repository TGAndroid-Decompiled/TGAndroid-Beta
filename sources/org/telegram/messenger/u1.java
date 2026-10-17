package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f19610a;
    public final ContactsController f19611b;
    public final HashMap f19612c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19610a = i10;
        this.f19611b = contactsController;
        this.f19612c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19610a) {
            case 0:
                this.f19611b.lambda$processLoadedContacts$35(this.f19612c, this.d);
                return;
            default:
                this.f19611b.lambda$processLoadedContacts$34(this.f19612c, this.d);
                return;
        }
    }
}
