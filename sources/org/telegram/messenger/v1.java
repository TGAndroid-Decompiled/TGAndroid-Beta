package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19149a;
    public final ContactsController f19150b;
    public final HashMap f19151c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19149a = i10;
        this.f19150b = contactsController;
        this.f19151c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19149a) {
            case 0:
                this.f19150b.lambda$processLoadedContacts$35(this.f19151c, this.d);
                return;
            default:
                this.f19150b.lambda$processLoadedContacts$34(this.f19151c, this.d);
                return;
        }
    }
}
