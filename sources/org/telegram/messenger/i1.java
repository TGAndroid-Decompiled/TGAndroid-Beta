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
    public final int f18107a = 0;
    public final boolean f18108b;
    public final int f18109c;
    public final Object d;
    public final Object f18110e;
    public final Serializable f18111f;
    public final Object f18112g;
    public final Serializable h;
    public final Serializable f18113i;
    public final Object f18114j;
    public final Object f18115k;
    public final Object f18116l;
    public final Cloneable f18117m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18110e = hashMap;
        this.f18114j = sparseArray;
        this.f18115k = zArr;
        this.f18111f = hashMap2;
        this.f18116l = tL_contacts_importContacts;
        this.f18109c = i10;
        this.f18112g = hashMap3;
        this.f18108b = z10;
        this.h = hashMap4;
        this.f18117m = arrayList;
        this.f18113i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18107a;
        Cloneable cloneable = this.f18117m;
        Object obj = this.f18116l;
        Object obj2 = this.f18115k;
        Object obj3 = this.f18114j;
        Serializable serializable = this.f18113i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18112g;
        Serializable serializable3 = this.f18111f;
        Object obj5 = this.f18110e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18109c, (HashMap) obj4, this.f18108b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18108b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (h90) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18109c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, h90 h90Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18110e = h90Var;
        this.f18108b = z10;
        this.f18111f = l4;
        this.f18112g = eVar;
        this.h = l10;
        this.f18113i = num;
        this.f18114j = num2;
        this.f18115k = bArr;
        this.f18116l = n2Var;
        this.f18109c = i10;
        this.f18117m = bundle;
    }
}
