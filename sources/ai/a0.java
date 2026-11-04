package ai;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.TextView;
import b8.be;
import ci.o7;
import gi.m7;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.ym;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ar0;
import org.telegram.ui.br0;
import org.telegram.ui.cr0;
import org.telegram.ui.dr0;
import org.telegram.ui.fr0;
import org.telegram.ui.pp;
import org.telegram.ui.u51;
public final class a0 implements TextWatcher {
    public final int f474a;
    public Object f475b;
    public final Object f476c;

    public a0(int i3, Object obj, Object obj2) {
        this.f474a = i3;
        this.f476c = obj;
        this.f475b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f10;
        int argb;
        int i3 = this.f474a;
        String str = null;
        u4.d1 d1Var = null;
        u4.d1 d1Var2 = null;
        Object obj = this.f476c;
        switch (i3) {
            case 0:
                View[] viewArr = (View[]) this.f475b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((e0) obj).f599e2.e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewPropertyAnimator animate = viewArr[0].animate();
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    animate.alpha(f10).setDuration(180L).start();
                    viewArr[0].setEnabled(z10);
                    viewArr[0].setClickable(z10);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 1:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 2:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 3:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 4:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 5:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 6:
                ((String[]) this.f475b)[0] = editable.toString();
                ((i5) obj).f35594g3.O(true);
                return;
            case 7:
                ((g2.c) this.f475b).run();
                m7 m7Var = (m7) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
                if (!m7Var.V1) {
                    if (m7Var.W1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        m7Var.V1 = true;
                        k3Var.d.setText(substring);
                        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                        i3Var.setSelection(0, i3Var.getText().length());
                        m7Var.V1 = false;
                        m7Var.W1 = false;
                        m7.d1(m7Var, substring);
                        return;
                    }
                    if (editable != null) {
                        str = editable.toString();
                    }
                    m7.d1(m7Var, str);
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.f475b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.h3(runnableArr[0]);
                    return;
                }
                return;
            case 9:
                ((String[]) this.f475b)[0] = editable.toString();
                ((o7) obj).run();
                return;
            case 10:
                an anVar = (an) ((org.telegram.ui.n4) obj).f47865e;
                xm xmVar = (xm) this.f475b;
                if (xmVar.getTag() == null) {
                    u4.d1 K = anVar.f31939s.K(anVar.f31934q0);
                    if (K != null && anVar.f31948y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.i6.l(editable, xmVar.getEditField().getPaint().getFontMetricsInt(), false);
                        anVar.f31948y.setDirection(1);
                        anVar.f31948y.setDelegate(xmVar);
                        anVar.f31948y.setTranslationY(K.f55540a.getY());
                        anVar.f31948y.e();
                    }
                    anVar.Q = editable;
                    if (K != null) {
                        an.P(anVar, K.f55540a, anVar.f31934q0);
                    }
                    anVar.X();
                    return;
                }
                return;
            case 11:
                an anVar2 = (an) ((org.telegram.ui.n4) obj).f47865e;
                u51 u51Var = anVar2.f31939s;
                ym ymVar = (ym) this.f475b;
                View F = u51Var.F(ymVar);
                if (F != null) {
                    d1Var2 = u51Var.T(F);
                }
                if (d1Var2 != null) {
                    View view = d1Var2.f55540a;
                    int b10 = d1Var2.b();
                    int i10 = b10 - anVar2.f31942u0;
                    if (i10 >= 0 && i10 < anVar2.L.length) {
                        if (anVar2.f31948y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.i6.l(editable, ymVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y9 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y9 > 0.0f) {
                                anVar2.f31948y.setDirection(0);
                                anVar2.f31948y.setTranslationY(y9);
                            } else {
                                anVar2.f31948y.setDirection(1);
                                anVar2.f31948y.setTranslationY(view.getY());
                            }
                            anVar2.f31948y.setDelegate(ymVar);
                            anVar2.f31948y.e();
                        }
                        anVar2.L[i10] = editable;
                        an.P(anVar2, ymVar, b10);
                        anVar2.X();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                return;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f41364y == 1 && passcodeActivity.F == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f41361s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f475b).get()) {
                            passcodeActivity.f41361s.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41361s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f41361s.getVisibility() != 0) {
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41361s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                fr0 fr0Var = ((dr0) obj).d;
                ar0 ar0Var = (ar0) this.f475b;
                if (ar0Var.getTag() == null) {
                    u4.d1 K2 = fr0Var.f45331c.K(fr0Var.f45341j0);
                    if (K2 != null && fr0Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.i6.l(editable, ar0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fr0Var.R.setDirection(1);
                        fr0Var.R.setDelegate(ar0Var);
                        fr0Var.R.setTranslationY(K2.f55540a.getY());
                        fr0Var.R.e();
                    }
                    fr0Var.F = editable;
                    if (K2 != null) {
                        fr0.h0(fr0Var, K2.f55540a, fr0Var.f45341j0);
                    }
                    fr0Var.n0();
                    return;
                }
                return;
            case 15:
                fr0 fr0Var2 = ((dr0) obj).d;
                br0 br0Var = (br0) this.f475b;
                if (br0Var.getTag() == null) {
                    u4.d1 K3 = fr0Var2.f45331c.K(fr0Var2.f45341j0);
                    if (K3 != null && fr0Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.i6.l(editable, br0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fr0Var2.R.setDirection(1);
                        fr0Var2.R.setDelegate(br0Var);
                        fr0Var2.R.setTranslationY(K3.f55540a.getY());
                        fr0Var2.R.e();
                    }
                    fr0Var2.G = editable;
                    if (K3 != null) {
                        fr0.h0(fr0Var2, K3.f55540a, fr0Var2.f45342k0);
                    }
                    fr0Var2.n0();
                    return;
                }
                return;
            case 16:
                fr0 fr0Var3 = ((dr0) obj).d;
                u51 u51Var2 = fr0Var3.f45331c;
                cr0 cr0Var = (cr0) this.f475b;
                View F2 = u51Var2.F(cr0Var);
                if (F2 != null) {
                    d1Var = u51Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f55540a;
                    int b11 = d1Var.b() - fr0Var3.f45346o0;
                    if (b11 >= 0 && b11 < fr0Var3.f45356w.length) {
                        if (fr0Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.i6.l(editable, cr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                fr0Var3.R.setDirection(0);
                                fr0Var3.R.setTranslationY(y10);
                            } else {
                                fr0Var3.R.setDirection(1);
                                fr0Var3.R.setTranslationY(view2.getY());
                            }
                            fr0Var3.R.setDelegate(cr0Var);
                            fr0Var3.R.e();
                        }
                        fr0Var3.f45356w[b11] = editable;
                        fr0.h0(fr0Var3, cr0Var, b11);
                        fr0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.v4 v4Var = (org.telegram.ui.v4) obj;
                tg.q qVar = (tg.q) v4Var.h;
                if (!v4Var.f50376c && ((String) this.f475b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f475b).toString(), editable.toString())) {
                    int b12 = be.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = v4Var.f50375b;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(qVar.f55288n1), b12, Color.green(qVar.f55288n1), Color.blue(qVar.f55288n1));
                        } else {
                            argb = Color.argb(Color.alpha(qVar.f55288n1), Color.red(qVar.f55288n1), Color.green(qVar.f55288n1), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(qVar.f55288n1), Color.red(qVar.f55288n1), b12, Color.blue(qVar.f55288n1));
                    }
                    int i12 = tg.q.f55285r1;
                    qVar.I0(argb, 5);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f474a) {
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
                return;
            case 12:
                EditText editText = (EditText) this.f475b;
                editText.post(new pp(this, editText, (AtomicReference) this.f476c, 28));
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                return;
            default:
                this.f475b = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12;
        switch (this.f474a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                m7 m7Var = (m7) this.f476c;
                if (!m7Var.V1) {
                    boolean z10 = false;
                    if (charSequence != null && i3 == 8 && charSequence.subSequence(0, i3).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i3) && charSequence.subSequence(i3, i12).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    m7Var.W1 = z10;
                    return;
                }
                return;
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

    public a0(Object obj, Object obj2, boolean z10, int i3) {
        this.f474a = i3;
        this.f475b = obj;
        this.f476c = obj2;
    }

    public a0(org.telegram.ui.v4 v4Var) {
        this.f474a = 17;
        this.f476c = v4Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
