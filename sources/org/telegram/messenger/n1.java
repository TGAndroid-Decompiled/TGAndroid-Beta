package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18577a;
    public final ContactsController f18578b;
    public final ArrayList f18579c;
    public final HashMap d;
    public final HashMap f18580e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18577a = 1;
        this.f18578b = contactsController;
        this.f18579c = arrayList;
        this.d = hashMap;
        this.f18580e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18577a) {
            case 0:
                ArrayList arrayList = this.f18579c;
                HashMap hashMap = this.f18580e;
                this.f18578b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18580e;
                this.f18578b.lambda$mergePhonebookAndTelegramContacts$40(this.f18579c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18579c;
                HashMap hashMap4 = this.f18580e;
                this.f18578b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18579c;
                HashMap hashMap5 = this.f18580e;
                this.f18578b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18579c;
                HashMap hashMap6 = this.f18580e;
                this.f18578b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18577a = i10;
        this.f18578b = contactsController;
        this.d = hashMap;
        this.f18579c = arrayList;
        this.f18580e = hashMap2;
    }
}
