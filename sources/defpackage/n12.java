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
public final class n12 implements uv0 {
    public ValueAnimator a;
    public final e32 b;
    public final String c;
    public final long d;
    public final i22 e;

    public n12(i22 i22Var, e32 e32Var, String str, long j) {
        this.e = i22Var;
        this.b = e32Var;
        this.c = str;
        this.d = j;
    }

    @Override
    public final ws0 A() {
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
        hs6 d0 = hs6.d0(i);
        long j = this.d;
        if (!d0.l(j) && !oc7.r1(i).S3.contains(Long.valueOf(j))) {
            return false;
        }
        return true;
    }

    @Override
    public final void i(boolean z) {
        int i;
        ImageView backButton = this.e.U2.getBackButton();
        if (z) {
            i = 2131231244;
        } else {
            i = 2131231273;
        }
        gm.L3(backButton, i);
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
        i22 i22Var = this.e;
        int i = i22Var.G3;
        d dVar = i22Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        e32 e32Var = this.b;
        p pVar = null;
        if (z) {
            he heVar = new he(3, null, i22Var.getContext());
            heVar.q(150L);
            jva.v(i, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new td(heVar, (byte) 4), new qy1(e32Var, str, (byte) 3));
            gm.t1(e32Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            oc7.r1(i).d4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, dVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            e32Var.J();
            gm.t1(e32Var);
            ht7 ht7Var = new ht7(dVar.getParentActivity());
            ht7Var.show();
            pVar.a1 = new jf(ht7Var, e32Var, str, (byte) 21);
            pVar.Z0 = i22Var.J0;
            ht7Var.c(pVar);
        }
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        int i3;
        float f;
        float f2;
        float f3;
        i22 i22Var = this.e;
        RadialProgressView radialProgressView = i22Var.z3;
        io ioVar = i22Var.B3;
        a22 a22Var = i22Var.v2;
        e32 e32Var = this.b;
        if (a22Var == e32Var) {
            if (e32Var.Q || this.c != null) {
                ioVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new gn(j, 1.4f, ioVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    ioVar.setText(spannableStringBuilder);
                } else {
                    ioVar.setText(str);
                }
                ioVar.setTextColor(i2);
                ioVar.setEmojiColor(i2);
                boolean z5 = qw0.R0;
                if (on2.h(i) >= 0.30000001192092896d) {
                    i3 = 301989888;
                } else {
                    i3 = 385875967;
                }
                ioVar.setBackground(cmb.g0(i, i3));
                float f4 = 0.0f;
                float f5 = 1.0f;
                if (i22Var.A3 != z) {
                    i22Var.A3 = z;
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
                    duration.addUpdateListener(new et1(this, (byte) 2));
                    this.a.addListener(new g12(this, z, (byte) 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (i22Var.y3 != z3) {
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
                    scaleX.scaleY(f5).setDuration(250L).setListener(new g12(this, z3, (byte) 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        a22 a22Var = this.e.v2;
        e32 e32Var = this.b;
        if (a22Var == e32Var && !e32Var.K.c) {
            e32Var.J();
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
        i22 i22Var = this.e;
        final int i4 = i22Var.D4.b;
        final rw0 rw0Var = new rw0();
        int i5 = 0;
        if (i22Var.U1) {
            i3 = i4;
        } else {
            i3 = 0;
        }
        rw0Var.c(rw0Var.a, i3, i22Var.J0);
        i22Var.U1 = z;
        if (z) {
            i5 = i2;
        }
        rw0Var.c(rw0Var.b, i5, i22Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(d53.f);
        final e32 e32Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = on2.f(floatValue, i4, i2);
                i22 i22Var2 = n12.this.e;
                i22Var2.k4 = f;
                i22Var2.j4 = true;
                x20 x20Var = i22Var2.U2;
                if (x20Var != null) {
                    x20Var.updateColors();
                    x20Var.invalidate();
                }
                i22Var2.D4.a(f);
                e02 e02Var = i22Var2.s3;
                if (e02Var != null) {
                    e02Var.invalidate();
                }
                e32Var.setCustomActionBarBackground(f);
                i22Var2.v2.invalidate();
                i22Var2.o3.invalidate();
                rw0Var.b(x20Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        i22 i22Var = this.e;
        if (isEmpty) {
            d dVar = i22Var.Z1;
            if (dVar instanceof yv1) {
                ms1 ms1Var = ((yv1) dVar).a0;
                ms1Var.setFieldText("@" + m9c.p(user) + " " + str);
            }
            i22Var.a(true);
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
        nk3 nk3Var = new nk3(bundle);
        ht7 ht7Var = new ht7(i22Var.getContext());
        nk3Var.E2 = new lu((Object) this, (Object) user, (Object) ht7Var, str, (byte) 5);
        ht7Var.show();
        ht7Var.c(nk3Var);
    }

    @Override
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override
    public final void z() {
        i22 i22Var = this.e;
        if (i22Var.v2 != this.b) {
            return;
        }
        i22Var.v0(false);
        i22Var.getWindow().setSoftInputMode(48);
        i22Var.dismiss();
        gm.d3(new jd((byte) 10), 150L);
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
