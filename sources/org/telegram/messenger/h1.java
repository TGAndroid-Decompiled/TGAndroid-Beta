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
import org.telegram.ui.v10;
public final class h1 implements RequestDelegate {
    public final int f18805a = 0;
    public final boolean f18806b;
    public final int f18807c;
    public final Object d;
    public final Object f18808e;
    public final Serializable f18809f;
    public final Object f18810g;
    public final Serializable h;
    public final Serializable f18811i;
    public final Object f18812j;
    public final Object f18813k;
    public final Object f18814l;
    public final Cloneable f18815m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z4, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18808e = hashMap;
        this.f18812j = sparseArray;
        this.f18813k = zArr;
        this.f18809f = hashMap2;
        this.f18814l = tL_contacts_importContacts;
        this.f18807c = i10;
        this.f18810g = hashMap3;
        this.f18806b = z4;
        this.h = hashMap4;
        this.f18815m = arrayList;
        this.f18811i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18805a;
        Cloneable cloneable = this.f18815m;
        Object obj = this.f18814l;
        Object obj2 = this.f18813k;
        Object obj3 = this.f18812j;
        Serializable serializable = this.f18811i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18810g;
        Serializable serializable3 = this.f18809f;
        Object obj5 = this.f18808e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18807c, (HashMap) obj4, this.f18806b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                boolean z4 = this.f18806b;
                AndroidUtilities.runOnUIThread(new f90((LaunchActivity) obj6, (v10) obj5, tLObject, z4, (Long) serializable3, (af.f) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f18807c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, v10 v10Var, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18808e = v10Var;
        this.f18806b = z4;
        this.f18809f = l10;
        this.f18810g = fVar;
        this.h = l11;
        this.f18811i = num;
        this.f18812j = num2;
        this.f18813k = bArr;
        this.f18814l = p2Var;
        this.f18807c = i10;
        this.f18815m = bundle;
    }
}
