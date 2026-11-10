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
import org.telegram.ui.l70;
public final class o4 implements RequestDelegate {
    public final int f24291a = 0;
    public final boolean f24292b;
    public final int f24293c;
    public final Object d;
    public final Object f24294e;
    public final Serializable f24295f;
    public final Object f24296g;
    public final Serializable h;
    public final Serializable f24297i;
    public final Object f24298j;
    public final Object f24299k;
    public final Object f24300l;
    public final Cloneable f24301m;

    public o4(g5 g5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i7, HashMap hashMap3, boolean z9, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = g5Var;
        this.f24294e = hashMap;
        this.f24298j = sparseArray;
        this.f24299k = zArr;
        this.f24295f = hashMap2;
        this.f24300l = tL_contacts_importContacts;
        this.f24293c = i7;
        this.f24296g = hashMap3;
        this.f24292b = z9;
        this.h = hashMap4;
        this.f24301m = arrayList;
        this.f24297i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        boolean z9;
        switch (this.f24291a) {
            case 0:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.f24294e;
                SparseArray sparseArray = (SparseArray) this.f24298j;
                boolean[] zArr = (boolean[]) this.f24299k;
                HashMap hashMap2 = (HashMap) this.f24295f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.f24300l;
                int i10 = this.f24293c;
                HashMap hashMap3 = (HashMap) this.f24296g;
                boolean z10 = this.f24292b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.f24301m;
                HashMap hashMap5 = (HashMap) this.f24297i;
                boolean z11 = true;
                g5Var.m0++;
                if (tL_error == null) {
                    if (r2.f25216a) {
                        a8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        int i11 = 0;
                        while (i11 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i11).longValue()));
                            i11++;
                            z11 = z11;
                        }
                        z9 = z11;
                        i7 = 0;
                        zArr[0] = z9;
                        if (r2.f25216a) {
                            a8.b("result has retry contacts");
                        }
                    } else {
                        z9 = true;
                        i7 = 0;
                    }
                    for (int i12 = i7; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                        d5 d5Var = (d5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (d5Var != null) {
                            d5Var.f21999l = tL_popularContact.importers;
                        }
                    }
                    boolean z12 = z9;
                    g5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z12, z12);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = i7;
                    while (i13 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                        arrayList2.add(tL_contact);
                        i13++;
                        g5Var = g5Var;
                    }
                    g0.h3(new dg(g5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    int i14 = 0;
                    int i15 = 0;
                    while (i15 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i15).client_id));
                        i15++;
                        i14 = i14;
                    }
                    i7 = i14;
                    zArr[i7] = true;
                    if (r2.f25216a) {
                        org.telegram.ui.Cells.f1.u(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (g5Var.m0 == i10) {
                    if (!hashMap.isEmpty()) {
                        boolean z13 = i7;
                        g5Var.getMessagesStorage().Z0(hashMap, z13, z13);
                    }
                    Utilities.d.c(new zg(g5Var, hashMap3, hashMap2, z10, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) this.f24294e;
                boolean z14 = this.f24292b;
                Long l10 = (Long) this.f24295f;
                vf.b bVar = (vf.b) this.f24296g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.f24297i;
                Integer num2 = (Integer) this.f24298j;
                byte[] bArr = (byte[]) this.f24299k;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f24300l;
                int i16 = this.f24293c;
                Bundle bundle = (Bundle) this.f24301m;
                String str = LaunchActivity.B1;
                g0.h3(new l70(launchActivity, f10Var, tLObject, z14, l10, bVar, l11, num, num2, bArr, f2Var, i16, bundle));
                return;
        }
    }

    public o4(LaunchActivity launchActivity, org.telegram.ui.f10 f10Var, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.d = launchActivity;
        this.f24294e = f10Var;
        this.f24292b = z9;
        this.f24295f = l10;
        this.f24296g = bVar;
        this.h = l11;
        this.f24297i = num;
        this.f24298j = num2;
        this.f24299k = bArr;
        this.f24300l = f2Var;
        this.f24293c = i7;
        this.f24301m = bundle;
    }
}
