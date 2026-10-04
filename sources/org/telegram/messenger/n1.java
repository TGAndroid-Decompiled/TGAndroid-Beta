package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18627a;
    public final ContactsController f18628b;
    public final ArrayList f18629c;
    public final HashMap d;
    public final HashMap f18630e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18627a = 1;
        this.f18628b = contactsController;
        this.f18629c = arrayList;
        this.d = hashMap;
        this.f18630e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18627a) {
            case 0:
                ArrayList arrayList = this.f18629c;
                HashMap hashMap = this.f18630e;
                this.f18628b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18630e;
                this.f18628b.lambda$mergePhonebookAndTelegramContacts$40(this.f18629c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18629c;
                HashMap hashMap4 = this.f18630e;
                this.f18628b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18629c;
                HashMap hashMap5 = this.f18630e;
                this.f18628b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18629c;
                HashMap hashMap6 = this.f18630e;
                this.f18628b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18627a = i10;
        this.f18628b = contactsController;
        this.d = hashMap;
        this.f18629c = arrayList;
        this.f18630e = hashMap2;
    }
}
