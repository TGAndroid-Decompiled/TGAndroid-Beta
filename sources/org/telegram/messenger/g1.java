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
import org.telegram.ui.w80;
import org.telegram.ui.x60;
public final class g1 implements RequestDelegate {
    public final int f20284a = 0;
    public final boolean f20285b;
    public final int f20286c;
    public final Object d;
    public final Object f20287e;
    public final Serializable f20288f;
    public final Object f20289g;
    public final Serializable h;
    public final Serializable f20290i;
    public final Object f20291j;
    public final Object f20292k;
    public final Object f20293l;
    public final Cloneable f20294m;

    public g1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f20287e = hashMap;
        this.f20291j = sparseArray;
        this.f20292k = zArr;
        this.f20288f = hashMap2;
        this.f20293l = tL_contacts_importContacts;
        this.f20286c = i10;
        this.f20289g = hashMap3;
        this.f20285b = z10;
        this.h = hashMap4;
        this.f20294m = arrayList;
        this.f20290i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20284a;
        Cloneable cloneable = this.f20294m;
        Object obj = this.f20293l;
        Object obj2 = this.f20292k;
        Object obj3 = this.f20291j;
        Serializable serializable = this.f20290i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f20289g;
        Serializable serializable3 = this.f20288f;
        Object obj5 = this.f20287e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f20286c, (HashMap) obj4, this.f20285b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                boolean z10 = this.f20285b;
                AndroidUtilities.runOnUIThread(new w80((LaunchActivity) obj6, (x60) obj5, tLObject, z10, (Long) serializable3, (ye.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f20286c, (Bundle) cloneable));
                return;
        }
    }

    public g1(LaunchActivity launchActivity, x60 x60Var, boolean z10, Long l10, ye.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f20287e = x60Var;
        this.f20285b = z10;
        this.f20288f = l10;
        this.f20289g = cVar;
        this.h = l11;
        this.f20290i = num;
        this.f20291j = num2;
        this.f20292k = bArr;
        this.f20293l = o2Var;
        this.f20286c = i10;
        this.f20294m = bundle;
    }
}
