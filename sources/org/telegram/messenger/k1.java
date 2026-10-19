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
import org.telegram.ui.z70;
import org.telegram.ui.z80;
public final class k1 implements RequestDelegate {
    public final int f18742a = 0;
    public final boolean f18743b;
    public final int f18744c;
    public final Object d;
    public final Object e;
    public final Serializable f18745f;
    public final Object f18746g;
    public final Serializable h;
    public final Serializable f18747i;
    public final Object f18748j;
    public final Object f18749k;
    public final Object f18750l;
    public final Cloneable f18751m;

    public k1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18748j = sparseArray;
        this.f18749k = zArr;
        this.f18745f = hashMap2;
        this.f18750l = tL_contacts_importContacts;
        this.f18744c = i10;
        this.f18746g = hashMap3;
        this.f18743b = z10;
        this.h = hashMap4;
        this.f18751m = arrayList;
        this.f18747i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18742a;
        Cloneable cloneable = this.f18751m;
        Object obj = this.f18750l;
        Object obj2 = this.f18749k;
        Object obj3 = this.f18748j;
        Serializable serializable = this.f18747i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18746g;
        Serializable serializable3 = this.f18745f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18744c, (HashMap) obj4, this.f18743b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                boolean z10 = this.f18743b;
                AndroidUtilities.runOnUIThread(new z80((LaunchActivity) obj6, (z70) obj5, tLObject, z10, (Long) serializable3, (pf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18744c, (Bundle) cloneable));
                return;
        }
    }

    public k1(LaunchActivity launchActivity, z70 z70Var, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = z70Var;
        this.f18743b = z10;
        this.f18745f = l4;
        this.f18746g = cVar;
        this.h = l10;
        this.f18747i = num;
        this.f18748j = num2;
        this.f18749k = bArr;
        this.f18750l = n2Var;
        this.f18744c = i10;
        this.f18751m = bundle;
    }
}
