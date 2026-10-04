package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19115a;
    public final ContactsController f19116b;
    public final HashMap f19117c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19115a = i10;
        this.f19116b = contactsController;
        this.f19117c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19115a) {
            case 0:
                this.f19116b.lambda$processLoadedContacts$35(this.f19117c, this.d);
                return;
            default:
                this.f19116b.lambda$processLoadedContacts$34(this.f19117c, this.d);
                return;
        }
    }
}
