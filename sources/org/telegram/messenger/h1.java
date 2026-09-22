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
import org.telegram.ui.o90;
import org.telegram.ui.r80;
public final class h1 implements RequestDelegate {
    public final int f16512a = 0;
    public final boolean f16513b;
    public final int f16514c;
    public final Object d;
    public final Object e;
    public final Serializable f16515f;
    public final Object f16516g;
    public final Serializable h;
    public final Serializable f16517i;
    public final Object f16518j;
    public final Object f16519k;
    public final Object f16520l;
    public final Cloneable f16521m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16518j = sparseArray;
        this.f16519k = zArr;
        this.f16515f = hashMap2;
        this.f16520l = tL_contacts_importContacts;
        this.f16514c = i10;
        this.f16516g = hashMap3;
        this.f16513b = z10;
        this.h = hashMap4;
        this.f16521m = arrayList;
        this.f16517i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16512a;
        Cloneable cloneable = this.f16521m;
        Object obj = this.f16520l;
        Object obj2 = this.f16519k;
        Object obj3 = this.f16518j;
        Serializable serializable = this.f16517i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16516g;
        Serializable serializable3 = this.f16515f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16514c, (HashMap) obj4, this.f16513b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16513b;
                AndroidUtilities.runOnUIThread(new o90((LaunchActivity) obj6, (r80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f16514c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, r80 r80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = r80Var;
        this.f16513b = z10;
        this.f16515f = l4;
        this.f16516g = eVar;
        this.h = l10;
        this.f16517i = num;
        this.f16518j = num2;
        this.f16519k = bArr;
        this.f16520l = n2Var;
        this.f16514c = i10;
        this.f16521m = bundle;
    }
}
