package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f17425a;
    public final ContactsController f17426b;
    public final HashMap f17427c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17425a = i10;
        this.f17426b = contactsController;
        this.f17427c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17425a) {
            case 0:
                this.f17426b.lambda$processLoadedContacts$35(this.f17427c, this.d);
                return;
            default:
                this.f17426b.lambda$processLoadedContacts$34(this.f17427c, this.d);
                return;
        }
    }
}
