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
import org.telegram.ui.pa0;
public final class o8 implements Runnable {
    public final int f1941a = 1;
    public final ha f1942b;
    public final TLObject f1943c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f1944f;
    public final org.telegram.ui.ActionBar.g6 h;
    public final long f1945n;
    public final String f1946r;
    public final long f1947s;
    public final TLObject v;
    public final TLObject f1948w;

    public o8(ha haVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f1942b = haVar;
        this.f1943c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1944f = context;
        this.h = g6Var;
        this.f1945n = j10;
        this.f1946r = str;
        this.f1947s = j11;
        this.v = tLObject2;
        this.f1948w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.xc X;
        pa0 pa0Var;
        String str;
        org.telegram.ui.Components.xc X2;
        pa0 pa0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f1941a) {
            case 0:
                ha haVar = this.f1942b;
                TLObject tLObject = this.f1943c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f1944f;
                org.telegram.ui.ActionBar.g6 g6Var = this.h;
                long j10 = this.f1945n;
                String str3 = this.f1946r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f1948w;
                long j11 = this.f1947s;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = org.telegram.ui.Components.xc.a0(R);
                } else {
                    X = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(haVar.f1413a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            ha.e0(context, g6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        dd ddVar = new dd(context, g6Var, j10, 6, str3, new q3(haVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        ddVar.setOnDismissListener(new q8(callback2, zArr, 2));
                        ddVar.show();
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
                        i2.o1.t(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new p8(haVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                haVar.D = false;
                haVar.E = true;
                haVar.G = 0L;
                haVar.V();
                haVar.Q(j11);
                haVar.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(haVar.f1413a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(haVar.f1413a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(haVar.f1413a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.J1;
                if (launchActivity != null && (pa0Var = launchActivity.f33501x0) != null) {
                    pa0Var.c(true);
                    return;
                }
                return;
            default:
                ha haVar2 = this.f1942b;
                TLObject tLObject2 = this.f1943c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f1944f;
                org.telegram.ui.ActionBar.g6 g6Var2 = this.h;
                long j12 = this.f1945n;
                String str4 = this.f1946r;
                long j13 = this.f1947s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f1948w;
                org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.xc.a0(R2);
                } else {
                    X2 = org.telegram.ui.Components.xc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(haVar2.f1413a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            ha.e0(context2, g6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        dd ddVar2 = new dd(context2, g6Var2, j12, 6, str4, new q3(haVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        ddVar2.setOnDismissListener(new q8(callback22, zArr2, 1));
                        ddVar2.show();
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
                        i2.o1.t(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new p8(haVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                haVar2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(haVar2.f1413a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(haVar2.f1413a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(haVar2.f1413a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.J1;
                if (launchActivity2 != null && (pa0Var2 = launchActivity2.f33501x0) != null) {
                    pa0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public o8(ha haVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f1942b = haVar;
        this.f1943c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f1944f = context;
        this.h = g6Var;
        this.f1945n = j10;
        this.f1946r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f1948w = starGift;
        this.f1947s = j11;
    }
}
