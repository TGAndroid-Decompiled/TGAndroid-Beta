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
    public final int f18841a = 0;
    public final boolean f18842b;
    public final int f18843c;
    public final Object d;
    public final Object e;
    public final Serializable f18844f;
    public final Object f18845g;
    public final Serializable h;
    public final Serializable f18846i;
    public final Object f18847j;
    public final Object f18848k;
    public final Object f18849l;
    public final Cloneable f18850m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18847j = sparseArray;
        this.f18848k = zArr;
        this.f18844f = hashMap2;
        this.f18849l = tL_contacts_importContacts;
        this.f18843c = i10;
        this.f18845g = hashMap3;
        this.f18842b = z10;
        this.h = hashMap4;
        this.f18850m = arrayList;
        this.f18846i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18841a;
        Cloneable cloneable = this.f18850m;
        Object obj = this.f18849l;
        Object obj2 = this.f18848k;
        Object obj3 = this.f18847j;
        Serializable serializable = this.f18846i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18845g;
        Serializable serializable3 = this.f18844f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18843c, (HashMap) obj4, this.f18842b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                boolean z10 = this.f18842b;
                AndroidUtilities.runOnUIThread(new z80((LaunchActivity) obj6, (z70) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18843c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, z70 z70Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = z70Var;
        this.f18842b = z10;
        this.f18844f = l4;
        this.f18845g = cVar;
        this.h = l10;
        this.f18846i = num;
        this.f18847j = num2;
        this.f18848k = bArr;
        this.f18849l = n2Var;
        this.f18843c = i10;
        this.f18850m = bundle;
    }
}
