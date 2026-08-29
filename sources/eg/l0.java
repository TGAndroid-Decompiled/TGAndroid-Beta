package eg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import ih.i5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jh.w5;
import jh.y5;
import nh.t4;
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
import org.telegram.ui.Components.vc;
import org.telegram.ui.UserInfoActivity;
public final class l0 implements Runnable {
    public final int f6070a;
    public final Object f6071b;
    public final Object f6072c;
    public final Object d;
    public final Object f6073e;
    public final Object f6074f;
    public final Object h;
    public final Object f6075n;
    public final Object f6076r;

    public l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f6070a = i10;
        this.f6071b = obj;
        this.h = obj2;
        this.f6072c = obj3;
        this.d = obj4;
        this.f6073e = obj5;
        this.f6075n = obj6;
        this.f6074f = obj7;
        this.f6076r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f6070a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6071b;
                u0 u0Var = (u0) this.h;
                TLObject tLObject = (TLObject) this.f6072c;
                List list = (List) this.d;
                p2.g gVar = (p2.g) this.f6073e;
                u0 u0Var2 = (u0) this.f6075n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f6074f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f6076r;
                if (tL_error != null) {
                    u0Var.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((p2.l) list.get(0)).f45473c, new n0(1, gVar, u0Var2));
                    BillingController.getInstance().setOnCanceled(new p0(u0Var, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = o2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar = new oc.i(16);
                    iVar.i2((p2.l) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(iVar.M1()));
                    return;
                } else {
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6071b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.f6072c;
                List list2 = (List) this.d;
                p2.g gVar2 = (p2.g) this.f6073e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f6075n;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f6074f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f6076r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((p2.l) list2.get(0)).f45473c, new n0(0, gVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new o0(0, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = o2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar2 = new oc.i(16);
                    iVar2.i2((p2.l) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(iVar2.M1()));
                    return;
                } else {
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) this.f6072c;
                p2.l lVar = (p2.l) this.h;
                p2.g gVar3 = (p2.g) this.f6073e;
                bh.v vVar = (bh.v) this.f6075n;
                Activity activity = (Activity) this.f6074f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f6076r;
                List list3 = (List) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f6071b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar.f45473c, new n0(3, gVar3, vVar));
                    BillingController.getInstance().setOnCanceled(new w5(vVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar3 = new oc.i(16);
                    iVar3.i2((p2.l) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(iVar3.M1()));
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
                TLObject tLObject4 = (TLObject) this.f6072c;
                p2.l lVar2 = (p2.l) this.h;
                p2.g gVar4 = (p2.g) this.f6073e;
                i5 i5Var = (i5) this.f6075n;
                Activity activity2 = (Activity) this.f6074f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f6076r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f6071b;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar2.f45473c, new n0(2, gVar4, i5Var));
                    BillingController.getInstance().setOnCanceled(new y5(i5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    oc.i iVar4 = new oc.i(16);
                    iVar4.i2((p2.l) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(iVar4.M1()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    i5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    i5Var.run(bool2, str2);
                    return;
                }
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.f6071b, (vc[]) this.h, (String) this.f6072c, (String) this.d, (String) this.f6073e, (String) this.f6075n, (String) this.f6074f, (Activity) this.f6076r);
                return;
            case 5:
                ((MessagesStorage) this.f6071b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.f6072c, (ArrayList) this.d, (ArrayList) this.f6073e, (ArrayList) this.f6075n, (ArrayList) this.f6074f, (HashMap) this.f6076r);
                return;
            case 6:
                UserInfoActivity.Y((UserInfoActivity) this.h, (TLRPC.TL_error) this.f6071b, (TLObject) this.f6072c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f6073e, (TLObject) this.f6075n, (int[]) this.f6074f, (ArrayList) this.f6076r);
                return;
            default:
                final String[] strArr = (String[]) this.f6071b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final nh.d dVar = (nh.d) this.f6072c;
                final boolean[] zArr = (boolean[]) this.d;
                t4 t4Var = (t4) this.f6073e;
                final ImageView imageView = (ImageView) this.f6075n;
                final c6 c6Var = (c6) this.f6074f;
                final int[] iArr = (int[]) this.f6076r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                final boolean z10 = zArr[0];
                final String str3 = strArr[0];
                t4Var.run(str3, new Utilities.Callback2() {
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
                        c6 c6Var2 = c6Var;
                        if (booleanValue) {
                            imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.f23295q7, c6Var2), PorterDuff.Mode.SRC_IN));
                            if (!z10) {
                                int[] iArr2 = iArr;
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                AndroidUtilities.shakeViewSpring(imageView2, i11);
                            }
                        } else {
                            imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var2), PorterDuff.Mode.SRC_IN));
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

    public l0(TLObject tLObject, p2.l lVar, p2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i10) {
        this.f6070a = i10;
        this.f6072c = tLObject;
        this.h = lVar;
        this.f6073e = gVar;
        this.f6075n = callback2;
        this.f6074f = activity;
        this.f6076r = inputStorePaymentPurpose;
        this.d = list;
        this.f6071b = tL_error;
    }

    public l0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f6070a = 6;
        this.h = userInfoActivity;
        this.f6071b = tL_error;
        this.f6072c = tLObject;
        this.d = tL_birthday;
        this.f6073e = userFull;
        this.f6075n = tLObject2;
        this.f6074f = iArr;
        this.f6076r = arrayList;
    }
}
