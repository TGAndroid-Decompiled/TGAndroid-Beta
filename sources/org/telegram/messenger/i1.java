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
    public final int f18103a = 0;
    public final boolean f18104b;
    public final int f18105c;
    public final Object d;
    public final Object f18106e;
    public final Serializable f18107f;
    public final Object f18108g;
    public final Serializable h;
    public final Serializable f18109i;
    public final Object f18110j;
    public final Object f18111k;
    public final Object f18112l;
    public final Cloneable f18113m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18106e = hashMap;
        this.f18110j = sparseArray;
        this.f18111k = zArr;
        this.f18107f = hashMap2;
        this.f18112l = tL_contacts_importContacts;
        this.f18105c = i10;
        this.f18108g = hashMap3;
        this.f18104b = z10;
        this.h = hashMap4;
        this.f18113m = arrayList;
        this.f18109i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18103a;
        Cloneable cloneable = this.f18113m;
        Object obj = this.f18112l;
        Object obj2 = this.f18111k;
        Object obj3 = this.f18110j;
        Serializable serializable = this.f18109i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18108g;
        Serializable serializable3 = this.f18107f;
        Object obj5 = this.f18106e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18105c, (HashMap) obj4, this.f18104b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18104b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (h90) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18105c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, h90 h90Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18106e = h90Var;
        this.f18104b = z10;
        this.f18107f = l4;
        this.f18108g = eVar;
        this.h = l10;
        this.f18109i = num;
        this.f18110j = num2;
        this.f18111k = bArr;
        this.f18112l = n2Var;
        this.f18105c = i10;
        this.f18113m = bundle;
    }
}
