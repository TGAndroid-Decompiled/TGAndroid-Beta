package jh;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oa0;
import org.telegram.ui.th;
public final class e6 implements Runnable {
    public final int f12009a = 1;
    public final s7 f12010b;
    public final TLObject f12011c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f12012e;
    public final Context f12013f;
    public final org.telegram.ui.ActionBar.c6 h;
    public final long f12014n;
    public final String f12015r;
    public final long f12016s;
    public final TLObject v;
    public final TLObject f12017w;

    public e6(s7 s7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f12010b = s7Var;
        this.f12011c = tLObject;
        this.d = tL_error;
        this.f12012e = callback2;
        this.f12013f = context;
        this.h = c6Var;
        this.f12014n = j10;
        this.f12015r = str;
        this.f12016s = j11;
        this.v = tLObject2;
        this.f12017w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        tc X;
        oa0 oa0Var;
        String str;
        tc X2;
        oa0 oa0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f12009a) {
            case 0:
                s7 s7Var = this.f12010b;
                TLObject tLObject = this.f12011c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f12012e;
                Context context = this.f12013f;
                org.telegram.ui.ActionBar.c6 c6Var = this.h;
                long j10 = this.f12014n;
                String str3 = this.f12015r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f12017w;
                long j11 = this.f12016s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = tc.a0(R);
                } else {
                    X = tc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(s7Var.f12787a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            s7.e0(context, c6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        y9 y9Var = new y9(context, c6Var, j10, 6, str3, new n2(s7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        y9Var.setOnDismissListener(new g6(callback2, zArr, 2));
                        y9Var.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        int i10 = R.raw.error;
                        int i11 = R.string.UnknownErrorCode;
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        th.r(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new f6(s7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                s7Var.D = false;
                s7Var.E = true;
                s7Var.G = 0L;
                s7Var.V();
                s7Var.Q(j11);
                s7Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(s7Var.f12787a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(s7Var.f12787a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(s7Var.f12787a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && (oa0Var = launchActivity.f35599t0) != null) {
                    oa0Var.c(true);
                    return;
                }
                return;
            default:
                s7 s7Var2 = this.f12010b;
                TLObject tLObject2 = this.f12011c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f12012e;
                Context context2 = this.f12013f;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                long j12 = this.f12014n;
                String str4 = this.f12015r;
                long j13 = this.f12016s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f12017w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = tc.a0(R2);
                } else {
                    X2 = tc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(s7Var2.f12787a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            s7.e0(context2, c6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        y9 y9Var2 = new y9(context2, c6Var2, j12, 6, str4, new n2(s7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        y9Var2.setOnDismissListener(new g6(callback22, zArr2, 1));
                        y9Var2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        int i12 = R.raw.error;
                        int i13 = R.string.UnknownErrorCode;
                        if (tL_error2 != null) {
                            str2 = tL_error2.text;
                        }
                        th.r(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new f6(s7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                s7Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(s7Var2.f12787a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(s7Var2.f12787a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(s7Var2.f12787a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.C1;
                if (launchActivity2 != null && (oa0Var2 = launchActivity2.f35599t0) != null) {
                    oa0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public e6(s7 s7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f12010b = s7Var;
        this.f12011c = tLObject;
        this.d = tL_error;
        this.f12012e = callback2;
        this.f12013f = context;
        this.h = c6Var;
        this.f12014n = j10;
        this.f12015r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f12017w = starGift;
        this.f12016s = j11;
    }
}
