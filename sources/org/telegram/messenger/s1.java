package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17493a;
    public final ContactsController f17494b;
    public final HashMap f17495c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17493a = i10;
        this.f17494b = contactsController;
        this.f17495c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17493a) {
            case 0:
                this.f17494b.lambda$processLoadedContacts$35(this.f17495c, this.d);
                return;
            default:
                this.f17494b.lambda$processLoadedContacts$34(this.f17495c, this.d);
                return;
        }
    }
}
