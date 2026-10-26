package bi;

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
import org.telegram.ui.oa0;
public final class k8 implements Runnable {
    public final int f4968a = 1;
    public final ca f4969b;
    public final TLObject f4970c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f4971f;
    public final org.telegram.ui.ActionBar.u6 h;
    public final long f4972n;
    public final String f4973r;
    public final long f4974s;
    public final TLObject v;
    public final TLObject f4975w;

    public k8(ca caVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f4969b = caVar;
        this.f4970c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f4971f = context;
        this.h = u6Var;
        this.f4972n = j10;
        this.f4973r = str;
        this.f4974s = j11;
        this.v = tLObject2;
        this.f4975w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc Y;
        oa0 oa0Var;
        String str;
        org.telegram.ui.Components.wc Y2;
        oa0 oa0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f4968a) {
            case 0:
                ca caVar = this.f4969b;
                TLObject tLObject = this.f4970c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f4971f;
                org.telegram.ui.ActionBar.u6 u6Var = this.h;
                long j10 = this.f4972n;
                String str3 = this.f4973r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f4975w;
                long j11 = this.f4974s;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    Y = org.telegram.ui.Components.wc.b0(R);
                } else {
                    Y = org.telegram.ui.Components.wc.Y();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(caVar.f4441a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            ca.e0(context, u6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        tc tcVar = new tc(context, u6Var, j10, 6, str3, new m3(caVar, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
                        tcVar.setOnDismissListener(new m8(callback2, zArr, 2));
                        tcVar.show();
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
                        ic.a.s(i11, new Object[]{str}, Y, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new l8(caVar, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                caVar.D = false;
                caVar.E = true;
                caVar.G = 0L;
                caVar.V();
                caVar.Q(j11);
                caVar.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(caVar.f4441a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(caVar.f4441a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(caVar.f4441a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && (oa0Var = launchActivity.f35567x0) != null) {
                    oa0Var.c(true);
                    return;
                }
                return;
            default:
                ca caVar2 = this.f4969b;
                TLObject tLObject2 = this.f4970c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f4971f;
                org.telegram.ui.ActionBar.u6 u6Var2 = this.h;
                long j12 = this.f4972n;
                String str4 = this.f4973r;
                long j13 = this.f4974s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f4975w;
                org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    Y2 = org.telegram.ui.Components.wc.b0(R2);
                } else {
                    Y2 = org.telegram.ui.Components.wc.Y();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(caVar2.f4441a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            ca.e0(context2, u6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        tc tcVar2 = new tc(context2, u6Var2, j12, 6, str4, new m3(caVar2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
                        tcVar2.setOnDismissListener(new m8(callback22, zArr2, 1));
                        tcVar2.show();
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
                        ic.a.s(i13, new Object[]{str2}, Y2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new l8(caVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                caVar2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(caVar2.f4441a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(caVar2.f4441a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(caVar2.f4441a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.I1;
                if (launchActivity2 != null && (oa0Var2 = launchActivity2.f35567x0) != null) {
                    oa0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public k8(ca caVar, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f4969b = caVar;
        this.f4970c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f4971f = context;
        this.h = u6Var;
        this.f4972n = j10;
        this.f4973r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f4975w = starGift;
        this.f4974s = j11;
    }
}
