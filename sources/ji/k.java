package ji;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import di.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.d80;
import org.telegram.ui.UserInfoActivity;
public final class k implements Runnable {
    public final int f14000a;
    public final Object f14001b;
    public final Object f14002c;
    public final Object d;
    public final Object f14003e;
    public final Object f14004f;
    public final Object h;
    public final Object f14005n;
    public final Object f14006r;

    public k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f14000a = i10;
        this.f14001b = obj;
        this.f14002c = obj2;
        this.d = obj3;
        this.f14003e = obj4;
        this.f14004f = obj5;
        this.h = obj6;
        this.f14005n = obj7;
        this.f14006r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f14000a) {
            case 0:
                final String[] strArr = (String[]) this.f14001b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f14002c;
                final di.d dVar = (di.d) this.d;
                final boolean[] zArr = (boolean[]) this.f14003e;
                ii.a aVar = (ii.a) this.f14004f;
                final ImageView imageView = (ImageView) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f14005n;
                final int[] iArr = (int[]) this.f14006r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                final boolean z10 = zArr[0];
                final String str3 = strArr[0];
                aVar.run(str3, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        int i10;
                        Bitmap bitmap = (Bitmap) obj;
                        Boolean bool = (Boolean) obj2;
                        if (!TextUtils.equals(str3, strArr[0])) {
                            return;
                        }
                        boolean booleanValue = bool.booleanValue();
                        ImageView imageView2 = imageView;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        if (booleanValue) {
                            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2), PorterDuff.Mode.SRC_IN));
                            if (!z10) {
                                int[] iArr2 = iArr;
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                AndroidUtilities.shakeViewSpring(imageView2, i11);
                            }
                        } else {
                            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), PorterDuff.Mode.SRC_IN));
                        }
                        if (bitmap != null) {
                            imageView2.setImageBitmap(bitmap);
                        }
                        dVar.setEnabled(!bool.booleanValue());
                        if (bitmap != null) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        horizontalScrollView.setVisibility(i10);
                        zArr[0] = bool.booleanValue();
                    }
                });
                return;
            case 1:
                ((MessagesStorage) this.f14001b).lambda$loadUnreadMessages$76((a0.i) this.f14002c, (ArrayList) this.d, (ArrayList) this.f14003e, (ArrayList) this.f14004f, (ArrayList) this.h, (ArrayList) this.f14005n, (HashMap) this.f14006r);
                return;
            case 2:
                UserInfoActivity.Y((UserInfoActivity) this.f14001b, (TLRPC.TL_error) this.f14002c, (TLObject) this.d, (TL_account.TL_birthday) this.f14003e, (TLRPC.UserFull) this.f14004f, (TLObject) this.h, (int[]) this.f14006r, (ArrayList) this.f14005n);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f14001b;
                ug.w wVar = (ug.w) this.f14002c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.f14003e;
                c5.h hVar = (c5.h) this.f14004f;
                ug.w wVar2 = (ug.w) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f14005n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f14006r;
                if (tL_error != null) {
                    wVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list.get(0)).f4422c, new di.l5(3, hVar, wVar2));
                    BillingController.getInstance().setOnCanceled(new ug.s(wVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar = new pf.b(7, false);
                    bVar.h0((c5.o) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.w()));
                    return;
                } else {
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f14001b;
                Utilities.Callback callback = (Utilities.Callback) this.f14002c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.f14003e;
                c5.h hVar2 = (c5.h) this.f14004f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f14005n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f14006r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).f4422c, new di.l5(2, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new ab(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = n2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar2 = new pf.b(7, false);
                    bVar2.h0((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.w()));
                    return;
                } else {
                    return;
                }
            case 5:
                TLObject tLObject3 = (TLObject) this.f14001b;
                c5.o oVar = (c5.o) this.f14002c;
                c5.h hVar3 = (c5.h) this.d;
                bi.f0 f0Var = (bi.f0) this.f14003e;
                Activity activity = (Activity) this.f14004f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f14005n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f14006r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f4422c, new di.l5(5, hVar3, f0Var));
                    BillingController.getInstance().setOnCanceled(new zh.i4(f0Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar3 = new pf.b(7, false);
                    bVar3.h0((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.w()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    f0Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    f0Var.run(bool, str);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f14001b;
                c5.o oVar2 = (c5.o) this.f14002c;
                c5.h hVar4 = (c5.h) this.d;
                d80 d80Var = (d80) this.f14003e;
                Activity activity2 = (Activity) this.f14004f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f14005n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f14006r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f4422c, new di.l5(4, hVar4, d80Var));
                    BillingController.getInstance().setOnCanceled(new zh.k4(d80Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar4 = new pf.b(7, false);
                    bVar4.h0((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.w()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    d80Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    d80Var.run(bool2, str2);
                    return;
                }
        }
    }

    public k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f14000a = 2;
        this.f14001b = userInfoActivity;
        this.f14002c = tL_error;
        this.d = tLObject;
        this.f14003e = tL_birthday;
        this.f14004f = userFull;
        this.h = tLObject2;
        this.f14006r = iArr;
        this.f14005n = arrayList;
    }
}
