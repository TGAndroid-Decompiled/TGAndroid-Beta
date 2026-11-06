package bi;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;
public final class s8 implements Runnable {
    public final int f4696a = 1;
    public final ea f4697b;
    public final TLObject f4698c;
    public final TLRPC.TL_error d;
    public final v10 f4699e;
    public final Context f4700f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f4701n;
    public final String f4702r;
    public final long f4703s;
    public final TLObject f4704w;
    public final TLObject f4705x;

    public s8(ea eaVar, TLObject tLObject, TLRPC.TL_error tL_error, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f4697b = eaVar;
        this.f4698c = tLObject;
        this.d = tL_error;
        this.f4699e = v10Var;
        this.f4700f = context;
        this.h = f6Var;
        this.f4701n = j3;
        this.f4702r = str;
        this.f4703s = j10;
        this.f4704w = tLObject2;
        this.f4705x = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hc X;
        r80 r80Var;
        String str;
        org.telegram.ui.Components.hc X2;
        r80 r80Var2;
        String str2;
        switch (this.f4696a) {
            case 0:
                ea eaVar = this.f4697b;
                TLObject tLObject = this.f4698c;
                TLRPC.TL_error tL_error = this.d;
                v10 v10Var = this.f4699e;
                Context context = this.f4700f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.f4701n;
                String str3 = this.f4702r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f4704w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f4705x;
                long j10 = this.f4703s;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null && Q.visibleDialog == null) {
                    X = org.telegram.ui.Components.hc.a0(Q);
                } else {
                    X = org.telegram.ui.Components.hc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (qp.s1(eaVar.f3807a).f24802j7) {
                            v10Var.a(Boolean.FALSE, null);
                            ea.c0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        tc tcVar = new tc(context, f6Var, j3, 6, str3, new m3(eaVar, zArr, tL_payments_paymentFormStarGift, starGift, j10, v10Var), 0L);
                        tcVar.setOnDismissListener(new t8(v10Var, zArr, 2));
                        tcVar.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        v10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        v10Var.a(Boolean.FALSE, null);
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        X.Q(2131624011, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str)).j();
                        return;
                    }
                }
                Utilities.d.c(new p8(eaVar, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                eaVar.D = false;
                eaVar.E = true;
                eaVar.G = 0L;
                eaVar.U();
                eaVar.P(j10);
                eaVar.S(true);
                v10Var.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(eaVar.f3807a).b();
                if (b10 != null && b10.a(j10)) {
                    SharedPreferences.Editor edit = qp.s1(eaVar.f3807a).f24759e7.edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = qp.s1(eaVar.f3807a).f24759e7.edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (r80Var = launchActivity.f41290v0) != null) {
                    r80Var.c(true);
                    return;
                }
                return;
            default:
                ea eaVar2 = this.f4697b;
                TLObject tLObject2 = this.f4698c;
                TLRPC.TL_error tL_error2 = this.d;
                v10 v10Var2 = this.f4699e;
                Context context2 = this.f4700f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.f4701n;
                String str4 = this.f4702r;
                long j12 = this.f4703s;
                TLObject tLObject3 = this.f4704w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f4705x;
                org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                if (Q2 != null && Q2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.hc.a0(Q2);
                } else {
                    X2 = org.telegram.ui.Components.hc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (qp.s1(eaVar2.f3807a).f24802j7) {
                            v10Var2.a(Boolean.FALSE, null);
                            ea.c0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        tc tcVar2 = new tc(context2, f6Var2, j11, 6, str4, new m3(eaVar2, zArr2, j12, tLObject3, tL_textWithEntities, v10Var2), 0L);
                        tcVar2.setOnDismissListener(new t8(v10Var2, zArr2, 1));
                        tcVar2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        v10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        v10Var2.a(Boolean.FALSE, null);
                        if (tL_error2 == null) {
                            str2 = "FAILED_SEND_STARS";
                        } else {
                            str2 = tL_error2.text;
                        }
                        X2.Q(2131624011, 36, org.telegram.messenger.hd.a0(null, null, 2131743879, str2)).j();
                        return;
                    }
                }
                Utilities.d.c(new p8(eaVar2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                eaVar2.S(true);
                v10Var2.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(eaVar2.f3807a).b();
                if (b11 != null && b11.a(j12)) {
                    SharedPreferences.Editor edit3 = qp.s1(eaVar2.f3807a).f24759e7.edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = qp.s1(eaVar2.f3807a).f24759e7.edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (r80Var2 = launchActivity2.f41290v0) != null) {
                    r80Var2.c(true);
                    return;
                }
                return;
        }
    }

    public s8(ea eaVar, TLObject tLObject, TLRPC.TL_error tL_error, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f4697b = eaVar;
        this.f4698c = tLObject;
        this.d = tL_error;
        this.f4699e = v10Var;
        this.f4700f = context;
        this.h = f6Var;
        this.f4701n = j3;
        this.f4702r = str;
        this.f4704w = tL_payments_paymentFormStarGift;
        this.f4705x = starGift;
        this.f4703s = j10;
    }
}
