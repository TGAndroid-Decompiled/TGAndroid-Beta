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
import org.telegram.ui.kn0;
public final class y5 implements Runnable {
    public final int f19868a = 0;
    public final Object f19869b;
    public final int f19870c;
    public final Object d;
    public final Object f19871e;
    public final Object f19872f;
    public final Object h;
    public final Object f19873n;
    public final Object f19874r;

    public y5(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f19870c = i10;
        this.f19872f = file;
        this.d = str;
        this.f19869b = b2Var;
        this.h = zArr;
        this.f19871e = str2;
        this.f19874r = callback;
        this.f19873n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        int i10 = this.f19868a;
        int i11 = this.f19870c;
        Object obj = this.f19874r;
        Object obj2 = this.f19873n;
        Object obj3 = this.h;
        Object obj4 = this.f19869b;
        Object obj5 = this.f19871e;
        Object obj6 = this.d;
        Object obj7 = this.f19872f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$50(this.f19870c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj3, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj2);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj3;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj2;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33740x;
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    kn0 kn0Var = new kn0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    kn0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, kn0Var);
                    } else {
                        externalActionActivity.f33744c.c(-1, kn0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.f33745e.setVisibility(8);
                    }
                    externalActionActivity.f33744c.c0();
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
                fx0 fx0Var = (fx0) obj4;
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
                    of.b bVar = new of.b(7, false);
                    bVar.O(BillingController.PREMIUM_PRODUCT_DETAILS);
                    fx0Var.a();
                    String str3 = fx0Var.f36427g.f4224a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f17159c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.s()), fVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.e5.f0(i11, tL_error, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
        }
    }

    public y5(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, fx0 fx0Var, c5.f fVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f19872f = tLObject;
        this.d = n2Var;
        this.f19871e = tL_inputStorePaymentPremiumSubscription;
        this.f19869b = fx0Var;
        this.h = fVar;
        this.f19870c = i10;
        this.f19873n = tL_error;
        this.f19874r = tL_payments_canPurchaseStore;
    }

    public y5(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f19872f = externalActionActivity;
        this.f19869b = b2Var;
        this.h = tLObject;
        this.f19870c = i10;
        this.f19873n = authorizationform;
        this.f19874r = getauthorizationform;
        this.d = str;
        this.f19871e = str2;
    }
}
