package ii;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import ci.ab;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.UserInfoActivity;
public final class k implements Runnable {
    public final int f11462a;
    public final Object f11463b;
    public final Object f11464c;
    public final Object d;
    public final Object e;
    public final Object f11465f;
    public final Object h;
    public final Object f11466n;
    public final Object f11467r;

    public k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f11462a = i10;
        this.f11463b = obj;
        this.f11464c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f11465f = obj5;
        this.h = obj6;
        this.f11466n = obj7;
        this.f11467r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f11462a) {
            case 0:
                final String[] strArr = (String[]) this.f11463b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f11464c;
                final ci.d dVar = (ci.d) this.d;
                final boolean[] zArr = (boolean[]) this.e;
                hi.a aVar = (hi.a) this.f11465f;
                final ImageView imageView = (ImageView) this.h;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f11466n;
                final int[] iArr = (int[]) this.f11467r;
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
                        org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                        if (booleanValue) {
                            imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19301q7, e6Var2), PorterDuff.Mode.SRC_IN));
                            if (!z10) {
                                int[] iArr2 = iArr;
                                int i11 = -iArr2[0];
                                iArr2[0] = i11;
                                AndroidUtilities.shakeViewSpring(imageView2, i11);
                            }
                        } else {
                            imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, e6Var2), PorterDuff.Mode.SRC_IN));
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
                ((MessagesStorage) this.f11463b).lambda$loadUnreadMessages$76((a0.i) this.f11464c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f11465f, (ArrayList) this.h, (ArrayList) this.f11466n, (HashMap) this.f11467r);
                return;
            case 2:
                UserInfoActivity.Y((UserInfoActivity) this.f11463b, (TLRPC.TL_error) this.f11464c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f11465f, (TLObject) this.h, (int[]) this.f11467r, (ArrayList) this.f11466n);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f11463b;
                tg.v vVar = (tg.v) this.f11464c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.h hVar = (c5.h) this.f11465f;
                tg.v vVar2 = (tg.v) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f11466n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f11467r;
                if (tL_error != null) {
                    vVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list.get(0)).f3917c, new ci.l5(3, hVar, vVar2));
                    BillingController.getInstance().setOnCanceled(new tg.q(vVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    of.b bVar = new of.b(7, false);
                    bVar.U((c5.o) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.B()));
                    return;
                } else {
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f11463b;
                Utilities.Callback callback = (Utilities.Callback) this.f11464c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.h hVar2 = (c5.h) this.f11465f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f11466n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f11467r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).f3917c, new ci.l5(2, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new ab(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = n2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    of.b bVar2 = new of.b(7, false);
                    bVar2.U((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.B()));
                    return;
                } else {
                    return;
                }
            case 5:
                TLObject tLObject3 = (TLObject) this.f11463b;
                c5.o oVar = (c5.o) this.f11464c;
                c5.h hVar3 = (c5.h) this.d;
                ai.m0 m0Var = (ai.m0) this.e;
                Activity activity = (Activity) this.f11465f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f11466n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f11467r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f3917c, new ci.l5(5, hVar3, m0Var));
                    BillingController.getInstance().setOnCanceled(new yh.k4(m0Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    of.b bVar3 = new of.b(7, false);
                    bVar3.U((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.B()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    m0Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    m0Var.run(bool, str);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f11463b;
                c5.o oVar2 = (c5.o) this.f11464c;
                c5.h hVar4 = (c5.h) this.d;
                m80 m80Var = (m80) this.e;
                Activity activity2 = (Activity) this.f11465f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f11466n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f11467r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f3917c, new ci.l5(4, hVar4, m80Var));
                    BillingController.getInstance().setOnCanceled(new yh.m4(m80Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    of.b bVar4 = new of.b(7, false);
                    bVar4.U((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.B()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    m80Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    m80Var.run(bool2, str2);
                    return;
                }
        }
    }

    public k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f11462a = 2;
        this.f11463b = userInfoActivity;
        this.f11464c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f11465f = userFull;
        this.h = tLObject2;
        this.f11467r = iArr;
        this.f11466n = arrayList;
    }
}
