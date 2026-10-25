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
import org.telegram.ui.e90;
import org.telegram.ui.sz;
public final class m1 implements RequestDelegate {
    public final int f20625a = 0;
    public final boolean f20626b;
    public final int f20627c;
    public final Object d;
    public final Object e;
    public final Serializable f20628f;
    public final Object f20629g;
    public final Serializable h;
    public final Serializable f20630i;
    public final Object f20631j;
    public final Object f20632k;
    public final Object f20633l;
    public final Cloneable f20634m;

    public m1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f20631j = sparseArray;
        this.f20632k = zArr;
        this.f20628f = hashMap2;
        this.f20633l = tL_contacts_importContacts;
        this.f20627c = i10;
        this.f20629g = hashMap3;
        this.f20626b = z10;
        this.h = hashMap4;
        this.f20634m = arrayList;
        this.f20630i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20625a;
        Cloneable cloneable = this.f20634m;
        Object obj = this.f20633l;
        Object obj2 = this.f20632k;
        Object obj3 = this.f20631j;
        Serializable serializable = this.f20630i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f20629g;
        Serializable serializable3 = this.f20628f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f20627c, (HashMap) obj4, this.f20626b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                boolean z10 = this.f20626b;
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj6, (sz) obj5, tLObject, z10, (Long) serializable3, (qf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.r2) obj, this.f20627c, (Bundle) cloneable));
                return;
        }
    }

    public m1(LaunchActivity launchActivity, sz szVar, boolean z10, Long l4, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = szVar;
        this.f20626b = z10;
        this.f20628f = l4;
        this.f20629g = cVar;
        this.h = l10;
        this.f20630i = num;
        this.f20631j = num2;
        this.f20632k = bArr;
        this.f20633l = r2Var;
        this.f20627c = i10;
        this.f20634m = bundle;
    }
}
