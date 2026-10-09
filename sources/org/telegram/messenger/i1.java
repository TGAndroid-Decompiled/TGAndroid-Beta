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
import org.telegram.ui.m70;
import org.telegram.ui.n90;
public final class i1 implements RequestDelegate {
    public final int f18100a = 0;
    public final boolean f18101b;
    public final int f18102c;
    public final Object d;
    public final Object f18103e;
    public final Serializable f18104f;
    public final Object f18105g;
    public final Serializable h;
    public final Serializable f18106i;
    public final Object f18107j;
    public final Object f18108k;
    public final Object f18109l;
    public final Cloneable f18110m;

    public i1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.f18103e = hashMap;
        this.f18107j = sparseArray;
        this.f18108k = zArr;
        this.f18104f = hashMap2;
        this.f18109l = tL_contacts_importContacts;
        this.f18102c = i10;
        this.f18105g = hashMap3;
        this.f18101b = z10;
        this.h = hashMap4;
        this.f18110m = arrayList;
        this.f18106i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f18100a;
        Cloneable cloneable = this.f18110m;
        Object obj = this.f18109l;
        Object obj2 = this.f18108k;
        Object obj3 = this.f18107j;
        Serializable serializable = this.f18106i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f18105g;
        Serializable serializable3 = this.f18104f;
        Object obj5 = this.f18103e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f18102c, (HashMap) obj4, this.f18101b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                boolean z10 = this.f18101b;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj6, (m70) obj5, tLObject, z10, (Long) serializable3, (of.e) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f18102c, (Bundle) cloneable));
                return;
        }
    }

    public i1(LaunchActivity launchActivity, m70 m70Var, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f18103e = m70Var;
        this.f18101b = z10;
        this.f18104f = l4;
        this.f18105g = eVar;
        this.h = l10;
        this.f18106i = num;
        this.f18107j = num2;
        this.f18108k = bArr;
        this.f18109l = n2Var;
        this.f18102c = i10;
        this.f18110m = bundle;
    }
}
