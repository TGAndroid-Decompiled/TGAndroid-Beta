package defpackage;

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
import org.telegram.ui.PasscodeActivity;
public final class qy implements TextWatcher {
    public final byte a;
    public Object b;
    public final Object c;

    public qy(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        float f;
        int argb;
        byte b = this.a;
        s49 s49Var = null;
        String str = null;
        s49 s49Var2 = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                View[] viewArr = (View[]) this.b;
                try {
                    if (Integer.parseInt(editable.toString()) >= ((ty) obj).g2.e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ViewPropertyAnimator animate = viewArr[0].animate();
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.6f;
                    }
                    animate.alpha(f).setDuration(180L).start();
                    viewArr[0].setEnabled(z);
                    viewArr[0].setClickable(z);
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 1:
                k62 k62Var = (k62) ((s20) obj).e;
                h62 h62Var = (h62) this.b;
                if (h62Var.getTag() == null) {
                    s49 K = k62Var.s.K(k62Var.q0);
                    if (K != null && k62Var.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        vu3.l(editable, h62Var.getEditField().getPaint().getFontMetricsInt(), false);
                        k62Var.y.setDirection(1);
                        k62Var.y.setDelegate(h62Var);
                        k62Var.y.setTranslationY(K.a.getY());
                        k62Var.y.d();
                    }
                    k62Var.Q = editable;
                    if (K != null) {
                        k62Var.i0(k62Var.q0, K.a);
                    }
                    k62Var.T();
                    return;
                }
                return;
            case 2:
                k62 k62Var2 = (k62) ((s20) obj).e;
                rkb rkbVar = k62Var2.s;
                i62 i62Var = (i62) this.b;
                View F = rkbVar.F(i62Var);
                if (F != null) {
                    s49Var = rkbVar.T(F);
                }
                if (s49Var != null) {
                    View view = s49Var.a;
                    int b2 = s49Var.b();
                    int i = b2 - k62Var2.u0;
                    if (i >= 0 && i < k62Var2.L.length) {
                        if (k62Var2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            vu3.l(editable, i62Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y = (view.getY() - gl.L(166.0f)) + view.getMeasuredHeight();
                            if (y > 0.0f) {
                                k62Var2.y.setDirection(0);
                                k62Var2.y.setTranslationY(y);
                            } else {
                                k62Var2.y.setDirection(1);
                                k62Var2.y.setTranslationY(view.getY());
                            }
                            k62Var2.y.setDelegate(i62Var);
                            k62Var2.y.d();
                        }
                        k62Var2.L[i] = editable;
                        k62Var2.i0(b2, i62Var);
                        k62Var2.T();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((ln0) obj).run();
                return;
            case 4:
                wl2 wl2Var = (wl2) obj;
                yl2 yl2Var = wl2Var.f;
                if (!wl2Var.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b3 = moe.b(Integer.parseInt(editable.toString()), 0, 255);
                    byte b4 = wl2Var.d;
                    if (b4 != 1) {
                        if (b4 != 2) {
                            argb = Color.argb(Color.alpha(yl2Var.p1), b3, Color.green(yl2Var.p1), Color.blue(yl2Var.p1));
                        } else {
                            argb = Color.argb(Color.alpha(yl2Var.p1), Color.red(yl2Var.p1), Color.green(yl2Var.p1), b3);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(yl2Var.p1), Color.red(yl2Var.p1), b3, Color.blue(yl2Var.p1));
                    }
                    int i2 = yl2.t1;
                    yl2Var.D0(argb, 5);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.y == 1 && !passcodeActivity.F) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.b).get()) {
                            passcodeActivity.s.callOnClick();
                        }
                        gl.T3(passcodeActivity.s, false, 0.1f, true, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        gl.T3(passcodeActivity.s, true, 0.1f, true, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 7:
                ie8 ie8Var = ((ge8) obj).d;
                de8 de8Var = (de8) this.b;
                if (de8Var.getTag() == null) {
                    s49 K2 = ie8Var.c.K(ie8Var.j0);
                    if (K2 != null && ie8Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        vu3.l(editable, de8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ie8Var.R.setDirection(1);
                        ie8Var.R.setDelegate(de8Var);
                        ie8Var.R.setTranslationY(K2.a.getY());
                        ie8Var.R.d();
                    }
                    ie8Var.F = editable;
                    if (K2 != null) {
                        ie8Var.s0(ie8Var.j0, K2.a);
                    }
                    ie8Var.j0();
                    return;
                }
                return;
            case 8:
                ie8 ie8Var2 = ((ge8) obj).d;
                ee8 ee8Var = (ee8) this.b;
                if (ee8Var.getTag() == null) {
                    s49 K3 = ie8Var2.c.K(ie8Var2.j0);
                    if (K3 != null && ie8Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        vu3.l(editable, ee8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ie8Var2.R.setDirection(1);
                        ie8Var2.R.setDelegate(ee8Var);
                        ie8Var2.R.setTranslationY(K3.a.getY());
                        ie8Var2.R.d();
                    }
                    ie8Var2.G = editable;
                    if (K3 != null) {
                        ie8Var2.s0(ie8Var2.k0, K3.a);
                    }
                    ie8Var2.j0();
                    return;
                }
                return;
            case 9:
                ie8 ie8Var3 = ((ge8) obj).d;
                rkb rkbVar2 = ie8Var3.c;
                fe8 fe8Var = (fe8) this.b;
                View F2 = rkbVar2.F(fe8Var);
                if (F2 != null) {
                    s49Var2 = rkbVar2.T(F2);
                }
                if (s49Var2 != null) {
                    View view2 = s49Var2.a;
                    int b5 = s49Var2.b() - ie8Var3.o0;
                    if (b5 >= 0 && b5 < ie8Var3.w.length) {
                        if (ie8Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            vu3.l(editable, fe8Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y2 = (view2.getY() - gl.L(166.0f)) + view2.getMeasuredHeight();
                            if (y2 > 0.0f) {
                                ie8Var3.R.setDirection(0);
                                ie8Var3.R.setTranslationY(y2);
                            } else {
                                ie8Var3.R.setDirection(1);
                                ie8Var3.R.setTranslationY(view2.getY());
                            }
                            ie8Var3.R.setDelegate(fe8Var);
                            ie8Var3.R.d();
                        }
                        ie8Var3.w[b5] = editable;
                        ie8Var3.s0(b5, fe8Var);
                        ie8Var3.j0();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    gl.r(runnableArr[0]);
                    gl.c3(runnableArr[0]);
                    return;
                }
                return;
            case 11:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            case 13:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            case 14:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            case 15:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            case 16:
                ((String[]) this.b)[0] = editable.toString();
                ((i24) obj).g3.O(true);
                return;
            default:
                ((iya) this.b).run();
                t4b t4bVar = (t4b) obj;
                it3 it3Var = t4bVar.T1;
                if (!t4bVar.X1) {
                    if (t4bVar.Y1 && editable != null) {
                        String substring = editable.toString().substring(8);
                        t4bVar.X1 = true;
                        it3Var.d.setText(substring);
                        ht3 ht3Var = it3Var.d;
                        ht3Var.setSelection(0, ht3Var.getText().length());
                        t4bVar.X1 = false;
                        t4bVar.Y1 = false;
                        t4bVar.Y0(substring);
                        return;
                    }
                    if (editable != null) {
                        str = editable.toString();
                    }
                    t4bVar.Y0(str);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                this.b = charSequence.toString();
                return;
            case 5:
                EditText editText = (EditText) this.b;
                editText.post(new sx5(this, editText, (AtomicReference) this.c, (byte) 18));
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        switch (this.a) {
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
                t4b t4bVar = (t4b) this.c;
                if (!t4bVar.X1) {
                    boolean z = false;
                    if (charSequence != null && i == 8 && charSequence.subSequence(0, i).toString().equals("https://") && charSequence.length() >= (i4 = i3 + i) && charSequence.subSequence(i, i4).toString().startsWith("https://")) {
                        z = true;
                    }
                    t4bVar.Y1 = z;
                    return;
                }
                return;
        }
    }

    public qy(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qy(wl2 wl2Var) {
        this.a = (byte) 4;
        this.c = wl2Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
