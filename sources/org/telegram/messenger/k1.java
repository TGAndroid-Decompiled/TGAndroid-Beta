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
import org.telegram.ui.o00;
import org.telegram.ui.s90;
public final class k1 implements RequestDelegate {
    public final int f17641a = 0;
    public final boolean f17642b;
    public final int f17643c;
    public final Object d;
    public final Object e;
    public final Serializable f17644f;
    public final Object f17645g;
    public final Serializable h;
    public final Serializable f17646i;
    public final Object f17647j;
    public final Object f17648k;
    public final Object f17649l;
    public final Cloneable f17650m;

    public k1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f17647j = sparseArray;
        this.f17648k = zArr;
        this.f17644f = hashMap2;
        this.f17649l = tL_contacts_importContacts;
        this.f17643c = i10;
        this.f17645g = hashMap3;
        this.f17642b = z10;
        this.h = hashMap4;
        this.f17650m = arrayList;
        this.f17646i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17641a;
        Cloneable cloneable = this.f17650m;
        Object obj = this.f17649l;
        Object obj2 = this.f17648k;
        Object obj3 = this.f17647j;
        Serializable serializable = this.f17646i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17645g;
        Serializable serializable3 = this.f17644f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17643c, (HashMap) obj4, this.f17642b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f17642b;
                AndroidUtilities.runOnUIThread(new s90((LaunchActivity) obj6, (o00) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f17643c, (Bundle) cloneable));
                return;
        }
    }

    public k1(LaunchActivity launchActivity, o00 o00Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = o00Var;
        this.f17642b = z10;
        this.f17644f = l4;
        this.f17645g = cVar;
        this.h = l10;
        this.f17646i = num;
        this.f17647j = num2;
        this.f17648k = bArr;
        this.f17649l = m2Var;
        this.f17643c = i10;
        this.f17650m = bundle;
    }
}
