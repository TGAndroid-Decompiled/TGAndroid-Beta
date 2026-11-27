package defpackage;

import android.widget.TextView;
import java.io.File;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.Wallet.c;
public final class a84 implements Runnable {
    public final byte a = 2;
    public final Object b;
    public final Object c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public a84(int i, File file, String str, id idVar, boolean[] zArr, String str2, pcc pccVar, boolean[] zArr2) {
        this.d = i;
        this.e = file;
        this.b = str;
        this.f = idVar;
        this.h = zArr;
        this.c = str2;
        this.n = pccVar;
        this.r = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a84.run():void");
    }

    public a84(c35 c35Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i, n55 n55Var, c cVar) {
        this.e = c35Var;
        this.b = str;
        this.f = bArr;
        this.h = jSONObject;
        this.c = str2;
        this.d = i;
        this.n = n55Var;
        this.r = cVar;
    }

    public a84(TLObject tLObject, e eVar, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, tl8 tl8Var, ekd ekdVar, int i, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.h = tLObject;
        this.e = eVar;
        this.f = tL_inputStorePaymentPremiumSubscription;
        this.n = tl8Var;
        this.r = ekdVar;
        this.d = i;
        this.b = tL_error;
        this.c = tL_payments_canPurchaseStore;
    }

    public a84(ExternalActionActivity externalActionActivity, id idVar, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.e = externalActionActivity;
        this.f = idVar;
        this.h = tLObject;
        this.d = i;
        this.n = authorizationform;
        this.r = getauthorizationform;
        this.b = str;
        this.c = str2;
    }

    public a84(Runnable[] runnableArr, TextView[] textViewArr, int i, vnb vnbVar, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.e = runnableArr;
        this.f = textViewArr;
        this.d = i;
        this.h = vnbVar;
        this.n = wallettransaction;
        this.r = strArr;
        this.b = zArr;
        this.c = bArr;
    }
}
