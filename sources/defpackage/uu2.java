package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class uu2 implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public final Serializable h;
    public final Serializable i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Cloneable m;

    public uu2(lv2 lv2Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i, HashMap hashMap3, boolean z, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = lv2Var;
        this.e = hashMap;
        this.j = sparseArray;
        this.k = zArr;
        this.f = hashMap2;
        this.l = tL_contacts_importContacts;
        this.c = i;
        this.g = hashMap3;
        this.b = z;
        this.h = hashMap4;
        this.m = arrayList;
        this.i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        boolean z;
        switch (this.a) {
            case 0:
                lv2 lv2Var = (lv2) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.j;
                boolean[] zArr = (boolean[]) this.k;
                HashMap hashMap2 = (HashMap) this.f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.l;
                int i2 = this.c;
                HashMap hashMap3 = (HashMap) this.g;
                boolean z2 = this.b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.m;
                HashMap hashMap5 = (HashMap) this.i;
                boolean z3 = true;
                lv2Var.n0++;
                if (tL_error == null) {
                    if (f11.a) {
                        cc4.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        int i3 = 0;
                        while (i3 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i3).longValue()));
                            i3++;
                            z3 = z3;
                        }
                        z = z3;
                        i = 0;
                        zArr[0] = z;
                        if (f11.a) {
                            cc4.b("result has retry contacts");
                        }
                    } else {
                        z = true;
                        i = 0;
                    }
                    for (int i4 = i; i4 < tL_contacts_importedContacts.popular_invites.size(); i4++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i4);
                        iv2 iv2Var = (iv2) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (iv2Var != null) {
                            iv2Var.l = tL_popularContact.importers;
                        }
                    }
                    boolean z4 = z;
                    lv2Var.getMessagesStorage().n1(tL_contacts_importedContacts.users, null, z4, z4);
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = i;
                    while (i5 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i5).user_id;
                        arrayList2.add(tL_contact);
                        i5++;
                        lv2Var = lv2Var;
                    }
                    hl.c3(new av2(lv2Var, tL_contacts_importedContacts.users, 2, arrayList2, (byte) 0));
                } else {
                    int i6 = 0;
                    int i7 = 0;
                    while (i7 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i7).client_id));
                        i7++;
                        i6 = i6;
                    }
                    i = i6;
                    zArr[i] = true;
                    if (f11.a) {
                        uh9.s(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (lv2Var.n0 == i2) {
                    if (!hashMap.isEmpty()) {
                        boolean z5 = i;
                        lv2Var.getMessagesStorage().a1(hashMap, z5, z5);
                    }
                    Utilities.d.c(new oq6(lv2Var, hashMap3, hashMap2, z2, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                int i8 = this.c;
                Bundle bundle = (Bundle) this.m;
                String str = LaunchActivity.C1;
                hl.c3(new j06((LaunchActivity) this.d, (tg5) this.e, tLObject, this.b, (Long) this.f, (l01) this.g, (Long) this.h, (Integer) this.i, (Integer) this.j, (byte[]) this.k, (e) this.l, i8, bundle));
                return;
        }
    }

    public uu2(LaunchActivity launchActivity, tg5 tg5Var, boolean z, Long l, l01 l01Var, Long l2, Integer num, Integer num2, byte[] bArr, e eVar, int i, Bundle bundle) {
        this.d = launchActivity;
        this.e = tg5Var;
        this.b = z;
        this.f = l;
        this.g = l01Var;
        this.h = l2;
        this.i = num;
        this.j = num2;
        this.k = bArr;
        this.l = eVar;
        this.c = i;
        this.m = bundle;
    }
}
