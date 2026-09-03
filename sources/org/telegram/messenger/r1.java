package org.telegram.messenger;

import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f18233a;
    public final ContactsController f18234b;
    public final HashMap f18235c;
    public final HashMap d;

    public r1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, int i10) {
        this.f18233a = i10;
        this.f18234b = contactsController;
        this.f18235c = hashMap;
        this.d = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18233a) {
            case 0:
                this.f18234b.lambda$processLoadedContacts$35(this.f18235c, this.d);
                return;
            default:
                this.f18234b.lambda$processLoadedContacts$34(this.f18235c, this.d);
                return;
        }
    }
}
