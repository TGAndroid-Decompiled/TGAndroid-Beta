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
import kh.j5;
import kh.k4;
import kh.k5;
import kh.l4;
import kh.l5;
import kh.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.pn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.hv0;
import org.telegram.ui.iv0;
import org.telegram.ui.jv0;
import org.telegram.ui.kv0;
import org.telegram.ui.mv0;
import org.telegram.ui.rb1;
import org.telegram.ui.tq;
public final class b0 implements TextWatcher {
    public final int f2295a;
    public Object f2296b;
    public final Object f2297c;

    public b0(int i10, Object obj, Object obj2) {
        this.f2295a = i10;
        this.f2296b = obj;
        this.f2297c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f2295a;
        f2.l1 l1Var = null;
        Object obj = this.f2297c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj;
                e0 e0Var = c0Var.f2307f;
                if (!c0Var.e && ((String) this.f2296b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f2296b).toString(), editable.toString())) {
                    int b10 = k7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = c0Var.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(e0Var.f2345f), b10, Color.green(e0Var.f2345f), Color.blue(e0Var.f2345f));
                        } else {
                            argb = Color.argb(Color.alpha(e0Var.f2345f), Color.red(e0Var.f2345f), Color.green(e0Var.f2345f), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(e0Var.f2345f), Color.red(e0Var.f2345f), b10, Color.blue(e0Var.f2345f));
                    }
                    int i12 = e0.f2342s;
                    e0Var.m(argb, 5);
                    return;
                }
                return;
            case 1:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((m4) obj).V2.N(true);
                return;
            case 2:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((k4) obj).V2.N(true);
                return;
            case 3:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((l4) obj).V2.N(true);
                return;
            case 4:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((j5) obj).V2.N(true);
                return;
            case 5:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((k5) obj).V2.N(true);
                return;
            case 6:
                ((String[]) this.f2296b)[0] = editable.toString();
                ((l5) obj).V2.N(true);
                return;
            case 7:
                pn pnVar = ((nn) obj).d;
                ln lnVar = (ln) this.f2296b;
                if (lnVar.getTag() == null) {
                    f2.l1 K = pnVar.f27960s.K(pnVar.m0);
                    if (K != null && pnVar.f27967x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        pnVar.f27967x.setDirection(1);
                        pnVar.f27967x.setDelegate(lnVar);
                        pnVar.f27967x.setTranslationY(K.f5774a.getY());
                        pnVar.f27967x.e();
                    }
                    pnVar.M = editable;
                    if (K != null) {
                        pn.K(pnVar, K.f5774a, pnVar.m0);
                    }
                    pnVar.T();
                    return;
                }
                return;
            case 8:
                pn pnVar2 = ((nn) obj).d;
                rb1 rb1Var = pnVar2.f27960s;
                mn mnVar = (mn) this.f2296b;
                View F = rb1Var.F(mnVar);
                if (F != null) {
                    l1Var = rb1Var.T(F);
                }
                if (l1Var != null) {
                    View view = l1Var.f5774a;
                    int b11 = l1Var.b();
                    int i13 = b11 - pnVar2.f27957q0;
                    if (i13 >= 0 && i13 < pnVar2.H.length) {
                        if (pnVar2.f27967x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, mnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                pnVar2.f27967x.setDirection(0);
                                pnVar2.f27967x.setTranslationY(y10);
                            } else {
                                pnVar2.f27967x.setDirection(1);
                                pnVar2.f27967x.setTranslationY(view.getY());
                            }
                            pnVar2.f27967x.setDelegate(mnVar);
                            pnVar2.f27967x.e();
                        }
                        pnVar2.H[i13] = editable;
                        pn.K(pnVar2, mnVar, b11);
                        pnVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f31664x == 1 && passcodeActivity.B == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f31662s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f2296b).get()) {
                            passcodeActivity.f31662s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31662s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f31662s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f31662s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                mv0 mv0Var = ((kv0) obj).d;
                hv0 hv0Var = (hv0) this.f2296b;
                if (hv0Var.getTag() == null) {
                    f2.l1 K2 = mv0Var.f36233c.K(mv0Var.f36238f0);
                    if (K2 != null && mv0Var.N != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, hv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var.N.setDirection(1);
                        mv0Var.N.setDelegate(hv0Var);
                        mv0Var.N.setTranslationY(K2.f5774a.getY());
                        mv0Var.N.e();
                    }
                    mv0Var.B = editable;
                    if (K2 != null) {
                        mv0.c0(mv0Var, K2.f5774a, mv0Var.f36238f0);
                    }
                    mv0Var.i0();
                    return;
                }
                return;
            case 12:
                mv0 mv0Var2 = ((kv0) obj).d;
                iv0 iv0Var = (iv0) this.f2296b;
                if (iv0Var.getTag() == null) {
                    f2.l1 K3 = mv0Var2.f36233c.K(mv0Var2.f36238f0);
                    if (K3 != null && mv0Var2.N != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, iv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        mv0Var2.N.setDirection(1);
                        mv0Var2.N.setDelegate(iv0Var);
                        mv0Var2.N.setTranslationY(K3.f5774a.getY());
                        mv0Var2.N.e();
                    }
                    mv0Var2.C = editable;
                    if (K3 != null) {
                        mv0.c0(mv0Var2, K3.f5774a, mv0Var2.f36239g0);
                    }
                    mv0Var2.i0();
                    return;
                }
                return;
            default:
                mv0 mv0Var3 = ((kv0) obj).d;
                rb1 rb1Var2 = mv0Var3.f36233c;
                jv0 jv0Var = (jv0) this.f2296b;
                View F2 = rb1Var2.F(jv0Var);
                if (F2 != null) {
                    l1Var = rb1Var2.T(F2);
                }
                if (l1Var != null) {
                    View view2 = l1Var.f5774a;
                    int b12 = l1Var.b() - mv0Var3.f36243k0;
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
        switch (this.f2295a) {
            case 0:
                this.f2296b = charSequence.toString();
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
                EditText editText = (EditText) this.f2296b;
                editText.post(new tq(this, editText, (AtomicReference) this.f2297c, 25));
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
        int i13 = this.f2295a;
    }

    public b0(Object obj, Object obj2, boolean z4, int i10) {
        this.f2295a = i10;
        this.f2297c = obj;
        this.f2296b = obj2;
    }

    public b0(c0 c0Var) {
        this.f2295a = 0;
        this.f2297c = c0Var;
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
