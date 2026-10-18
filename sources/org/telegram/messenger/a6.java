package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.rw0;
import org.telegram.ui.xm0;
public final class a6 implements Runnable {
    public final int f17844a = 0;
    public final Object f17845b;
    public final int f17846c;
    public final Object d;
    public final Object e;
    public final Object f17847f;
    public final Object h;
    public final Object f17848n;
    public final Object f17849r;

    public a6(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f17846c = i10;
        this.f17847f = file;
        this.d = str;
        this.f17845b = b2Var;
        this.h = zArr;
        this.e = str2;
        this.f17849r = callback;
        this.f17848n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.n h;
        int i10 = this.f17844a;
        int i11 = this.f17846c;
        Object obj = this.f17849r;
        Object obj2 = this.h;
        Object obj3 = this.f17848n;
        Object obj4 = this.f17845b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f17847f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$51(this.f17846c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33125x;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    xm0 xm0Var = new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    xm0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, xm0Var);
                    } else {
                        externalActionActivity.f33129c.c(-1, xm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f33129c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                rw0 rw0Var = (rw0) obj4;
                c5.g gVar = (c5.g) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (n2Var != null) {
                        activity = n2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = n2Var.getAccountInstance();
                    n4.s sVar = new n4.s(9, false);
                    sVar.K(BillingController.PREMIUM_PRODUCT_DETAILS);
                    rw0Var.a();
                    String str3 = rw0Var.f40847g.f4772a;
                    if (!TextUtils.isEmpty(str3)) {
                        sVar.f17129c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(sVar.k()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.f5.e0(i11, tL_error, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f17846c;
                ai.u0 u0Var = new ai.u0(runnableArr, textViewArr, i12, d6Var, 9);
                org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.c0 c0Var = new org.telegram.ui.Wallet.c0(w9, wallettransaction.peer.address, nftitem, strArr[0], u0Var);
                    w9.j0(c0Var);
                    h = new org.telegram.ui.Wallet.n(c0Var, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = w9.h(str4, j10, str5, bArr, u0Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public a6(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, rw0 rw0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f17847f = tLObject;
        this.d = n2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f17845b = rw0Var;
        this.h = gVar;
        this.f17846c = i10;
        this.f17848n = tL_error;
        this.f17849r = tL_payments_canPurchaseStore;
    }

    public a6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f17847f = externalActionActivity;
        this.f17845b = b2Var;
        this.h = tLObject;
        this.f17846c = i10;
        this.f17848n = authorizationform;
        this.f17849r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public a6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.d6 d6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f17847f = runnableArr;
        this.d = textViewArr;
        this.f17846c = i10;
        this.e = d6Var;
        this.f17845b = wallettransaction;
        this.f17848n = strArr;
        this.h = zArr;
        this.f17849r = bArr;
    }
}
