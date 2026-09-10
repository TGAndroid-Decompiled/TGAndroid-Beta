package hi;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import bi.jc;
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
import org.telegram.ui.Components.n80;
import org.telegram.ui.UserInfoActivity;
public final class l implements Runnable {
    public final int f9713a;
    public final Object f9714b;
    public final Object f9715c;
    public final Object d;
    public final Object e;
    public final Object f9716f;
    public final Object h;
    public final Object f9717n;
    public final Object f9718r;

    public l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f9713a = i10;
        this.f9714b = obj;
        this.f9715c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f9716f = obj5;
        this.h = obj6;
        this.f9717n = obj7;
        this.f9718r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f9713a) {
            case 0:
                final String[] strArr = (String[]) this.f9714b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f9715c;
                final bi.d dVar = (bi.d) this.d;
                final boolean[] zArr = (boolean[]) this.e;
                gi.a aVar = (gi.a) this.f9716f;
                final ImageView imageView = (ImageView) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f9717n;
                final int[] iArr = (int[]) this.f9718r;
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
                            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2), PorterDuff.Mode.SRC_IN));
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
                ((MessagesStorage) this.f9714b).lambda$loadUnreadMessages$76((a0.i) this.f9715c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f9716f, (ArrayList) this.h, (ArrayList) this.f9717n, (HashMap) this.f9718r);
                return;
            case 2:
                UserInfoActivity.Y((UserInfoActivity) this.f9714b, (TLRPC.TL_error) this.f9715c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f9716f, (TLObject) this.h, (int[]) this.f9718r, (ArrayList) this.f9717n);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f9714b;
                sg.v vVar = (sg.v) this.f9715c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.h hVar = (c5.h) this.f9716f;
                sg.v vVar2 = (sg.v) this.h;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f9717n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f9718r;
                if (tL_error != null) {
                    vVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list.get(0)).f4331c, new bi.h6(3, hVar, vVar2));
                    BillingController.getInstance().setOnCanceled(new sg.r(vVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = p2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.y yVar = new n4.y(7, false);
                    yVar.z((c5.o) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(yVar.d()));
                    return;
                } else {
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9714b;
                Utilities.Callback callback = (Utilities.Callback) this.f9715c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.h hVar2 = (c5.h) this.f9716f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f9717n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f9718r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).f4331c, new bi.h6(2, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new jc(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = p2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.y yVar2 = new n4.y(7, false);
                    yVar2.z((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(yVar2.d()));
                    return;
                } else {
                    return;
                }
            case 5:
                TLObject tLObject3 = (TLObject) this.f9714b;
                c5.o oVar = (c5.o) this.f9715c;
                c5.h hVar3 = (c5.h) this.d;
                bi.k6 k6Var = (bi.k6) this.e;
                Activity activity = (Activity) this.f9716f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f9717n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f9718r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f4331c, new bi.h6(5, hVar3, k6Var));
                    BillingController.getInstance().setOnCanceled(new xh.j4(k6Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.y yVar3 = new n4.y(7, false);
                    yVar3.z((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(yVar3.d()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    k6Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    k6Var.run(bool, str);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f9714b;
                c5.o oVar2 = (c5.o) this.f9715c;
                c5.h hVar4 = (c5.h) this.d;
                n80 n80Var = (n80) this.e;
                Activity activity2 = (Activity) this.f9716f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f9717n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f9718r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f4331c, new bi.h6(4, hVar4, n80Var));
                    BillingController.getInstance().setOnCanceled(new xh.l4(n80Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.y yVar4 = new n4.y(7, false);
                    yVar4.z((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(yVar4.d()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    n80Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    n80Var.run(bool2, str2);
                    return;
                }
        }
    }

    public l(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f9713a = 2;
        this.f9714b = userInfoActivity;
        this.f9715c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f9716f = userFull;
        this.h = tLObject2;
        this.f9718r = iArr;
        this.f9717n = arrayList;
    }
}
