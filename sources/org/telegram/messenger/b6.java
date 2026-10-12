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
import org.telegram.ui.nx0;
import org.telegram.ui.pn0;
public final class b6 implements Runnable {
    public final int f17138a = 0;
    public final Object f17139b;
    public final int f17140c;
    public final Object d;
    public final Object f17141e;
    public final Object f17142f;
    public final Object h;
    public final Object f17143n;
    public final Object f17144r;

    public b6(int i10, File file, String str, org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f17140c = i10;
        this.f17142f = file;
        this.d = str;
        this.f17139b = a2Var;
        this.h = zArr;
        this.f17141e = str2;
        this.f17144r = callback;
        this.f17143n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.n h;
        int i10 = this.f17138a;
        int i11 = this.f17140c;
        Object obj = this.f17144r;
        Object obj2 = this.h;
        Object obj3 = this.f17143n;
        Object obj4 = this.f17139b;
        Object obj5 = this.f17141e;
        Object obj6 = this.d;
        Object obj7 = this.f17142f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$51(this.f17140c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.a2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33586x;
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    pn0 pn0Var = new pn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    pn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, pn0Var);
                    } else {
                        externalActionActivity.f33590c.c(-1, pn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f33591e.setVisibility(8);
                    }
                    externalActionActivity.f33590c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                nx0 nx0Var = (nx0) obj4;
                c5.f fVar = (c5.f) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (m2Var != null) {
                        activity = m2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = m2Var.getAccountInstance();
                    pf.b bVar = new pf.b(7, false);
                    bVar.V(BillingController.PREMIUM_PRODUCT_DETAILS);
                    nx0Var.a();
                    String str3 = nx0Var.f40500g.f4273a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f45444c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.G()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.g5.e0(i11, tL_error, m2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f17140c;
                ei.h1 h1Var = new ei.h1(runnableArr, textViewArr, i12, c6Var, 7);
                org.telegram.ui.Wallet.l0 v = org.telegram.ui.Wallet.l0.v(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(v, wallettransaction.peer.address, nftitem, strArr[0], h1Var);
                    v.h0(b0Var);
                    h = new org.telegram.ui.Wallet.n(b0Var, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j3 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = v.h(str4, j3, str5, bArr, h1Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public b6(TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, nx0 nx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f17142f = tLObject;
        this.d = m2Var;
        this.f17141e = tL_inputStorePaymentPremiumSubscription;
        this.f17139b = nx0Var;
        this.h = fVar;
        this.f17140c = i10;
        this.f17143n = tL_error;
        this.f17144r = tL_payments_canPurchaseStore;
    }

    public b6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f17142f = externalActionActivity;
        this.f17139b = a2Var;
        this.h = tLObject;
        this.f17140c = i10;
        this.f17143n = authorizationform;
        this.f17144r = getauthorizationform;
        this.d = str;
        this.f17141e = str2;
    }

    public b6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.c6 c6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f17142f = runnableArr;
        this.d = textViewArr;
        this.f17140c = i10;
        this.f17141e = c6Var;
        this.f17139b = wallettransaction;
        this.f17143n = strArr;
        this.h = zArr;
        this.f17144r = bArr;
    }
}
