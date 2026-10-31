package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.fu0;
public final class ce implements Runnable {
    public final int f15005a = 0;
    public final Object f15006b;
    public final int f15007c;
    public final Object d;
    public final Object e;
    public final Object f15008f;
    public final Object h;
    public final Object f15009n;
    public final Object f15010r;

    public ce(int i10, File file, String str, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, String str2, q20 q20Var, boolean[] zArr2) {
        this.f15007c = i10;
        this.f15008f = file;
        this.d = str;
        this.f15006b = x1Var;
        this.h = zArr;
        this.e = str2;
        this.f15010r = q20Var;
        this.f15009n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ce.run():void");
    }

    public ce(TLObject tLObject, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, fu0 fu0Var, ba.a aVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f15008f = tLObject;
        this.d = k2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f15006b = fu0Var;
        this.h = aVar;
        this.f15007c = i10;
        this.f15009n = tL_error;
        this.f15010r = tL_payments_canPurchaseStore;
    }

    public ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f15008f = externalActionActivity;
        this.f15006b = x1Var;
        this.h = tLObject;
        this.f15007c = i10;
        this.f15009n = authorizationform;
        this.f15010r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public ce(org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i10, org.telegram.ui.Wallet.t2 t2Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f15008f = h0Var;
        this.d = str;
        this.f15006b = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.f15007c = i10;
        this.f15009n = t2Var;
        this.f15010r = k0Var;
    }

    public ce(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.p6 p6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f15008f = runnableArr;
        this.d = textViewArr;
        this.f15007c = i10;
        this.e = p6Var;
        this.f15006b = wallettransaction;
        this.f15009n = strArr;
        this.h = zArr;
        this.f15010r = bArr;
    }
}
