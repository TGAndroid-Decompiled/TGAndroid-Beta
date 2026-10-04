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
    public final int f18098a = 0;
    public final boolean f18099b;
    public final int f18100c;
    public final Object d;
    public final Object f18101e;
    public final Serializable f18102f;
    public final Object f18103g;
    public final Serializable h;
    public final Serializable f18104i;
    public final Object f18105j;
    public final Object f18106k;
    public final Object f18107l;
    public final Cloneable f18108m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18101e = hashMap;
        this.f18105j = sparseArray;
        this.f18106k = zArr;
        this.f18102f = hashMap2;
        this.f18107l = tL_contacts_importContacts;
        this.f18100c = i10;
        this.f18103g = hashMap3;
        this.f18099b = z10;
        this.h = hashMap4;
        this.f18108m = arrayList;
        this.f18104i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18098a;
        Cloneable cloneable = this.f18108m;
        Object obj = this.f18107l;
        Object obj2 = this.f18106k;
        Object obj3 = this.f18105j;
        Serializable serializable = this.f18104i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18103g;
        Serializable serializable3 = this.f18102f;
        Object obj5 = this.f18101e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18100c, (HashMap) obj4, this.f18099b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18099b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (h90) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18100c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, h90 h90Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18101e = h90Var;
        this.f18099b = z10;
        this.f18102f = l4;
        this.f18103g = eVar;
        this.h = l10;
        this.f18104i = num;
        this.f18105j = num2;
        this.f18106k = bArr;
        this.f18107l = n2Var;
        this.f18100c = i10;
        this.f18108m = bundle;
    }
}
