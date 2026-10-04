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
import org.telegram.ui.h90;
import org.telegram.ui.n90;
public final class i1 implements RequestDelegate {
    public final int f18106a = 0;
    public final boolean f18107b;
    public final int f18108c;
    public final Object d;
    public final Object f18109e;
    public final Serializable f18110f;
    public final Object f18111g;
    public final Serializable h;
    public final Serializable f18112i;
    public final Object f18113j;
    public final Object f18114k;
    public final Object f18115l;
    public final Cloneable f18116m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18109e = hashMap;
        this.f18113j = sparseArray;
        this.f18114k = zArr;
        this.f18110f = hashMap2;
        this.f18115l = tL_contacts_importContacts;
        this.f18108c = i10;
        this.f18111g = hashMap3;
        this.f18107b = z10;
        this.h = hashMap4;
        this.f18116m = arrayList;
        this.f18112i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18106a;
        Cloneable cloneable = this.f18116m;
        Object obj = this.f18115l;
        Object obj2 = this.f18114k;
        Object obj3 = this.f18113j;
        Serializable serializable = this.f18112i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18111g;
        Serializable serializable3 = this.f18110f;
        Object obj5 = this.f18109e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18108c, (HashMap) obj4, this.f18107b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18107b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (h90) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18108c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, h90 h90Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18109e = h90Var;
        this.f18107b = z10;
        this.f18110f = l4;
        this.f18111g = eVar;
        this.h = l10;
        this.f18112i = num;
        this.f18113j = num2;
        this.f18114k = bArr;
        this.f18115l = n2Var;
        this.f18108c = i10;
        this.f18116m = bundle;
    }
}
