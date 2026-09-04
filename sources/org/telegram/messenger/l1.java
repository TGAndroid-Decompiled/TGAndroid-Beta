package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class l1 implements Runnable {
    public final int f18222a;
    public final ContactsController f18223b;
    public final ArrayList f18224c;
    public final HashMap d;
    public final HashMap f18225e;

    public l1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18222a = 1;
        this.f18223b = contactsController;
        this.f18224c = arrayList;
        this.d = hashMap;
        this.f18225e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18222a) {
            case 0:
                ArrayList arrayList = this.f18224c;
                HashMap hashMap = this.f18225e;
                this.f18223b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18225e;
                this.f18223b.lambda$mergePhonebookAndTelegramContacts$40(this.f18224c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18224c;
                HashMap hashMap4 = this.f18225e;
                this.f18223b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18224c;
                HashMap hashMap5 = this.f18225e;
                this.f18223b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18224c;
                HashMap hashMap6 = this.f18225e;
                this.f18223b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public l1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18222a = i10;
        this.f18223b = contactsController;
        this.d = hashMap;
        this.f18224c = arrayList;
        this.f18225e = hashMap2;
    }
}
