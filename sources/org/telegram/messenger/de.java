package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.eu0;
public final class de implements Runnable {
    public final int f15367a = 0;
    public final Object f15368b;
    public final int f15369c;
    public final Object d;
    public final Object e;
    public final Object f15370f;
    public final Object h;
    public final Object f15371n;
    public final Object f15372r;

    public de(int i10, File file, String str, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr, String str2, r20 r20Var, boolean[] zArr2) {
        this.f15369c = i10;
        this.f15370f = file;
        this.d = str;
        this.f15368b = x1Var;
        this.h = zArr;
        this.e = str2;
        this.f15372r = r20Var;
        this.f15371n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.de.run():void");
    }

    public de(TLObject tLObject, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, eu0 eu0Var, ba.a aVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f15370f = tLObject;
        this.d = k2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f15368b = eu0Var;
        this.h = aVar;
        this.f15369c = i10;
        this.f15371n = tL_error;
        this.f15372r = tL_payments_canPurchaseStore;
    }

    public de(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f15370f = externalActionActivity;
        this.f15368b = x1Var;
        this.h = tLObject;
        this.f15369c = i10;
        this.f15371n = authorizationform;
        this.f15372r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public de(org.telegram.ui.Wallet.h0 h0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i10, org.telegram.ui.Wallet.u2 u2Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.f15370f = h0Var;
        this.d = str;
        this.f15368b = bArr;
        this.h = jSONObject;
        this.e = str2;
        this.f15369c = i10;
        this.f15371n = u2Var;
        this.f15372r = k0Var;
    }

    public de(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.p6 p6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f15370f = runnableArr;
        this.d = textViewArr;
        this.f15369c = i10;
        this.e = p6Var;
        this.f15368b = wallettransaction;
        this.f15371n = strArr;
        this.h = zArr;
        this.f15372r = bArr;
    }
}
