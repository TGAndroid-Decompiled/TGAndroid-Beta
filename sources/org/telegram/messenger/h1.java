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
import org.telegram.ui.s80;
import org.telegram.ui.x20;
public final class h1 implements RequestDelegate {
    public final int f20433a = 0;
    public final boolean f20434b;
    public final int f20435c;
    public final Object d;
    public final Object f20436e;
    public final Serializable f20437f;
    public final Object f20438g;
    public final Serializable h;
    public final Serializable f20439i;
    public final Object f20440j;
    public final Object f20441k;
    public final Object f20442l;
    public final Cloneable f20443m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i9, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f20436e = hashMap;
        this.f20440j = sparseArray;
        this.f20441k = zArr;
        this.f20437f = hashMap2;
        this.f20442l = tL_contacts_importContacts;
        this.f20435c = i9;
        this.f20438g = hashMap3;
        this.f20434b = z10;
        this.h = hashMap4;
        this.f20443m = arrayList;
        this.f20439i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f20433a;
        Cloneable cloneable = this.f20443m;
        Object obj = this.f20442l;
        Object obj2 = this.f20441k;
        Object obj3 = this.f20440j;
        Serializable serializable = this.f20439i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f20438g;
        Serializable serializable3 = this.f20437f;
        Object obj5 = this.f20436e;
        Object obj6 = this.d;
        switch (i9) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f20435c, (HashMap) obj4, this.f20434b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                boolean z10 = this.f20434b;
                AndroidUtilities.runOnUIThread(new s80((LaunchActivity) obj6, (x20) obj5, tLObject, z10, (Long) serializable3, (ve.d) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.o2) obj, this.f20435c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, x20 x20Var, boolean z10, Long l10, ve.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i9, Bundle bundle) {
        this.d = launchActivity;
        this.f20436e = x20Var;
        this.f20434b = z10;
        this.f20437f = l10;
        this.f20438g = dVar;
        this.h = l11;
        this.f20439i = num;
        this.f20440j = num2;
        this.f20441k = bArr;
        this.f20442l = o2Var;
        this.f20435c = i9;
        this.f20443m = bundle;
    }
}
