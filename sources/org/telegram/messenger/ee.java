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
    public final int f22190a = 0;
    public final Object f22191b;
    public final int f22192c;
    public final Object d;
    public final Object f22193e;
    public final Object f22194f;
    public final Object h;
    public final Object f22195n;
    public final Object f22196r;

    public ee(int i7, File file, String str, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, String str2, c20 c20Var, boolean[] zArr2) {
        this.f22192c = i7;
        this.f22194f = file;
        this.d = str;
        this.f22191b = u1Var;
        this.h = zArr;
        this.f22193e = str2;
        this.f22196r = c20Var;
        this.f22195n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ee.run():void");
    }

    public ee(TLObject tLObject, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ws0 ws0Var, com.google.android.gms.internal.clearcut.z0 z0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22194f = tLObject;
        this.d = f2Var;
        this.f22193e = tL_inputStorePaymentPremiumSubscription;
        this.f22191b = ws0Var;
        this.h = z0Var;
        this.f22192c = i7;
        this.f22195n = tL_error;
        this.f22196r = tL_payments_canPurchaseStore;
    }

    public ee(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22194f = externalActionActivity;
        this.f22191b = u1Var;
        this.h = tLObject;
        this.f22192c = i7;
        this.f22195n = authorizationform;
        this.f22196r = getauthorizationform;
        this.d = str;
        this.f22193e = str2;
    }

    public ee(org.telegram.ui.Wallet.k0 k0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.u2 u2Var, org.telegram.ui.Wallet.n0 n0Var) {
        this.f22194f = k0Var;
        this.d = str;
        this.f22191b = bArr;
        this.h = jSONObject;
        this.f22193e = str2;
        this.f22192c = i7;
        this.f22195n = u2Var;
        this.f22196r = n0Var;
    }

    public ee(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.f6 f6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f22194f = runnableArr;
        this.d = textViewArr;
        this.f22192c = i7;
        this.f22193e = f6Var;
        this.f22191b = wallettransaction;
        this.f22195n = strArr;
        this.h = zArr;
        this.f22196r = bArr;
    }
}
