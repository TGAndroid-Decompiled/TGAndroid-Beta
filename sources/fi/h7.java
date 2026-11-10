package fi;

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
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.ym;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.g61;
import org.telegram.ui.nr0;
import org.telegram.ui.nx;
import org.telegram.ui.or0;
import org.telegram.ui.pr0;
import org.telegram.ui.qr0;
import org.telegram.ui.sr0;
import org.telegram.ui.tp;
public final class h7 implements TextWatcher {
    public final int f12140a;
    public Object f12141b;
    public final Object f12142c;

    public h7(int i7, Object obj, Object obj2) {
        this.f12140a = i7;
        this.f12142c = obj;
        this.f12141b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        boolean z9;
        float f10;
        int i7 = this.f12140a;
        String str = null;
        v4.d1 d1Var = null;
        v4.d1 d1Var2 = null;
        Object obj = this.f12142c;
        switch (i7) {
            case 0:
                ((f2.h) this.f12141b).run();
                m7 m7Var = (m7) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.T1;
                if (!m7Var.X1) {
                    if (m7Var.Y1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        m7Var.X1 = true;
                        k3Var.d.setText(substring);
                        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                        i3Var.setSelection(0, i3Var.getText().length());
                        m7Var.X1 = false;
                        m7Var.Y1 = false;
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
            case 1:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.f12141b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.h3(runnableArr[0]);
                    return;
                }
                return;
            case 2:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((bi.n8) obj).run();
                return;
            case 3:
                an anVar = (an) ((org.telegram.ui.l4) obj).f47512e;
                xm xmVar = (xm) this.f12141b;
                if (xmVar.getTag() == null) {
                    v4.d1 K = anVar.f31922s.K(anVar.f31916p0);
                    if (K != null && anVar.f31931y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.i6.l(editable, xmVar.getEditField().getPaint().getFontMetricsInt(), false);
                        anVar.f31931y.setDirection(1);
                        anVar.f31931y.setDelegate(xmVar);
                        anVar.f31931y.setTranslationY(K.f57052a.getY());
                        anVar.f31931y.e();
                    }
                    anVar.P = editable;
                    if (K != null) {
                        an.P(anVar, K.f57052a, anVar.f31916p0);
                    }
                    anVar.X();
                    return;
                }
                return;
            case 4:
                an anVar2 = (an) ((org.telegram.ui.l4) obj).f47512e;
                g61 g61Var = anVar2.f31922s;
                ym ymVar = (ym) this.f12141b;
                View F = g61Var.F(ymVar);
                if (F != null) {
                    d1Var2 = g61Var.T(F);
                }
                if (d1Var2 != null) {
                    View view = d1Var2.f57052a;
                    int b10 = d1Var2.b();
                    int i10 = b10 - anVar2.f31924t0;
                    if (i10 >= 0 && i10 < anVar2.K.length) {
                        if (anVar2.f31931y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.i6.l(editable, ymVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                anVar2.f31931y.setDirection(0);
                                anVar2.f31931y.setTranslationY(y10);
                            } else {
                                anVar2.f31931y.setDirection(1);
                                anVar2.f31931y.setTranslationY(view.getY());
                            }
                            anVar2.f31931y.setDelegate(ymVar);
                            anVar2.f31931y.e();
                        }
                        anVar2.K[i10] = editable;
                        an.P(anVar2, ymVar, b10);
                        anVar2.X();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f41333y == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f41330s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f12141b).get()) {
                            passcodeActivity.f41330s.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41330s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f41330s.getVisibility() != 0) {
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41330s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 7:
                sr0 sr0Var = ((qr0) obj).d;
                nr0 nr0Var = (nr0) this.f12141b;
                if (nr0Var.getTag() == null) {
                    v4.d1 K2 = sr0Var.f49923c.K(sr0Var.f49932i0);
                    if (K2 != null && sr0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.i6.l(editable, nr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        sr0Var.Q.setDirection(1);
                        sr0Var.Q.setDelegate(nr0Var);
                        sr0Var.Q.setTranslationY(K2.f57052a.getY());
                        sr0Var.Q.e();
                    }
                    sr0Var.E = editable;
                    if (K2 != null) {
                        sr0.h0(sr0Var, K2.f57052a, sr0Var.f49932i0);
                    }
                    sr0Var.n0();
                    return;
                }
                return;
            case 8:
                sr0 sr0Var2 = ((qr0) obj).d;
                or0 or0Var = (or0) this.f12141b;
                if (or0Var.getTag() == null) {
                    v4.d1 K3 = sr0Var2.f49923c.K(sr0Var2.f49932i0);
                    if (K3 != null && sr0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.i6.l(editable, or0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        sr0Var2.Q.setDirection(1);
                        sr0Var2.Q.setDelegate(or0Var);
                        sr0Var2.Q.setTranslationY(K3.f57052a.getY());
                        sr0Var2.Q.e();
                    }
                    sr0Var2.F = editable;
                    if (K3 != null) {
                        sr0.h0(sr0Var2, K3.f57052a, sr0Var2.f49933j0);
                    }
                    sr0Var2.n0();
                    return;
                }
                return;
            case 9:
                sr0 sr0Var3 = ((qr0) obj).d;
                g61 g61Var2 = sr0Var3.f49923c;
                pr0 pr0Var = (pr0) this.f12141b;
                View F2 = g61Var2.F(pr0Var);
                if (F2 != null) {
                    d1Var = g61Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f57052a;
                    int b11 = d1Var.b() - sr0Var3.f49937n0;
                    if (b11 >= 0 && b11 < sr0Var3.f49948w.length) {
                        if (sr0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.i6.l(editable, pr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                sr0Var3.Q.setDirection(0);
                                sr0Var3.Q.setTranslationY(y11);
                            } else {
                                sr0Var3.Q.setDirection(1);
                                sr0Var3.Q.setTranslationY(view2.getY());
                            }
                            sr0Var3.Q.setDelegate(pr0Var);
                            sr0Var3.Q.e();
                        }
                        sr0Var3.f49948w[b11] = editable;
                        sr0.h0(sr0Var3, pr0Var, b11);
                        sr0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.f50107c && ((String) this.f12141b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f12141b).toString(), editable.toString())) {
                    int b12 = c8.j9.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = t4Var.f50106b;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(qVar.f55193p1), b12, Color.green(qVar.f55193p1), Color.blue(qVar.f55193p1));
                        } else {
                            argb = Color.argb(Color.alpha(qVar.f55193p1), Color.red(qVar.f55193p1), Color.green(qVar.f55193p1), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(qVar.f55193p1), Color.red(qVar.f55193p1), b12, Color.blue(qVar.f55193p1));
                    }
                    int i12 = sg.q.f55190t1;
                    qVar.I0(argb, 5);
                    return;
                }
                return;
            case 11:
                View[] viewArr = (View[]) this.f12141b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((zh.l) obj).f60438g2.e()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ViewPropertyAnimator animate = viewArr[0].animate();
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    animate.alpha(f10).setDuration(180L).start();
                    viewArr[0].setEnabled(z9);
                    viewArr[0].setClickable(z9);
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 12:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
            case 13:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
            case 14:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
            case 15:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
            case 16:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
            default:
                ((String[]) this.f12141b)[0] = editable.toString();
                ((nx) obj).f37496f3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f12140a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                EditText editText = (EditText) this.f12141b;
                editText.post(new tp(this, editText, (AtomicReference) this.f12142c, 28));
                return;
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                this.f12141b = charSequence.toString();
                return;
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
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.f12140a) {
            case 0:
                m7 m7Var = (m7) this.f12142c;
                if (!m7Var.X1) {
                    boolean z9 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z9 = true;
                    }
                    m7Var.Y1 = z9;
                    return;
                }
                return;
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
            default:
                return;
        }
    }

    public h7(Object obj, Object obj2, boolean z9, int i7) {
        this.f12140a = i7;
        this.f12141b = obj;
        this.f12142c = obj2;
    }

    public h7(org.telegram.ui.t4 t4Var) {
        this.f12140a = 10;
        this.f12142c = t4Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
