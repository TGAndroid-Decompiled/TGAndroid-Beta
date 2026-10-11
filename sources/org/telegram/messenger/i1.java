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
import org.telegram.ui.m90;
import org.telegram.ui.n70;
public final class i1 implements RequestDelegate {
    public final int f18141a = 0;
    public final boolean f18142b;
    public final int f18143c;
    public final Object d;
    public final Object f18144e;
    public final Serializable f18145f;
    public final Object f18146g;
    public final Serializable h;
    public final Serializable f18147i;
    public final Object f18148j;
    public final Object f18149k;
    public final Object f18150l;
    public final Cloneable f18151m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18144e = hashMap;
        this.f18148j = sparseArray;
        this.f18149k = zArr;
        this.f18145f = hashMap2;
        this.f18150l = tL_contacts_importContacts;
        this.f18143c = i10;
        this.f18146g = hashMap3;
        this.f18142b = z10;
        this.h = hashMap4;
        this.f18151m = arrayList;
        this.f18147i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18141a;
        Cloneable cloneable = this.f18151m;
        Object obj = this.f18150l;
        Object obj2 = this.f18149k;
        Object obj3 = this.f18148j;
        Serializable serializable = this.f18147i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18146g;
        Serializable serializable3 = this.f18145f;
        Object obj5 = this.f18144e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18143c, (HashMap) obj4, this.f18142b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18142b;
                AndroidUtilities.runOnUIThread(new m90((LaunchActivity) obj6, (n70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f18143c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, n70 n70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18144e = n70Var;
        this.f18142b = z10;
        this.f18145f = l4;
        this.f18146g = eVar;
        this.h = l10;
        this.f18147i = num;
        this.f18148j = num2;
        this.f18149k = bArr;
        this.f18150l = m2Var;
        this.f18143c = i10;
        this.f18151m = bundle;
    }
}
