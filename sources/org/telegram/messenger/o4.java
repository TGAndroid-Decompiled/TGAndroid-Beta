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
import org.telegram.ui.g50;
import org.telegram.ui.g70;
public final class o4 implements RequestDelegate {
    public final int f25713a = 0;
    public final boolean f25714b;
    public final int f25715c;
    public final Object d;
    public final Object f25716e;
    public final Serializable f25717f;
    public final Object f25718g;
    public final Serializable h;
    public final Serializable f25719i;
    public final Object f25720j;
    public final Object f25721k;
    public final Object f25722l;
    public final Cloneable f25723m;

    public o4(g5 g5Var, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i7, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = g5Var;
        this.f25716e = hashMap;
        this.f25720j = sparseArray;
        this.f25721k = zArr;
        this.f25717f = hashMap2;
        this.f25722l = tL_contacts_importContacts;
        this.f25715c = i7;
        this.f25718g = hashMap3;
        this.f25714b = z10;
        this.h = hashMap4;
        this.f25723m = arrayList;
        this.f25719i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        boolean z10;
        switch (this.f25713a) {
            case 0:
                g5 g5Var = (g5) this.d;
                HashMap hashMap = (HashMap) this.f25716e;
                SparseArray sparseArray = (SparseArray) this.f25720j;
                boolean[] zArr = (boolean[]) this.f25721k;
                HashMap hashMap2 = (HashMap) this.f25717f;
                TLRPC.TL_contacts_importContacts tL_contacts_importContacts = (TLRPC.TL_contacts_importContacts) this.f25722l;
                int i10 = this.f25715c;
                HashMap hashMap3 = (HashMap) this.f25718g;
                boolean z11 = this.f25714b;
                HashMap hashMap4 = (HashMap) this.h;
                ArrayList arrayList = (ArrayList) this.f25723m;
                HashMap hashMap5 = (HashMap) this.f25719i;
                boolean z12 = true;
                g5Var.f23689n0++;
                if (tL_error == null) {
                    if (r2.f26206a) {
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
                        if (r2.f26206a) {
                            a8.b("result has retry contacts");
                        }
                    } else {
                        z10 = true;
                        i7 = 0;
                    }
                    for (int i12 = i7; i12 < tL_contacts_importedContacts.popular_invites.size(); i12++) {
                        TLRPC.TL_popularContact tL_popularContact = tL_contacts_importedContacts.popular_invites.get(i12);
                        d5 d5Var = (d5) hashMap2.get(sparseArray.get((int) tL_popularContact.client_id));
                        if (d5Var != null) {
                            d5Var.f23048l = tL_popularContact.importers;
                        }
                    }
                    boolean z13 = z10;
                    g5Var.getMessagesStorage().m1(tL_contacts_importedContacts.users, null, z13, z13);
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = i7;
                    while (i13 < tL_contacts_importedContacts.imported.size()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = tL_contacts_importedContacts.imported.get(i13).user_id;
                        arrayList2.add(tL_contact);
                        i13++;
                        g5Var = g5Var;
                    }
                    g0.h3(new cg(g5Var, tL_contacts_importedContacts.users, 2, arrayList2, 3));
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
                    if (r2.f26206a) {
                        org.telegram.ui.Cells.y0.t(tL_error.text, new StringBuilder("import contacts error "));
                    }
                }
                if (g5Var.f23689n0 == i10) {
                    if (!hashMap.isEmpty()) {
                        boolean z14 = i7;
                        g5Var.getMessagesStorage().Z0(hashMap, z14, z14);
                    }
                    Utilities.d.c(new yg(g5Var, hashMap3, hashMap2, z11, hashMap4, arrayList, hashMap5, zArr));
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                g50 g50Var = (g50) this.f25716e;
                boolean z15 = this.f25714b;
                Long l10 = (Long) this.f25717f;
                vf.b bVar = (vf.b) this.f25718g;
                Long l11 = (Long) this.h;
                Integer num = (Integer) this.f25719i;
                Integer num2 = (Integer) this.f25720j;
                byte[] bArr = (byte[]) this.f25721k;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f25722l;
                int i16 = this.f25715c;
                Bundle bundle = (Bundle) this.f25723m;
                String str = LaunchActivity.C1;
                g0.h3(new g70(launchActivity, g50Var, tLObject, z15, l10, bVar, l11, num, num2, bArr, e2Var, i16, bundle));
                return;
        }
    }

    public o4(LaunchActivity launchActivity, g50 g50Var, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, int i7, Bundle bundle) {
        this.d = launchActivity;
        this.f25716e = g50Var;
        this.f25714b = z10;
        this.f25717f = l10;
        this.f25718g = bVar;
        this.h = l11;
        this.f25719i = num;
        this.f25720j = num2;
        this.f25721k = bArr;
        this.f25722l = e2Var;
        this.f25715c = i7;
        this.f25723m = bundle;
    }
}
