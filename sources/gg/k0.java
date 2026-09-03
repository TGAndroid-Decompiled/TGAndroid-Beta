package gg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kh.h5;
import lh.w5;
import lh.y5;
import n7.qa;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.UserInfoActivity;
import ph.d4;
public final class k0 implements Runnable {
    public final int f6674a;
    public final Object f6675b;
    public final Object f6676c;
    public final Object d;
    public final Object e;
    public final Object f6677f;
    public final Object h;
    public final Object f6678n;
    public final Object f6679r;

    public k0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f6674a = i10;
        this.f6675b = obj;
        this.h = obj2;
        this.f6676c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f6678n = obj6;
        this.f6677f = obj7;
        this.f6679r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f6674a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6675b;
                t0 t0Var = (t0) this.h;
                TLObject tLObject = (TLObject) this.f6676c;
                List list = (List) this.d;
                p2.h hVar = (p2.h) this.e;
                t0 t0Var2 = (t0) this.f6678n;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f6677f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f6679r;
                if (tL_error != null) {
                    t0Var.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((p2.n) list.get(0)).f41031c, new m0(1, hVar, t0Var2));
                    BillingController.getInstance().setOnCanceled(new o0(t0Var, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = p2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar = new qa(24);
                    qaVar.L0((p2.n) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(qaVar.X()));
                    return;
                } else {
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6675b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.f6676c;
                List list2 = (List) this.d;
                p2.h hVar2 = (p2.h) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f6678n;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f6677f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f6679r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((p2.n) list2.get(0)).f41031c, new m0(0, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new n0(0, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = p2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar2 = new qa(24);
                    qaVar2.L0((p2.n) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(qaVar2.X()));
                    return;
                } else {
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) this.f6676c;
                p2.n nVar = (p2.n) this.h;
                p2.h hVar3 = (p2.h) this.e;
                dh.v vVar = (dh.v) this.f6678n;
                Activity activity = (Activity) this.f6677f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f6679r;
                List list3 = (List) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f6675b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(nVar.f41031c, new m0(3, hVar3, vVar));
                    BillingController.getInstance().setOnCanceled(new w5(vVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar3 = new qa(24);
                    qaVar3.L0((p2.n) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(qaVar3.X()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    vVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    vVar.run(bool, str);
                    return;
                }
            case 3:
                TLObject tLObject4 = (TLObject) this.f6676c;
                p2.n nVar2 = (p2.n) this.h;
                p2.h hVar4 = (p2.h) this.e;
                h5 h5Var = (h5) this.f6678n;
                Activity activity2 = (Activity) this.f6677f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f6679r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f6675b;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(nVar2.f41031c, new m0(2, hVar4, h5Var));
                    BillingController.getInstance().setOnCanceled(new y5(h5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qa qaVar4 = new qa(24);
                    qaVar4.L0((p2.n) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(qaVar4.X()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    h5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    h5Var.run(bool2, str2);
                    return;
                }
            case 4:
                ((MessagesStorage) this.f6675b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.f6676c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f6678n, (ArrayList) this.f6677f, (HashMap) this.f6679r);
                return;
            case 5:
                UserInfoActivity.Y((UserInfoActivity) this.h, (TLRPC.TL_error) this.f6675b, (TLObject) this.f6676c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.e, (TLObject) this.f6678n, (int[]) this.f6677f, (ArrayList) this.f6679r);
                return;
            default:
                final String[] strArr = (String[]) this.f6675b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final ph.d dVar = (ph.d) this.f6676c;
                final boolean[] zArr = (boolean[]) this.d;
                d4 d4Var = (d4) this.e;
                final ImageView imageView = (ImageView) this.f6678n;
                final f6 f6Var = (f6) this.f6677f;
                final int[] iArr = (int[]) this.f6679r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                final boolean z4 = zArr[0];
                final String str3 = strArr[0];
                d4Var.run(str3, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        int i10;
                        Bitmap bitmap = (Bitmap) obj;
                        Boolean bool3 = (Boolean) obj2;
                        if (!TextUtils.equals(str3, strArr[0])) {
                            return;
                        }
                        boolean booleanValue = bool3.booleanValue();
                        ImageView imageView2 = imageView;
                        f6 f6Var2 = f6Var;
                        if (booleanValue) {
                            imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20116q7, f6Var2), PorterDuff.Mode.SRC_IN));
                            if (!z4) {
                                int[] iArr2 = iArr;
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                AndroidUtilities.shakeViewSpring(imageView2, i11);
                            }
                        } else {
                            imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, f6Var2), PorterDuff.Mode.SRC_IN));
                        }
                        if (bitmap != null) {
                            imageView2.setImageBitmap(bitmap);
                        }
                        dVar.setEnabled(!bool3.booleanValue());
                        if (bitmap != null) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        horizontalScrollView.setVisibility(i10);
                        zArr[0] = bool3.booleanValue();
                    }
                });
                return;
        }
    }

    public k0(TLObject tLObject, p2.n nVar, p2.h hVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i10) {
        this.f6674a = i10;
        this.f6676c = tLObject;
        this.h = nVar;
        this.e = hVar;
        this.f6678n = callback2;
        this.f6677f = activity;
        this.f6679r = inputStorePaymentPurpose;
        this.d = list;
        this.f6675b = tL_error;
    }

    public k0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f6674a = 5;
        this.h = userInfoActivity;
        this.f6675b = tL_error;
        this.f6676c = tLObject;
        this.d = tL_birthday;
        this.e = userFull;
        this.f6678n = tLObject2;
        this.f6677f = iArr;
        this.f6679r = arrayList;
    }
}
