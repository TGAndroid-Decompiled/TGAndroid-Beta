package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.ws0;
public final class ee implements Runnable {
    public final int f22183a = 0;
    public final Object f22184b;
    public final int f22185c;
    public final Object d;
    public final Object f22186e;
    public final Object f22187f;
    public final Object h;
    public final Object f22188n;
    public final Object f22189r;

    public ee(int i7, File file, String str, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, String str2, c20 c20Var, boolean[] zArr2) {
        this.f22185c = i7;
        this.f22187f = file;
        this.d = str;
        this.f22184b = u1Var;
        this.h = zArr;
        this.f22186e = str2;
        this.f22189r = c20Var;
        this.f22188n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ee.run():void");
    }

    public ee(TLObject tLObject, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ws0 ws0Var, com.google.android.gms.internal.clearcut.z0 z0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22187f = tLObject;
        this.d = f2Var;
        this.f22186e = tL_inputStorePaymentPremiumSubscription;
        this.f22184b = ws0Var;
        this.h = z0Var;
        this.f22185c = i7;
        this.f22188n = tL_error;
        this.f22189r = tL_payments_canPurchaseStore;
    }

    public ee(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22187f = externalActionActivity;
        this.f22184b = u1Var;
        this.h = tLObject;
        this.f22185c = i7;
        this.f22188n = authorizationform;
        this.f22189r = getauthorizationform;
        this.d = str;
        this.f22186e = str2;
    }

    public ee(org.telegram.ui.Wallet.k0 k0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.u2 u2Var, org.telegram.ui.Wallet.n0 n0Var) {
        this.f22187f = k0Var;
        this.d = str;
        this.f22184b = bArr;
        this.h = jSONObject;
        this.f22186e = str2;
        this.f22185c = i7;
        this.f22188n = u2Var;
        this.f22189r = n0Var;
    }

    public ee(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.f6 f6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f22187f = runnableArr;
        this.d = textViewArr;
        this.f22185c = i7;
        this.f22186e = f6Var;
        this.f22184b = wallettransaction;
        this.f22188n = strArr;
        this.h = zArr;
        this.f22189r = bArr;
    }
}
