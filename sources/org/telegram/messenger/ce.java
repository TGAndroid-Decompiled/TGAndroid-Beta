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
import org.telegram.ui.ws0;
public final class ce implements Runnable {
    public final int f23452a = 0;
    public final int f23453b;
    public final Object f23454c;
    public final Object d;
    public final Object f23455e;
    public final Object f23456f;
    public final Object h;
    public final Object f23457n;
    public final Object f23458r;

    public ce(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, w10 w10Var, boolean[] zArr2) {
        this.f23453b = i7;
        this.f23454c = file;
        this.d = str;
        this.f23456f = t1Var;
        this.h = zArr;
        this.f23455e = str2;
        this.f23458r = w10Var;
        this.f23457n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ce.run():void");
    }

    public ce(TLObject tLObject, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, ws0 ws0Var, com.google.android.gms.internal.clearcut.y0 y0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f23454c = tLObject;
        this.d = g2Var;
        this.f23455e = tL_inputStorePaymentPremiumSubscription;
        this.f23456f = ws0Var;
        this.h = y0Var;
        this.f23453b = i7;
        this.f23457n = tL_error;
        this.f23458r = tL_payments_canPurchaseStore;
    }

    public ce(org.telegram.ui.Components.qf qfVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i7, ji.g gVar) {
        this.f23454c = qfVar;
        this.d = view;
        this.f23455e = frameLayout;
        this.f23456f = layoutParams;
        this.h = arrayList;
        this.f23457n = arrayList2;
        this.f23453b = i7;
        this.f23458r = gVar;
    }

    public ce(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f23454c = externalActionActivity;
        this.f23456f = t1Var;
        this.h = tLObject;
        this.f23453b = i7;
        this.f23457n = authorizationform;
        this.f23458r = getauthorizationform;
        this.d = str;
        this.f23455e = str2;
    }

    public ce(org.telegram.ui.Wallet.s0 s0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.z2 z2Var, org.telegram.ui.Wallet.v0 v0Var) {
        this.f23454c = s0Var;
        this.d = str;
        this.f23456f = bArr;
        this.h = jSONObject;
        this.f23455e = str2;
        this.f23453b = i7;
        this.f23457n = z2Var;
        this.f23458r = v0Var;
    }

    public ce(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f23454c = runnableArr;
        this.d = textViewArr;
        this.f23453b = i7;
        this.f23455e = i6Var;
        this.f23456f = wallettransaction;
        this.f23457n = strArr;
        this.h = zArr;
        this.f23458r = bArr;
    }
}
