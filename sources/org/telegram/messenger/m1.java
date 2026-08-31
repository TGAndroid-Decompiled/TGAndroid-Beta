package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class m1 implements Runnable {
    public final int f19321a;
    public final ContactsController f19322b;
    public final ArrayList f19323c;
    public final HashMap d;
    public final HashMap f19324e;

    public m1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f19321a = 1;
        this.f19322b = contactsController;
        this.f19323c = arrayList;
        this.d = hashMap;
        this.f19324e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19321a) {
            case 0:
                ArrayList arrayList = this.f19323c;
                HashMap hashMap = this.f19324e;
                this.f19322b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f19324e;
                this.f19322b.lambda$mergePhonebookAndTelegramContacts$40(this.f19323c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f19323c;
                HashMap hashMap4 = this.f19324e;
                this.f19322b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f19323c;
                HashMap hashMap5 = this.f19324e;
                this.f19322b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f19323c;
                HashMap hashMap6 = this.f19324e;
                this.f19322b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public m1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f19321a = i10;
        this.f19322b = contactsController;
        this.d = hashMap;
        this.f19323c = arrayList;
        this.f19324e = hashMap2;
    }
}
