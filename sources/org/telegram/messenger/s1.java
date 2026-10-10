package org.telegram.messenger;

import java.util.HashMap;
public final class s1 implements Runnable {
    public final int f19100a;
    public final ContactsController f19101b;
    public final HashMap f19102c;
    public final HashMap d;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f19100a = i10;
        this.f19101b = contactsController;
        this.f19102c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19100a) {
            case 0:
                this.f19101b.lambda$processLoadedContacts$35(this.f19102c, this.d);
                return;
            default:
                this.f19101b.lambda$processLoadedContacts$34(this.f19102c, this.d);
                return;
        }
    }
}
