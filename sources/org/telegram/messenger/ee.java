package org.telegram.messenger;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.zs0;
public final class ee implements Runnable {
    public final int f22213a = 0;
    public final Object f22214b;
    public final int f22215c;
    public final Object d;
    public final Object f22216e;
    public final Object f22217f;
    public final Object h;
    public final Object f22218n;
    public final Object f22219r;

    public ee(int i7, File file, String str, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr, String str2, c20 c20Var, boolean[] zArr2) {
        this.f22215c = i7;
        this.f22217f = file;
        this.d = str;
        this.f22214b = u1Var;
        this.h = zArr;
        this.f22216e = str2;
        this.f22219r = c20Var;
        this.f22218n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ee.run():void");
    }

    public ee(TLObject tLObject, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, zs0 zs0Var, com.google.android.gms.internal.clearcut.z0 z0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22217f = tLObject;
        this.d = f2Var;
        this.f22216e = tL_inputStorePaymentPremiumSubscription;
        this.f22214b = zs0Var;
        this.h = z0Var;
        this.f22215c = i7;
        this.f22218n = tL_error;
        this.f22219r = tL_payments_canPurchaseStore;
    }

    public ee(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22217f = externalActionActivity;
        this.f22214b = u1Var;
        this.h = tLObject;
        this.f22215c = i7;
        this.f22218n = authorizationform;
        this.f22219r = getauthorizationform;
        this.d = str;
        this.f22216e = str2;
    }

    public ee(org.telegram.ui.Wallet.i0 i0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.s2 s2Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.f22217f = i0Var;
        this.d = str;
        this.f22214b = bArr;
        this.h = jSONObject;
        this.f22216e = str2;
        this.f22215c = i7;
        this.f22218n = s2Var;
        this.f22219r = l0Var;
    }

    public ee(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f22217f = runnableArr;
        this.d = textViewArr;
        this.f22215c = i7;
        this.f22216e = h6Var;
        this.f22214b = wallettransaction;
        this.f22218n = strArr;
        this.h = zArr;
        this.f22219r = bArr;
    }
}
