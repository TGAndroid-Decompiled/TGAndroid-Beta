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
import org.telegram.ui.kz;
public final class m1 implements RequestDelegate {
    public final int f20643a = 0;
    public final boolean f20644b;
    public final int f20645c;
    public final Object d;
    public final Object e;
    public final Serializable f20646f;
    public final Object f20647g;
    public final Serializable h;
    public final Serializable f20648i;
    public final Object f20649j;
    public final Object f20650k;
    public final Object f20651l;
    public final Cloneable f20652m;

    public m1(ContactsController contactsController, HashMap hashMap, SparseArray sparseArray, boolean[] zArr, HashMap hashMap2, TLRPC.TL_contacts_importContacts tL_contacts_importContacts, int i10, HashMap hashMap3, boolean z10, HashMap hashMap4, ArrayList arrayList, HashMap hashMap5) {
        this.d = contactsController;
        this.e = hashMap;
        this.f20649j = sparseArray;
        this.f20650k = zArr;
        this.f20646f = hashMap2;
        this.f20651l = tL_contacts_importContacts;
        this.f20645c = i10;
        this.f20647g = hashMap3;
        this.f20644b = z10;
        this.h = hashMap4;
        this.f20652m = arrayList;
        this.f20648i = hashMap5;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20643a;
        Cloneable cloneable = this.f20652m;
        Object obj = this.f20651l;
        Object obj2 = this.f20650k;
        Object obj3 = this.f20649j;
        Serializable serializable = this.f20648i;
        Serializable serializable2 = this.h;
        Object obj4 = this.f20647g;
        Serializable serializable3 = this.f20646f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i10) {
            case 0:
                ((ContactsController) obj6).lambda$performSyncPhoneBook$20((HashMap) obj5, (SparseArray) obj3, (boolean[]) obj2, (HashMap) serializable3, (TLRPC.TL_contacts_importContacts) obj, this.f20645c, (HashMap) obj4, this.f20644b, (HashMap) serializable2, (ArrayList) cloneable, (HashMap) serializable, tLObject, tL_error);
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                boolean z10 = this.f20644b;
                AndroidUtilities.runOnUIThread(new g90((LaunchActivity) obj6, (kz) obj5, tLObject, z10, (Long) serializable3, (qf.c) obj4, (Long) serializable2, (Integer) serializable, (Integer) obj3, (byte[]) obj2, (org.telegram.ui.ActionBar.r2) obj, this.f20645c, (Bundle) cloneable));
                return;
        }
    }

    public m1(LaunchActivity launchActivity, kz kzVar, boolean z10, Long l4, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, Bundle bundle) {
        this.d = launchActivity;
        this.e = kzVar;
        this.f20644b = z10;
        this.f20646f = l4;
        this.f20647g = cVar;
        this.h = l10;
        this.f20648i = num;
        this.f20649j = num2;
        this.f20650k = bArr;
        this.f20651l = r2Var;
        this.f20645c = i10;
        this.f20652m = bundle;
    }
}
