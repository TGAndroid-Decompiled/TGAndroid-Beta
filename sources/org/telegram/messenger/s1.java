package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17503a;
    public final ContactsController f17504b;
    public final HashMap f17505c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17503a = i10;
        this.f17504b = contactsController;
        this.f17505c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17503a) {
            case 0:
                this.f17504b.lambda$processLoadedContacts$35(this.f17505c, this.d);
                return;
            default:
                this.f17504b.lambda$processLoadedContacts$34(this.f17505c, this.d);
                return;
        }
    }
}
