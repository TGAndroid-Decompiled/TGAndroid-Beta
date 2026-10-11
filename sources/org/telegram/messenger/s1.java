package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19138a;
    public final ContactsController f19139b;
    public final HashMap f19140c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19138a = i10;
        this.f19139b = contactsController;
        this.f19140c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19138a) {
            case 0:
                this.f19139b.lambda$processLoadedContacts$35(this.f19140c, this.d);
                return;
            default:
                this.f19139b.lambda$processLoadedContacts$34(this.f19140c, this.d);
                return;
        }
    }
}
