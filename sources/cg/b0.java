package cg;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kh.k5;
import kh.l4;
import kh.l5;
import kh.m4;
import kh.m5;
import kh.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.qn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.av0;
import org.telegram.ui.bv0;
import org.telegram.ui.cv0;
import org.telegram.ui.dv0;
import org.telegram.ui.fv0;
import org.telegram.ui.jb1;
import org.telegram.ui.rq;
public final class b0 implements TextWatcher {
    public final int f2312a;
    public Object f2313b;
    public final Object f2314c;

    public b0(int i10, Object obj, Object obj2) {
        this.f2312a = i10;
        this.f2313b = obj;
        this.f2314c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f2312a;
        f2.l1 l1Var = null;
        Object obj = this.f2314c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj;
                e0 e0Var = c0Var.f2324f;
                if (!c0Var.e && ((String) this.f2313b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f2313b).toString(), editable.toString())) {
                    int b10 = k7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = c0Var.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(e0Var.f2362f), b10, Color.green(e0Var.f2362f), Color.blue(e0Var.f2362f));
                        } else {
                            argb = Color.argb(Color.alpha(e0Var.f2362f), Color.red(e0Var.f2362f), Color.green(e0Var.f2362f), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(e0Var.f2362f), Color.red(e0Var.f2362f), b10, Color.blue(e0Var.f2362f));
                    }
                    int i12 = e0.f2359s;
                    e0Var.m(argb, 5);
                    return;
                }
                return;
            case 1:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((n4) obj).V2.N(true);
                return;
            case 2:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((l4) obj).V2.N(true);
                return;
            case 3:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((m4) obj).V2.N(true);
                return;
            case 4:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((k5) obj).V2.N(true);
                return;
            case 5:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((l5) obj).V2.N(true);
                return;
            case 6:
                ((String[]) this.f2313b)[0] = editable.toString();
                ((m5) obj).V2.N(true);
                return;
            case 7:
                qn qnVar = ((on) obj).d;
                mn mnVar = (mn) this.f2313b;
                if (mnVar.getTag() == null) {
                    f2.l1 K = qnVar.f28188s.K(qnVar.m0);
                    if (K != null && qnVar.f28195x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        qnVar.f28195x.setDirection(1);
                        qnVar.f28195x.setDelegate(mnVar);
                        qnVar.f28195x.setTranslationY(K.f5785a.getY());
                        qnVar.f28195x.e();
                    }
                    qnVar.M = editable;
                    if (K != null) {
                        qn.K(qnVar, K.f5785a, qnVar.m0);
                    }
                    qnVar.T();
                    return;
                }
                return;
            case 8:
                qn qnVar2 = ((on) obj).d;
                jb1 jb1Var = qnVar2.f28188s;
                nn nnVar = (nn) this.f2313b;
                View F = jb1Var.F(nnVar);
                if (F != null) {
                    l1Var = jb1Var.T(F);
                }
                if (l1Var != null) {
                    View view = l1Var.f5785a;
                    int b11 = l1Var.b();
                    int i13 = b11 - qnVar2.f28185q0;
                    if (i13 >= 0 && i13 < qnVar2.H.length) {
                        if (qnVar2.f28195x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                qnVar2.f28195x.setDirection(0);
                                qnVar2.f28195x.setTranslationY(y10);
                            } else {
                                qnVar2.f28195x.setDirection(1);
                                qnVar2.f28195x.setTranslationY(view.getY());
                            }
                            qnVar2.f28195x.setDelegate(nnVar);
                            qnVar2.f28195x.e();
                        }
                        qnVar2.H[i13] = editable;
                        qn.K(qnVar2, nnVar, b11);
                        qnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f31690x == 1 && passcodeActivity.B == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f31688s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f2313b).get()) {
                            passcodeActivity.f31688s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31688s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f31688s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31688s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                fv0 fv0Var = ((dv0) obj).d;
                av0 av0Var = (av0) this.f2313b;
                if (av0Var.getTag() == null) {
                    f2.l1 K2 = fv0Var.f34376c.K(fv0Var.f34381f0);
                    if (K2 != null && fv0Var.N != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, av0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var.N.setDirection(1);
                        fv0Var.N.setDelegate(av0Var);
                        fv0Var.N.setTranslationY(K2.f5785a.getY());
                        fv0Var.N.e();
                    }
                    fv0Var.B = editable;
                    if (K2 != null) {
                        fv0.c0(fv0Var, K2.f5785a, fv0Var.f34381f0);
                    }
                    fv0Var.i0();
                    return;
                }
                return;
            case 12:
                fv0 fv0Var2 = ((dv0) obj).d;
                bv0 bv0Var = (bv0) this.f2313b;
                if (bv0Var.getTag() == null) {
                    f2.l1 K3 = fv0Var2.f34376c.K(fv0Var2.f34381f0);
                    if (K3 != null && fv0Var2.N != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, bv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var2.N.setDirection(1);
                        fv0Var2.N.setDelegate(bv0Var);
                        fv0Var2.N.setTranslationY(K3.f5785a.getY());
                        fv0Var2.N.e();
                    }
                    fv0Var2.C = editable;
                    if (K3 != null) {
                        fv0.c0(fv0Var2, K3.f5785a, fv0Var2.f34382g0);
                    }
                    fv0Var2.i0();
                    return;
                }
                return;
            default:
                fv0 fv0Var3 = ((dv0) obj).d;
                jb1 jb1Var2 = fv0Var3.f34376c;
                cv0 cv0Var = (cv0) this.f2313b;
                View F2 = jb1Var2.F(cv0Var);
                if (F2 != null) {
                    l1Var = jb1Var2.T(F2);
                }
                if (l1Var != null) {
                    View view2 = l1Var.f5785a;
                    int b12 = l1Var.b() - fv0Var3.f34386k0;
                    if (b12 >= 0 && b12 < fv0Var3.v.length) {
                        if (fv0Var3.N != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, cv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                fv0Var3.N.setDirection(0);
                                fv0Var3.N.setTranslationY(y11);
                            } else {
                                fv0Var3.N.setDirection(1);
                                fv0Var3.N.setTranslationY(view2.getY());
                            }
                            fv0Var3.N.setDelegate(cv0Var);
                            fv0Var3.N.e();
                        }
                        fv0Var3.v[b12] = editable;
                        fv0.c0(fv0Var3, cv0Var, b12);
                        fv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f2312a) {
            case 0:
                this.f2313b = charSequence.toString();
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                EditText editText = (EditText) this.f2313b;
                editText.post(new rq(this, editText, (AtomicReference) this.f2314c, 25));
                return;
            case 10:
            case 11:
            case 12:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f2312a;
    }

    public b0(Object obj, Object obj2, boolean z4, int i10) {
        this.f2312a = i10;
        this.f2314c = obj;
        this.f2313b = obj2;
    }

    public b0(c0 c0Var) {
        this.f2312a = 0;
        this.f2314c = c0Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
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
