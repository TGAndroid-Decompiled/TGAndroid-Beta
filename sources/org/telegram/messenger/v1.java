package org.telegram.messenger;

import java.util.HashMap;
public final class v1 implements Runnable {
    public final int f19702a;
    public final ContactsController f19703b;
    public final HashMap f19704c;
    public final HashMap d;

    public v1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19702a = i10;
        this.f19703b = contactsController;
        this.f19704c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19702a) {
            case 0:
                this.f19703b.lambda$processLoadedContacts$35(this.f19704c, this.d);
                return;
            default:
                this.f19703b.lambda$processLoadedContacts$34(this.f19704c, this.d);
                return;
        }
    }
}
