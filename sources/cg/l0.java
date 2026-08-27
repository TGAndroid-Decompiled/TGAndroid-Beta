package cg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import gh.p5;
import hh.a6;
import hh.y5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import lh.a8;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.UserInfoActivity;

public final class l0 implements Runnable {

    public final int f2756a;

    public final Object f2757b;

    public final Object f2758c;
    public final Object d;

    public final Object f2759e;

    public final Object f2760f;
    public final Object h;

    public final Object f2761n;

    public final Object f2762r;

    public l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f2756a = i10;
        this.f2757b = obj;
        this.h = obj2;
        this.f2758c = obj3;
        this.d = obj4;
        this.f2759e = obj5;
        this.f2761n = obj6;
        this.f2760f = obj7;
        this.f2762r = obj8;
    }

    @Override
    public final void run() {
        switch (this.f2756a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2757b;
                v0 v0Var = (v0) this.h;
                TLObject tLObject = (TLObject) this.f2758c;
                List list = (List) this.d;
                n2.g gVar = (n2.g) this.f2759e;
                v0 v0Var2 = (v0) this.f2761n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f2760f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f2762r;
                if (tL_error != null) {
                    v0Var.run(tL_error);
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((n2.l) list.get(0)).f18163c, new n0(1, gVar, v0Var2));
                    BillingController.getInstance().setOnCanceled(new p0(v0Var, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar = new g5.b(22);
                    bVar.t((n2.l) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.i()));
                }
                break;
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f2757b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.f2758c;
                List list2 = (List) this.d;
                n2.g gVar2 = (n2.g) this.f2759e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f2761n;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f2760f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f2762r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((n2.l) list2.get(0)).f18163c, new n0(0, gVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new o0(0, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = n2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar2 = new g5.b(22);
                    bVar2.t((n2.l) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.i()));
                }
                break;
            case 2:
                TLObject tLObject3 = (TLObject) this.f2758c;
                n2.l lVar = (n2.l) this.h;
                n2.g gVar3 = (n2.g) this.f2759e;
                u0 u0Var = (u0) this.f2761n;
                Activity activity = (Activity) this.f2760f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f2762r;
                List list3 = (List) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f2757b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar.f18163c, new n0(3, gVar3, u0Var));
                    BillingController.getInstance().setOnCanceled(new y5(u0Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar3 = new g5.b(22);
                    bVar3.t((n2.l) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.i()));
                } else if (!(tLObject3 instanceof TLRPC.TL_boolFalse)) {
                    u0Var.run(Boolean.FALSE, tL_error3 != null ? tL_error3.text : "SERVER_ERROR");
                } else {
                    u0Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                }
                break;
            case 3:
                TLObject tLObject4 = (TLObject) this.f2758c;
                n2.l lVar2 = (n2.l) this.h;
                n2.g gVar4 = (n2.g) this.f2759e;
                p5 p5Var = (p5) this.f2761n;
                Activity activity2 = (Activity) this.f2760f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f2762r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f2757b;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar2.f18163c, new n0(2, gVar4, p5Var));
                    BillingController.getInstance().setOnCanceled(new a6(p5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar4 = new g5.b(22);
                    bVar4.t((n2.l) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.i()));
                } else if (!(tLObject4 instanceof TLRPC.TL_boolFalse)) {
                    p5Var.run(Boolean.FALSE, tL_error4 != null ? tL_error4.text : "SERVER_ERROR");
                } else {
                    p5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                }
                break;
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.f2757b, (oc[]) this.h, (String) this.f2758c, (String) this.d, (String) this.f2759e, (String) this.f2761n, (String) this.f2760f, (Activity) this.f2762r);
                break;
            case 5:
                ((MessagesStorage) this.f2757b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.f2758c, (ArrayList) this.d, (ArrayList) this.f2759e, (ArrayList) this.f2761n, (ArrayList) this.f2760f, (HashMap) this.f2762r);
                break;
            case 6:
                UserInfoActivity.Y((UserInfoActivity) this.h, (TLRPC.TL_error) this.f2757b, (TLObject) this.f2758c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f2759e, (TLObject) this.f2761n, (int[]) this.f2760f, (ArrayList) this.f2762r);
                break;
            default:
                final String[] strArr = (String[]) this.f2757b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final lh.d dVar = (lh.d) this.f2758c;
                final boolean[] zArr = (boolean[]) this.d;
                a8 a8Var = (a8) this.f2759e;
                final ImageView imageView = (ImageView) this.f2761n;
                final c6 c6Var = (c6) this.f2760f;
                final int[] iArr = (int[]) this.f2762r;
                if (!TextUtils.isEmpty(strArr[0].trim())) {
                    final boolean z10 = zArr[0];
                    final String str = strArr[0];
                    a8Var.run(str, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj;
                            Boolean bool = (Boolean) obj2;
                            if (TextUtils.equals(str, strArr[0])) {
                                boolean zBooleanValue = bool.booleanValue();
                                ImageView imageView2 = imageView;
                                c6 c6Var2 = c6Var;
                                if (zBooleanValue) {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23284q7, c6Var2), PorterDuff.Mode.SRC_IN));
                                    if (!z10) {
                                        int[] iArr2 = iArr;
                                        int i10 = -iArr2[0];
                                        iArr2[0] = i10;
                                        AndroidUtilities.shakeViewSpring(imageView2, i10);
                                    }
                                } else {
                                    imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var2), PorterDuff.Mode.SRC_IN));
                                }
                                if (bitmap != null) {
                                    imageView2.setImageBitmap(bitmap);
                                }
                                dVar.setEnabled(!bool.booleanValue());
                                horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                                zArr[0] = bool.booleanValue();
                            }
                        }
                    });
                } else {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                }
                break;
        }
    }

    public l0(TLObject tLObject, n2.l lVar, n2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i10) {
        this.f2756a = i10;
        this.f2758c = tLObject;
        this.h = lVar;
        this.f2759e = gVar;
        this.f2761n = callback2;
        this.f2760f = activity;
        this.f2762r = inputStorePaymentPurpose;
        this.d = list;
        this.f2757b = tL_error;
    }

    public l0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f2756a = 6;
        this.h = userInfoActivity;
        this.f2757b = tL_error;
        this.f2758c = tLObject;
        this.d = tL_birthday;
        this.f2759e = userFull;
        this.f2761n = tLObject2;
        this.f2760f = iArr;
        this.f2762r = arrayList;
    }
}
