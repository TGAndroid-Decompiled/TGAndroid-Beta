package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19102a;
    public final ContactsController f19103b;
    public final HashMap f19104c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19102a = i10;
        this.f19103b = contactsController;
        this.f19104c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19102a) {
            case 0:
                this.f19103b.lambda$processLoadedContacts$35(this.f19104c, this.d);
                return;
            default:
                this.f19103b.lambda$processLoadedContacts$34(this.f19104c, this.d);
                return;
        }
    }
}
