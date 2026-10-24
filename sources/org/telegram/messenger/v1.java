package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19787a;
    public final ContactsController f19788b;
    public final HashMap f19789c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19787a = i10;
        this.f19788b = contactsController;
        this.f19789c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19787a) {
            case 0:
                this.f19788b.lambda$processLoadedContacts$35(this.f19789c, this.d);
                return;
            default:
                this.f19788b.lambda$processLoadedContacts$34(this.f19789c, this.d);
                return;
        }
    }
}
