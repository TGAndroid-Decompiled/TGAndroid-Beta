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
import org.telegram.ui.f80;
import org.telegram.ui.f90;
public final class l1 implements RequestDelegate {
    public final int f18909a = 0;
    public final boolean f18910b;
    public final int f18911c;
    public final Object d;
    public final Object e;
    public final Serializable f18912f;
    public final Object f18913g;
    public final Serializable h;
    public final Serializable f18914i;
    public final Object f18915j;
    public final Object f18916k;
    public final Object f18917l;
    public final Cloneable f18918m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18915j = sparseArray;
        this.f18916k = zArr;
        this.f18912f = hashMap2;
        this.f18917l = tL_contacts_importContacts;
        this.f18911c = i10;
        this.f18913g = hashMap3;
        this.f18910b = z10;
        this.h = hashMap4;
        this.f18918m = arrayList;
        this.f18914i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18909a;
        Cloneable cloneable = this.f18918m;
        Object obj = this.f18917l;
        Object obj2 = this.f18916k;
        Object obj3 = this.f18915j;
        Serializable serializable = this.f18914i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18913g;
        Serializable serializable3 = this.f18912f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18911c, (HashMap) obj4, this.f18910b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                boolean z10 = this.f18910b;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj6, (f80) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f18911c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, f80 f80Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = f80Var;
        this.f18910b = z10;
        this.f18912f = l4;
        this.f18913g = cVar;
        this.h = l10;
        this.f18914i = num;
        this.f18915j = num2;
        this.f18916k = bArr;
        this.f18917l = o2Var;
        this.f18911c = i10;
        this.f18918m = bundle;
    }
}
