package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f19611a;
    public final ContactsController f19612b;
    public final HashMap f19613c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19611a = i10;
        this.f19612b = contactsController;
        this.f19613c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19611a) {
            case 0:
                this.f19612b.lambda$processLoadedContacts$35(this.f19613c, this.d);
                return;
            default:
                this.f19612b.lambda$processLoadedContacts$34(this.f19613c, this.d);
                return;
        }
    }
}
