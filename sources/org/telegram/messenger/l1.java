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
    public final int f18881a = 0;
    public final boolean f18882b;
    public final int f18883c;
    public final Object d;
    public final Object e;
    public final Serializable f18884f;
    public final Object f18885g;
    public final Serializable h;
    public final Serializable f18886i;
    public final Object f18887j;
    public final Object f18888k;
    public final Object f18889l;
    public final Cloneable f18890m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18887j = sparseArray;
        this.f18888k = zArr;
        this.f18884f = hashMap2;
        this.f18889l = tL_contacts_importContacts;
        this.f18883c = i10;
        this.f18885g = hashMap3;
        this.f18882b = z10;
        this.h = hashMap4;
        this.f18890m = arrayList;
        this.f18886i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18881a;
        Cloneable cloneable = this.f18890m;
        Object obj = this.f18889l;
        Object obj2 = this.f18888k;
        Object obj3 = this.f18887j;
        Serializable serializable = this.f18886i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18885g;
        Serializable serializable3 = this.f18884f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18883c, (HashMap) obj4, this.f18882b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                boolean z10 = this.f18882b;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj6, (f80) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f18883c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, f80 f80Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = f80Var;
        this.f18882b = z10;
        this.f18884f = l4;
        this.f18885g = cVar;
        this.h = l10;
        this.f18886i = num;
        this.f18887j = num2;
        this.f18888k = bArr;
        this.f18889l = o2Var;
        this.f18883c = i10;
        this.f18890m = bundle;
    }
}
