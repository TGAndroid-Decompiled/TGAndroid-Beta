package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class m1 implements Runnable {
    public final int f19323a;
    public final ContactsController f19324b;
    public final ArrayList f19325c;
    public final HashMap d;
    public final HashMap f19326e;

    public m1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f19323a = 1;
        this.f19324b = contactsController;
        this.f19325c = arrayList;
        this.d = hashMap;
        this.f19326e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19323a) {
            case 0:
                ArrayList arrayList = this.f19325c;
                HashMap hashMap = this.f19326e;
                this.f19324b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f19326e;
                this.f19324b.lambda$mergePhonebookAndTelegramContacts$40(this.f19325c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f19325c;
                HashMap hashMap4 = this.f19326e;
                this.f19324b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f19325c;
                HashMap hashMap5 = this.f19326e;
                this.f19324b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f19325c;
                HashMap hashMap6 = this.f19326e;
                this.f19324b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public m1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f19323a = i10;
        this.f19324b = contactsController;
        this.d = hashMap;
        this.f19325c = arrayList;
        this.f19326e = hashMap2;
    }
}
