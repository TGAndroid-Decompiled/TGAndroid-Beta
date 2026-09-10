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
public final class j1 implements RequestDelegate {
    public final int f15484a = 0;
    public final boolean f15485b;
    public final int f15486c;
    public final Object d;
    public final Object e;
    public final Serializable f15487f;
    public final Object f15488g;
    public final Serializable h;
    public final Serializable f15489i;
    public final Object f15490j;
    public final Object f15491k;
    public final Object f15492l;
    public final Cloneable f15493m;

    public j1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f15490j = sparseArray;
        this.f15491k = zArr;
        this.f15487f = hashMap2;
        this.f15492l = tL_contacts_importContacts;
        this.f15486c = i10;
        this.f15488g = hashMap3;
        this.f15485b = z10;
        this.h = hashMap4;
        this.f15493m = arrayList;
        this.f15489i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f15484a;
        Cloneable cloneable = this.f15493m;
        Object obj = this.f15492l;
        Object obj2 = this.f15491k;
        Object obj3 = this.f15490j;
        Serializable serializable = this.f15489i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f15488g;
        Serializable serializable3 = this.f15487f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f15486c, (HashMap) obj4, this.f15485b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f15485b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (h90) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f15486c, (Bundle) cloneable));
                return;
        }
    }

    public j1(LaunchActivity launchActivity, h90 h90Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = h90Var;
        this.f15485b = z10;
        this.f15487f = l4;
        this.f15488g = eVar;
        this.h = l10;
        this.f15489i = num;
        this.f15490j = num2;
        this.f15491k = bArr;
        this.f15492l = p2Var;
        this.f15486c = i10;
        this.f15493m = bundle;
    }
}
