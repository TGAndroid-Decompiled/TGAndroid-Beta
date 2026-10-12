package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class q1 implements Runnable {
    public final int f18629a;
    public final ContactsController f18630b;
    public final ArrayList f18631c;
    public final HashMap d;
    public final HashMap f18632e;

    public q1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18629a = 1;
        this.f18630b = contactsController;
        this.f18631c = arrayList;
        this.d = hashMap;
        this.f18632e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18629a) {
            case 0:
                ArrayList arrayList = this.f18631c;
                HashMap hashMap = this.f18632e;
                this.f18630b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18632e;
                this.f18630b.lambda$mergePhonebookAndTelegramContacts$40(this.f18631c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18631c;
                HashMap hashMap4 = this.f18632e;
                this.f18630b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18631c;
                HashMap hashMap5 = this.f18632e;
                this.f18630b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18631c;
                HashMap hashMap6 = this.f18632e;
                this.f18630b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public q1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18629a = i10;
        this.f18630b = contactsController;
        this.d = hashMap;
        this.f18631c = arrayList;
        this.f18632e = hashMap2;
    }
}
