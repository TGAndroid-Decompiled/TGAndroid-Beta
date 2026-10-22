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
import org.telegram.ui.z70;
import org.telegram.ui.z80;
public final class l1 implements RequestDelegate {
    public final int f18813a = 0;
    public final boolean f18814b;
    public final int f18815c;
    public final Object d;
    public final Object e;
    public final Serializable f18816f;
    public final Object f18817g;
    public final Serializable h;
    public final Serializable f18818i;
    public final Object f18819j;
    public final Object f18820k;
    public final Object f18821l;
    public final Cloneable f18822m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18819j = sparseArray;
        this.f18820k = zArr;
        this.f18816f = hashMap2;
        this.f18821l = tL_contacts_importContacts;
        this.f18815c = i10;
        this.f18817g = hashMap3;
        this.f18814b = z10;
        this.h = hashMap4;
        this.f18822m = arrayList;
        this.f18818i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18813a;
        Cloneable cloneable = this.f18822m;
        Object obj = this.f18821l;
        Object obj2 = this.f18820k;
        Object obj3 = this.f18819j;
        Serializable serializable = this.f18818i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18817g;
        Serializable serializable3 = this.f18816f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18815c, (HashMap) obj4, this.f18814b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                boolean z10 = this.f18814b;
                AndroidUtilities.runOnUIThread(new z80((LaunchActivity) obj6, (z70) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18815c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, z70 z70Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = z70Var;
        this.f18814b = z10;
        this.f18816f = l4;
        this.f18817g = cVar;
        this.h = l10;
        this.f18818i = num;
        this.f18819j = num2;
        this.f18820k = bArr;
        this.f18821l = n2Var;
        this.f18815c = i10;
        this.f18822m = bundle;
    }
}
