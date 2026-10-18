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
    public final int f18745a = 0;
    public final boolean f18746b;
    public final int f18747c;
    public final Object d;
    public final Object e;
    public final Serializable f18748f;
    public final Object f18749g;
    public final Serializable h;
    public final Serializable f18750i;
    public final Object f18751j;
    public final Object f18752k;
    public final Object f18753l;
    public final Cloneable f18754m;

    public k1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18751j = sparseArray;
        this.f18752k = zArr;
        this.f18748f = hashMap2;
        this.f18753l = tL_contacts_importContacts;
        this.f18747c = i10;
        this.f18749g = hashMap3;
        this.f18746b = z10;
        this.h = hashMap4;
        this.f18754m = arrayList;
        this.f18750i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18745a;
        Cloneable cloneable = this.f18754m;
        Object obj = this.f18753l;
        Object obj2 = this.f18752k;
        Object obj3 = this.f18751j;
        Serializable serializable = this.f18750i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18749g;
        Serializable serializable3 = this.f18748f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18747c, (HashMap) obj4, this.f18746b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                boolean z10 = this.f18746b;
                AndroidUtilities.runOnUIThread(new b90((LaunchActivity) obj6, (b80) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18747c, (Bundle) cloneable));
                return;
        }
    }

    public k1(LaunchActivity launchActivity, b80 b80Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = b80Var;
        this.f18746b = z10;
        this.f18748f = l4;
        this.f18749g = cVar;
        this.h = l10;
        this.f18750i = num;
        this.f18751j = num2;
        this.f18752k = bArr;
        this.f18753l = n2Var;
        this.f18747c = i10;
        this.f18754m = bundle;
    }
}
