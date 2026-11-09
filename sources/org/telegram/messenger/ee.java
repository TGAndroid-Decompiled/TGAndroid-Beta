package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.ys0;
public final class ee implements Runnable {
    public final int f22209a = 0;
    public final Object f22210b;
    public final int f22211c;
    public final Object d;
    public final Object f22212e;
    public final Object f22213f;
    public final Object h;
    public final Object f22214n;
    public final Object f22215r;

    public ee(int i7, File file, String str, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, String str2, c20 c20Var, boolean[] zArr2) {
        this.f22211c = i7;
        this.f22213f = file;
        this.d = str;
        this.f22210b = u1Var;
        this.h = zArr;
        this.f22212e = str2;
        this.f22215r = c20Var;
        this.f22214n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ee.run():void");
    }

    public ee(TLObject tLObject, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ys0 ys0Var, com.google.android.gms.internal.clearcut.z0 z0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22213f = tLObject;
        this.d = f2Var;
        this.f22212e = tL_inputStorePaymentPremiumSubscription;
        this.f22210b = ys0Var;
        this.h = z0Var;
        this.f22211c = i7;
        this.f22214n = tL_error;
        this.f22215r = tL_payments_canPurchaseStore;
    }

    public ee(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22213f = externalActionActivity;
        this.f22210b = u1Var;
        this.h = tLObject;
        this.f22211c = i7;
        this.f22214n = authorizationform;
        this.f22215r = getauthorizationform;
        this.d = str;
        this.f22212e = str2;
    }

    public ee(org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.f22213f = i0Var;
        this.d = str;
        this.f22210b = bArr;
        this.h = jSONObject;
        this.f22212e = str2;
        this.f22211c = i7;
        this.f22214n = s2Var;
        this.f22215r = l0Var;
    }

    public ee(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.g6 g6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f22213f = runnableArr;
        this.d = textViewArr;
        this.f22211c = i7;
        this.f22212e = g6Var;
        this.f22210b = wallettransaction;
        this.f22214n = strArr;
        this.h = zArr;
        this.f22215r = bArr;
    }
}
