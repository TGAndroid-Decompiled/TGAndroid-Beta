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
import org.telegram.ui.fn0;
import org.telegram.ui.sw0;
public final class a6 implements Runnable {
    public final int f18109a = 0;
    public final Object f18110b;
    public final int f18111c;
    public final Object d;
    public final Object f18112e;
    public final Object f18113f;
    public final Object h;
    public final Object f18114n;
    public final Object f18115r;

    public a6(int i10, File file, String str, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f18111c = i10;
        this.f18113f = file;
        this.d = str;
        this.f18110b = d2Var;
        this.h = zArr;
        this.f18112e = str2;
        this.f18115r = callback;
        this.f18114n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f18109a;
        int i11 = this.f18111c;
        Object obj = this.f18115r;
        Object obj2 = this.f18114n;
        Object obj3 = this.h;
        Object obj4 = this.f18110b;
        Object obj5 = this.f18112e;
        Object obj6 = this.d;
        Object obj7 = this.f18113f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f18111c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.d2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f34106x;
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    fn0 fn0Var = new fn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    fn0Var.f36977z1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, fn0Var);
                    } else {
                        externalActionActivity.f34110c.c(-1, fn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f34111e.setVisibility(8);
                    }
                    externalActionActivity.f34110c.c0();
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
                sw0 sw0Var = (sw0) obj4;
                p2.e eVar = (p2.e) obj3;
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
                    n7.qa qaVar = new n7.qa(23);
                    qaVar.i1(BillingController.PREMIUM_PRODUCT_DETAILS);
                    sw0Var.a();
                    String str3 = sw0Var.f41386g.f44157a;
                    if (!TextUtils.isEmpty(str3)) {
                        qaVar.f15700c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(qaVar.O0()), eVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.z4.f0(i11, tL_error, p2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public a6(TLObject tLObject, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, sw0 sw0Var, p2.e eVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f18113f = tLObject;
        this.d = p2Var;
        this.f18112e = tL_inputStorePaymentPremiumSubscription;
        this.f18110b = sw0Var;
        this.h = eVar;
        this.f18111c = i10;
        this.f18114n = tL_error;
        this.f18115r = tL_payments_canPurchaseStore;
    }

    public a6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f18113f = externalActionActivity;
        this.f18110b = d2Var;
        this.h = tLObject;
        this.f18111c = i10;
        this.f18114n = authorizationform;
        this.f18115r = getauthorizationform;
        this.d = str;
        this.f18112e = str2;
    }
}
