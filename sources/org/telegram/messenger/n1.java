package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18581a;
    public final ContactsController f18582b;
    public final ArrayList f18583c;
    public final HashMap d;
    public final HashMap f18584e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18581a = 1;
        this.f18582b = contactsController;
        this.f18583c = arrayList;
        this.d = hashMap;
        this.f18584e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18581a) {
            case 0:
                ArrayList arrayList = this.f18583c;
                HashMap hashMap = this.f18584e;
                this.f18582b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18584e;
                this.f18582b.lambda$mergePhonebookAndTelegramContacts$40(this.f18583c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18583c;
                HashMap hashMap4 = this.f18584e;
                this.f18582b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18583c;
                HashMap hashMap5 = this.f18584e;
                this.f18582b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18583c;
                HashMap hashMap6 = this.f18584e;
                this.f18582b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18581a = i10;
        this.f18582b = contactsController;
        this.d = hashMap;
        this.f18583c = arrayList;
        this.f18584e = hashMap2;
    }
}
