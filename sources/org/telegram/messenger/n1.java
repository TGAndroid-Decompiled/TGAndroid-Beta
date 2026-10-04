package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class n1 implements Runnable {
    public final int f18618a;
    public final ContactsController f18619b;
    public final ArrayList f18620c;
    public final HashMap d;
    public final HashMap f18621e;

    public n1(ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ContactsController contactsController) {
        this.f18618a = 1;
        this.f18619b = contactsController;
        this.f18620c = arrayList;
        this.d = hashMap;
        this.f18621e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f18618a) {
            case 0:
                ArrayList arrayList = this.f18620c;
                HashMap hashMap = this.f18621e;
                this.f18619b.lambda$performSyncPhoneBook$15(this.d, arrayList, hashMap);
                return;
            case 1:
                HashMap hashMap2 = this.d;
                HashMap hashMap3 = this.f18621e;
                this.f18619b.lambda$mergePhonebookAndTelegramContacts$40(this.f18620c, hashMap2, hashMap3);
                return;
            case 2:
                ArrayList arrayList2 = this.f18620c;
                HashMap hashMap4 = this.f18621e;
                this.f18619b.lambda$performSyncPhoneBook$21(this.d, arrayList2, hashMap4);
                return;
            case 3:
                ArrayList arrayList3 = this.f18620c;
                HashMap hashMap5 = this.f18621e;
                this.f18619b.lambda$performSyncPhoneBook$17(this.d, arrayList3, hashMap5);
                return;
            default:
                ArrayList arrayList4 = this.f18620c;
                HashMap hashMap6 = this.f18621e;
                this.f18619b.lambda$performSyncPhoneBook$23(this.d, arrayList4, hashMap6);
                return;
        }
    }

    public n1(ContactsController contactsController, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f18618a = i10;
        this.f18619b = contactsController;
        this.d = hashMap;
        this.f18620c = arrayList;
        this.f18621e = hashMap2;
    }
}
