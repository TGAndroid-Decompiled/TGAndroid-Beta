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
import org.telegram.ui.j90;
import org.telegram.ui.m80;
public final class i1 implements RequestDelegate {
    public final int f16590a = 0;
    public final boolean f16591b;
    public final int f16592c;
    public final Object d;
    public final Object e;
    public final Serializable f16593f;
    public final Object f16594g;
    public final Serializable h;
    public final Serializable f16595i;
    public final Object f16596j;
    public final Object f16597k;
    public final Object f16598l;
    public final Cloneable f16599m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16596j = sparseArray;
        this.f16597k = zArr;
        this.f16593f = hashMap2;
        this.f16598l = tL_contacts_importContacts;
        this.f16592c = i10;
        this.f16594g = hashMap3;
        this.f16591b = z10;
        this.h = hashMap4;
        this.f16599m = arrayList;
        this.f16595i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16590a;
        Cloneable cloneable = this.f16599m;
        Object obj = this.f16598l;
        Object obj2 = this.f16597k;
        Object obj3 = this.f16596j;
        Serializable serializable = this.f16595i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16594g;
        Serializable serializable3 = this.f16593f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16592c, (HashMap) obj4, this.f16591b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16591b;
                AndroidUtilities.runOnUIThread(new j90((LaunchActivity) obj6, (m80) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f16592c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, m80 m80Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = m80Var;
        this.f16591b = z10;
        this.f16593f = l4;
        this.f16594g = eVar;
        this.h = l10;
        this.f16595i = num;
        this.f16596j = num2;
        this.f16597k = bArr;
        this.f16598l = m2Var;
        this.f16592c = i10;
        this.f16599m = bundle;
    }
}
