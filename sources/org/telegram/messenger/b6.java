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
import org.telegram.ui.an0;
import org.telegram.ui.tw0;
public final class b6 implements Runnable {
    public final int f17995a = 0;
    public final Object f17996b;
    public final int f17997c;
    public final Object d;
    public final Object e;
    public final Object f17998f;
    public final Object h;
    public final Object f17999n;
    public final Object f18000r;

    public b6(int i10, File file, String str, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f17997c = i10;
        this.f17998f = file;
        this.d = str;
        this.f17996b = c2Var;
        this.h = zArr;
        this.e = str2;
        this.f18000r = callback;
        this.f17999n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.m h;
        int i10 = this.f17995a;
        int i11 = this.f17997c;
        Object obj = this.f18000r;
        Object obj2 = this.h;
        Object obj3 = this.f17999n;
        Object obj4 = this.f17996b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f17998f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$53(this.f17997c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.c2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33432x;
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    an0 an0Var = new an0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    an0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, an0Var);
                    } else {
                        externalActionActivity.f33436c.c(-1, an0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f33436c.d0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.d0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                tw0 tw0Var = (tw0) obj4;
                c5.g gVar = (c5.g) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (o2Var != null) {
                        activity = o2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = o2Var.getAccountInstance();
                    n4.s sVar = new n4.s(9, false);
                    sVar.G(BillingController.PREMIUM_PRODUCT_DETAILS);
                    tw0Var.a();
                    String str3 = tw0Var.f42093g.f4776a;
                    if (!TextUtils.isEmpty(str3)) {
                        sVar.f17189c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(sVar.k()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.f5.f0(i11, tL_error, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f17997c;
                ai.u0 u0Var = new ai.u0(runnableArr, textViewArr, i12, g6Var, 9);
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(w9, wallettransaction.peer.address, nftitem, strArr[0], u0Var);
                    w9.j0(b0Var);
                    h = new org.telegram.ui.Wallet.m(b0Var, 1);
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

    public b6(TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, tw0 tw0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f17998f = tLObject;
        this.d = o2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f17996b = tw0Var;
        this.h = gVar;
        this.f17997c = i10;
        this.f17999n = tL_error;
        this.f18000r = tL_payments_canPurchaseStore;
    }

    public b6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f17998f = externalActionActivity;
        this.f17996b = c2Var;
        this.h = tLObject;
        this.f17997c = i10;
        this.f17999n = authorizationform;
        this.f18000r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public b6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.g6 g6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f17998f = runnableArr;
        this.d = textViewArr;
        this.f17997c = i10;
        this.e = g6Var;
        this.f17996b = wallettransaction;
        this.f17999n = strArr;
        this.h = zArr;
        this.f18000r = bArr;
    }
}
