package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class m1 implements Runnable {
    public final int f20930a;
    public final ContactsController f20931b;
    public final ArrayList f20932c;
    public final HashMap d;
    public final HashMap f20933e;

    public m1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f20930a = 1;
        this.f20931b = contactsController;
        this.f20932c = arrayList;
        this.d = hashMap;
        this.f20933e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f20930a) {
            case 0:
                ArrayList arrayList = this.f20932c;
                HashMap hashMap = this.f20933e;
                this.f20931b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f20933e;
                this.f20931b.lambda$mergePhonebookAndTelegramContacts$40(this.f20932c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f20932c;
                HashMap hashMap4 = this.f20933e;
                this.f20931b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f20932c;
                HashMap hashMap5 = this.f20933e;
                this.f20931b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f20932c;
                HashMap hashMap6 = this.f20933e;
                this.f20931b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public m1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i9) {
        this.f20930a = i9;
        this.f20931b = contactsController;
        this.d = hashMap;
        this.f20932c = arrayList;
        this.f20933e = hashMap2;
    }
}
