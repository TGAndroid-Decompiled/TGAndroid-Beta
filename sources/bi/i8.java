package bi;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.v51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.lb0;
public final class i8 implements Runnable {
    public final int f4832a;
    public final Object f4833b;
    public final Object f4834c;
    public final Object d;
    public final Object e;
    public final Object f4835f;
    public final Object h;
    public final Object f4836n;
    public final Object f4837r;

    public i8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f4832a = i10;
        this.f4833b = obj;
        this.f4834c = obj2;
        this.d = obj3;
        this.f4836n = obj4;
        this.e = obj5;
        this.f4837r = obj6;
        this.f4835f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f4832a) {
            case 0:
                TLObject tLObject = (TLObject) this.f4833b;
                d5.o oVar = (d5.o) this.f4834c;
                d5.i iVar = (d5.i) this.d;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f4836n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f4837r;
                List list = (List) this.f4835f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f8001c, new y7(1, iVar, r1Var));
                    BillingController.getInstance().setOnCanceled(new a8(r1Var, 2));
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar = new rf.b(13, false);
                    bVar.R((d5.o) list.get(0));
                    billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.E()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    r1Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    r1Var.run(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f4833b;
                d5.o oVar2 = (d5.o) this.f4834c;
                d5.i iVar2 = (d5.i) this.d;
                lc lcVar = (lc) this.f4836n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f4837r;
                List list2 = (List) this.f4835f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f8001c, new y7(0, iVar2, lcVar));
                    BillingController.getInstance().setOnCanceled(new d8(lcVar, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar2 = new rf.b(13, false);
                    bVar2.R((d5.o) list2.get(0));
                    billingController2.launchBillingFlow(activity2, accountInstance2, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.E()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    lcVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    lcVar.run(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f4833b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f4834c;
                fi.d dVar = (fi.d) this.d;
                boolean[] zArr = (boolean[]) this.f4836n;
                hi.e2 e2Var = (hi.e2) this.e;
                ImageView imageView = (ImageView) this.f4837r;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f4835f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                e2Var.run(str4, new li.c(str4, strArr, imageView, u6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                ((MessagesStorage) this.f4833b).lambda$loadUnreadMessages$79((a0.h) this.f4834c, (ArrayList) this.d, (ArrayList) this.f4836n, (ArrayList) this.e, (ArrayList) this.f4837r, (ArrayList) this.f4835f, (HashMap) this.h);
                return;
            case 4:
                String str5 = (String) this.f4836n;
                String str6 = (String) this.e;
                String str7 = (String) this.f4837r;
                String str8 = (String) this.f4835f;
                org.telegram.ui.Wallet.e2 e2Var2 = ((org.telegram.ui.Wallet.l0) this.f4834c).f36811g;
                eb0 eb0Var = new eb0((lb0) this.f4833b, (String) this.h, 1);
                e2Var2.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                e2Var2.f36509f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.h1(e2Var2, eb0Var, str6, str5, str7, str8));
                return;
            case 5:
                UserInfoActivity.Z((UserInfoActivity) this.f4834c, (TLRPC.TL_error) this.h, (TLObject) this.f4833b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f4836n, (TLObject) this.e, (int[]) this.f4837r, (ArrayList) this.f4835f);
                return;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.f4833b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f4834c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f4836n;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f4837r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f4835f;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.h;
                e2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new r7(e2Var3, z1Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.e2.p(i0Var, tonconnectsession, str9, bArr, z1Var.f37550a, z1Var.f37551b, z1Var.d, tonconnectchallenge, e2Var3.f36509f.getCurrentTime()), sVar, 12));
                    return;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.c1(sVar, org.telegram.ui.Wallet.e2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.f4833b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f4834c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.f4836n;
                byte[] bArr2 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.f4837r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f4835f;
                org.telegram.ui.Wallet.r1 r1Var2 = (org.telegram.ui.Wallet.r1) this.h;
                e2Var4.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new v51(e2Var4, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.e2.q(i0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var4.f36509f.getCurrentTime()), r1Var2, i0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e10) {
                    r1Var2.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth identity", e10));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.e2 e2Var5 = (org.telegram.ui.Wallet.e2) this.f4833b;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.f4834c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f4836n;
                byte[] bArr3 = (byte[]) this.e;
                String str12 = ((org.telegram.ui.Wallet.b2) this.f4837r).f36387a;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.f4835f;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.h;
                if (e2Var5.c(z1Var2, tonconnectsession3, str11, bArr3) && ((str3 = z1Var2.e.client_id) == null || str12.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f22290id;
                    tonconnectregisterkey.client_id = str12;
                    e2Var5.f36509f.sendRequestTyped(tonconnectregisterkey, new Object(), new org.telegram.ui.Wallet.b1(e2Var5, sVar2, i0Var3, tonconnectsession3, str11, bArr3, z1Var2));
                    return;
                }
                sVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                vg.v vVar = (vg.v) this.f4834c;
                TLObject tLObject3 = (TLObject) this.f4833b;
                List list3 = (List) this.f4835f;
                d5.i iVar3 = (d5.i) this.d;
                vg.v vVar2 = (vg.v) this.f4836n;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f4837r;
                if (tL_error3 != null) {
                    vVar.run(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    BillingController.getInstance().addResultListener(((d5.o) list3.get(0)).f8001c, new y7(5, iVar3, vVar2));
                    BillingController.getInstance().setOnCanceled(new vg.r(vVar, 0));
                    BillingController billingController3 = BillingController.getInstance();
                    Activity parentActivity = r2Var.getParentActivity();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar3 = new rf.b(13, false);
                    bVar3.R((d5.o) list3.get(0));
                    billingController3.launchBillingFlow(parentActivity, accountInstance3, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.E()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.f4834c;
                TLObject tLObject4 = (TLObject) this.f4833b;
                List list4 = (List) this.f4835f;
                d5.i iVar4 = (d5.i) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f4836n;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f4837r;
                if (tL_error4 != null) {
                    callback.run(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    BillingController.getInstance().addResultListener(((d5.o) list4.get(0)).f8001c, new y7(4, iVar4, callback2));
                    BillingController.getInstance().setOnCanceled(new fi.ea(1, callback));
                    BillingController billingController4 = BillingController.getInstance();
                    Activity parentActivity2 = r2Var2.getParentActivity();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    rf.b bVar4 = new rf.b(13, false);
                    bVar4.R((d5.o) list4.get(0));
                    billingController4.launchBillingFlow(parentActivity2, accountInstance4, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.E()));
                    return;
                } else {
                    return;
                }
        }
    }

    public i8(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, d5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f4832a = i10;
        this.h = tL_error;
        this.f4834c = callback;
        this.f4833b = tLObject;
        this.f4835f = list;
        this.d = iVar;
        this.f4836n = callback2;
        this.e = r2Var;
        this.f4837r = inputStorePaymentPurpose;
    }

    public i8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f4832a = 5;
        this.f4834c = userInfoActivity;
        this.h = tL_error;
        this.f4833b = tLObject;
        this.d = tL_birthday;
        this.f4836n = userFull;
        this.e = tLObject2;
        this.f4837r = iArr;
        this.f4835f = arrayList;
    }
}
