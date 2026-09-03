package dg;

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
import lh.k5;
import lh.l4;
import lh.l5;
import lh.m4;
import lh.m5;
import lh.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.rn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.hv0;
import org.telegram.ui.iv0;
import org.telegram.ui.jv0;
import org.telegram.ui.kv0;
import org.telegram.ui.mv0;
import org.telegram.ui.qb1;
import org.telegram.ui.sq;
public final class b0 implements TextWatcher {
    public final int f4438a;
    public Object f4439b;
    public final Object f4440c;

    public b0(int i10, Object obj, Object obj2) {
        this.f4438a = i10;
        this.f4439b = obj;
        this.f4440c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f4438a;
        f2.m1 m1Var = null;
        Object obj = this.f4440c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj;
                e0 e0Var = c0Var.f4450f;
                if (!c0Var.f4449e && ((String) this.f4439b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f4439b).toString(), editable.toString())) {
                    int b10 = k7.o.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = c0Var.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(e0Var.f4505f), b10, Color.green(e0Var.f4505f), Color.blue(e0Var.f4505f));
                        } else {
                            argb = Color.argb(Color.alpha(e0Var.f4505f), Color.red(e0Var.f4505f), Color.green(e0Var.f4505f), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(e0Var.f4505f), Color.red(e0Var.f4505f), b10, Color.blue(e0Var.f4505f));
                    }
                    int i12 = e0.f4501s;
                    e0Var.m(argb, 5);
                    return;
                }
                return;
            case 1:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((n4) obj).V2.N(true);
                return;
            case 2:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((l4) obj).V2.N(true);
                return;
            case 3:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((m4) obj).V2.N(true);
                return;
            case 4:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((k5) obj).V2.N(true);
                return;
            case 5:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((l5) obj).V2.N(true);
                return;
            case 6:
                ((String[]) this.f4439b)[0] = editable.toString();
                ((m5) obj).V2.N(true);
                return;
            case 7:
                rn rnVar = ((pn) obj).d;
                nn nnVar = (nn) this.f4439b;
                if (nnVar.getTag() == null) {
                    f2.m1 K = rnVar.f30842s.K(rnVar.m0);
                    if (K != null && rnVar.f30849x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, nnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        rnVar.f30849x.setDirection(1);
                        rnVar.f30849x.setDelegate(nnVar);
                        rnVar.f30849x.setTranslationY(K.f5875a.getY());
                        rnVar.f30849x.e();
                    }
                    rnVar.M = editable;
                    if (K != null) {
                        rn.K(rnVar, K.f5875a, rnVar.m0);
                    }
                    rnVar.T();
                    return;
                }
                return;
            case 8:
                rn rnVar2 = ((pn) obj).d;
                qb1 qb1Var = rnVar2.f30842s;
                on onVar = (on) this.f4439b;
                View F = qb1Var.F(onVar);
                if (F != null) {
                    m1Var = qb1Var.T(F);
                }
                if (m1Var != null) {
                    View view = m1Var.f5875a;
                    int b11 = m1Var.b();
                    int i13 = b11 - rnVar2.f30839q0;
                    if (i13 >= 0 && i13 < rnVar2.H.length) {
                        if (rnVar2.f30849x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                rnVar2.f30849x.setDirection(0);
                                rnVar2.f30849x.setTranslationY(y10);
                            } else {
                                rnVar2.f30849x.setDirection(1);
                                rnVar2.f30849x.setTranslationY(view.getY());
                            }
                            rnVar2.f30849x.setDelegate(onVar);
                            rnVar2.f30849x.e();
                        }
                        rnVar2.H[i13] = editable;
                        rn.K(rnVar2, onVar, b11);
                        rnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f34215x == 1 && passcodeActivity.B == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f34213s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f4439b).get()) {
                            passcodeActivity.f34213s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f34213s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f34213s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f34213s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                mv0 mv0Var = ((kv0) obj).d;
                hv0 hv0Var = (hv0) this.f4439b;
                if (hv0Var.getTag() == null) {
                    f2.m1 K2 = mv0Var.f39093c.K(mv0Var.f39099f0);
                    if (K2 != null && mv0Var.N != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, hv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var.N.setDirection(1);
                        mv0Var.N.setDelegate(hv0Var);
                        mv0Var.N.setTranslationY(K2.f5875a.getY());
                        mv0Var.N.e();
                    }
                    mv0Var.B = editable;
                    if (K2 != null) {
                        mv0.c0(mv0Var, K2.f5875a, mv0Var.f39099f0);
                    }
                    mv0Var.i0();
                    return;
                }
                return;
            case 12:
                mv0 mv0Var2 = ((kv0) obj).d;
                iv0 iv0Var = (iv0) this.f4439b;
                if (iv0Var.getTag() == null) {
                    f2.m1 K3 = mv0Var2.f39093c.K(mv0Var2.f39099f0);
                    if (K3 != null && mv0Var2.N != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, iv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var2.N.setDirection(1);
                        mv0Var2.N.setDelegate(iv0Var);
                        mv0Var2.N.setTranslationY(K3.f5875a.getY());
                        mv0Var2.N.e();
                    }
                    mv0Var2.C = editable;
                    if (K3 != null) {
                        mv0.c0(mv0Var2, K3.f5875a, mv0Var2.f39100g0);
                    }
                    mv0Var2.i0();
                    return;
                }
                return;
            default:
                mv0 mv0Var3 = ((kv0) obj).d;
                qb1 qb1Var2 = mv0Var3.f39093c;
                jv0 jv0Var = (jv0) this.f4439b;
                View F2 = qb1Var2.F(jv0Var);
                if (F2 != null) {
                    m1Var = qb1Var2.T(F2);
                }
                if (m1Var != null) {
                    View view2 = m1Var.f5875a;
                    int b12 = m1Var.b() - mv0Var3.f39104k0;
                    if (b12 >= 0 && b12 < mv0Var3.v.length) {
                        if (mv0Var3.N != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, jv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                mv0Var3.N.setDirection(0);
                                mv0Var3.N.setTranslationY(y11);
                            } else {
                                mv0Var3.N.setDirection(1);
                                mv0Var3.N.setTranslationY(view2.getY());
                            }
                            mv0Var3.N.setDelegate(jv0Var);
                            mv0Var3.N.e();
                        }
                        mv0Var3.v[b12] = editable;
                        mv0.c0(mv0Var3, jv0Var, b12);
                        mv0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f4438a) {
            case 0:
                this.f4439b = charSequence.toString();
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
                EditText editText = (EditText) this.f4439b;
                editText.post(new sq(this, editText, (AtomicReference) this.f4440c, 25));
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
        int i13 = this.f4438a;
    }

    public b0(Object obj, Object obj2, boolean z4, int i10) {
        this.f4438a = i10;
        this.f4440c = obj;
        this.f4439b = obj2;
    }

    public b0(c0 c0Var) {
        this.f4438a = 0;
        this.f4440c = c0Var;
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
