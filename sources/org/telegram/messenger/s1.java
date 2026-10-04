package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19114a;
    public final ContactsController f19115b;
    public final HashMap f19116c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19114a = i10;
        this.f19115b = contactsController;
        this.f19116c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19114a) {
            case 0:
                this.f19115b.lambda$processLoadedContacts$35(this.f19116c, this.d);
                return;
            default:
                this.f19115b.lambda$processLoadedContacts$34(this.f19116c, this.d);
                return;
        }
    }
}
