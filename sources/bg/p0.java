package bg;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import fh.w5;
import gh.b6;
import gh.z5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kh.b8;
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
import org.telegram.ui.Components.qc;
import org.telegram.ui.UserInfoActivity;
public final class p0 implements Runnable {
    public final int f1910a;
    public final Object f1911b;
    public final Object f1912c;
    public final Object d;
    public final Object f1913e;
    public final Object f1914f;
    public final Object h;
    public final Object f1915n;
    public final Object f1916r;

    public p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i9) {
        this.f1910a = i9;
        this.f1911b = obj;
        this.h = obj2;
        this.f1912c = obj3;
        this.d = obj4;
        this.f1913e = obj5;
        this.f1915n = obj6;
        this.f1914f = obj7;
        this.f1916r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f1910a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1911b;
                z0 z0Var = (z0) this.h;
                TLObject tLObject = (TLObject) this.f1912c;
                List list = (List) this.d;
                n2.g gVar = (n2.g) this.f1913e;
                z0 z0Var2 = (z0) this.f1915n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f1914f;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1916r;
                if (tL_error != null) {
                    z0Var.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((n2.l) list.get(0)).f18335c, new r0(1, gVar, z0Var2));
                    BillingController.getInstance().setOnCanceled(new t0(z0Var, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = o2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar = new g5.b(23);
                    bVar.t((n2.l) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.h()));
                    return;
                } else {
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f1911b;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                TLObject tLObject2 = (TLObject) this.f1912c;
                List list2 = (List) this.d;
                n2.g gVar2 = (n2.g) this.f1913e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f1915n;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f1914f;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1916r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((n2.l) list2.get(0)).f18335c, new r0(0, gVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new s0(0, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = o2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar2 = new g5.b(23);
                    bVar2.t((n2.l) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.h()));
                    return;
                } else {
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) this.f1912c;
                n2.l lVar = (n2.l) this.h;
                n2.g gVar3 = (n2.g) this.f1913e;
                y0 y0Var = (y0) this.f1915n;
                Activity activity = (Activity) this.f1914f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1916r;
                List list3 = (List) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f1911b;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar.f18335c, new r0(3, gVar3, y0Var));
                    BillingController.getInstance().setOnCanceled(new z5(y0Var, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar3 = new g5.b(23);
                    bVar3.t((n2.l) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.h()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    y0Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    y0Var.run(bool, str);
                    return;
                }
            case 3:
                TLObject tLObject4 = (TLObject) this.f1912c;
                n2.l lVar2 = (n2.l) this.h;
                n2.g gVar4 = (n2.g) this.f1913e;
                w5 w5Var = (w5) this.f1915n;
                Activity activity2 = (Activity) this.f1914f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f1916r;
                List list4 = (List) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f1911b;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(lVar2.f18335c, new r0(2, gVar4, w5Var));
                    BillingController.getInstance().setOnCanceled(new b6(w5Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    g5.b bVar4 = new g5.b(23);
                    bVar4.t((n2.l) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.h()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    w5Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str2 = tL_error4.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    w5Var.run(bool2, str2);
                    return;
                }
            case 4:
                AndroidUtilities.lambda$showProxyAlert$21((boolean[]) this.f1911b, (qc[]) this.h, (String) this.f1912c, (String) this.d, (String) this.f1913e, (String) this.f1915n, (String) this.f1914f, (Activity) this.f1916r);
                return;
            case 5:
                ((MessagesStorage) this.f1911b).lambda$loadUnreadMessages$76((a0.h) this.h, (ArrayList) this.f1912c, (ArrayList) this.d, (ArrayList) this.f1913e, (ArrayList) this.f1915n, (ArrayList) this.f1914f, (HashMap) this.f1916r);
                return;
            case 6:
                UserInfoActivity.X((UserInfoActivity) this.h, (TLRPC.TL_error) this.f1911b, (TLObject) this.f1912c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f1913e, (TLObject) this.f1915n, (int[]) this.f1914f, (ArrayList) this.f1916r);
                return;
            default:
                final String[] strArr = (String[]) this.f1911b;
                final HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.h;
                final kh.d dVar = (kh.d) this.f1912c;
                final boolean[] zArr = (boolean[]) this.d;
                b8 b8Var = (b8) this.f1913e;
                final ImageView imageView = (ImageView) this.f1915n;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f1914f;
                final int[] iArr = (int[]) this.f1916r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                final boolean z10 = zArr[0];
                final String str3 = strArr[0];
                b8Var.run(str3, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        int i9;
                        Bitmap bitmap = (Bitmap) obj;
                        Boolean bool3 = (Boolean) obj2;
                        if (!TextUtils.equals(str3, strArr[0])) {
                            return;
                        }
                        boolean booleanValue = bool3.booleanValue();
                        ImageView imageView2 = imageView;
                        org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                        if (booleanValue) {
                            imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23230q7, b6Var2), PorterDuff.Mode.SRC_IN));
                            if (!z10) {
                                int[] iArr2 = iArr;
                                int i10 = -iArr2[0];
                                iArr2[0] = i10;
                                AndroidUtilities.shakeViewSpring(imageView2, i10);
                            }
                        } else {
                            imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.G6, b6Var2), PorterDuff.Mode.SRC_IN));
                        }
                        if (bitmap != null) {
                            imageView2.setImageBitmap(bitmap);
                        }
                        dVar.setEnabled(!bool3.booleanValue());
                        if (bitmap != null) {
                            i9 = 0;
                        } else {
                            i9 = 8;
                        }
                        horizontalScrollView.setVisibility(i9);
                        zArr[0] = bool3.booleanValue();
                    }
                });
                return;
        }
    }

    public p0(TLObject tLObject, n2.l lVar, n2.g gVar, Utilities.Callback2 callback2, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, int i9) {
        this.f1910a = i9;
        this.f1912c = tLObject;
        this.h = lVar;
        this.f1913e = gVar;
        this.f1915n = callback2;
        this.f1914f = activity;
        this.f1916r = inputStorePaymentPurpose;
        this.d = list;
        this.f1911b = tL_error;
    }

    public p0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f1910a = 6;
        this.h = userInfoActivity;
        this.f1911b = tL_error;
        this.f1912c = tLObject;
        this.d = tL_birthday;
        this.f1913e = userFull;
        this.f1915n = tLObject2;
        this.f1914f = iArr;
        this.f1916r = arrayList;
    }
}
