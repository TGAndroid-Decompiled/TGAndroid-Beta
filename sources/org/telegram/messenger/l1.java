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
import org.telegram.ui.p90;
import org.telegram.ui.q70;
public final class l1 implements RequestDelegate {
    public final int f18121a = 0;
    public final boolean f18122b;
    public final int f18123c;
    public final Object d;
    public final Object f18124e;
    public final Serializable f18125f;
    public final Object f18126g;
    public final Serializable h;
    public final Serializable f18127i;
    public final Object f18128j;
    public final Object f18129k;
    public final Object f18130l;
    public final Cloneable f18131m;

    public l1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18124e = hashMap;
        this.f18128j = sparseArray;
        this.f18129k = zArr;
        this.f18125f = hashMap2;
        this.f18130l = tL_contacts_importContacts;
        this.f18123c = i10;
        this.f18126g = hashMap3;
        this.f18122b = z10;
        this.h = hashMap4;
        this.f18131m = arrayList;
        this.f18127i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18121a;
        Cloneable cloneable = this.f18131m;
        Object obj = this.f18130l;
        Object obj2 = this.f18129k;
        Object obj3 = this.f18128j;
        Serializable serializable = this.f18127i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18126g;
        Serializable serializable3 = this.f18125f;
        Object obj5 = this.f18124e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18123c, (HashMap) obj4, this.f18122b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18122b;
                AndroidUtilities.runOnUIThread(new p90((LaunchActivity) obj6, (q70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.m2) obj, this.f18123c, (Bundle) cloneable));
                return;
        }
    }

    public l1(LaunchActivity launchActivity, q70 q70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18124e = q70Var;
        this.f18122b = z10;
        this.f18125f = l4;
        this.f18126g = eVar;
        this.h = l10;
        this.f18127i = num;
        this.f18128j = num2;
        this.f18129k = bArr;
        this.f18130l = m2Var;
        this.f18123c = i10;
        this.f18131m = bundle;
    }
}
