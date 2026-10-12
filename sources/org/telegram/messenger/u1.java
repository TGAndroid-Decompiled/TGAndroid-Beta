package org.telegram.messenger;

import java.util.HashMap;
public final class u1 implements Runnable {
    public final int f18543a;
    public final ContactsController f18544b;
    public final HashMap f18545c;
    public final HashMap d;

    public u1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18543a = i10;
        this.f18544b = contactsController;
        this.f18545c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                this.f18544b.lambda$processLoadedContacts$35(this.f18545c, this.d);
                return;
            default:
                this.f18544b.lambda$processLoadedContacts$34(this.f18545c, this.d);
                return;
        }
    }
}
