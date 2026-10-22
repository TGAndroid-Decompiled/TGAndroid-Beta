package ai;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja0;
public final class o8 implements Runnable {
    public final int f1940a = 1;
    public final ga f1941b;
    public final TLObject f1942c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f1943f;
    public final org.telegram.ui.ActionBar.d6 h;
    public final long f1944n;
    public final String f1945r;
    public final long f1946s;
    public final TLObject v;
    public final TLObject f1947w;

    public o8(ga gaVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1941b = gaVar;
        this.f1942c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1943f = context;
        this.h = d6Var;
        this.f1944n = j10;
        this.f1945r = str;
        this.f1946s = j11;
        this.v = tLObject2;
        this.f1947w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc X;
        ja0 ja0Var;
        String str;
        org.telegram.ui.Components.xc X2;
        ja0 ja0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f1940a) {
            case 0:
                ga gaVar = this.f1941b;
                TLObject tLObject = this.f1942c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f1943f;
                org.telegram.ui.ActionBar.d6 d6Var = this.h;
                long j10 = this.f1944n;
                String str3 = this.f1945r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f1947w;
                long j11 = this.f1946s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = org.telegram.ui.Components.xc.a0(R);
                } else {
                    X = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(gaVar.f1363a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            ga.e0(context, d6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        cd cdVar = new cd(context, d6Var, j10, 6, str3, new q3(gaVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        cdVar.setOnDismissListener(new q8(callback2, zArr, 2));
                        cdVar.show();
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
                        i2.e.s(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new p8(gaVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                gaVar.D = false;
                gaVar.E = true;
                gaVar.G = 0L;
                gaVar.V();
                gaVar.Q(j11);
                gaVar.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(gaVar.f1363a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(gaVar.f1363a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(gaVar.f1363a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && (ja0Var = launchActivity.f33203x0) != null) {
                    ja0Var.c(true);
                    return;
                }
                return;
            default:
                ga gaVar2 = this.f1941b;
                TLObject tLObject2 = this.f1942c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f1943f;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.h;
                long j12 = this.f1944n;
                String str4 = this.f1945r;
                long j13 = this.f1946s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f1947w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.xc.a0(R2);
                } else {
                    X2 = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(gaVar2.f1363a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            ga.e0(context2, d6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        cd cdVar2 = new cd(context2, d6Var2, j12, 6, str4, new q3(gaVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        cdVar2.setOnDismissListener(new q8(callback22, zArr2, 1));
                        cdVar2.show();
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
                        i2.e.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new p8(gaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                gaVar2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(gaVar2.f1363a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(gaVar2.f1363a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(gaVar2.f1363a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.H1;
                if (launchActivity2 != null && (ja0Var2 = launchActivity2.f33203x0) != null) {
                    ja0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public o8(ga gaVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1941b = gaVar;
        this.f1942c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1943f = context;
        this.h = d6Var;
        this.f1944n = j10;
        this.f1945r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f1947w = starGift;
        this.f1946s = j11;
    }
}
