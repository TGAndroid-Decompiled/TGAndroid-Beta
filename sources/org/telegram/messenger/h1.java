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
import org.telegram.ui.e90;
import org.telegram.ui.g00;
public final class h1 implements RequestDelegate {
    public final int f17346a = 0;
    public final boolean f17347b;
    public final int f17348c;
    public final Object d;
    public final Object e;
    public final Serializable f17349f;
    public final Object f17350g;
    public final Serializable h;
    public final Serializable f17351i;
    public final Object f17352j;
    public final Object f17353k;
    public final Object f17354l;
    public final Cloneable f17355m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z4, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f17352j = sparseArray;
        this.f17353k = zArr;
        this.f17349f = hashMap2;
        this.f17354l = tL_contacts_importContacts;
        this.f17348c = i10;
        this.f17350g = hashMap3;
        this.f17347b = z4;
        this.h = hashMap4;
        this.f17355m = arrayList;
        this.f17351i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17346a;
        Cloneable cloneable = this.f17355m;
        Object obj = this.f17354l;
        Object obj2 = this.f17353k;
        Object obj3 = this.f17352j;
        Serializable serializable = this.f17351i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17350g;
        Serializable serializable3 = this.f17349f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17348c, (HashMap) obj4, this.f17347b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                boolean z4 = this.f17347b;
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj6, (g00) obj5, tLObject, z4, (Long) serializable3, (af.f) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f17348c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, g00 g00Var, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = g00Var;
        this.f17347b = z4;
        this.f17349f = l10;
        this.f17350g = fVar;
        this.h = l11;
        this.f17351i = num;
        this.f17352j = num2;
        this.f17353k = bArr;
        this.f17354l = p2Var;
        this.f17348c = i10;
        this.f17355m = bundle;
    }
}
