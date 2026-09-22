package org.telegram.messenger;

import java.util.ArrayList;
public final class p1 implements Runnable {
    public final int f17233a;
    public final ContactsController f17234b;
    public final ArrayList f17235c;

    public p1(ContactsController contactsController, ArrayList arrayList, int i10) {
        this.f17233a = i10;
        this.f17234b = contactsController;
        this.f17235c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17233a) {
            case 0:
                this.f17234b.lambda$deleteContact$55(this.f17235c);
                return;
            case 1:
                this.f17234b.lambda$performWriteContactsToPhoneBook$45(this.f17235c);
                return;
            default:
                this.f17234b.lambda$deleteContactsUndoable$54(this.f17235c);
                return;
        }
    }
}
