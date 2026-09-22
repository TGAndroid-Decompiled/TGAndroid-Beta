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
import org.telegram.ui.ma0;
import org.telegram.ui.n90;
public final class h1 implements RequestDelegate {
    public final int f16266a = 0;
    public final boolean f16267b;
    public final int f16268c;
    public final Object d;
    public final Object e;
    public final Serializable f16269f;
    public final Object f16270g;
    public final Serializable h;
    public final Serializable f16271i;
    public final Object f16272j;
    public final Object f16273k;
    public final Object f16274l;
    public final Cloneable f16275m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16272j = sparseArray;
        this.f16273k = zArr;
        this.f16269f = hashMap2;
        this.f16274l = tL_contacts_importContacts;
        this.f16268c = i10;
        this.f16270g = hashMap3;
        this.f16267b = z10;
        this.h = hashMap4;
        this.f16275m = arrayList;
        this.f16271i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16266a;
        Cloneable cloneable = this.f16275m;
        Object obj = this.f16274l;
        Object obj2 = this.f16273k;
        Object obj3 = this.f16272j;
        Serializable serializable = this.f16271i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16270g;
        Serializable serializable3 = this.f16269f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16268c, (HashMap) obj4, this.f16267b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16267b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (ma0) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f16268c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, ma0 ma0Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = ma0Var;
        this.f16267b = z10;
        this.f16269f = l4;
        this.f16270g = eVar;
        this.h = l10;
        this.f16271i = num;
        this.f16272j = num2;
        this.f16273k = bArr;
        this.f16274l = n2Var;
        this.f16268c = i10;
        this.f16275m = bundle;
    }
}
