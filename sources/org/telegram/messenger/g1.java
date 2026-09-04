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
    public final int f17698a = 0;
    public final boolean f17699b;
    public final int f17700c;
    public final Object d;
    public final Object f17701e;
    public final Serializable f17702f;
    public final Object f17703g;
    public final Serializable h;
    public final Serializable f17704i;
    public final Object f17705j;
    public final Object f17706k;
    public final Object f17707l;
    public final Cloneable f17708m;

    public g1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f17701e = hashMap;
        this.f17705j = sparseArray;
        this.f17706k = zArr;
        this.f17702f = hashMap2;
        this.f17707l = tL_contacts_importContacts;
        this.f17700c = i10;
        this.f17703g = hashMap3;
        this.f17699b = z10;
        this.h = hashMap4;
        this.f17708m = arrayList;
        this.f17704i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17698a;
        Cloneable cloneable = this.f17708m;
        Object obj = this.f17707l;
        Object obj2 = this.f17706k;
        Object obj3 = this.f17705j;
        Serializable serializable = this.f17704i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17703g;
        Serializable serializable3 = this.f17702f;
        Object obj5 = this.f17701e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17700c, (HashMap) obj4, this.f17699b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f17699b;
                AndroidUtilities.runOnUIThread(new o90((LaunchActivity) obj6, (r80) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f17700c, (Bundle) cloneable));
                return;
        }
    }

    public g1(LaunchActivity launchActivity, r80 r80Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f17701e = r80Var;
        this.f17699b = z10;
        this.f17702f = l4;
        this.f17703g = eVar;
        this.h = l10;
        this.f17704i = num;
        this.f17705j = num2;
        this.f17706k = bArr;
        this.f17707l = n2Var;
        this.f17700c = i10;
        this.f17708m = bundle;
    }
}
