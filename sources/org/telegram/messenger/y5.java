package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.cx0;
import org.telegram.ui.gn0;
public final class y5 implements Runnable {
    public final int f18181a = 0;
    public final Object f18182b;
    public final int f18183c;
    public final Object d;
    public final Object e;
    public final Object f18184f;
    public final Object h;
    public final Object f18185n;
    public final Object f18186r;

    public y5(int i10, File file, String str, org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f18183c = i10;
        this.f18184f = file;
        this.d = str;
        this.f18182b = a2Var;
        this.h = zArr;
        this.e = str2;
        this.f18186r = callback;
        this.f18185n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f18181a;
        int i11 = this.f18183c;
        Object obj = this.f18186r;
        Object obj2 = this.f18185n;
        Object obj3 = this.h;
        Object obj4 = this.f18182b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f18184f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f18183c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.a2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f31074x;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    gn0 gn0Var = new gn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    gn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, gn0Var);
                    } else {
                        externalActionActivity.f31078c.c(-1, gn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f31078c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                cx0 cx0Var = (cx0) obj4;
                c5.f fVar = (c5.f) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
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
                    of.b bVar = new of.b(7, false);
                    bVar.U(BillingController.PREMIUM_PRODUCT_DETAILS);
                    cx0Var.a();
                    String str3 = cx0Var.f32815g.f3905a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f15694c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.B()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.e5.f0(i11, tL_error, m2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public y5(TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, cx0 cx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18184f = tLObject;
        this.d = m2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f18182b = cx0Var;
        this.h = fVar;
        this.f18183c = i10;
        this.f18185n = tL_error;
        this.f18186r = tL_payments_canPurchaseStore;
    }

    public y5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f18184f = externalActionActivity;
        this.f18182b = a2Var;
        this.h = tLObject;
        this.f18183c = i10;
        this.f18185n = authorizationform;
        this.f18186r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }
}
