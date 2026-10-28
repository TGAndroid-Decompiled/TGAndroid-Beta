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
import org.telegram.ui.kn0;
import org.telegram.ui.zw0;
public final class e6 implements Runnable {
    public final int f19962a = 0;
    public final Object f19963b;
    public final int f19964c;
    public final Object d;
    public final Object e;
    public final Object f19965f;
    public final Object h;
    public final Object f19966n;
    public final Object f19967r;

    public e6(int i10, File file, String str, org.telegram.ui.ActionBar.e2 e2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f19964c = i10;
        this.f19965f = file;
        this.d = str;
        this.f19963b = e2Var;
        this.h = zArr;
        this.e = str2;
        this.f19967r = callback;
        this.f19966n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.m i10;
        int i11 = this.f19962a;
        int i12 = this.f19964c;
        Object obj = this.f19967r;
        Object obj2 = this.h;
        Object obj3 = this.f19966n;
        Object obj4 = this.f19963b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f19965f;
        switch (i11) {
            case 0:
                MediaController.lambda$saveFile$53(this.f19964c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.e2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f35522x;
                try {
                    e2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i12).putUsers(authorizationform.users, false);
                    kn0 kn0Var = new kn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    kn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, kn0Var);
                    } else {
                        externalActionActivity.f35526c.c(-1, kn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f35526c.e0();
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
                zw0 zw0Var = (zw0) obj4;
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
                    zw0Var.a();
                    String str3 = zw0Var.f46399g.f7997a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f47371c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.E()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.g5.e0(i12, tL_error, r2Var, tL_payments_canPurchaseStore, new Object[0]);
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
                int i13 = this.f19964c;
                bi.v0 v0Var = new bi.v0(runnableArr, textViewArr, i13, u6Var, 10);
                org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i13);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(x9, wallettransaction.peer.address, nftitem, strArr[0], v0Var);
                    x9.m0(b0Var);
                    i10 = new org.telegram.ui.Wallet.m(b0Var, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    i10 = x9.i(str4, j10, str5, bArr, v0Var);
                }
                runnableArr[0] = i10;
                return;
        }
    }

    public e6(TLObject tLObject, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, zw0 zw0Var, d5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f19965f = tLObject;
        this.d = r2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f19963b = zw0Var;
        this.h = gVar;
        this.f19964c = i10;
        this.f19966n = tL_error;
        this.f19967r = tL_payments_canPurchaseStore;
    }

    public e6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f19965f = externalActionActivity;
        this.f19963b = e2Var;
        this.h = tLObject;
        this.f19964c = i10;
        this.f19966n = authorizationform;
        this.f19967r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public e6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.u6 u6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f19965f = runnableArr;
        this.d = textViewArr;
        this.f19964c = i10;
        this.e = u6Var;
        this.f19963b = wallettransaction;
        this.f19966n = strArr;
        this.h = zArr;
        this.f19967r = bArr;
    }
}
