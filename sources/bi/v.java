package bi;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.TextView;
import c8.m9;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.d61;
import org.telegram.ui.kr0;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import org.telegram.ui.up;
public final class v implements TextWatcher {
    public final int f4130a;
    public Object f4131b;
    public final Object f4132c;

    public v(int i7, Object obj, Object obj2) {
        this.f4130a = i7;
        this.f4132c = obj;
        this.f4131b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        float f10;
        int argb;
        int i7 = this.f4130a;
        String str = null;
        v4.f1 f1Var = null;
        v4.f1 f1Var2 = null;
        Object obj = this.f4132c;
        switch (i7) {
            case 0:
                View[] viewArr = (View[]) this.f4131b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((y) obj).f4229h2.e()) {
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
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 1:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 2:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 3:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 4:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 5:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 6:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35323g3.O(true);
                return;
            case 7:
                ((hi.c) this.f4131b).run();
                hi.f8 f8Var = (hi.f8) obj;
                org.telegram.ui.Cells.l3 l3Var = f8Var.U1;
                if (!f8Var.Y1) {
                    if (f8Var.Z1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        f8Var.Y1 = true;
                        l3Var.d.setText(substring);
                        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                        j3Var.setSelection(0, j3Var.getText().length());
                        f8Var.Y1 = false;
                        f8Var.Z1 = false;
                        hi.f8.e1(f8Var, substring);
                        return;
                    }
                    if (editable != null) {
                        str = editable.toString();
                    }
                    hi.f8.e1(f8Var, str);
                    return;
                }
                return;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.f4131b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.g3(runnableArr[0]);
                    return;
                }
                return;
            case 9:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((di.j7) obj).run();
                return;
            case 10:
                qn qnVar = (qn) ((org.telegram.ui.l4) obj).f49583e;
                nn nnVar = (nn) this.f4131b;
                if (nnVar.getTag() == null) {
                    v4.f1 K = qnVar.f38944s.K(qnVar.f38939q0);
                    if (K != null && qnVar.f38953y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.j6.l(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        qnVar.f38953y.setDirection(1);
                        qnVar.f38953y.setDelegate(nnVar);
                        qnVar.f38953y.setTranslationY(K.f59245a.getY());
                        qnVar.f38953y.e();
                    }
                    qnVar.Q = editable;
                    if (K != null) {
                        qn.Q(qnVar, K.f59245a, qnVar.f38939q0);
                    }
                    qnVar.Y();
                    return;
                }
                return;
            case 11:
                qn qnVar2 = (qn) ((org.telegram.ui.l4) obj).f49583e;
                d61 d61Var = qnVar2.f38944s;
                on onVar = (on) this.f4131b;
                View F = d61Var.F(onVar);
                if (F != null) {
                    f1Var2 = d61Var.T(F);
                }
                if (f1Var2 != null) {
                    View view = f1Var2.f59245a;
                    int b10 = f1Var2.b();
                    int i10 = b10 - qnVar2.f38947u0;
                    if (i10 >= 0 && i10 < qnVar2.L.length) {
                        if (qnVar2.f38953y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.j6.l(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                qnVar2.f38953y.setDirection(0);
                                qnVar2.f38953y.setTranslationY(y10);
                            } else {
                                qnVar2.f38953y.setDirection(1);
                                qnVar2.f38953y.setTranslationY(view.getY());
                            }
                            qnVar2.f38953y.setDelegate(onVar);
                            qnVar2.f38953y.e();
                        }
                        qnVar2.L[i10] = editable;
                        qn.Q(qnVar2, onVar, b10);
                        qnVar2.Y();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                return;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f43268y == 1 && passcodeActivity.F == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f43265s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f4131b).get()) {
                            passcodeActivity.f43265s.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(passcodeActivity.f43265s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f43265s.getVisibility() != 0) {
                        org.telegram.messenger.g0.X3(passcodeActivity.f43265s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                pr0 pr0Var = ((nr0) obj).d;
                kr0 kr0Var = (kr0) this.f4131b;
                if (kr0Var.getTag() == null) {
                    v4.f1 K2 = pr0Var.f51103c.K(pr0Var.f51113j0);
                    if (K2 != null && pr0Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.j6.l(editable, kr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var.R.setDirection(1);
                        pr0Var.R.setDelegate(kr0Var);
                        pr0Var.R.setTranslationY(K2.f59245a.getY());
                        pr0Var.R.e();
                    }
                    pr0Var.F = editable;
                    if (K2 != null) {
                        pr0.h0(pr0Var, K2.f59245a, pr0Var.f51113j0);
                    }
                    pr0Var.n0();
                    return;
                }
                return;
            case 15:
                pr0 pr0Var2 = ((nr0) obj).d;
                lr0 lr0Var = (lr0) this.f4131b;
                if (lr0Var.getTag() == null) {
                    v4.f1 K3 = pr0Var2.f51103c.K(pr0Var2.f51113j0);
                    if (K3 != null && pr0Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.j6.l(editable, lr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var2.R.setDirection(1);
                        pr0Var2.R.setDelegate(lr0Var);
                        pr0Var2.R.setTranslationY(K3.f59245a.getY());
                        pr0Var2.R.e();
                    }
                    pr0Var2.G = editable;
                    if (K3 != null) {
                        pr0.h0(pr0Var2, K3.f59245a, pr0Var2.f51114k0);
                    }
                    pr0Var2.n0();
                    return;
                }
                return;
            case 16:
                pr0 pr0Var3 = ((nr0) obj).d;
                d61 d61Var2 = pr0Var3.f51103c;
                mr0 mr0Var = (mr0) this.f4131b;
                View F2 = d61Var2.F(mr0Var);
                if (F2 != null) {
                    f1Var = d61Var2.T(F2);
                }
                if (f1Var != null) {
                    View view2 = f1Var.f59245a;
                    int b11 = f1Var.b() - pr0Var3.f51118o0;
                    if (b11 >= 0 && b11 < pr0Var3.f51128w.length) {
                        if (pr0Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.j6.l(editable, mr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                pr0Var3.R.setDirection(0);
                                pr0Var3.R.setTranslationY(y11);
                            } else {
                                pr0Var3.R.setDirection(1);
                                pr0Var3.R.setTranslationY(view2.getY());
                            }
                            pr0Var3.R.setDelegate(mr0Var);
                            pr0Var3.R.e();
                        }
                        pr0Var3.f51128w[b11] = editable;
                        pr0.h0(pr0Var3, mr0Var, b11);
                        pr0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.f52237c && ((String) this.f4131b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f4131b).toString(), editable.toString())) {
                    int b12 = m9.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = t4Var.f52236b;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(qVar.f57441q1), b12, Color.green(qVar.f57441q1), Color.blue(qVar.f57441q1));
                        } else {
                            argb = Color.argb(Color.alpha(qVar.f57441q1), Color.red(qVar.f57441q1), Color.green(qVar.f57441q1), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(qVar.f57441q1), Color.red(qVar.f57441q1), b12, Color.blue(qVar.f57441q1));
                    }
                    int i12 = sg.q.f57437u1;
                    qVar.J0(argb, 5);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f4130a) {
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
                EditText editText = (EditText) this.f4131b;
                editText.post(new up(this, editText, (AtomicReference) this.f4132c, 28));
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                return;
            default:
                this.f4131b = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.f4130a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                hi.f8 f8Var = (hi.f8) this.f4132c;
                if (!f8Var.Y1) {
                    boolean z10 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    f8Var.Z1 = z10;
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

    public v(Object obj, Object obj2, boolean z10, int i7) {
        this.f4130a = i7;
        this.f4131b = obj;
        this.f4132c = obj2;
    }

    public v(org.telegram.ui.t4 t4Var) {
        this.f4130a = 17;
        this.f4132c = t4Var;
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
