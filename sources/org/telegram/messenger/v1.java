package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19150a;
    public final ContactsController f19151b;
    public final HashMap f19152c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19150a = i10;
        this.f19151b = contactsController;
        this.f19152c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19150a) {
            case 0:
                this.f19151b.lambda$processLoadedContacts$35(this.f19152c, this.d);
                return;
            default:
                this.f19151b.lambda$processLoadedContacts$34(this.f19152c, this.d);
                return;
        }
    }
}
