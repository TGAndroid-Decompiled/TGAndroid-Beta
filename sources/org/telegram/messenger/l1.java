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
import org.telegram.ui.p90;
import org.telegram.ui.t70;
public final class l1 implements RequestDelegate {
    public final int f18120a = 0;
    public final boolean f18121b;
    public final int f18122c;
    public final Object d;
    public final Object f18123e;
    public final Serializable f18124f;
    public final Object f18125g;
    public final Serializable h;
    public final Serializable f18126i;
    public final Object f18127j;
    public final Object f18128k;
    public final Object f18129l;
    public final Cloneable f18130m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18123e = hashMap;
        this.f18127j = sparseArray;
        this.f18128k = zArr;
        this.f18124f = hashMap2;
        this.f18129l = tL_contacts_importContacts;
        this.f18122c = i10;
        this.f18125g = hashMap3;
        this.f18121b = z10;
        this.h = hashMap4;
        this.f18130m = arrayList;
        this.f18126i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18120a;
        Cloneable cloneable = this.f18130m;
        Object obj = this.f18129l;
        Object obj2 = this.f18128k;
        Object obj3 = this.f18127j;
        Serializable serializable = this.f18126i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18125g;
        Serializable serializable3 = this.f18124f;
        Object obj5 = this.f18123e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18122c, (HashMap) obj4, this.f18121b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18121b;
                AndroidUtilities.runOnUIThread(new p90((LaunchActivity) obj6, (t70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f18122c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, t70 t70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18123e = t70Var;
        this.f18121b = z10;
        this.f18124f = l4;
        this.f18125g = eVar;
        this.h = l10;
        this.f18126i = num;
        this.f18127j = num2;
        this.f18128k = bArr;
        this.f18129l = m2Var;
        this.f18122c = i10;
        this.f18130m = bundle;
    }
}
