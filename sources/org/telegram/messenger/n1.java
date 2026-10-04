package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18628a;
    public final ContactsController f18629b;
    public final ArrayList f18630c;
    public final HashMap d;
    public final HashMap f18631e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18628a = 1;
        this.f18629b = contactsController;
        this.f18630c = arrayList;
        this.d = hashMap;
        this.f18631e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18628a) {
            case 0:
                ArrayList arrayList = this.f18630c;
                HashMap hashMap = this.f18631e;
                this.f18629b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18631e;
                this.f18629b.lambda$mergePhonebookAndTelegramContacts$40(this.f18630c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18630c;
                HashMap hashMap4 = this.f18631e;
                this.f18629b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18630c;
                HashMap hashMap5 = this.f18631e;
                this.f18629b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18630c;
                HashMap hashMap6 = this.f18631e;
                this.f18629b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18628a = i10;
        this.f18629b = contactsController;
        this.d = hashMap;
        this.f18630c = arrayList;
        this.f18631e = hashMap2;
    }
}
