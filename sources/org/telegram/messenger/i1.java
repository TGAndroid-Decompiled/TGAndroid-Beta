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
    public final int f16618a = 0;
    public final boolean f16619b;
    public final int f16620c;
    public final Object d;
    public final Object e;
    public final Serializable f16621f;
    public final Object f16622g;
    public final Serializable h;
    public final Serializable f16623i;
    public final Object f16624j;
    public final Object f16625k;
    public final Object f16626l;
    public final Cloneable f16627m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16624j = sparseArray;
        this.f16625k = zArr;
        this.f16621f = hashMap2;
        this.f16626l = tL_contacts_importContacts;
        this.f16620c = i10;
        this.f16622g = hashMap3;
        this.f16619b = z10;
        this.h = hashMap4;
        this.f16627m = arrayList;
        this.f16623i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16618a;
        Cloneable cloneable = this.f16627m;
        Object obj = this.f16626l;
        Object obj2 = this.f16625k;
        Object obj3 = this.f16624j;
        Serializable serializable = this.f16623i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16622g;
        Serializable serializable3 = this.f16621f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16620c, (HashMap) obj4, this.f16619b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16619b;
                AndroidUtilities.runOnUIThread(new j90((LaunchActivity) obj6, (n80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f16620c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, n80 n80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = n80Var;
        this.f16619b = z10;
        this.f16621f = l4;
        this.f16622g = eVar;
        this.h = l10;
        this.f16623i = num;
        this.f16624j = num2;
        this.f16625k = bArr;
        this.f16626l = m2Var;
        this.f16620c = i10;
        this.f16627m = bundle;
    }
}
