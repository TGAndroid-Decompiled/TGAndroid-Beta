package ci;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p80;
public final class t7 implements Runnable {
    public final int f6031a = 1;
    public final e9 f6032b;
    public final TLObject f6033c;
    public final TLRPC.TL_error d;
    public final n10 f6034e;
    public final Context f6035f;
    public final org.telegram.ui.ActionBar.e6 h;
    public final long f6036n;
    public final String f6037r;
    public final long f6038s;
    public final TLObject f6039w;
    public final TLObject f6040x;

    public t7(e9 e9Var, TLObject tLObject, TLRPC.TL_error tL_error, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f6032b = e9Var;
        this.f6033c = tLObject;
        this.d = tL_error;
        this.f6034e = n10Var;
        this.f6035f = context;
        this.h = e6Var;
        this.f6036n = j10;
        this.f6037r = str;
        this.f6038s = j11;
        this.f6039w = tLObject2;
        this.f6040x = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fc X;
        p80 p80Var;
        String str;
        org.telegram.ui.Components.fc X2;
        p80 p80Var2;
        String str2;
        switch (this.f6031a) {
            case 0:
                e9 e9Var = this.f6032b;
                TLObject tLObject = this.f6033c;
                TLRPC.TL_error tL_error = this.d;
                n10 n10Var = this.f6034e;
                Context context = this.f6035f;
                org.telegram.ui.ActionBar.e6 e6Var = this.h;
                long j10 = this.f6036n;
                String str3 = this.f6037r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f6039w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f6040x;
                long j11 = this.f6038s;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null && Q.visibleDialog == null) {
                    X = org.telegram.ui.Components.fc.a0(Q);
                } else {
                    X = org.telegram.ui.Components.fc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (hp.s1(e9Var.f5029a).f23042j7) {
                            n10Var.a(Boolean.FALSE, null);
                            e9.c0(context, e6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        mb mbVar = new mb(context, e6Var, j10, 6, str3, new z2(e9Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, n10Var), 0L);
                        mbVar.setOnDismissListener(new u7(n10Var, zArr, 2));
                        mbVar.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        n10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        n10Var.a(Boolean.FALSE, null);
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        X.Q(2131624011, 36, bd.a0(null, null, 2131743888, str)).j();
                        return;
                    }
                }
                Utilities.d.c(new q7(e9Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                e9Var.D = false;
                e9Var.E = true;
                e9Var.G = 0L;
                e9Var.U();
                e9Var.P(j11);
                e9Var.S(true);
                n10Var.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(e9Var.f5029a).b();
                if (b10 != null && b10.a(j11)) {
                    SharedPreferences.Editor edit = hp.s1(e9Var.f5029a).f22999e7.edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = hp.s1(e9Var.f5029a).f22999e7.edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null && (p80Var = launchActivity.f41328y0) != null) {
                    p80Var.c(true);
                    return;
                }
                return;
            default:
                e9 e9Var2 = this.f6032b;
                TLObject tLObject2 = this.f6033c;
                TLRPC.TL_error tL_error2 = this.d;
                n10 n10Var2 = this.f6034e;
                Context context2 = this.f6035f;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.h;
                long j12 = this.f6036n;
                String str4 = this.f6037r;
                long j13 = this.f6038s;
                TLObject tLObject3 = this.f6039w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f6040x;
                org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
                if (Q2 != null && Q2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.fc.a0(Q2);
                } else {
                    X2 = org.telegram.ui.Components.fc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (hp.s1(e9Var2.f5029a).f23042j7) {
                            n10Var2.a(Boolean.FALSE, null);
                            e9.c0(context2, e6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        mb mbVar2 = new mb(context2, e6Var2, j12, 6, str4, new z2(e9Var2, zArr2, j13, tLObject3, tL_textWithEntities, n10Var2), 0L);
                        mbVar2.setOnDismissListener(new u7(n10Var2, zArr2, 1));
                        mbVar2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        n10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        n10Var2.a(Boolean.FALSE, null);
                        if (tL_error2 == null) {
                            str2 = "FAILED_SEND_STARS";
                        } else {
                            str2 = tL_error2.text;
                        }
                        X2.Q(2131624011, 36, bd.a0(null, null, 2131743888, str2)).j();
                        return;
                    }
                }
                Utilities.d.c(new q7(e9Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                e9Var2.S(true);
                n10Var2.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(e9Var2.f5029a).b();
                if (b11 != null && b11.a(j13)) {
                    SharedPreferences.Editor edit3 = hp.s1(e9Var2.f5029a).f22999e7.edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = hp.s1(e9Var2.f5029a).f22999e7.edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.K1;
                if (launchActivity2 != null && (p80Var2 = launchActivity2.f41328y0) != null) {
                    p80Var2.c(true);
                    return;
                }
                return;
        }
    }

    public t7(e9 e9Var, TLObject tLObject, TLRPC.TL_error tL_error, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f6032b = e9Var;
        this.f6033c = tLObject;
        this.d = tL_error;
        this.f6034e = n10Var;
        this.f6035f = context;
        this.h = e6Var;
        this.f6036n = j10;
        this.f6037r = str;
        this.f6039w = tL_payments_paymentFormStarGift;
        this.f6040x = starGift;
        this.f6038s = j11;
    }
}
