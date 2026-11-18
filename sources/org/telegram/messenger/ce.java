package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
public final class ce implements Runnable {
    public final int f23337a;
    public final int f23338b;
    public final Object f23339c;
    public final Object d;
    public final Object f23340e;
    public final Object f23341f;
    public final Object h;
    public final Object f23342n;
    public final Object f23343r;

    public ce(int i7, File file, String str, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, String str2, x10 x10Var, boolean[] zArr2) {
        this.f23337a = 0;
        this.f23338b = i7;
        this.f23339c = file;
        this.d = str;
        this.f23341f = u1Var;
        this.h = zArr;
        this.f23340e = str2;
        this.f23343r = x10Var;
        this.f23342n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ce.run():void");
    }

    public ce(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7, Object obj6, Object obj7, int i10) {
        this.f23337a = i10;
        this.f23339c = obj;
        this.d = obj2;
        this.f23340e = obj3;
        this.f23341f = obj4;
        this.h = obj5;
        this.f23338b = i7;
        this.f23342n = obj6;
        this.f23343r = obj7;
    }

    public ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f23337a = 2;
        this.f23339c = externalActionActivity;
        this.f23341f = u1Var;
        this.h = tLObject;
        this.f23338b = i7;
        this.f23342n = authorizationform;
        this.f23343r = getauthorizationform;
        this.d = str;
        this.f23340e = str2;
    }

    public ce(org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var) {
        this.f23337a = 4;
        this.f23339c = r0Var;
        this.d = str;
        this.f23341f = bArr;
        this.h = jSONObject;
        this.f23340e = str2;
        this.f23338b = i7;
        this.f23342n = y2Var;
        this.f23343r = u0Var;
    }

    public ce(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f23337a = 5;
        this.f23339c = runnableArr;
        this.d = textViewArr;
        this.f23338b = i7;
        this.f23340e = i6Var;
        this.f23341f = wallettransaction;
        this.f23342n = strArr;
        this.h = zArr;
        this.f23343r = bArr;
    }
}
