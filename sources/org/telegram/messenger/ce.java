package org.telegram.messenger;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.xs0;
public final class ce implements Runnable {
    public final int f23365a = 0;
    public final int f23366b;
    public final Object f23367c;
    public final Object d;
    public final Object f23368e;
    public final Object f23369f;
    public final Object h;
    public final Object f23370n;
    public final Object f23371r;

    public ce(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, x10 x10Var, boolean[] zArr2) {
        this.f23366b = i7;
        this.f23367c = file;
        this.d = str;
        this.f23369f = t1Var;
        this.h = zArr;
        this.f23368e = str2;
        this.f23371r = x10Var;
        this.f23370n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ce.run():void");
    }

    public ce(TLObject tLObject, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, xs0 xs0Var, com.google.android.gms.internal.clearcut.y0 y0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f23367c = tLObject;
        this.d = g2Var;
        this.f23368e = tL_inputStorePaymentPremiumSubscription;
        this.f23369f = xs0Var;
        this.h = y0Var;
        this.f23366b = i7;
        this.f23370n = tL_error;
        this.f23371r = tL_payments_canPurchaseStore;
    }

    public ce(org.telegram.ui.Components.rf rfVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f23367c = rfVar;
        this.d = view;
        this.f23368e = frameLayout;
        this.f23369f = layoutParams;
        this.h = arrayList;
        this.f23370n = arrayList2;
        this.f23366b = i7;
        this.f23371r = fVar;
    }

    public ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f23367c = externalActionActivity;
        this.f23369f = t1Var;
        this.h = tLObject;
        this.f23366b = i7;
        this.f23370n = authorizationform;
        this.f23371r = getauthorizationform;
        this.d = str;
        this.f23368e = str2;
    }

    public ce(org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var) {
        this.f23367c = r0Var;
        this.d = str;
        this.f23369f = bArr;
        this.h = jSONObject;
        this.f23368e = str2;
        this.f23366b = i7;
        this.f23370n = y2Var;
        this.f23371r = u0Var;
    }

    public ce(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f23367c = runnableArr;
        this.d = textViewArr;
        this.f23366b = i7;
        this.f23368e = h6Var;
        this.f23369f = wallettransaction;
        this.f23370n = strArr;
        this.h = zArr;
        this.f23371r = bArr;
    }
}
