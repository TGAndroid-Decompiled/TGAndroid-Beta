package mh;

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
import org.telegram.ui.xa0;
import org.telegram.ui.yh;
public final class e6 implements Runnable {
    public final int f13951a = 1;
    public final t7 f13952b;
    public final TLObject f13953c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f13954e;
    public final Context f13955f;
    public final org.telegram.ui.ActionBar.g6 h;
    public final long f13956n;
    public final String f13957r;
    public final long f13958s;
    public final TLObject v;
    public final TLObject f13959w;

    public e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f13952b = t7Var;
        this.f13953c = tLObject;
        this.d = tL_error;
        this.f13954e = callback2;
        this.f13955f = context;
        this.h = g6Var;
        this.f13956n = j10;
        this.f13957r = str;
        this.f13958s = j11;
        this.v = tLObject2;
        this.f13959w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        qc X;
        xa0 xa0Var;
        String str;
        qc X2;
        xa0 xa0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f13951a) {
            case 0:
                t7 t7Var = this.f13952b;
                TLObject tLObject = this.f13953c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f13954e;
                Context context = this.f13955f;
                org.telegram.ui.ActionBar.g6 g6Var = this.h;
                long j10 = this.f13956n;
                String str3 = this.f13957r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f13959w;
                long j11 = this.f13958s;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = qc.a0(R);
                } else {
                    X = qc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(t7Var.f14828a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            t7.e0(context, g6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        z9 z9Var = new z9(context, g6Var, j10, 6, str3, new n2(t7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
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
                        yh.s(i11, new Object[]{str}, X, i10, 36);
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
                if (BirthdayController.getInstance(t7Var.f14828a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(t7Var.f14828a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(t7Var.f14828a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity != null && (xa0Var = launchActivity.f34174u0) != null) {
                    xa0Var.c(true);
                    return;
                }
                return;
            default:
                t7 t7Var2 = this.f13952b;
                TLObject tLObject2 = this.f13953c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f13954e;
                Context context2 = this.f13955f;
                org.telegram.ui.ActionBar.g6 g6Var2 = this.h;
                long j12 = this.f13956n;
                String str4 = this.f13957r;
                long j13 = this.f13958s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f13959w;
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = qc.a0(R2);
                } else {
                    X2 = qc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(t7Var2.f14828a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            t7.e0(context2, g6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        z9 z9Var2 = new z9(context2, g6Var2, j12, 6, str4, new n2(t7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
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
                        yh.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new f6(t7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                t7Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(t7Var2.f14828a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(t7Var2.f14828a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(t7Var2.f14828a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.D1;
                if (launchActivity2 != null && (xa0Var2 = launchActivity2.f34174u0) != null) {
                    xa0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public e6(t7 t7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f13952b = t7Var;
        this.f13953c = tLObject;
        this.d = tL_error;
        this.f13954e = callback2;
        this.f13955f = context;
        this.h = g6Var;
        this.f13956n = j10;
        this.f13957r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f13959w = starGift;
        this.f13958s = j11;
    }
}
