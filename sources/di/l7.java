package di;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r80;
public final class l7 implements Runnable {
    public final int f8982a = 1;
    public final u8 f8983b;
    public final TLObject f8984c;
    public final TLRPC.TL_error d;
    public final s10 f8985e;
    public final Context f8986f;
    public final org.telegram.ui.ActionBar.e6 h;
    public final long f8987n;
    public final String f8988r;
    public final long f8989s;
    public final TLObject f8990w;
    public final TLObject f8991x;

    public l7(u8 u8Var, TLObject tLObject, TLRPC.TL_error tL_error, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f8983b = u8Var;
        this.f8984c = tLObject;
        this.d = tL_error;
        this.f8985e = s10Var;
        this.f8986f = context;
        this.h = e6Var;
        this.f8987n = j3;
        this.f8988r = str;
        this.f8989s = j10;
        this.f8990w = tLObject2;
        this.f8991x = tL_textWithEntities;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc X;
        r80 r80Var;
        String str;
        org.telegram.ui.Components.cc X2;
        r80 r80Var2;
        String str2;
        switch (this.f8982a) {
            case 0:
                u8 u8Var = this.f8983b;
                TLObject tLObject = this.f8984c;
                TLRPC.TL_error tL_error = this.d;
                s10 s10Var = this.f8985e;
                Context context = this.f8986f;
                org.telegram.ui.ActionBar.e6 e6Var = this.h;
                long j3 = this.f8987n;
                String str3 = this.f8988r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f8990w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f8991x;
                long j10 = this.f8989s;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null && Q.visibleDialog == null) {
                    X = org.telegram.ui.Components.cc.a0(Q);
                } else {
                    X = org.telegram.ui.Components.cc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (np.s1(u8Var.f9529a).f25325k7) {
                            s10Var.a(Boolean.FALSE, null);
                            u8.c0(context, e6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        bb bbVar = new bb(context, e6Var, j3, 6, str3, new ai.e(u8Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, s10Var), 0L);
                        bbVar.setOnDismissListener(new m7(s10Var, zArr, 2));
                        bbVar.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        s10Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        s10Var.a(Boolean.FALSE, null);
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        X.Q(2131624012, 36, hd.a0(null, null, 2131743878, str)).j();
                        return;
                    }
                }
                Utilities.d.c(new i7(u8Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                u8Var.D = false;
                u8Var.E = true;
                u8Var.G = 0L;
                u8Var.U();
                u8Var.P(j10);
                u8Var.S(true);
                s10Var.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b10 = org.telegram.messenger.v1.a(u8Var.f9529a).b();
                if (b10 != null && b10.a(j10)) {
                    SharedPreferences.Editor edit = np.s1(u8Var.f9529a).f25283f7.edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = np.s1(u8Var.f9529a).f25283f7.edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && (r80Var = launchActivity.f42663w0) != null) {
                    r80Var.c(true);
                    return;
                }
                return;
            default:
                u8 u8Var2 = this.f8983b;
                TLObject tLObject2 = this.f8984c;
                TLRPC.TL_error tL_error2 = this.d;
                s10 s10Var2 = this.f8985e;
                Context context2 = this.f8986f;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.h;
                long j11 = this.f8987n;
                String str4 = this.f8988r;
                long j12 = this.f8989s;
                TLObject tLObject3 = this.f8990w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f8991x;
                org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                if (Q2 != null && Q2.visibleDialog == null) {
                    X2 = org.telegram.ui.Components.cc.a0(Q2);
                } else {
                    X2 = org.telegram.ui.Components.cc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (np.s1(u8Var2.f9529a).f25325k7) {
                            s10Var2.a(Boolean.FALSE, null);
                            u8.c0(context2, e6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        bb bbVar2 = new bb(context2, e6Var2, j11, 6, str4, new ai.e(u8Var2, zArr2, j12, tLObject3, tL_textWithEntities, s10Var2, 2), 0L);
                        bbVar2.setOnDismissListener(new m7(s10Var2, zArr2, 1));
                        bbVar2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        s10Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        s10Var2.a(Boolean.FALSE, null);
                        if (tL_error2 == null) {
                            str2 = "FAILED_SEND_STARS";
                        } else {
                            str2 = tL_error2.text;
                        }
                        X2.Q(2131624012, 36, hd.a0(null, null, 2131743878, str2)).j();
                        return;
                    }
                }
                Utilities.d.c(new i7(u8Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                u8Var2.S(true);
                s10Var2.a(Boolean.TRUE, null);
                org.telegram.messenger.t1 b11 = org.telegram.messenger.v1.a(u8Var2.f9529a).b();
                if (b11 != null && b11.a(j12)) {
                    SharedPreferences.Editor edit3 = np.s1(u8Var2.f9529a).f25283f7.edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = np.s1(u8Var2.f9529a).f25283f7.edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.H1;
                if (launchActivity2 != null && (r80Var2 = launchActivity2.f42663w0) != null) {
                    r80Var2.c(true);
                    return;
                }
                return;
        }
    }

    public l7(u8 u8Var, TLObject tLObject, TLRPC.TL_error tL_error, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f8983b = u8Var;
        this.f8984c = tLObject;
        this.d = tL_error;
        this.f8985e = s10Var;
        this.f8986f = context;
        this.h = e6Var;
        this.f8987n = j3;
        this.f8988r = str;
        this.f8990w = tL_payments_paymentFormStarGift;
        this.f8991x = starGift;
        this.f8989s = j10;
    }
}
