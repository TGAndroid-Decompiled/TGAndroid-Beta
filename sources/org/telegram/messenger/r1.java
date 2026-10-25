package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class r1 implements Runnable {
    public final int f21085a;
    public final ContactsController f21086b;
    public final ArrayList f21087c;
    public final HashMap d;
    public final HashMap e;

    public r1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f21085a = 1;
        this.f21086b = contactsController;
        this.f21087c = arrayList;
        this.d = hashMap;
        this.e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f21085a) {
            case 0:
                ArrayList arrayList = this.f21087c;
                HashMap hashMap = this.e;
                this.f21086b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.e;
                this.f21086b.lambda$mergePhonebookAndTelegramContacts$40(this.f21087c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f21087c;
                HashMap hashMap4 = this.e;
                this.f21086b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f21087c;
                HashMap hashMap5 = this.e;
                this.f21086b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f21087c;
                HashMap hashMap6 = this.e;
                this.f21086b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public r1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f21085a = i10;
        this.f21086b = contactsController;
        this.d = hashMap;
        this.f21087c = arrayList;
        this.e = hashMap2;
    }
}
