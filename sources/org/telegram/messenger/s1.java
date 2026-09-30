package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f17519a;
    public final ContactsController f17520b;
    public final HashMap f17521c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f17519a = i10;
        this.f17520b = contactsController;
        this.f17521c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f17519a) {
            case 0:
                this.f17520b.lambda$processLoadedContacts$35(this.f17521c, this.d);
                return;
            default:
                this.f17520b.lambda$processLoadedContacts$34(this.f17521c, this.d);
                return;
        }
    }
}
