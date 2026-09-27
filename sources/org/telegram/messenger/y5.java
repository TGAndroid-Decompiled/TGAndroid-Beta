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
import org.telegram.ui.fx0;
import org.telegram.ui.jn0;
public final class y5 implements Runnable {
    public final int f18175a = 0;
    public final Object f18176b;
    public final int f18177c;
    public final Object d;
    public final Object e;
    public final Object f18178f;
    public final Object h;
    public final Object f18179n;
    public final Object f18180r;

    public y5(int i10, File file, String str, org.telegram.ui.ActionBar.c2 c2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f18177c = i10;
        this.f18178f = file;
        this.d = str;
        this.f18176b = c2Var;
        this.h = zArr;
        this.e = str2;
        this.f18180r = callback;
        this.f18179n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f18175a;
        int i11 = this.f18177c;
        Object obj = this.f18180r;
        Object obj2 = this.f18179n;
        Object obj3 = this.h;
        Object obj4 = this.f18176b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f18178f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f18177c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.c2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f31077x;
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    jn0 jn0Var = new jn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    jn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, jn0Var);
                    } else {
                        externalActionActivity.f31081c.c(-1, jn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f31081c.c0();
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
                fx0 fx0Var = (fx0) obj4;
                c5.f fVar = (c5.f) obj3;
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
                    of.b bVar = new of.b(7, false);
                    bVar.U(BillingController.PREMIUM_PRODUCT_DETAILS);
                    fx0Var.a();
                    String str3 = fx0Var.f33653g.f3907a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f15733c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.B()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.e5.f0(i11, tL_error, o2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public y5(TLObject tLObject, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, fx0 fx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18178f = tLObject;
        this.d = o2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f18176b = fx0Var;
        this.h = fVar;
        this.f18177c = i10;
        this.f18179n = tL_error;
        this.f18180r = tL_payments_canPurchaseStore;
    }

    public y5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f18178f = externalActionActivity;
        this.f18176b = c2Var;
        this.h = tLObject;
        this.f18177c = i10;
        this.f18179n = authorizationform;
        this.f18180r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }
}
