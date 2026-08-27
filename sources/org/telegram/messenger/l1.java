package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;

public final class l1 implements Runnable {

    public final int f20820a;

    public final ContactsController f20821b;

    public final ArrayList f20822c;
    public final HashMap d;

    public final HashMap f20823e;

    public l1(ArrayList arrayList, HashMap map, HashMap map2, ContactsController contactsController) {
        this.f20820a = 1;
        this.f20821b = contactsController;
        this.f20822c = arrayList;
        this.d = map;
        this.f20823e = map2;
    }

    @Override
    public final void run() {
        switch (this.f20820a) {
            case 0:
                ArrayList arrayList = this.f20822c;
                HashMap map = this.f20823e;
                this.f20821b.lambda$performSyncPhoneBook$15(this.d, arrayList, map);
                break;
            case 1:
                HashMap map2 = this.d;
                HashMap map3 = this.f20823e;
                this.f20821b.lambda$mergePhonebookAndTelegramContacts$40(this.f20822c, map2, map3);
                break;
            case 2:
                ArrayList arrayList2 = this.f20822c;
                HashMap map4 = this.f20823e;
                this.f20821b.lambda$performSyncPhoneBook$21(this.d, arrayList2, map4);
                break;
            case 3:
                ArrayList arrayList3 = this.f20822c;
                HashMap map5 = this.f20823e;
                this.f20821b.lambda$performSyncPhoneBook$17(this.d, arrayList3, map5);
                break;
            default:
                ArrayList arrayList4 = this.f20822c;
                HashMap map6 = this.f20823e;
                this.f20821b.lambda$performSyncPhoneBook$23(this.d, arrayList4, map6);
                break;
        }
    }

    public l1(ContactsController contactsController, HashMap map, ArrayList arrayList, HashMap map2, int i10) {
        this.f20820a = i10;
        this.f20821b = contactsController;
        this.d = map;
        this.f20822c = arrayList;
        this.f20823e = map2;
    }
}
