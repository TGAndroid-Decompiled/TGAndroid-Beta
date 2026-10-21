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
import org.telegram.ui.pw0;
import org.telegram.ui.vm0;
public final class c6 implements Runnable {
    public final int f18022a = 0;
    public final Object f18023b;
    public final int f18024c;
    public final Object d;
    public final Object e;
    public final Object f18025f;
    public final Object h;
    public final Object f18026n;
    public final Object f18027r;

    public c6(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f18024c = i10;
        this.f18025f = file;
        this.d = str;
        this.f18023b = b2Var;
        this.h = zArr;
        this.e = str2;
        this.f18027r = callback;
        this.f18026n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.n h;
        int i10 = this.f18022a;
        int i11 = this.f18024c;
        Object obj = this.f18027r;
        Object obj2 = this.h;
        Object obj3 = this.f18026n;
        Object obj4 = this.f18023b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f18025f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$51(this.f18024c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33131x;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    vm0 vm0Var = new vm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    vm0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, vm0Var);
                    } else {
                        externalActionActivity.f33135c.c(-1, vm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f33135c.c0();
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
                pw0 pw0Var = (pw0) obj4;
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
                    sVar.G(BillingController.PREMIUM_PRODUCT_DETAILS);
                    pw0Var.a();
                    String str3 = pw0Var.f40312g.f4771a;
                    if (!TextUtils.isEmpty(str3)) {
                        sVar.f17126c = str3;
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
                int i12 = this.f18024c;
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

    public c6(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, pw0 pw0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18025f = tLObject;
        this.d = n2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f18023b = pw0Var;
        this.h = gVar;
        this.f18024c = i10;
        this.f18026n = tL_error;
        this.f18027r = tL_payments_canPurchaseStore;
    }

    public c6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f18025f = externalActionActivity;
        this.f18023b = b2Var;
        this.h = tLObject;
        this.f18024c = i10;
        this.f18026n = authorizationform;
        this.f18027r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public c6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.d6 d6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f18025f = runnableArr;
        this.d = textViewArr;
        this.f18024c = i10;
        this.e = d6Var;
        this.f18023b = wallettransaction;
        this.f18026n = strArr;
        this.h = zArr;
        this.f18027r = bArr;
    }
}
