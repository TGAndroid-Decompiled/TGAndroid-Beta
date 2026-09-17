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
import org.telegram.ui.oa0;
import org.telegram.ui.p90;
public final class g1 implements RequestDelegate {
    public final int f16177a = 0;
    public final boolean f16178b;
    public final int f16179c;
    public final Object d;
    public final Object e;
    public final Serializable f16180f;
    public final Object f16181g;
    public final Serializable h;
    public final Serializable f16182i;
    public final Object f16183j;
    public final Object f16184k;
    public final Object f16185l;
    public final Cloneable f16186m;

    public g1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f16183j = sparseArray;
        this.f16184k = zArr;
        this.f16180f = hashMap2;
        this.f16185l = tL_contacts_importContacts;
        this.f16179c = i10;
        this.f16181g = hashMap3;
        this.f16178b = z10;
        this.h = hashMap4;
        this.f16186m = arrayList;
        this.f16182i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16177a;
        Cloneable cloneable = this.f16186m;
        Object obj = this.f16185l;
        Object obj2 = this.f16184k;
        Object obj3 = this.f16183j;
        Serializable serializable = this.f16182i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f16181g;
        Serializable serializable3 = this.f16180f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f16179c, (HashMap) obj4, this.f16178b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f16178b;
                AndroidUtilities.runOnUIThread(new p90((LaunchActivity) obj6, (oa0) obj5, tLObject, z10, (Long) serializable3, (nf.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f16179c, (Bundle) cloneable));
                return;
        }
    }

    public g1(LaunchActivity launchActivity, oa0 oa0Var, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = oa0Var;
        this.f16178b = z10;
        this.f16180f = l4;
        this.f16181g = eVar;
        this.h = l10;
        this.f16182i = num;
        this.f16183j = num2;
        this.f16184k = bArr;
        this.f16185l = o2Var;
        this.f16179c = i10;
        this.f16186m = bundle;
    }
}
