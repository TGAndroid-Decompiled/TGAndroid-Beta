package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rw0;
import org.telegram.ui.xm0;
public final class a6 implements Runnable {
    public final int f17835a = 0;
    public final Object f17836b;
    public final int f17837c;
    public final Object d;
    public final Object e;
    public final Object f17838f;
    public final Object h;
    public final Object f17839n;
    public final Object f17840r;

    public a6(int i10, File file, String str, org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f17837c = i10;
        this.f17838f = file;
        this.d = str;
        this.f17836b = b2Var;
        this.h = zArr;
        this.e = str2;
        this.f17840r = callback;
        this.f17839n = zArr2;
    }

    @Override
    public final void run() {
        String str;
        Activity activity;
        byte[] bArr;
        org.telegram.ui.Wallet.n h;
        int i10 = this.f17835a;
        int i11 = this.f17837c;
        Object obj = this.f17840r;
        Object obj2 = this.h;
        Object obj3 = this.f17839n;
        Object obj4 = this.f17836b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f17838f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$51(this.f17837c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.b2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f33118x;
                try {
                    b2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    xm0 xm0Var = new xm0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, (String) null, authorizationform, (TL_account.Password) tLObject);
                    xm0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, xm0Var);
                    } else {
                        externalActionActivity.f33122c.c(-1, xm0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f33122c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                TLObject tLObject2 = (TLObject) obj4;
                pf.c cVar = (pf.c) obj2;
                String str4 = (String) obj6;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                MessagesController messagesController = (MessagesController) obj;
                String str5 = (String) obj5;
                Pattern pattern = LaunchActivity.C1;
                if (!(tLObject2 instanceof TLRPC.User)) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    StringBuilder v = a1.g.v("cant import contact token. token=", str4, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    v.append(str);
                    FileLog.e(v.toString());
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        wh.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0(R), null);
                        return;
                    }
                    return;
                }
                TLRPC.User user = (TLRPC.User) tLObject2;
                messagesController.putUser(user, false);
                if (UserObject.isUserSelf(user)) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    launchActivity.m0(null, user.f20419id);
                    return;
                }
                launchActivity.Z(i11, user, str5, cVar);
                return;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                rw0 rw0Var = (rw0) obj4;
                c5.g gVar = (c5.g) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
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
                    n4.s sVar = new n4.s(9, false);
                    sVar.K(BillingController.PREMIUM_PRODUCT_DETAILS);
                    rw0Var.a();
                    String str6 = rw0Var.f40826g.f4771a;
                    if (!TextUtils.isEmpty(str6)) {
                        sVar.f17122c = str6;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(sVar.j()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.f5.e0(i11, tL_error2, n2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr2 = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f17837c;
                ai.u0 u0Var = new ai.u0(runnableArr, textViewArr, i12, d6Var, 9);
                org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.c0 c0Var = new org.telegram.ui.Wallet.c0(w9, wallettransaction.peer.address, nftitem, strArr[0], u0Var);
                    w9.j0(c0Var);
                    h = new org.telegram.ui.Wallet.n(c0Var, 1);
                } else {
                    String str7 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str8 = strArr[0];
                    if (zArr[0]) {
                        bArr = bArr2;
                    } else {
                        bArr = null;
                    }
                    h = w9.h(str7, j10, str8, bArr, u0Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public a6(TLObject tLObject, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, rw0 rw0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f17838f = tLObject;
        this.d = n2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f17836b = rw0Var;
        this.h = gVar;
        this.f17837c = i10;
        this.f17839n = tL_error;
        this.f17840r = tL_payments_canPurchaseStore;
    }

    public a6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f17838f = externalActionActivity;
        this.f17836b = b2Var;
        this.h = tLObject;
        this.f17837c = i10;
        this.f17839n = authorizationform;
        this.f17840r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public a6(LaunchActivity launchActivity, TLObject tLObject, pf.c cVar, String str, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str2) {
        this.f17838f = launchActivity;
        this.f17836b = tLObject;
        this.h = cVar;
        this.d = str;
        this.f17839n = tL_error;
        this.f17840r = messagesController;
        this.f17837c = i10;
        this.e = str2;
    }

    public a6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.d6 d6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f17838f = runnableArr;
        this.d = textViewArr;
        this.f17837c = i10;
        this.e = d6Var;
        this.f17836b = wallettransaction;
        this.f17839n = strArr;
        this.h = zArr;
        this.f17840r = bArr;
    }
}
