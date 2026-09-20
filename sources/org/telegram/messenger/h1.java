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
import org.telegram.ui.o90;
import org.telegram.ui.r80;
public final class h1 implements RequestDelegate {
    public final int f16497a = 0;
    public final boolean f16498b;
    public final int f16499c;
    public final Object d;
    public final Object e;
    public final Serializable f16500f;
    public final Object f16501g;
    public final Serializable h;
    public final Serializable f16502i;
    public final Object f16503j;
    public final Object f16504k;
    public final Object f16505l;
    public final Cloneable f16506m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16503j = sparseArray;
        this.f16504k = zArr;
        this.f16500f = hashMap2;
        this.f16505l = tL_contacts_importContacts;
        this.f16499c = i10;
        this.f16501g = hashMap3;
        this.f16498b = z10;
        this.h = hashMap4;
        this.f16506m = arrayList;
        this.f16502i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16497a;
        Cloneable cloneable = this.f16506m;
        Object obj = this.f16505l;
        Object obj2 = this.f16504k;
        Object obj3 = this.f16503j;
        Serializable serializable = this.f16502i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16501g;
        Serializable serializable3 = this.f16500f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16499c, (HashMap) obj4, this.f16498b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16498b;
                AndroidUtilities.runOnUIThread(new o90((LaunchActivity) obj6, (r80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f16499c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, r80 r80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = r80Var;
        this.f16498b = z10;
        this.f16500f = l4;
        this.f16501g = eVar;
        this.h = l10;
        this.f16502i = num;
        this.f16503j = num2;
        this.f16504k = bArr;
        this.f16505l = n2Var;
        this.f16499c = i10;
        this.f16506m = bundle;
    }
}
