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
import org.telegram.ui.in0;
import org.telegram.ui.xw0;
public final class d6 implements Runnable {
    public final int f19874a = 0;
    public final Object f19875b;
    public final int f19876c;
    public final Object d;
    public final Object e;
    public final Object f19877f;
    public final Object h;
    public final Object f19878n;
    public final Object f19879r;

    public d6(int i10, File file, String str, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f19876c = i10;
        this.f19877f = file;
        this.d = str;
        this.f19875b = e2Var;
        this.h = zArr;
        this.e = str2;
        this.f19879r = callback;
        this.f19878n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.m h;
        int i10 = this.f19874a;
        int i11 = this.f19876c;
        Object obj = this.f19879r;
        Object obj2 = this.h;
        Object obj3 = this.f19878n;
        Object obj4 = this.f19875b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f19877f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$53(this.f19876c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.e2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f35498x;
                try {
                    e2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    in0 in0Var = new in0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    in0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, in0Var);
                    } else {
                        externalActionActivity.f35502c.c(-1, in0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f35502c.e0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.e0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                xw0 xw0Var = (xw0) obj4;
                d5.g gVar = (d5.g) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (r2Var != null) {
                        activity = r2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = r2Var.getAccountInstance();
                    rf.b bVar = new rf.b(13, false);
                    bVar.R(BillingController.PREMIUM_PRODUCT_DETAILS);
                    xw0Var.a();
                    String str3 = xw0Var.f45895g.f7997a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f47336c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.E()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.g5.e0(i11, tL_error, r2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f19876c;
                bi.v0 v0Var = new bi.v0(runnableArr, textViewArr, i12, u6Var, 10);
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(w10, wallettransaction.peer.address, nftitem, strArr[0], v0Var);
                    w10.j0(b0Var);
                    h = new org.telegram.ui.Wallet.m(b0Var, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = w10.h(str4, j10, str5, bArr, v0Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public d6(TLObject tLObject, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, xw0 xw0Var, d5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f19877f = tLObject;
        this.d = r2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f19875b = xw0Var;
        this.h = gVar;
        this.f19876c = i10;
        this.f19878n = tL_error;
        this.f19879r = tL_payments_canPurchaseStore;
    }

    public d6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f19877f = externalActionActivity;
        this.f19875b = e2Var;
        this.h = tLObject;
        this.f19876c = i10;
        this.f19878n = authorizationform;
        this.f19879r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public d6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.u6 u6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f19877f = runnableArr;
        this.d = textViewArr;
        this.f19876c = i10;
        this.e = u6Var;
        this.f19875b = wallettransaction;
        this.f19878n = strArr;
        this.h = zArr;
        this.f19879r = bArr;
    }
}
