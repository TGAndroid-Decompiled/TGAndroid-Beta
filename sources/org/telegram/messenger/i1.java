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
import org.telegram.ui.j90;
import org.telegram.ui.n80;
public final class i1 implements RequestDelegate {
    public final int f16601a = 0;
    public final boolean f16602b;
    public final int f16603c;
    public final Object d;
    public final Object e;
    public final Serializable f16604f;
    public final Object f16605g;
    public final Serializable h;
    public final Serializable f16606i;
    public final Object f16607j;
    public final Object f16608k;
    public final Object f16609l;
    public final Cloneable f16610m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16607j = sparseArray;
        this.f16608k = zArr;
        this.f16604f = hashMap2;
        this.f16609l = tL_contacts_importContacts;
        this.f16603c = i10;
        this.f16605g = hashMap3;
        this.f16602b = z10;
        this.h = hashMap4;
        this.f16610m = arrayList;
        this.f16606i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16601a;
        Cloneable cloneable = this.f16610m;
        Object obj = this.f16609l;
        Object obj2 = this.f16608k;
        Object obj3 = this.f16607j;
        Serializable serializable = this.f16606i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16605g;
        Serializable serializable3 = this.f16604f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16603c, (HashMap) obj4, this.f16602b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16602b;
                AndroidUtilities.runOnUIThread(new j90((LaunchActivity) obj6, (n80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f16603c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, n80 n80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = n80Var;
        this.f16602b = z10;
        this.f16604f = l4;
        this.f16605g = eVar;
        this.h = l10;
        this.f16606i = num;
        this.f16607j = num2;
        this.f16608k = bArr;
        this.f16609l = m2Var;
        this.f16603c = i10;
        this.f16610m = bundle;
    }
}
