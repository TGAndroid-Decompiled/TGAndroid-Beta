package org.telegram.messenger;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f70;
import org.telegram.ui.i80;
public final class r4 implements RequestDelegate {
    public final int f17687a = 0;
    public final boolean f17688b;
    public final int f17689c;
    public final Object d;
    public final Object e;
    public final Serializable f17690f;
    public final Object f17691g;
    public final Serializable h;
    public final Serializable f17692i;
    public final Object f17693j;
    public final Object f17694k;
    public final Object f17695l;
    public final Cloneable f17696m;

    public r4(i5 i5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = i5Var;
        this.e = hashMap;
        this.f17693j = sparseArray;
        this.f17694k = zArr;
        this.f17690f = hashMap2;
        this.f17695l = tL_contacts_importContacts;
        this.f17689c = i10;
        this.f17691g = hashMap3;
        this.f17688b = z10;
        this.h = hashMap4;
        this.f17696m = arrayList;
        this.f17692i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        boolean z10;
        switch (this.f17687a) {
            case 0:
                i5 i5Var = (i5) this.d;
                HashMap hashMap = (HashMap) this.e;
                SparseArray sparseArray = (SparseArray) this.f17693j;
                boolean[] zArr = (boolean[]) this.f17694k;
                HashMap hashMap2 = (HashMap) this.f17690f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.f17695l;
                int i11 = this.f17689c;
                HashMap hashMap3 = (HashMap) this.f17691g;
                boolean z11 = this.f17688b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.f17696m;
                HashMap hashMap5 = (HashMap) this.f17692i;
                boolean z12 = true;
                i5Var.m0++;
                if (tL_error == null) {
                    if (v2.f18448a) {
                        f8.b("contacts imported");
                    }
                    TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts = (TLRPC.TL_contacts_importedContacts) tLObject;
                    if (!tL_contacts_importedContacts.retry_contacts.isEmpty()) {
                        int i12 = 0;
                        while (i12 < tL_contacts_importedContacts.retry_contacts.size()) {
                            hashMap.remove(sparseArray.get((int) tL_contacts_importedContacts.retry_contacts.get(i12).longValue()));
                            i12++;
                            z12 = z12;
                        }
                        z10 = z12;
                        i10 = 0;
                        zArr[0] = z10;
                        if (v2.f18448a) {
                            f8.b("result has retry contacts");
                        }
                    } else {
                        z10 = true;
                        i10 = 0;
                    }
                    for (int i13 = i10; i13 < tL_contacts_importedContacts.popular_invites.size(); i13++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i13);
                        f5 f5Var = (f5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (f5Var != null) {
                            f5Var.f15516l = tL_popularContact.importers;
                        }
                    }
                    boolean z13 = z10;
                    i5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z13, z13);
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = i10;
                    while (i14 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i14).user_id;
                        arrayList2.add(tL_contact);
                        i14++;
                        i5Var = i5Var;
                    }
                    i0.g3(new cg(i5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
                } else {
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < tL_contacts_importContacts.contacts.size()) {
                        hashMap.remove(sparseArray.get((int) tL_contacts_importContacts.contacts.get(i16).client_id));
                        i16++;
                        i15 = i15;
                    }
                    i10 = i15;
                    zArr[i10] = true;
                    if (v2.f18448a) {
                        a1.g.z(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (i5Var.m0 == i11) {
                    if (!hashMap.isEmpty()) {
                        boolean z14 = i10;
                        i5Var.getMessagesStorage().Z0(hashMap, z14, z14);
                    }
                    Utilities.d.c(new yg(i5Var, hashMap3, hashMap2, z11, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                f70 f70Var = (f70) this.e;
                boolean z15 = this.f17688b;
                Long l4 = (Long) this.f17690f;
                gf.e eVar = (gf.e) this.f17691g;
                Long l10 = (Long) this.h;
                Integer num = (Integer) this.f17692i;
                Integer num2 = (Integer) this.f17693j;
                byte[] bArr = (byte[]) this.f17694k;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f17695l;
                int i17 = this.f17689c;
                Bundle bundle = (Bundle) this.f17696m;
                Pattern pattern = LaunchActivity.D1;
                i0.g3(new i80(launchActivity, f70Var, tLObject, z15, l4, eVar, l10, num, num2, bArr, k2Var, i17, bundle));
                return;
        }
    }

    public r4(LaunchActivity launchActivity, f70 f70Var, boolean z10, Long l4, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = f70Var;
        this.f17688b = z10;
        this.f17690f = l4;
        this.f17691g = eVar;
        this.h = l10;
        this.f17692i = num;
        this.f17693j = num2;
        this.f17694k = bArr;
        this.f17695l = k2Var;
        this.f17689c = i10;
        this.f17696m = bundle;
    }
}
