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
import org.telegram.ui.nx0;
import org.telegram.ui.on0;
public final class e6 implements Runnable {
    public final int f15051a = 0;
    public final Object f15052b;
    public final int f15053c;
    public final Object d;
    public final Object e;
    public final Object f15054f;
    public final Object h;
    public final Object f15055n;
    public final Object f15056r;

    public e6(int i10, File file, String str, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f15053c = i10;
        this.f15054f = file;
        this.d = str;
        this.f15052b = d2Var;
        this.h = zArr;
        this.e = str2;
        this.f15056r = callback;
        this.f15055n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f15051a;
        int i11 = this.f15053c;
        Object obj = this.f15056r;
        Object obj2 = this.f15055n;
        Object obj3 = this.h;
        Object obj4 = this.f15052b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f15054f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f15053c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.d2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f29902x;
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    on0 on0Var = new on0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    on0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, on0Var);
                    } else {
                        externalActionActivity.f29906c.c(-1, on0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f29906c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                nx0 nx0Var = (nx0) obj4;
                c5.f fVar = (c5.f) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                if (((TLObject) obj7) instanceof TLRPC.TL_boolTrue) {
                    if (p2Var != null) {
                        activity = p2Var.getParentActivity();
                    } else {
                        activity = AndroidUtilities.getActivity();
                    }
                    Activity activity2 = activity;
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = p2Var.getAccountInstance();
                    n4.y yVar = new n4.y(7, false);
                    yVar.z(BillingController.PREMIUM_PRODUCT_DETAILS);
                    nx0Var.a();
                    String str3 = nx0Var.f35356g.f4327a;
                    if (!TextUtils.isEmpty(str3)) {
                        yVar.f13825c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(yVar.d()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.d5.f0(i11, tL_error, p2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public e6(TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, nx0 nx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f15054f = tLObject;
        this.d = p2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f15052b = nx0Var;
        this.h = fVar;
        this.f15053c = i10;
        this.f15055n = tL_error;
        this.f15056r = tL_payments_canPurchaseStore;
    }

    public e6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f15054f = externalActionActivity;
        this.f15052b = d2Var;
        this.h = tLObject;
        this.f15053c = i10;
        this.f15055n = authorizationform;
        this.f15056r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }
}
