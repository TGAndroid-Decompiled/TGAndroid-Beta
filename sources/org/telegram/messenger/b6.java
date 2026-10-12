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
import org.telegram.ui.rx0;
import org.telegram.ui.un0;
public final class b6 implements Runnable {
    public final int f16840a = 0;
    public final Object f16841b;
    public final int f16842c;
    public final Object d;
    public final Object e;
    public final Object f16843f;
    public final Object h;
    public final Object f16844n;
    public final Object f16845r;

    public b6(int i10, File file, String str, org.telegram.ui.ActionBar.a2 a2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        this.f16842c = i10;
        this.f16843f = file;
        this.d = str;
        this.f16841b = a2Var;
        this.h = zArr;
        this.e = str2;
        this.f16845r = callback;
        this.f16844n = zArr2;
    }

    @Override
    public final void run() {
        Activity activity;
        org.telegram.ui.Wallet.m h;
        int i10 = this.f16840a;
        int i11 = this.f16842c;
        Object obj = this.f16845r;
        Object obj2 = this.h;
        Object obj3 = this.f16844n;
        Object obj4 = this.f16841b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f16843f;
        switch (i10) {
            case 0:
                MediaController.lambda$saveFile$51(this.f16842c, (File) obj7, (String) obj6, (org.telegram.ui.ActionBar.a2) obj4, (boolean[]) obj2, (String) obj5, (Utilities.Callback) obj, (boolean[]) obj3);
                return;
            case 1:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) obj7;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj4;
                TLObject tLObject = (TLObject) obj2;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj3;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj;
                String str = (String) obj6;
                String str2 = (String) obj5;
                ArrayList arrayList = ExternalActionActivity.f32078x;
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject != null) {
                    MessagesController.getInstance(i11).putUsers(authorizationform.users, false);
                    un0 un0Var = new un0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, (String) null, authorizationform, (TL_account.Password) tLObject);
                    un0Var.C1 = true;
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c(-1, un0Var);
                    } else {
                        externalActionActivity.f32082c.c(-1, un0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        externalActionActivity.e.setVisibility(8);
                    }
                    externalActionActivity.f32082c.c0();
                    if (AndroidUtilities.isTablet()) {
                        externalActionActivity.d.c0();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj6;
                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = (TLRPC.TL_inputStorePaymentPremiumSubscription) obj5;
                rx0 rx0Var = (rx0) obj4;
                c5.g gVar = (c5.g) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
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
                    qf.b bVar = new qf.b(9);
                    bVar.e0(BillingController.PREMIUM_PRODUCT_DETAILS);
                    rx0Var.a();
                    String str3 = rx0Var.f39889g.f4400a;
                    if (!TextUtils.isEmpty(str3)) {
                        bVar.f43356c = str3;
                        billingController.launchBillingFlow(activity2, accountInstance, tL_inputStorePaymentPremiumSubscription, Collections.singletonList(bVar.w()), gVar, false);
                        return;
                    }
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                org.telegram.ui.Components.g5.e0(i11, tL_error, m2Var, tL_payments_canPurchaseStore, new Object[0]);
                return;
            default:
                Runnable[] runnableArr = (Runnable[]) obj7;
                TextView[] textViewArr = (TextView[]) obj6;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj5;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                String[] strArr = (String[]) obj3;
                boolean[] zArr = (boolean[]) obj2;
                byte[] bArr = (byte[]) obj;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                }
                int i12 = this.f16842c;
                fi.g1 g1Var = new fi.g1(runnableArr, textViewArr, i12, c6Var, 7);
                org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i12);
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null) {
                    org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(v, wallettransaction.peer.address, nftitem, strArr[0], g1Var);
                    v.h0(zVar);
                    h = new org.telegram.ui.Wallet.m(zVar, 1);
                } else {
                    String str4 = wallettransaction.peer.address;
                    long j10 = wallettransaction.amount;
                    String str5 = strArr[0];
                    if (!zArr[0]) {
                        bArr = null;
                    }
                    h = v.h(str4, j10, str5, bArr, g1Var);
                }
                runnableArr[0] = h;
                return;
        }
    }

    public b6(TLObject tLObject, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription, rx0 rx0Var, c5.g gVar, int i10, TLRPC.TL_error tL_error, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f16843f = tLObject;
        this.d = m2Var;
        this.e = tL_inputStorePaymentPremiumSubscription;
        this.f16841b = rx0Var;
        this.h = gVar;
        this.f16842c = i10;
        this.f16844n = tL_error;
        this.f16845r = tL_payments_canPurchaseStore;
    }

    public b6(ExternalActionActivity externalActionActivity, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2) {
        this.f16843f = externalActionActivity;
        this.f16841b = a2Var;
        this.h = tLObject;
        this.f16842c = i10;
        this.f16844n = authorizationform;
        this.f16845r = getauthorizationform;
        this.d = str;
        this.e = str2;
    }

    public b6(Runnable[] runnableArr, TextView[] textViewArr, int i10, org.telegram.ui.ActionBar.c6 c6Var, TL_wallet.walletTransaction wallettransaction, String[] strArr, boolean[] zArr, byte[] bArr) {
        this.f16843f = runnableArr;
        this.d = textViewArr;
        this.f16842c = i10;
        this.e = c6Var;
        this.f16841b = wallettransaction;
        this.f16844n = strArr;
        this.h = zArr;
        this.f16845r = bArr;
    }
}
