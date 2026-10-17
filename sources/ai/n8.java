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
import org.telegram.ui.la0;
public final class n8 implements Runnable {
    public final int f1899a = 1;
    public final fa f1900b;
    public final TLObject f1901c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f1902f;
    public final org.telegram.ui.ActionBar.d6 h;
    public final long f1903n;
    public final String f1904r;
    public final long f1905s;
    public final TLObject v;
    public final TLObject f1906w;

    public n8(fa faVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1900b = faVar;
        this.f1901c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1902f = context;
        this.h = d6Var;
        this.f1903n = j10;
        this.f1904r = str;
        this.f1905s = j11;
        this.v = tLObject2;
        this.f1906w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc X;
        la0 la0Var;
        String str;
        org.telegram.ui.Components.xc X2;
        la0 la0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f1899a) {
            case 0:
                fa faVar = this.f1900b;
                TLObject tLObject = this.f1901c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f1902f;
                org.telegram.ui.ActionBar.d6 d6Var = this.h;
                long j10 = this.f1903n;
                String str3 = this.f1904r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f1906w;
                long j11 = this.f1905s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = org.telegram.ui.Components.xc.a0(R);
                } else {
                    X = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(faVar.f1311a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            fa.e0(context, d6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        bd bdVar = new bd(context, d6Var, j10, 6, str3, new b4(faVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        bdVar.setOnDismissListener(new p8(callback2, zArr, 2));
                        bdVar.show();
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
                        i0.a.s(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new o8(faVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                faVar.D = false;
                faVar.E = true;
                faVar.G = 0L;
                faVar.V();
                faVar.Q(j11);
                faVar.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(faVar.f1311a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(faVar.f1311a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(faVar.f1311a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && (la0Var = launchActivity.f33187x0) != null) {
                    la0Var.c(true);
                    return;
                }
                return;
            default:
                fa faVar2 = this.f1900b;
                TLObject tLObject2 = this.f1901c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f1902f;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.h;
                long j12 = this.f1903n;
                String str4 = this.f1904r;
                long j13 = this.f1905s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f1906w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.xc.a0(R2);
                } else {
                    X2 = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(faVar2.f1311a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            fa.e0(context2, d6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        bd bdVar2 = new bd(context2, d6Var2, j12, 6, str4, new b4(faVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        bdVar2.setOnDismissListener(new p8(callback22, zArr2, 1));
                        bdVar2.show();
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
                        i0.a.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new o8(faVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                faVar2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(faVar2.f1311a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(faVar2.f1311a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(faVar2.f1311a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.H1;
                if (launchActivity2 != null && (la0Var2 = launchActivity2.f33187x0) != null) {
                    la0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public n8(fa faVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1900b = faVar;
        this.f1901c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1902f = context;
        this.h = d6Var;
        this.f1903n = j10;
        this.f1904r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f1906w = starGift;
        this.f1905s = j11;
    }
}
