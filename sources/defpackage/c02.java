package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.p;
public final class c02 implements ku0 {
    public ValueAnimator a;
    public final s12 b;
    public final String c;
    public final long d;
    public final x02 e;

    public c02(x02 x02Var, s12 s12Var, String str, long j) {
        this.e = x02Var;
        this.b = s12Var;
        this.c = str;
        this.d = j;
    }

    @Override
    public final or0 A() {
        return null;
    }

    @Override
    public final void b() {
        z();
    }

    @Override
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override
    public final boolean h() {
        int i = this.e.G3;
        hq6 d0 = hq6.d0(i);
        long j = this.d;
        if (!d0.l(j) && !na7.q1(i).S3.contains(Long.valueOf(j))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z) {
        int i;
        ImageView backButton = this.e.U2.getBackButton();
        if (z) {
            i = 2131231243;
        } else {
            i = 2131231272;
        }
        gl.L3(backButton, i);
    }

    @Override
    public final void j() {
        z();
    }

    @Override
    public final void k(boolean z) {
        this.b.setNeedCloseConfirmation(z);
    }

    @Override
    public final void m(int i) {
        this.b.setCustomBackground(i);
    }

    @Override
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        x02 x02Var = this.e;
        int i = x02Var.G3;
        d dVar = x02Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        s12 s12Var = this.b;
        p pVar = null;
        if (z) {
            hd hdVar = new hd(3, null, x02Var.getContext());
            hdVar.q(150L);
            gta.v(i, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new tc(hdVar, (byte) 4), new pz1(s12Var, str, (byte) 2));
            gl.t1(s12Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            na7.q1(i).b4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, dVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            s12Var.K();
            gl.t1(s12Var);
            gr7 gr7Var = new gr7(dVar.getParentActivity());
            gr7Var.show();
            pVar.a1 = new ie(gr7Var, s12Var, str, (byte) 21);
            pVar.Z0 = x02Var.J0;
            gr7Var.c(pVar);
        }
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        int i3;
        float f;
        float f2;
        float f3;
        x02 x02Var = this.e;
        RadialProgressView radialProgressView = x02Var.z3;
        hn hnVar = x02Var.B3;
        p02 p02Var = x02Var.v2;
        s12 s12Var = this.b;
        if (p02Var == s12Var) {
            if (s12Var.Q || this.c != null) {
                hnVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new gm(j, 1.4f, hnVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    hnVar.setText(spannableStringBuilder);
                } else {
                    hnVar.setText(str);
                }
                hnVar.setTextColor(i2);
                hnVar.setEmojiColor(i2);
                boolean z5 = hv0.R0;
                if (bm2.h(i) >= 0.30000001192092896d) {
                    i3 = 301989888;
                } else {
                    i3 = 385875967;
                }
                hnVar.setBackground(bkb.g0(i, i3));
                float f4 = 0.0f;
                float f5 = 1.0f;
                if (x02Var.A3 != z) {
                    x02Var.A3 = z;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z) {
                        f3 = 0.0f;
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                        f3 = 1.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f3, f2).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new uz1(this, (byte) 0));
                    this.a.addListener(new vz1(this, z, (byte) 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (x02Var.y3 != z3) {
                    radialProgressView.animate().cancel();
                    if (z3) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = radialProgressView.animate();
                    if (z3) {
                        f4 = 1.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f4);
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f);
                    if (!z3) {
                        f5 = 0.1f;
                    }
                    scaleX.scaleY(f5).setDuration(250L).setListener(new vz1(this, z3, (byte) 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        p02 p02Var = this.e.v2;
        s12 s12Var = this.b;
        if (p02Var == s12Var && !s12Var.K.c) {
            s12Var.K();
        }
    }

    @Override
    public final void t(boolean z) {
        int i;
        a8 a8Var = this.b.M;
        if (a8Var != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            a8Var.setVisibility(i);
        }
    }

    @Override
    public final void u(int i, final int i2, boolean z) {
        int i3;
        x02 x02Var = this.e;
        final int i4 = x02Var.D4.b;
        final iv0 iv0Var = new iv0();
        int i5 = 0;
        if (x02Var.U1) {
            i3 = i4;
        } else {
            i3 = 0;
        }
        iv0Var.c(iv0Var.a, i3, x02Var.J0);
        x02Var.U1 = z;
        if (z) {
            i5 = i2;
        }
        iv0Var.c(iv0Var.b, i5, x02Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(s33.f);
        final s12 s12Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = bm2.f(floatValue, i4, i2);
                x02 x02Var2 = c02.this.e;
                x02Var2.k4 = f;
                x02Var2.j4 = true;
                x10 x10Var = x02Var2.U2;
                if (x10Var != null) {
                    x10Var.updateColors();
                    x10Var.invalidate();
                }
                x02Var2.D4.a(f);
                ry1 ry1Var = x02Var2.s3;
                if (ry1Var != null) {
                    ry1Var.invalidate();
                }
                s12Var.setCustomActionBarBackground(f);
                x02Var2.v2.invalidate();
                x02Var2.o3.invalidate();
                iv0Var.b(x10Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        x02 x02Var = this.e;
        if (isEmpty) {
            d dVar = x02Var.Z1;
            if (dVar instanceof mu1) {
                ar1 ar1Var = ((mu1) dVar).a0;
                ar1Var.setFieldText("@" + l7c.p(user) + " " + str);
            }
            x02Var.a(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        cj3 cj3Var = new cj3(bundle);
        gr7 gr7Var = new gr7(x02Var.getContext());
        cj3Var.E2 = new lt((Object) this, (Object) user, (Object) gr7Var, str, (byte) 5);
        gr7Var.show();
        gr7Var.c(cj3Var);
    }

    @Override
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override
    public final void z() {
        x02 x02Var = this.e;
        if (x02Var.v2 != this.b) {
            return;
        }
        x02Var.v0(false);
        x02Var.getWindow().setSoftInputMode(48);
        x02Var.dismiss();
        gl.d3(new jc((byte) 10), 150L);
    }

    @Override
    public final void a() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(String str) {
    }

    @Override
    public final void f(ArrayList arrayList) {
    }

    @Override
    public final void p(boolean z) {
    }

    @Override
    public final void r(int i) {
    }

    @Override
    public final void w(boolean z) {
    }

    @Override
    public final void x(int i) {
    }

    @Override
    public final void o(int i, boolean z) {
    }

    @Override
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }
}
