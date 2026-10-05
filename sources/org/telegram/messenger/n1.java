package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18623a;
    public final ContactsController f18624b;
    public final ArrayList f18625c;
    public final HashMap d;
    public final HashMap f18626e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18623a = 1;
        this.f18624b = contactsController;
        this.f18625c = arrayList;
        this.d = hashMap;
        this.f18626e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18623a) {
            case 0:
                ArrayList arrayList = this.f18625c;
                HashMap hashMap = this.f18626e;
                this.f18624b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18626e;
                this.f18624b.lambda$mergePhonebookAndTelegramContacts$40(this.f18625c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18625c;
                HashMap hashMap4 = this.f18626e;
                this.f18624b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18625c;
                HashMap hashMap5 = this.f18626e;
                this.f18624b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18625c;
                HashMap hashMap6 = this.f18626e;
                this.f18624b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18623a = i10;
        this.f18624b = contactsController;
        this.d = hashMap;
        this.f18625c = arrayList;
        this.f18626e = hashMap2;
    }
}
