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
public final class g1 implements RequestDelegate {
    public final int f17725a = 0;
    public final boolean f17726b;
    public final int f17727c;
    public final Object d;
    public final Object f17728e;
    public final Serializable f17729f;
    public final Object f17730g;
    public final Serializable h;
    public final Serializable f17731i;
    public final Object f17732j;
    public final Object f17733k;
    public final Object f17734l;
    public final Cloneable f17735m;

    public g1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f17728e = hashMap;
        this.f17732j = sparseArray;
        this.f17733k = zArr;
        this.f17729f = hashMap2;
        this.f17734l = tL_contacts_importContacts;
        this.f17727c = i10;
        this.f17730g = hashMap3;
        this.f17726b = z10;
        this.h = hashMap4;
        this.f17735m = arrayList;
        this.f17731i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17725a;
        Cloneable cloneable = this.f17735m;
        Object obj = this.f17734l;
        Object obj2 = this.f17733k;
        Object obj3 = this.f17732j;
        Serializable serializable = this.f17731i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17730g;
        Serializable serializable3 = this.f17729f;
        Object obj5 = this.f17728e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17727c, (HashMap) obj4, this.f17726b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f17726b;
                AndroidUtilities.runOnUIThread(new o90((LaunchActivity) obj6, (r80) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f17727c, (Bundle) cloneable));
                return;
        }
    }

    public g1(LaunchActivity launchActivity, r80 r80Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f17728e = r80Var;
        this.f17726b = z10;
        this.f17729f = l4;
        this.f17730g = eVar;
        this.h = l10;
        this.f17731i = num;
        this.f17732j = num2;
        this.f17733k = bArr;
        this.f17734l = n2Var;
        this.f17727c = i10;
        this.f17735m = bundle;
    }
}
