package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f17410a;
    public final ContactsController f17411b;
    public final HashMap f17412c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17410a = i10;
        this.f17411b = contactsController;
        this.f17412c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                this.f17411b.lambda$processLoadedContacts$35(this.f17412c, this.d);
                return;
            default:
                this.f17411b.lambda$processLoadedContacts$34(this.f17412c, this.d);
                return;
        }
    }
}
