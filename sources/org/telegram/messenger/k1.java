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
import org.telegram.ui.b80;
import org.telegram.ui.b90;
public final class k1 implements RequestDelegate {
    public final int f18738a = 0;
    public final boolean f18739b;
    public final int f18740c;
    public final Object d;
    public final Object e;
    public final Serializable f18741f;
    public final Object f18742g;
    public final Serializable h;
    public final Serializable f18743i;
    public final Object f18744j;
    public final Object f18745k;
    public final Object f18746l;
    public final Cloneable f18747m;

    public k1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18744j = sparseArray;
        this.f18745k = zArr;
        this.f18741f = hashMap2;
        this.f18746l = tL_contacts_importContacts;
        this.f18740c = i10;
        this.f18742g = hashMap3;
        this.f18739b = z10;
        this.h = hashMap4;
        this.f18747m = arrayList;
        this.f18743i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18738a;
        Cloneable cloneable = this.f18747m;
        Object obj = this.f18746l;
        Object obj2 = this.f18745k;
        Object obj3 = this.f18744j;
        Serializable serializable = this.f18743i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18742g;
        Serializable serializable3 = this.f18741f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18740c, (HashMap) obj4, this.f18739b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                boolean z10 = this.f18739b;
                AndroidUtilities.runOnUIThread(new b90((LaunchActivity) obj6, (b80) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18740c, (Bundle) cloneable));
                return;
        }
    }

    public k1(LaunchActivity launchActivity, b80 b80Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = b80Var;
        this.f18739b = z10;
        this.f18741f = l4;
        this.f18742g = cVar;
        this.h = l10;
        this.f18743i = num;
        this.f18744j = num2;
        this.f18745k = bArr;
        this.f18746l = n2Var;
        this.f18740c = i10;
        this.f18747m = bundle;
    }
}
