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
    public final int f16605a = 0;
    public final boolean f16606b;
    public final int f16607c;
    public final Object d;
    public final Object e;
    public final Serializable f16608f;
    public final Object f16609g;
    public final Serializable h;
    public final Serializable f16610i;
    public final Object f16611j;
    public final Object f16612k;
    public final Object f16613l;
    public final Cloneable f16614m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16611j = sparseArray;
        this.f16612k = zArr;
        this.f16608f = hashMap2;
        this.f16613l = tL_contacts_importContacts;
        this.f16607c = i10;
        this.f16609g = hashMap3;
        this.f16606b = z10;
        this.h = hashMap4;
        this.f16614m = arrayList;
        this.f16610i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16605a;
        Cloneable cloneable = this.f16614m;
        Object obj = this.f16613l;
        Object obj2 = this.f16612k;
        Object obj3 = this.f16611j;
        Serializable serializable = this.f16610i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16609g;
        Serializable serializable3 = this.f16608f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16607c, (HashMap) obj4, this.f16606b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16606b;
                AndroidUtilities.runOnUIThread(new j90((LaunchActivity) obj6, (n80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f16607c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, n80 n80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = n80Var;
        this.f16606b = z10;
        this.f16608f = l4;
        this.f16609g = eVar;
        this.h = l10;
        this.f16610i = num;
        this.f16611j = num2;
        this.f16612k = bArr;
        this.f16613l = m2Var;
        this.f16607c = i10;
        this.f16614m = bundle;
    }
}
