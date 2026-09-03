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
import org.telegram.ui.f90;
import org.telegram.ui.z10;
public final class h1 implements RequestDelegate {
    public final int f18807a = 0;
    public final boolean f18808b;
    public final int f18809c;
    public final Object d;
    public final Object f18810e;
    public final Serializable f18811f;
    public final Object f18812g;
    public final Serializable h;
    public final Serializable f18813i;
    public final Object f18814j;
    public final Object f18815k;
    public final Object f18816l;
    public final Cloneable f18817m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z4, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18810e = hashMap;
        this.f18814j = sparseArray;
        this.f18815k = zArr;
        this.f18811f = hashMap2;
        this.f18816l = tL_contacts_importContacts;
        this.f18809c = i10;
        this.f18812g = hashMap3;
        this.f18808b = z4;
        this.h = hashMap4;
        this.f18817m = arrayList;
        this.f18813i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18807a;
        Cloneable cloneable = this.f18817m;
        Object obj = this.f18816l;
        Object obj2 = this.f18815k;
        Object obj3 = this.f18814j;
        Serializable serializable = this.f18813i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18812g;
        Serializable serializable3 = this.f18811f;
        Object obj5 = this.f18810e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18809c, (HashMap) obj4, this.f18808b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                boolean z4 = this.f18808b;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj6, (z10) obj5, tLObject, z4, (Long) serializable3, (af.f) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f18809c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, z10 z10Var, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18810e = z10Var;
        this.f18808b = z4;
        this.f18811f = l10;
        this.f18812g = fVar;
        this.h = l11;
        this.f18813i = num;
        this.f18814j = num2;
        this.f18815k = bArr;
        this.f18816l = p2Var;
        this.f18809c = i10;
        this.f18817m = bundle;
    }
}
