package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f16448a;
    public final ContactsController f16449b;
    public final HashMap f16450c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f16448a = i10;
        this.f16449b = contactsController;
        this.f16450c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16448a) {
            case 0:
                this.f16449b.lambda$processLoadedContacts$35(this.f16450c, this.d);
                return;
            default:
                this.f16449b.lambda$processLoadedContacts$34(this.f16450c, this.d);
                return;
        }
    }
}
