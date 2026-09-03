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
import org.telegram.ui.g90;
import org.telegram.ui.w10;
public final class h1 implements RequestDelegate {
    public final int f17326a = 0;
    public final boolean f17327b;
    public final int f17328c;
    public final Object d;
    public final Object e;
    public final Serializable f17329f;
    public final Object f17330g;
    public final Serializable h;
    public final Serializable f17331i;
    public final Object f17332j;
    public final Object f17333k;
    public final Object f17334l;
    public final Cloneable f17335m;

    public h1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z4, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f17332j = sparseArray;
        this.f17333k = zArr;
        this.f17329f = hashMap2;
        this.f17334l = tL_contacts_importContacts;
        this.f17328c = i10;
        this.f17330g = hashMap3;
        this.f17327b = z4;
        this.h = hashMap4;
        this.f17335m = arrayList;
        this.f17331i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f17326a;
        Cloneable cloneable = this.f17335m;
        Object obj = this.f17334l;
        Object obj2 = this.f17333k;
        Object obj3 = this.f17332j;
        Serializable serializable = this.f17331i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f17330g;
        Serializable serializable3 = this.f17329f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f17328c, (HashMap) obj4, this.f17327b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                boolean z4 = this.f17327b;
                AndroidUtilities.runOnUIThread(new g90((LaunchActivity) obj6, (w10) obj5, tLObject, z4, (Long) serializable3, (ze.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.p2) obj, this.f17328c, (Bundle) cloneable));
                return;
        }
    }

    public h1(LaunchActivity launchActivity, w10 w10Var, boolean z4, Long l10, ze.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = w10Var;
        this.f17327b = z4;
        this.f17329f = l10;
        this.f17330g = cVar;
        this.h = l11;
        this.f17331i = num;
        this.f17332j = num2;
        this.f17333k = bArr;
        this.f17334l = p2Var;
        this.f17328c = i10;
        this.f17335m = bundle;
    }
}
