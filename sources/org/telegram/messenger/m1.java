package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class m1 implements Runnable {
    public final int f16956a;
    public final ContactsController f16957b;
    public final ArrayList f16958c;
    public final HashMap d;
    public final HashMap e;

    public m1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f16956a = 1;
        this.f16957b = contactsController;
        this.f16958c = arrayList;
        this.d = hashMap;
        this.e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f16956a) {
            case 0:
                ArrayList arrayList = this.f16958c;
                HashMap hashMap = this.e;
                this.f16957b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.e;
                this.f16957b.lambda$mergePhonebookAndTelegramContacts$40(this.f16958c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f16958c;
                HashMap hashMap4 = this.e;
                this.f16957b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f16958c;
                HashMap hashMap5 = this.e;
                this.f16957b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f16958c;
                HashMap hashMap6 = this.e;
                this.f16957b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public m1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f16956a = i10;
        this.f16957b = contactsController;
        this.d = hashMap;
        this.f16958c = arrayList;
        this.e = hashMap2;
    }
}
