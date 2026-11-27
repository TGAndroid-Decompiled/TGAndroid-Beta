package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.p;
public final class s02 implements uu0 {
    public ValueAnimator a;
    public final j22 b;
    public final String c;
    public final long d;
    public final n12 e;

    public s02(n12 n12Var, j22 j22Var, String str, long j) {
        this.e = n12Var;
        this.b = j22Var;
        this.c = str;
        this.d = j;
    }

    @Override
    public final wr0 A() {
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
        ls6 d0 = ls6.d0(i);
        long j = this.d;
        if (!d0.l(j) && !uc7.s1(i).T3.contains(Long.valueOf(j))) {
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
        hl.L3(backButton, i);
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
        n12 n12Var = this.e;
        int i = n12Var.G3;
        e eVar = n12Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        j22 j22Var = this.b;
        p pVar = null;
        if (z) {
            id idVar = new id(3, null, n12Var.getContext());
            idVar.q(150L);
            jxa.v(i, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new uc(idVar, (byte) 4), new rx1(j22Var, str, (byte) 3));
            hl.t1(j22Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            uc7.s1(i).j4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, eVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            j22Var.J();
            hl.t1(j22Var);
            mu7 mu7Var = new mu7(eVar.getParentActivity());
            mu7Var.show();
            pVar.a1 = new ie(mu7Var, j22Var, str, (byte) 21);
            pVar.Z0 = n12Var.J0;
            mu7Var.c(pVar);
        }
    }

    @Override
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        int i3;
        float f;
        float f2;
        float f3;
        n12 n12Var = this.e;
        RadialProgressView radialProgressView = n12Var.z3;
        in inVar = n12Var.B3;
        f12 f12Var = n12Var.v2;
        j22 j22Var = this.b;
        if (f12Var == j22Var) {
            if (j22Var.Q || this.c != null) {
                inVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new hm(j, 1.4f, inVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    inVar.setText(spannableStringBuilder);
                } else {
                    inVar.setText(str);
                }
                inVar.setTextColor(i2);
                inVar.setEmojiColor(i2);
                boolean z5 = rv0.R0;
                if (vm2.h(i) >= 0.30000001192092896d) {
                    i3 = 301989888;
                } else {
                    i3 = 385875967;
                }
                inVar.setBackground(aob.g0(i, i3));
                float f4 = 0.0f;
                float f5 = 1.0f;
                if (n12Var.A3 != z) {
                    n12Var.A3 = z;
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
                    duration.addUpdateListener(new az1(this, (byte) 1));
                    this.a.addListener(new l02(this, z, (byte) 0));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (n12Var.y3 != z3) {
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
                    scaleX.scaleY(f5).setDuration(250L).setListener(new l02(this, z3, (byte) 1)).start();
                }
            }
        }
    }

    @Override
    public final void s() {
        f12 f12Var = this.e.v2;
        j22 j22Var = this.b;
        if (f12Var == j22Var && !j22Var.K.c) {
            j22Var.J();
        }
    }

    @Override
    public final void t(boolean z) {
        int i;
        b8 b8Var = this.b.M;
        if (b8Var != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            b8Var.setVisibility(i);
        }
    }

    @Override
    public final void u(int i, final int i2, boolean z) {
        int i3;
        n12 n12Var = this.e;
        final int i4 = n12Var.D4.b;
        final sv0 sv0Var = new sv0();
        int i5 = 0;
        if (n12Var.U1) {
            i3 = i4;
        } else {
            i3 = 0;
        }
        sv0Var.c(sv0Var.a, i3, n12Var.J0);
        n12Var.U1 = z;
        if (z) {
            i5 = i2;
        }
        sv0Var.c(sv0Var.b, i5, n12Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(k43.f);
        final j22 j22Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = vm2.f(floatValue, i4, i2);
                n12 n12Var2 = s02.this.e;
                n12Var2.k4 = f;
                n12Var2.j4 = true;
                y10 y10Var = n12Var2.U2;
                if (y10Var != null) {
                    y10Var.updateColors();
                    y10Var.invalidate();
                }
                n12Var2.D4.a(f);
                jz1 jz1Var = n12Var2.s3;
                if (jz1Var != null) {
                    jz1Var.invalidate();
                }
                j22Var.setCustomActionBarBackground(f);
                n12Var2.v2.invalidate();
                n12Var2.o3.invalidate();
                sv0Var.b(y10Var, floatValue);
            }
        });
        duration.start();
    }

    @Override
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        n12 n12Var = this.e;
        if (isEmpty) {
            e eVar = n12Var.Z1;
            if (eVar instanceof zu1) {
                nr1 nr1Var = ((zu1) eVar).a0;
                nr1Var.setFieldText("@" + lbc.p(user) + " " + str);
            }
            n12Var.a(true);
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
        uj3 uj3Var = new uj3(bundle);
        mu7 mu7Var = new mu7(n12Var.getContext());
        uj3Var.E2 = new pt((Object) this, (Object) user, (Object) mu7Var, str, (byte) 5);
        mu7Var.show();
        mu7Var.c(uj3Var);
    }

    @Override
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override
    public final void z() {
        n12 n12Var = this.e;
        if (n12Var.v2 != this.b) {
            return;
        }
        n12Var.w0(false);
        n12Var.getWindow().setSoftInputMode(48);
        n12Var.dismiss();
        hl.d3(new kc((byte) 10), 150L);
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
