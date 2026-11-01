package ag;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.my;
import org.telegram.ui.qq;
import org.telegram.ui.u71;
import org.telegram.ui.us0;
import org.telegram.ui.vs0;
import org.telegram.ui.ws0;
import org.telegram.ui.xs0;
import org.telegram.ui.zs0;
import vh.t5;
public final class u2 implements TextWatcher {
    public final int f742a;
    public Object f743b;
    public final Object f744c;

    public u2(int i10, Object obj, Object obj2) {
        this.f742a = i10;
        this.f743b = obj;
        this.f744c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        boolean z10;
        float f7;
        int i10 = this.f742a;
        s4.c1 c1Var = null;
        String str = null;
        s4.c1 c1Var2 = null;
        Object obj = this.f744c;
        switch (i10) {
            case 0:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.f743b).getAlpha() > 0.0f) {
                    org.telegram.messenger.i0.r(runnableArr[0]);
                    org.telegram.messenger.i0.g3(runnableArr[0]);
                    return;
                }
                return;
            case 1:
                ((String[]) this.f743b)[0] = editable.toString();
                ((bi.n) obj).run();
                return;
            case 2:
                ig.s sVar = (ig.s) obj;
                ig.u uVar = (ig.u) sVar.h;
                if (!sVar.f8443b && ((String) this.f743b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f743b).toString(), editable.toString())) {
                    int b10 = w7.u.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = sVar.f8444c;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(uVar.f8477m1), b10, Color.green(uVar.f8477m1), Color.blue(uVar.f8477m1));
                        } else {
                            argb = Color.argb(Color.alpha(uVar.f8477m1), Color.red(uVar.f8477m1), Color.green(uVar.f8477m1), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(uVar.f8477m1), Color.red(uVar.f8477m1), b10, Color.blue(uVar.f8477m1));
                    }
                    int i12 = ig.u.f8473q1;
                    uVar.I0(argb, 5);
                    return;
                }
                return;
            case 3:
                jn jnVar = (jn) ((fg.j) obj).e;
                gn gnVar = (gn) this.f743b;
                if (gnVar.getTag() == null) {
                    s4.c1 K = jnVar.f27511s.K(jnVar.f27505p0);
                    if (K != null && jnVar.f27520y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        k6.l(editable, gnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        jnVar.f27520y.setDirection(1);
                        jnVar.f27520y.setDelegate(gnVar);
                        jnVar.f27520y.setTranslationY(K.f47909a.getY());
                        jnVar.f27520y.e();
                    }
                    jnVar.P = editable;
                    if (K != null) {
                        jn.O(jnVar, K.f47909a, jnVar.f27505p0);
                    }
                    jnVar.W();
                    return;
                }
                return;
            case 4:
                jn jnVar2 = (jn) ((fg.j) obj).e;
                u71 u71Var = jnVar2.f27511s;
                hn hnVar = (hn) this.f743b;
                View F = u71Var.F(hnVar);
                if (F != null) {
                    c1Var = u71Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f47909a;
                    int b11 = c1Var.b();
                    int i13 = b11 - jnVar2.f27513t0;
                    if (i13 >= 0 && i13 < jnVar2.K.length) {
                        if (jnVar2.f27520y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            k6.l(editable, hnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                jnVar2.f27520y.setDirection(0);
                                jnVar2.f27520y.setTranslationY(y3);
                            } else {
                                jnVar2.f27520y.setDirection(1);
                                jnVar2.f27520y.setTranslationY(view.getY());
                            }
                            jnVar2.f27520y.setDelegate(hnVar);
                            jnVar2.f27520y.e();
                        }
                        jnVar2.K[i13] = editable;
                        jn.O(jnVar2, hnVar, b11);
                        jnVar2.W();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f33433y == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f33430s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f743b).get()) {
                            passcodeActivity.f33430s.callOnClick();
                        }
                        org.telegram.messenger.i0.Y3(passcodeActivity.f33430s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f33430s.getVisibility() != 0) {
                        org.telegram.messenger.i0.Y3(passcodeActivity.f33430s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 7:
                zs0 zs0Var = ((xs0) obj).d;
                us0 us0Var = (us0) this.f743b;
                if (us0Var.getTag() == null) {
                    s4.c1 K2 = zs0Var.f44056c.K(zs0Var.f44064i0);
                    if (K2 != null && zs0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        k6.l(editable, us0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zs0Var.Q.setDirection(1);
                        zs0Var.Q.setDelegate(us0Var);
                        zs0Var.Q.setTranslationY(K2.f47909a.getY());
                        zs0Var.Q.e();
                    }
                    zs0Var.E = editable;
                    if (K2 != null) {
                        zs0.h0(zs0Var, K2.f47909a, zs0Var.f44064i0);
                    }
                    zs0Var.n0();
                    return;
                }
                return;
            case 8:
                zs0 zs0Var2 = ((xs0) obj).d;
                vs0 vs0Var = (vs0) this.f743b;
                if (vs0Var.getTag() == null) {
                    s4.c1 K3 = zs0Var2.f44056c.K(zs0Var2.f44064i0);
                    if (K3 != null && zs0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        k6.l(editable, vs0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zs0Var2.Q.setDirection(1);
                        zs0Var2.Q.setDelegate(vs0Var);
                        zs0Var2.Q.setTranslationY(K3.f47909a.getY());
                        zs0Var2.Q.e();
                    }
                    zs0Var2.F = editable;
                    if (K3 != null) {
                        zs0.h0(zs0Var2, K3.f47909a, zs0Var2.f44065j0);
                    }
                    zs0Var2.n0();
                    return;
                }
                return;
            case 9:
                zs0 zs0Var3 = ((xs0) obj).d;
                u71 u71Var2 = zs0Var3.f44056c;
                ws0 ws0Var = (ws0) this.f743b;
                View F2 = u71Var2.F(ws0Var);
                if (F2 != null) {
                    c1Var2 = u71Var2.T(F2);
                }
                if (c1Var2 != null) {
                    View view2 = c1Var2.f47909a;
                    int b12 = c1Var2.b() - zs0Var3.f44069n0;
                    if (b12 >= 0 && b12 < zs0Var3.f44080w.length) {
                        if (zs0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            k6.l(editable, ws0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - org.telegram.messenger.i0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                zs0Var3.Q.setDirection(0);
                                zs0Var3.Q.setTranslationY(y10);
                            } else {
                                zs0Var3.Q.setDirection(1);
                                zs0Var3.Q.setTranslationY(view2.getY());
                            }
                            zs0Var3.Q.setDelegate(ws0Var);
                            zs0Var3.Q.e();
                        }
                        zs0Var3.f44080w[b12] = editable;
                        zs0.h0(zs0Var3, ws0Var, b12);
                        zs0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                View[] viewArr = (View[]) this.f743b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((ph.m) obj).f45227d2.e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewPropertyAnimator animate = viewArr[0].animate();
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.6f;
                    }
                    animate.alpha(f7).setDuration(180L).start();
                    viewArr[0].setEnabled(z10);
                    viewArr[0].setClickable(z10);
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 11:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            case 12:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            case 13:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            case 14:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            case 15:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            case 16:
                ((String[]) this.f743b)[0] = editable.toString();
                ((my) obj).f31183f3.O(true);
                return;
            default:
                ((vh.r0) this.f743b).run();
                t5 t5Var = (t5) obj;
                org.telegram.ui.Cells.m3 m3Var = t5Var.Q1;
                if (!t5Var.U1) {
                    if (t5Var.V1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        t5Var.U1 = true;
                        m3Var.d.setText(substring);
                        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
                        k3Var.setSelection(0, k3Var.getText().length());
                        t5Var.U1 = false;
                        t5Var.V1 = false;
                        t5.d1(t5Var, substring);
                        return;
                    }
                    if (editable != null) {
                        str = editable.toString();
                    }
                    t5.d1(t5Var, str);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f742a) {
            case 0:
            case 1:
                return;
            case 2:
                this.f743b = charSequence.toString();
                return;
            case 3:
            case 4:
                return;
            case 5:
                EditText editText = (EditText) this.f743b;
                editText.post(new qq(this, editText, (AtomicReference) this.f744c, 28));
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.f742a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return;
            default:
                t5 t5Var = (t5) this.f744c;
                if (!t5Var.U1) {
                    boolean z10 = false;
                    if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    t5Var.V1 = z10;
                    return;
                }
                return;
        }
    }

    public u2(Object obj, Object obj2, boolean z10, int i10) {
        this.f742a = i10;
        this.f744c = obj;
        this.f743b = obj2;
    }

    public u2(ig.s sVar) {
        this.f742a = 2;
        this.f744c = sVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
