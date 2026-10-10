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
import org.telegram.ui.m70;
import org.telegram.ui.n90;
public final class i1 implements RequestDelegate {
    public final int f18104a = 0;
    public final boolean f18105b;
    public final int f18106c;
    public final Object d;
    public final Object f18107e;
    public final Serializable f18108f;
    public final Object f18109g;
    public final Serializable h;
    public final Serializable f18110i;
    public final Object f18111j;
    public final Object f18112k;
    public final Object f18113l;
    public final Cloneable f18114m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18107e = hashMap;
        this.f18111j = sparseArray;
        this.f18112k = zArr;
        this.f18108f = hashMap2;
        this.f18113l = tL_contacts_importContacts;
        this.f18106c = i10;
        this.f18109g = hashMap3;
        this.f18105b = z10;
        this.h = hashMap4;
        this.f18114m = arrayList;
        this.f18110i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18104a;
        Cloneable cloneable = this.f18114m;
        Object obj = this.f18113l;
        Object obj2 = this.f18112k;
        Object obj3 = this.f18111j;
        Serializable serializable = this.f18110i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18109g;
        Serializable serializable3 = this.f18108f;
        Object obj5 = this.f18107e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18106c, (HashMap) obj4, this.f18105b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18105b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (m70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18106c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, m70 m70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18107e = m70Var;
        this.f18105b = z10;
        this.f18108f = l4;
        this.f18109g = eVar;
        this.h = l10;
        this.f18110i = num;
        this.f18111j = num2;
        this.f18112k = bArr;
        this.f18113l = n2Var;
        this.f18106c = i10;
        this.f18114m = bundle;
    }
}
