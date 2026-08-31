package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f19823a;
    public final ContactsController f19824b;
    public final HashMap f19825c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19823a = i10;
        this.f19824b = contactsController;
        this.f19825c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19823a) {
            case 0:
                this.f19824b.lambda$processLoadedContacts$35(this.f19825c, this.d);
                return;
            default:
                this.f19824b.lambda$processLoadedContacts$34(this.f19825c, this.d);
                return;
        }
    }
}
