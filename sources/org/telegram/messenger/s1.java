package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17502a;
    public final ContactsController f17503b;
    public final HashMap f17504c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17502a = i10;
        this.f17503b = contactsController;
        this.f17504c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17502a) {
            case 0:
                this.f17503b.lambda$processLoadedContacts$35(this.f17504c, this.d);
                return;
            default:
                this.f17503b.lambda$processLoadedContacts$34(this.f17504c, this.d);
                return;
        }
    }
}
