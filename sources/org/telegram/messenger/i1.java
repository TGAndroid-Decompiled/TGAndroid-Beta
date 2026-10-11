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
    public final int f18105a = 0;
    public final boolean f18106b;
    public final int f18107c;
    public final Object d;
    public final Object f18108e;
    public final Serializable f18109f;
    public final Object f18110g;
    public final Serializable h;
    public final Serializable f18111i;
    public final Object f18112j;
    public final Object f18113k;
    public final Object f18114l;
    public final Cloneable f18115m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18108e = hashMap;
        this.f18112j = sparseArray;
        this.f18113k = zArr;
        this.f18109f = hashMap2;
        this.f18114l = tL_contacts_importContacts;
        this.f18107c = i10;
        this.f18110g = hashMap3;
        this.f18106b = z10;
        this.h = hashMap4;
        this.f18115m = arrayList;
        this.f18111i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18105a;
        Cloneable cloneable = this.f18115m;
        Object obj = this.f18114l;
        Object obj2 = this.f18113k;
        Object obj3 = this.f18112j;
        Serializable serializable = this.f18111i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18110g;
        Serializable serializable3 = this.f18109f;
        Object obj5 = this.f18108e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18107c, (HashMap) obj4, this.f18106b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18106b;
                AndroidUtilities.runOnUIThread(new m90((LaunchActivity) obj6, (n70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f18107c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, n70 n70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18108e = n70Var;
        this.f18106b = z10;
        this.f18109f = l4;
        this.f18110g = eVar;
        this.h = l10;
        this.f18111i = num;
        this.f18112j = num2;
        this.f18113k = bArr;
        this.f18114l = m2Var;
        this.f18107c = i10;
        this.f18115m = bundle;
    }
}
