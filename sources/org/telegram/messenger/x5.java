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
import org.telegram.ui.hw0;
import org.telegram.ui.wm0;
public final class x5 implements Runnable {
    public final int f22089a = 0;
    public final Object f22090b;
    public final int f22091c;
    public final Object d;
    public final Object f22092e;
    public final Object f22093f;
    public final Object h;
    public final Object f22094n;
    public final Object f22095r;

    public x5(int i9, File file, String str, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f22091c = i9;
        this.f22093f = file;
        this.d = str;
        this.f22090b = c2Var;
        this.h = zArr;
        this.f22092e = str2;
        this.f22095r = callback;
        this.f22094n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i9 = this.f22089a;
        int i10 = this.f22091c;
        Object obj = this.f22095r;
        Object obj2 = this.f22094n;
        Object obj3 = this.h;
        Object obj4 = this.f22090b;
        Object obj5 = this.f22092e;
        Object obj6 = this.d;
        Object obj7 = this.f22093f;
        switch (i9) {
            case 0:
                MediaController.lambda$saveFile$50(this.f22091c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.c2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f35465x;
                try {
                    c2Var.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i10).putUsers(authorizationform.users, false);
                    wm0 wm0Var = new wm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    wm0Var.f44206y1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, wm0Var);
                    } else {
                        externalActionActivity.f35469c.c(-1, wm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f35470e.setVisibility(8);
                    }
                    externalActionActivity.f35469c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                hw0 hw0Var = (hw0) obj4;
                n2.e eVar = (n2.e) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
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
                    g5.b bVar = new g5.b(23);
                    bVar.t(BillingController.PREMIUM_PRODUCT_DETAILS);
                    hw0Var.a();
                    String str3 = hw0Var.f38948g.f18331a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f7112c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.h()), eVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.y4.f0(i10, tL_error, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public x5(TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, hw0 hw0Var, n2.e eVar, int i9, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f22093f = tLObject;
        this.d = o2Var;
        this.f22092e = tL_inputStorePaymentPremiumSubscription;
        this.f22090b = hw0Var;
        this.h = eVar;
        this.f22091c = i9;
        this.f22094n = tL_error;
        this.f22095r = tL_payments_canPurchaseStore;
    }

    public x5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i9, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f22093f = externalActionActivity;
        this.f22090b = c2Var;
        this.h = tLObject;
        this.f22091c = i9;
        this.f22094n = authorizationform;
        this.f22095r = getauthorizationform;
        this.d = str;
        this.f22092e = str2;
    }
}
