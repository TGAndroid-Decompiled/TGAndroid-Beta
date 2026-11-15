package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
public final class de implements Runnable {
    public final int f23075a;
    public final int f23076b;
    public final Object f23077c;
    public final Object d;
    public final Object f23078e;
    public final Object f23079f;
    public final Object h;
    public final Object f23080n;
    public final Object f23081r;

    public de(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, z10 z10Var, boolean[] zArr2) {
        this.f23075a = 0;
        this.f23076b = i7;
        this.f23077c = file;
        this.d = str;
        this.f23079f = t1Var;
        this.h = zArr;
        this.f23078e = str2;
        this.f23081r = z10Var;
        this.f23080n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.de.run():void");
    }

    public de(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7, Object obj6, Object obj7, int i10) {
        this.f23075a = i10;
        this.f23077c = obj;
        this.d = obj2;
        this.f23078e = obj3;
        this.f23079f = obj4;
        this.h = obj5;
        this.f23076b = i7;
        this.f23080n = obj6;
        this.f23081r = obj7;
    }

    public de(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f23075a = 2;
        this.f23077c = externalActionActivity;
        this.f23079f = t1Var;
        this.h = tLObject;
        this.f23076b = i7;
        this.f23080n = authorizationform;
        this.f23081r = getauthorizationform;
        this.d = str;
        this.f23078e = str2;
    }

    public de(org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.r2 r2Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.f23075a = 4;
        this.f23077c = i0Var;
        this.d = str;
        this.f23079f = bArr;
        this.h = jSONObject;
        this.f23078e = str2;
        this.f23076b = i7;
        this.f23080n = r2Var;
        this.f23081r = l0Var;
    }

    public de(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.e6 e6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f23075a = 5;
        this.f23077c = runnableArr;
        this.d = textViewArr;
        this.f23076b = i7;
        this.f23078e = e6Var;
        this.f23079f = wallettransaction;
        this.f23080n = strArr;
        this.h = zArr;
        this.f23081r = bArr;
    }
}
