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
import org.telegram.ui.d20;
import org.telegram.ui.s90;
public final class k1 implements RequestDelegate {
    public final int f17340a = 0;
    public final boolean f17341b;
    public final int f17342c;
    public final Object d;
    public final Object e;
    public final Serializable f17343f;
    public final Object f17344g;
    public final Serializable h;
    public final Serializable f17345i;
    public final Object f17346j;
    public final Object f17347k;
    public final Object f17348l;
    public final Cloneable f17349m;

    public k1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f17346j = sparseArray;
        this.f17347k = zArr;
        this.f17343f = hashMap2;
        this.f17348l = tL_contacts_importContacts;
        this.f17342c = i10;
        this.f17344g = hashMap3;
        this.f17341b = z10;
        this.h = hashMap4;
        this.f17349m = arrayList;
        this.f17345i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17340a;
        Cloneable cloneable = this.f17349m;
        Object obj = this.f17348l;
        Object obj2 = this.f17347k;
        Object obj3 = this.f17346j;
        Serializable serializable = this.f17345i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17344g;
        Serializable serializable3 = this.f17343f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17342c, (HashMap) obj4, this.f17341b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f17341b;
                AndroidUtilities.runOnUIThread(new s90((LaunchActivity) obj6, (d20) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f17342c, (Bundle) cloneable));
                return;
        }
    }

    public k1(LaunchActivity launchActivity, d20 d20Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = d20Var;
        this.f17341b = z10;
        this.f17343f = l4;
        this.f17344g = cVar;
        this.h = l10;
        this.f17345i = num;
        this.f17346j = num2;
        this.f17347k = bArr;
        this.f17348l = m2Var;
        this.f17342c = i10;
        this.f17349m = bundle;
    }
}
