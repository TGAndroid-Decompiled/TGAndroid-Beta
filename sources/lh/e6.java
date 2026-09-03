package lh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.ya0;
public final class e6 implements Runnable {
    public final int f12331a = 1;
    public final t7 f12332b;
    public final TLObject f12333c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f12334f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f12335n;
    public final String f12336r;
    public final long f12337s;
    public final TLObject v;
    public final TLObject f12338w;

    public e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f12332b = t7Var;
        this.f12333c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f12334f = context;
        this.h = f6Var;
        this.f12335n = j10;
        this.f12336r = str;
        this.f12337s = j11;
        this.v = tLObject2;
        this.f12338w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        qc X;
        ya0 ya0Var;
        String str;
        qc X2;
        ya0 ya0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f12331a) {
            case 0:
                t7 t7Var = this.f12332b;
                TLObject tLObject = this.f12333c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f12334f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j10 = this.f12335n;
                String str3 = this.f12336r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f12338w;
                long j11 = this.f12337s;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = qc.a0(R);
                } else {
                    X = qc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(t7Var.f13133a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            t7.e0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        z9 z9Var = new z9(context, f6Var, j10, 6, str3, new o2(t7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        z9Var.setOnDismissListener(new g6(callback2, zArr, 2));
                        z9Var.show();
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
                        ai.r(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new f6(t7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                t7Var.D = false;
                t7Var.E = true;
                t7Var.G = 0L;
                t7Var.V();
                t7Var.Q(j11);
                t7Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(t7Var.f13133a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(t7Var.f13133a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(t7Var.f13133a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && (ya0Var = launchActivity.f31626u0) != null) {
                    ya0Var.c(true);
                    return;
                }
                return;
            default:
                t7 t7Var2 = this.f12332b;
                TLObject tLObject2 = this.f12333c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f12334f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j12 = this.f12335n;
                String str4 = this.f12336r;
                long j13 = this.f12337s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f12338w;
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = qc.a0(R2);
                } else {
                    X2 = qc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(t7Var2.f13133a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            t7.e0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        z9 z9Var2 = new z9(context2, f6Var2, j12, 6, str4, new o2(t7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        z9Var2.setOnDismissListener(new g6(callback22, zArr2, 1));
                        z9Var2.show();
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
                        ai.r(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new f6(t7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                t7Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(t7Var2.f13133a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(t7Var2.f13133a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(t7Var2.f13133a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.D1;
                if (launchActivity2 != null && (ya0Var2 = launchActivity2.f31626u0) != null) {
                    ya0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f12332b = t7Var;
        this.f12333c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f12334f = context;
        this.h = f6Var;
        this.f12335n = j10;
        this.f12336r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f12338w = starGift;
        this.f12337s = j11;
    }
}
