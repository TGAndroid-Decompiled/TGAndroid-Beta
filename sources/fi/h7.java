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
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.zm;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.e61;
import org.telegram.ui.kr0;
import org.telegram.ui.kx;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import org.telegram.ui.rp;
public final class h7 implements TextWatcher {
    public final int f12136a;
    public Object f12137b;
    public final Object f12138c;

    public h7(int i7, Object obj, Object obj2) {
        this.f12136a = i7;
        this.f12138c = obj;
        this.f12137b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        boolean z9;
        float f10;
        int i7 = this.f12136a;
        String str = null;
        v4.d1 d1Var = null;
        v4.d1 d1Var2 = null;
        Object obj = this.f12138c;
        switch (i7) {
            case 0:
                ((f2.h) this.f12137b).run();
                m7 m7Var = (m7) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.Q1;
                if (!m7Var.U1) {
                    if (m7Var.V1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        m7Var.U1 = true;
                        k3Var.d.setText(substring);
                        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                        i3Var.setSelection(0, i3Var.getText().length());
                        m7Var.U1 = false;
                        m7Var.V1 = false;
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
                if (((TextView) this.f12137b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.h3(runnableArr[0]);
                    return;
                }
                return;
            case 2:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((bi.n8) obj).run();
                return;
            case 3:
                bn bnVar = (bn) ((org.telegram.ui.l4) obj).f47405e;
                ym ymVar = (ym) this.f12137b;
                if (ymVar.getTag() == null) {
                    v4.d1 K = bnVar.f32239s.K(bnVar.f32233p0);
                    if (K != null && bnVar.f32248y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.i6.l(editable, ymVar.getEditField().getPaint().getFontMetricsInt(), false);
                        bnVar.f32248y.setDirection(1);
                        bnVar.f32248y.setDelegate(ymVar);
                        bnVar.f32248y.setTranslationY(K.f56951a.getY());
                        bnVar.f32248y.e();
                    }
                    bnVar.P = editable;
                    if (K != null) {
                        bn.P(bnVar, K.f56951a, bnVar.f32233p0);
                    }
                    bnVar.X();
                    return;
                }
                return;
            case 4:
                bn bnVar2 = (bn) ((org.telegram.ui.l4) obj).f47405e;
                e61 e61Var = bnVar2.f32239s;
                zm zmVar = (zm) this.f12137b;
                View F = e61Var.F(zmVar);
                if (F != null) {
                    d1Var2 = e61Var.T(F);
                }
                if (d1Var2 != null) {
                    View view = d1Var2.f56951a;
                    int b10 = d1Var2.b();
                    int i10 = b10 - bnVar2.f32241t0;
                    if (i10 >= 0 && i10 < bnVar2.K.length) {
                        if (bnVar2.f32248y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.i6.l(editable, zmVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                bnVar2.f32248y.setDirection(0);
                                bnVar2.f32248y.setTranslationY(y10);
                            } else {
                                bnVar2.f32248y.setDirection(1);
                                bnVar2.f32248y.setTranslationY(view.getY());
                            }
                            bnVar2.f32248y.setDelegate(zmVar);
                            bnVar2.f32248y.e();
                        }
                        bnVar2.K[i10] = editable;
                        bn.P(bnVar2, zmVar, b10);
                        bnVar2.X();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f41331y == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f41328s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f12137b).get()) {
                            passcodeActivity.f41328s.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41328s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f41328s.getVisibility() != 0) {
                        org.telegram.messenger.g0.Z3(passcodeActivity.f41328s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 7:
                pr0 pr0Var = ((nr0) obj).d;
                kr0 kr0Var = (kr0) this.f12137b;
                if (kr0Var.getTag() == null) {
                    v4.d1 K2 = pr0Var.f48916c.K(pr0Var.f48925i0);
                    if (K2 != null && pr0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.i6.l(editable, kr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var.Q.setDirection(1);
                        pr0Var.Q.setDelegate(kr0Var);
                        pr0Var.Q.setTranslationY(K2.f56951a.getY());
                        pr0Var.Q.e();
                    }
                    pr0Var.E = editable;
                    if (K2 != null) {
                        pr0.h0(pr0Var, K2.f56951a, pr0Var.f48925i0);
                    }
                    pr0Var.n0();
                    return;
                }
                return;
            case 8:
                pr0 pr0Var2 = ((nr0) obj).d;
                lr0 lr0Var = (lr0) this.f12137b;
                if (lr0Var.getTag() == null) {
                    v4.d1 K3 = pr0Var2.f48916c.K(pr0Var2.f48925i0);
                    if (K3 != null && pr0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.i6.l(editable, lr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var2.Q.setDirection(1);
                        pr0Var2.Q.setDelegate(lr0Var);
                        pr0Var2.Q.setTranslationY(K3.f56951a.getY());
                        pr0Var2.Q.e();
                    }
                    pr0Var2.F = editable;
                    if (K3 != null) {
                        pr0.h0(pr0Var2, K3.f56951a, pr0Var2.f48926j0);
                    }
                    pr0Var2.n0();
                    return;
                }
                return;
            case 9:
                pr0 pr0Var3 = ((nr0) obj).d;
                e61 e61Var2 = pr0Var3.f48916c;
                mr0 mr0Var = (mr0) this.f12137b;
                View F2 = e61Var2.F(mr0Var);
                if (F2 != null) {
                    d1Var = e61Var2.T(F2);
                }
                if (d1Var != null) {
                    View view2 = d1Var.f56951a;
                    int b11 = d1Var.b() - pr0Var3.f48930n0;
                    if (b11 >= 0 && b11 < pr0Var3.f48941w.length) {
                        if (pr0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.i6.l(editable, mr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                pr0Var3.Q.setDirection(0);
                                pr0Var3.Q.setTranslationY(y11);
                            } else {
                                pr0Var3.Q.setDirection(1);
                                pr0Var3.Q.setTranslationY(view2.getY());
                            }
                            pr0Var3.Q.setDelegate(mr0Var);
                            pr0Var3.Q.e();
                        }
                        pr0Var3.f48941w[b11] = editable;
                        pr0.h0(pr0Var3, mr0Var, b11);
                        pr0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.f49915c && ((String) this.f12137b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f12137b).toString(), editable.toString())) {
                    int b12 = c8.j9.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = t4Var.f49914b;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(qVar.f55092m1), b12, Color.green(qVar.f55092m1), Color.blue(qVar.f55092m1));
                        } else {
                            argb = Color.argb(Color.alpha(qVar.f55092m1), Color.red(qVar.f55092m1), Color.green(qVar.f55092m1), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(qVar.f55092m1), Color.red(qVar.f55092m1), b12, Color.blue(qVar.f55092m1));
                    }
                    int i12 = sg.q.f55088q1;
                    qVar.I0(argb, 5);
                    return;
                }
                return;
            case 11:
                View[] viewArr = (View[]) this.f12137b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((zh.m) obj).d2.e()) {
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
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
            case 13:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
            case 14:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
            case 15:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
            case 16:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
            default:
                ((String[]) this.f12137b)[0] = editable.toString();
                ((kx) obj).f37160f3.O(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f12136a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                EditText editText = (EditText) this.f12137b;
                editText.post(new rp(this, editText, (AtomicReference) this.f12138c, 28));
                return;
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
                this.f12137b = charSequence.toString();
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
        switch (this.f12136a) {
            case 0:
                m7 m7Var = (m7) this.f12138c;
                if (!m7Var.U1) {
                    boolean z9 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z9 = true;
                    }
                    m7Var.V1 = z9;
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
        this.f12136a = i7;
        this.f12137b = obj;
        this.f12138c = obj2;
    }

    public h7(org.telegram.ui.t4 t4Var) {
        this.f12136a = 10;
        this.f12138c = t4Var;
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
