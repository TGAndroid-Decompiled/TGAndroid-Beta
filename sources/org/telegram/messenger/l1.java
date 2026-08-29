package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class l1 implements Runnable {
    public final int f20809a;
    public final ContactsController f20810b;
    public final ArrayList f20811c;
    public final HashMap d;
    public final HashMap f20812e;

    public l1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f20809a = 1;
        this.f20810b = contactsController;
        this.f20811c = arrayList;
        this.d = hashMap;
        this.f20812e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f20809a) {
            case 0:
                ArrayList arrayList = this.f20811c;
                HashMap hashMap = this.f20812e;
                this.f20810b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f20812e;
                this.f20810b.lambda$mergePhonebookAndTelegramContacts$40(this.f20811c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f20811c;
                HashMap hashMap4 = this.f20812e;
                this.f20810b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f20811c;
                HashMap hashMap5 = this.f20812e;
                this.f20810b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f20811c;
                HashMap hashMap6 = this.f20812e;
                this.f20810b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public l1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f20809a = i10;
        this.f20810b = contactsController;
        this.d = hashMap;
        this.f20811c = arrayList;
        this.f20812e = hashMap2;
    }
}
