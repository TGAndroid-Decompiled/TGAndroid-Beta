package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17499a;
    public final ContactsController f17500b;
    public final HashMap f17501c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17499a = i10;
        this.f17500b = contactsController;
        this.f17501c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17499a) {
            case 0:
                this.f17500b.lambda$processLoadedContacts$35(this.f17501c, this.d);
                return;
            default:
                this.f17500b.lambda$processLoadedContacts$34(this.f17501c, this.d);
                return;
        }
    }
}
