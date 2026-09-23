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
import org.telegram.ui.ia0;
import org.telegram.ui.k90;
public final class i1 implements RequestDelegate {
    public final int f16344a = 0;
    public final boolean f16345b;
    public final int f16346c;
    public final Object d;
    public final Object e;
    public final Serializable f16347f;
    public final Object f16348g;
    public final Serializable h;
    public final Serializable f16349i;
    public final Object f16350j;
    public final Object f16351k;
    public final Object f16352l;
    public final Cloneable f16353m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16350j = sparseArray;
        this.f16351k = zArr;
        this.f16347f = hashMap2;
        this.f16352l = tL_contacts_importContacts;
        this.f16346c = i10;
        this.f16348g = hashMap3;
        this.f16345b = z10;
        this.h = hashMap4;
        this.f16353m = arrayList;
        this.f16349i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16344a;
        Cloneable cloneable = this.f16353m;
        Object obj = this.f16352l;
        Object obj2 = this.f16351k;
        Object obj3 = this.f16350j;
        Serializable serializable = this.f16349i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16348g;
        Serializable serializable3 = this.f16347f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16346c, (HashMap) obj4, this.f16345b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16345b;
                AndroidUtilities.runOnUIThread(new k90((LaunchActivity) obj6, (ia0) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f16346c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, ia0 ia0Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = ia0Var;
        this.f16345b = z10;
        this.f16347f = l4;
        this.f16348g = eVar;
        this.h = l10;
        this.f16349i = num;
        this.f16350j = num2;
        this.f16351k = bArr;
        this.f16352l = n2Var;
        this.f16346c = i10;
        this.f16353m = bundle;
    }
}
