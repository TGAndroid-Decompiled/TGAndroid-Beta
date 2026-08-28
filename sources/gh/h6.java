package gh;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
public final class h6 implements Runnable {
    public final int f8214a = 1;
    public final v7 f8215b;
    public final TLObject f8216c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f8217e;
    public final Context f8218f;
    public final org.telegram.ui.ActionBar.b6 h;
    public final long f8219n;
    public final String f8220r;
    public final long f8221s;
    public final TLObject v;
    public final TLObject f8222w;

    public h6(v7 v7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8215b = v7Var;
        this.f8216c = tLObject;
        this.d = tL_error;
        this.f8217e = callback2;
        this.f8218f = context;
        this.h = b6Var;
        this.f8219n = j10;
        this.f8220r = str;
        this.f8221s = j11;
        this.v = tLObject2;
        this.f8222w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        oc X;
        la0 la0Var;
        String str;
        oc X2;
        la0 la0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f8214a) {
            case 0:
                v7 v7Var = this.f8215b;
                TLObject tLObject = this.f8216c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f8217e;
                Context context = this.f8218f;
                org.telegram.ui.ActionBar.b6 b6Var = this.h;
                long j10 = this.f8219n;
                String str3 = this.f8220r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f8222w;
                long j11 = this.f8221s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = oc.a0(R);
                } else {
                    X = oc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(v7Var.f9045a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            v7.e0(context, b6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        ea eaVar = new ea(context, b6Var, j10, 6, str3, new p2(v7Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        eaVar.setOnDismissListener(new j6(callback2, zArr, 2));
                        eaVar.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        int i9 = R.raw.error;
                        int i10 = R.string.UnknownErrorCode;
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        org.telegram.ui.Cells.j2.q(i10, new Object[]{str}, X, i9, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new i6(v7Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                v7Var.D = false;
                v7Var.E = true;
                v7Var.G = 0L;
                v7Var.V();
                v7Var.Q(j11);
                v7Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v7Var.f9045a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(v7Var.f9045a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(v7Var.f9045a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity != null && (la0Var = launchActivity.f35532t0) != null) {
                    la0Var.c(true);
                    return;
                }
                return;
            default:
                v7 v7Var2 = this.f8215b;
                TLObject tLObject2 = this.f8216c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f8217e;
                Context context2 = this.f8218f;
                org.telegram.ui.ActionBar.b6 b6Var2 = this.h;
                long j12 = this.f8219n;
                String str4 = this.f8220r;
                long j13 = this.f8221s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f8222w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = oc.a0(R2);
                } else {
                    X2 = oc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(v7Var2.f9045a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            v7.e0(context2, b6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        ea eaVar2 = new ea(context2, b6Var2, j12, 6, str4, new p2(v7Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        eaVar2.setOnDismissListener(new j6(callback22, zArr2, 1));
                        eaVar2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        int i11 = R.raw.error;
                        int i12 = R.string.UnknownErrorCode;
                        if (tL_error2 != null) {
                            str2 = tL_error2.text;
                        }
                        org.telegram.ui.Cells.j2.q(i12, new Object[]{str2}, X2, i11, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new i6(v7Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                v7Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v7Var2.f9045a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(v7Var2.f9045a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(v7Var2.f9045a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.C1;
                if (launchActivity2 != null && (la0Var2 = launchActivity2.f35532t0) != null) {
                    la0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public h6(v7 v7Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f8215b = v7Var;
        this.f8216c = tLObject;
        this.d = tL_error;
        this.f8217e = callback2;
        this.f8218f = context;
        this.h = b6Var;
        this.f8219n = j10;
        this.f8220r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f8222w = starGift;
        this.f8221s = j11;
    }
}
