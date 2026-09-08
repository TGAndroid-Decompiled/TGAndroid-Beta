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
import org.telegram.ui.lx0;
import org.telegram.ui.pn0;
public final class y5 implements Runnable {
    public final int f19698a = 0;
    public final Object f19699b;
    public final int f19700c;
    public final Object d;
    public final Object f19701e;
    public final Object f19702f;
    public final Object h;
    public final Object f19703n;
    public final Object f19704r;

    public y5(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f19700c = i10;
        this.f19702f = file;
        this.d = str;
        this.f19699b = b2Var;
        this.h = zArr;
        this.f19701e = str2;
        this.f19704r = callback;
        this.f19703n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f19698a;
        int i11 = this.f19700c;
        Object obj = this.f19704r;
        Object obj2 = this.f19703n;
        Object obj3 = this.h;
        Object obj4 = this.f19699b;
        Object obj5 = this.f19701e;
        Object obj6 = this.d;
        Object obj7 = this.f19702f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f19700c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33422x;
                try {
                    b2Var.dismiss();
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
                        externalActionActivity.f33426c.c(-1, pn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f33427e.setVisibility(8);
                    }
                    externalActionActivity.f33426c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                lx0 lx0Var = (lx0) obj4;
                c5.f fVar = (c5.f) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
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
                    pf.b bVar = new pf.b(7, false);
                    bVar.i0(BillingController.PREMIUM_PRODUCT_DETAILS);
                    lx0Var.a();
                    String str3 = lx0Var.f38540g.f4445a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f44074c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.w()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.e5.f0(i11, tL_error, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public y5(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, lx0 lx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f19702f = tLObject;
        this.d = n2Var;
        this.f19701e = tL_inputStorePaymentPremiumSubscription;
        this.f19699b = lx0Var;
        this.h = fVar;
        this.f19700c = i10;
        this.f19703n = tL_error;
        this.f19704r = tL_payments_canPurchaseStore;
    }

    public y5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f19702f = externalActionActivity;
        this.f19699b = b2Var;
        this.h = tLObject;
        this.f19700c = i10;
        this.f19703n = authorizationform;
        this.f19704r = getauthorizationform;
        this.d = str;
        this.f19701e = str2;
    }
}
