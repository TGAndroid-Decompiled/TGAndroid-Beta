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
import org.telegram.ui.a30;
import org.telegram.ui.x80;

public final class g1 implements RequestDelegate {

    public final int f20323a = 0;

    public final boolean f20324b;

    public final int f20325c;
    public final Object d;

    public final Object f20326e;

    public final Serializable f20327f;

    public final Object f20328g;
    public final Serializable h;

    public final Serializable f20329i;

    public final Object f20330j;

    public final Object f20331k;

    public final Object f20332l;

    public final Cloneable f20333m;

    public g1(ContactsController contactsController, HashMap map, SparseArray sparseArray, boolean[] zArr, HashMap map2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap map3, boolean z10, HashMap map4, ArrayList arrayList, HashMap map5) {
        this.d = contactsController;
        this.f20326e = map;
        this.f20330j = sparseArray;
        this.f20331k = zArr;
        this.f20327f = map2;
        this.f20332l = tL_contacts_importContacts;
        this.f20325c = i10;
        this.f20328g = map3;
        this.f20324b = z10;
        this.h = map4;
        this.f20333m = arrayList;
        this.f20329i = map5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20323a;
        Cloneable cloneable = this.f20333m;
        Object obj = this.f20332l;
        Object obj2 = this.f20331k;
        Object obj3 = this.f20330j;
        Serializable serializable = this.f20329i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f20328g;
        Serializable serializable3 = this.f20327f;
        Object obj5 = this.f20326e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f20325c, (HashMap) obj4, this.f20324b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                boolean z10 = this.f20324b;
                AndroidUtilities.runOnUIThread(new x80((LaunchActivity) obj6, (a30) obj5, tLObject, z10, (Long) serializable3, (we.d) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.n2) obj, this.f20325c, (Bundle) cloneable));
                break;
        }
    }

    public g1(LaunchActivity launchActivity, a30 a30Var, boolean z10, Long l10, we.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.f20326e = a30Var;
        this.f20324b = z10;
        this.f20327f = l10;
        this.f20328g = dVar;
        this.h = l11;
        this.f20329i = num;
        this.f20330j = num2;
        this.f20331k = bArr;
        this.f20332l = n2Var;
        this.f20325c = i10;
        this.f20333m = bundle;
    }
}
