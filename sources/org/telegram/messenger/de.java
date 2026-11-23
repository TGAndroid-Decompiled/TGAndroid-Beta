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
public final class de implements Runnable {
    public final int f23538a = 0;
    public final int f23539b;
    public final Object f23540c;
    public final Object d;
    public final Object f23541e;
    public final Object f23542f;
    public final Object h;
    public final Object f23543n;
    public final Object f23544r;

    public de(int i7, File file, String str, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr, String str2, y10 y10Var, boolean[] zArr2) {
        this.f23539b = i7;
        this.f23540c = file;
        this.d = str;
        this.f23542f = t1Var;
        this.h = zArr;
        this.f23541e = str2;
        this.f23544r = y10Var;
        this.f23543n = zArr2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.de.run():void");
    }

    public de(TLObject tLObject, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, xs0 xs0Var, com.google.android.gms.internal.clearcut.y0 y0Var, int i7, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f23540c = tLObject;
        this.d = g2Var;
        this.f23541e = tL_inputStorePaymentPremiumSubscription;
        this.f23542f = xs0Var;
        this.h = y0Var;
        this.f23539b = i7;
        this.f23543n = tL_error;
        this.f23544r = tL_payments_canPurchaseStore;
    }

    public de(org.telegram.ui.Components.rf rfVar, View view, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f23540c = rfVar;
        this.d = view;
        this.f23541e = frameLayout;
        this.f23542f = layoutParams;
        this.h = arrayList;
        this.f23543n = arrayList2;
        this.f23539b = i7;
        this.f23544r = fVar;
    }

    public de(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.t1 t1Var, TLObject tLObject, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f23540c = externalActionActivity;
        this.f23542f = t1Var;
        this.h = tLObject;
        this.f23539b = i7;
        this.f23543n = authorizationform;
        this.f23544r = getauthorizationform;
        this.d = str;
        this.f23541e = str2;
    }

    public de(org.telegram.ui.Wallet.r0 r0Var, String str, byte[] bArr, JSONObject jSONObject, String str2, int i7, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.Wallet.u0 u0Var) {
        this.f23540c = r0Var;
        this.d = str;
        this.f23542f = bArr;
        this.h = jSONObject;
        this.f23541e = str2;
        this.f23539b = i7;
        this.f23543n = y2Var;
        this.f23544r = u0Var;
    }

    public de(Runnable[] runnableArr, TextView[] textViewArr, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f23540c = runnableArr;
        this.d = textViewArr;
        this.f23539b = i7;
        this.f23541e = h6Var;
        this.f23542f = wallettransaction;
        this.f23543n = strArr;
        this.h = zArr;
        this.f23544r = bArr;
    }
}
