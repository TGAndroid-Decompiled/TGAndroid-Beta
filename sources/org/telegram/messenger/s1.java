package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19126a;
    public final ContactsController f19127b;
    public final HashMap f19128c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19126a = i10;
        this.f19127b = contactsController;
        this.f19128c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19126a) {
            case 0:
                this.f19127b.lambda$processLoadedContacts$35(this.f19128c, this.d);
                return;
            default:
                this.f19127b.lambda$processLoadedContacts$34(this.f19128c, this.d);
                return;
        }
    }
}
