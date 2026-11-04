package org.telegram.messenger;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c70;
public final class o4 implements RequestDelegate {
    public final int f24489a = 0;
    public final boolean f24490b;
    public final int f24491c;
    public final Object d;
    public final Object f24492e;
    public final Serializable f24493f;
    public final Object f24494g;
    public final Serializable h;
    public final Serializable f24495i;
    public final Object f24496j;
    public final Object f24497k;
    public final Object f24498l;
    public final Cloneable f24499m;

    public o4(g5 g5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i3, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = g5Var;
        this.f24492e = hashMap;
        this.f24496j = sparseArray;
        this.f24497k = zArr;
        this.f24493f = hashMap2;
        this.f24498l = tL_contacts_importContacts;
        this.f24491c = i3;
        this.f24494g = hashMap3;
        this.f24490b = z10;
        this.h = hashMap4;
        this.f24499m = arrayList;
        this.f24495i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3;
        boolean z10;
        switch (this.f24489a) {
            case 0:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.f24492e;
                SparseArray sparseArray = (SparseArray) this.f24496j;
                boolean[] zArr = (boolean[]) this.f24497k;
                HashMap hashMap2 = (HashMap) this.f24493f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.f24498l;
                int i10 = this.f24491c;
                HashMap hashMap3 = (HashMap) this.f24494g;
                boolean z11 = this.f24490b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.f24499m;
                HashMap hashMap5 = (HashMap) this.f24495i;
                boolean z12 = true;
                g5Var.f22661n0++;
                if (tL_error == null) {
                    if (r2.f25040a) {
                        a8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        int i11 = 0;
                        while (i11 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                            i11++;
                            z12 = z12;
                        }
                        z10 = z12;
                        i3 = 0;
                        zArr[0] = z10;
                        if (r2.f25040a) {
                            a8.b("result has retry contacts");
                        }
                    } else {
                        z10 = true;
                        i3 = 0;
                    }
                    for (int i12 = i3; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                        d5 d5Var = (d5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (d5Var != null) {
                            d5Var.f22156l = tL_popularContact.importers;
                        }
                    }
                    boolean z13 = z10;
                    g5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z13, z13);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = i3;
                    while (i13 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                        arrayList2.add(tL_contact);
                        i13++;
                        g5Var = g5Var;
                    }
                    g0.h3(new vf(g5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i15).client_id));
                        i15++;
                        i14 = i14;
                    }
                    i3 = i14;
                    zArr[i3] = true;
                    if (r2.f25040a) {
                        k2.p1.w(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (g5Var.f22661n0 == i10) {
                    if (!hashMap.isEmpty()) {
                        boolean z14 = i3;
                        g5Var.getMessagesStorage().Z0(hashMap, z14, z14);
                    }
                    Utilities.d.c(new rg(g5Var, hashMap3, hashMap2, z11, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) this.f24492e;
                boolean z15 = this.f24490b;
                Long l10 = (Long) this.f24493f;
                sf.b bVar = (sf.b) this.f24494g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.f24495i;
                Integer num2 = (Integer) this.f24496j;
                byte[] bArr = (byte[]) this.f24497k;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24498l;
                int i16 = this.f24491c;
                Bundle bundle = (Bundle) this.f24499m;
                String str = LaunchActivity.E1;
                g0.h3(new c70(launchActivity, lyVar, tLObject, z15, l10, bVar, l11, num, num2, bArr, d2Var, i16, bundle));
                return;
        }
    }

    public o4(LaunchActivity launchActivity, org.telegram.ui.ly lyVar, boolean z10, Long l10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3, Bundle bundle) {
        this.d = launchActivity;
        this.f24492e = lyVar;
        this.f24490b = z10;
        this.f24493f = l10;
        this.f24494g = bVar;
        this.h = l11;
        this.f24495i = num;
        this.f24496j = num2;
        this.f24497k = bArr;
        this.f24498l = d2Var;
        this.f24491c = i3;
        this.f24499m = bundle;
    }
}
