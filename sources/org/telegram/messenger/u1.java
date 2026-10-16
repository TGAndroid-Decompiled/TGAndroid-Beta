package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f18244a;
    public final ContactsController f18245b;
    public final HashMap f18246c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18244a = i10;
        this.f18245b = contactsController;
        this.f18246c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18244a) {
            case 0:
                this.f18245b.lambda$processLoadedContacts$35(this.f18246c, this.d);
                return;
            default:
                this.f18245b.lambda$processLoadedContacts$34(this.f18246c, this.d);
                return;
        }
    }
}
