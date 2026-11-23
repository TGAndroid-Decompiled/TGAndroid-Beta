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
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.tn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.f61;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.nr0;
import org.telegram.ui.or0;
import org.telegram.ui.qr0;
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
        v4.e1 e1Var = null;
        v4.e1 e1Var2 = null;
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
                ((l7) obj).f35742g3.O(true);
                return;
            case 2:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35742g3.O(true);
                return;
            case 3:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35742g3.O(true);
                return;
            case 4:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35742g3.O(true);
                return;
            case 5:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35742g3.O(true);
                return;
            case 6:
                ((String[]) this.f4131b)[0] = editable.toString();
                ((l7) obj).f35742g3.O(true);
                return;
            case 7:
                ((hi.q1) this.f4131b).run();
                hi.l7 l7Var = (hi.l7) obj;
                org.telegram.ui.Cells.l3 l3Var = l7Var.U1;
                if (!l7Var.Y1) {
                    if (l7Var.Z1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        l7Var.Y1 = true;
                        l3Var.d.setText(substring);
                        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                        j3Var.setSelection(0, j3Var.getText().length());
                        l7Var.Y1 = false;
                        l7Var.Z1 = false;
                        hi.l7.e1(l7Var, substring);
                        return;
                    }
                    if (editable != null) {
                        str = editable.toString();
                    }
                    hi.l7.e1(l7Var, str);
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
                tn tnVar = (tn) ((org.telegram.ui.l4) obj).f49452e;
                qn qnVar = (qn) this.f4131b;
                if (qnVar.getTag() == null) {
                    v4.e1 K = tnVar.f39962s.K(tnVar.f39957q0);
                    if (K != null && tnVar.f39971y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.j6.l(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        tnVar.f39971y.setDirection(1);
                        tnVar.f39971y.setDelegate(qnVar);
                        tnVar.f39971y.setTranslationY(K.f59111a.getY());
                        tnVar.f39971y.e();
                    }
                    tnVar.Q = editable;
                    if (K != null) {
                        tn.Q(tnVar, K.f59111a, tnVar.f39957q0);
                    }
                    tnVar.Y();
                    return;
                }
                return;
            case 11:
                tn tnVar2 = (tn) ((org.telegram.ui.l4) obj).f49452e;
                f61 f61Var = tnVar2.f39962s;
                rn rnVar = (rn) this.f4131b;
                View F = f61Var.F(rnVar);
                if (F != null) {
                    e1Var2 = f61Var.T(F);
                }
                if (e1Var2 != null) {
                    View view = e1Var2.f59111a;
                    int b10 = e1Var2.b();
                    int i10 = b10 - tnVar2.f39965u0;
                    if (i10 >= 0 && i10 < tnVar2.L.length) {
                        if (tnVar2.f39971y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.j6.l(editable, rnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                tnVar2.f39971y.setDirection(0);
                                tnVar2.f39971y.setTranslationY(y10);
                            } else {
                                tnVar2.f39971y.setDirection(1);
                                tnVar2.f39971y.setTranslationY(view.getY());
                            }
                            tnVar2.f39971y.setDelegate(rnVar);
                            tnVar2.f39971y.e();
                        }
                        tnVar2.L[i10] = editable;
                        tn.Q(tnVar2, rnVar, b10);
                        tnVar2.Y();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                return;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f43158y == 1 && passcodeActivity.F == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f43155s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f4131b).get()) {
                            passcodeActivity.f43155s.callOnClick();
                        }
                        org.telegram.messenger.g0.X3(passcodeActivity.f43155s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f43155s.getVisibility() != 0) {
                        org.telegram.messenger.g0.X3(passcodeActivity.f43155s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                qr0 qr0Var = ((or0) obj).d;
                lr0 lr0Var = (lr0) this.f4131b;
                if (lr0Var.getTag() == null) {
                    v4.e1 K2 = qr0Var.f51285c.K(qr0Var.f51295j0);
                    if (K2 != null && qr0Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.j6.l(editable, lr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        qr0Var.R.setDirection(1);
                        qr0Var.R.setDelegate(lr0Var);
                        qr0Var.R.setTranslationY(K2.f59111a.getY());
                        qr0Var.R.e();
                    }
                    qr0Var.F = editable;
                    if (K2 != null) {
                        qr0.h0(qr0Var, K2.f59111a, qr0Var.f51295j0);
                    }
                    qr0Var.n0();
                    return;
                }
                return;
            case 15:
                qr0 qr0Var2 = ((or0) obj).d;
                mr0 mr0Var = (mr0) this.f4131b;
                if (mr0Var.getTag() == null) {
                    v4.e1 K3 = qr0Var2.f51285c.K(qr0Var2.f51295j0);
                    if (K3 != null && qr0Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.j6.l(editable, mr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        qr0Var2.R.setDirection(1);
                        qr0Var2.R.setDelegate(mr0Var);
                        qr0Var2.R.setTranslationY(K3.f59111a.getY());
                        qr0Var2.R.e();
                    }
                    qr0Var2.G = editable;
                    if (K3 != null) {
                        qr0.h0(qr0Var2, K3.f59111a, qr0Var2.f51296k0);
                    }
                    qr0Var2.n0();
                    return;
                }
                return;
            case 16:
                qr0 qr0Var3 = ((or0) obj).d;
                f61 f61Var2 = qr0Var3.f51285c;
                nr0 nr0Var = (nr0) this.f4131b;
                View F2 = f61Var2.F(nr0Var);
                if (F2 != null) {
                    e1Var = f61Var2.T(F2);
                }
                if (e1Var != null) {
                    View view2 = e1Var.f59111a;
                    int b11 = e1Var.b() - qr0Var3.f51300o0;
                    if (b11 >= 0 && b11 < qr0Var3.f51310w.length) {
                        if (qr0Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.j6.l(editable, nr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                qr0Var3.R.setDirection(0);
                                qr0Var3.R.setTranslationY(y11);
                            } else {
                                qr0Var3.R.setDirection(1);
                                qr0Var3.R.setTranslationY(view2.getY());
                            }
                            qr0Var3.R.setDelegate(nr0Var);
                            qr0Var3.R.e();
                        }
                        qr0Var3.f51310w[b11] = editable;
                        qr0.h0(qr0Var3, nr0Var, b11);
                        qr0Var3.n0();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.f52156c && ((String) this.f4131b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f4131b).toString(), editable.toString())) {
                    int b12 = m9.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = t4Var.f52155b;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(qVar.f57331q1), b12, Color.green(qVar.f57331q1), Color.blue(qVar.f57331q1));
                        } else {
                            argb = Color.argb(Color.alpha(qVar.f57331q1), Color.red(qVar.f57331q1), Color.green(qVar.f57331q1), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(qVar.f57331q1), Color.red(qVar.f57331q1), b12, Color.blue(qVar.f57331q1));
                    }
                    int i12 = sg.q.f57327u1;
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
                hi.l7 l7Var = (hi.l7) this.f4132c;
                if (!l7Var.Y1) {
                    boolean z10 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    l7Var.Z1 = z10;
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
