package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f19825a;
    public final ContactsController f19826b;
    public final HashMap f19827c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19825a = i10;
        this.f19826b = contactsController;
        this.f19827c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19825a) {
            case 0:
                this.f19826b.lambda$processLoadedContacts$35(this.f19827c, this.d);
                return;
            default:
                this.f19826b.lambda$processLoadedContacts$34(this.f19827c, this.d);
                return;
        }
    }
}
