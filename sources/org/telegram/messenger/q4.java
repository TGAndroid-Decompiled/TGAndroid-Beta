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
import org.telegram.ui.i50;
import org.telegram.ui.i70;
public final class q4 implements RequestDelegate {
    public final int f26453a = 0;
    public final boolean f26454b;
    public final int f26455c;
    public final Object d;
    public final Object f26456e;
    public final Serializable f26457f;
    public final Object f26458g;
    public final Serializable h;
    public final Serializable f26459i;
    public final Object f26460j;
    public final Object f26461k;
    public final Object f26462l;
    public final Cloneable f26463m;

    public q4(i5 i5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i7, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = i5Var;
        this.f26456e = hashMap;
        this.f26460j = sparseArray;
        this.f26461k = zArr;
        this.f26457f = hashMap2;
        this.f26462l = tL_contacts_importContacts;
        this.f26455c = i7;
        this.f26458g = hashMap3;
        this.f26454b = z10;
        this.h = hashMap4;
        this.f26463m = arrayList;
        this.f26459i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        boolean z10;
        switch (this.f26453a) {
            case 0:
                i5 i5Var = (i5) this.d;
                HashMap hashMap = (HashMap) this.f26456e;
                SparseArray sparseArray = (SparseArray) this.f26460j;
                boolean[] zArr = (boolean[]) this.f26461k;
                HashMap hashMap2 = (HashMap) this.f26457f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.f26462l;
                int i10 = this.f26455c;
                HashMap hashMap3 = (HashMap) this.f26458g;
                boolean z11 = this.f26454b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.f26463m;
                HashMap hashMap5 = (HashMap) this.f26459i;
                boolean z12 = true;
                i5Var.f24701n0++;
                if (tL_error == null) {
                    if (s2.f26829a) {
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
                        i7 = 0;
                        zArr[0] = z10;
                        if (s2.f26829a) {
                            a8.b("result has retry contacts");
                        }
                    } else {
                        z10 = true;
                        i7 = 0;
                    }
                    for (int i12 = i7; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                        f5 f5Var = (f5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (f5Var != null) {
                            f5Var.f23957l = tL_popularContact.importers;
                        }
                    }
                    boolean z13 = z10;
                    i5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z13, z13);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = i7;
                    while (i13 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                        arrayList2.add(tL_contact);
                        i13++;
                        i5Var = i5Var;
                    }
                    g0.g3(new dg(i5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
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
                    if (s2.f26829a) {
                        p5.c.s(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (i5Var.f24701n0 == i10) {
                    if (!hashMap.isEmpty()) {
                        boolean z14 = i7;
                        i5Var.getMessagesStorage().Z0(hashMap, z14, z14);
                    }
                    Utilities.d.c(new ah(i5Var, hashMap3, hashMap2, z11, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                i50 i50Var = (i50) this.f26456e;
                boolean z15 = this.f26454b;
                Long l10 = (Long) this.f26457f;
                vf.b bVar = (vf.b) this.f26458g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.f26459i;
                Integer num2 = (Integer) this.f26460j;
                byte[] bArr = (byte[]) this.f26461k;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26462l;
                int i16 = this.f26455c;
                Bundle bundle = (Bundle) this.f26463m;
                String str = LaunchActivity.C1;
                g0.g3(new i70(launchActivity, i50Var, tLObject, z15, l10, bVar, l11, num, num2, bArr, g2Var, i16, bundle));
                return;
        }
    }

    public q4(LaunchActivity launchActivity, i50 i50Var, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7, Bundle bundle) {
        this.d = launchActivity;
        this.f26456e = i50Var;
        this.f26454b = z10;
        this.f26457f = l10;
        this.f26458g = bVar;
        this.h = l11;
        this.f26459i = num;
        this.f26460j = num2;
        this.f26461k = bArr;
        this.f26462l = g2Var;
        this.f26455c = i7;
        this.f26463m = bundle;
    }
}
