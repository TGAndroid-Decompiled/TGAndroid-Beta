package fh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.jq;
import org.telegram.ui.su0;
import org.telegram.ui.tu0;
import org.telegram.ui.uu0;
import org.telegram.ui.va1;
import org.telegram.ui.vu0;
import org.telegram.ui.xu0;
public final class t4 implements TextWatcher {
    public final int f6764a;
    public Object f6765b;
    public final Object f6766c;

    public t4(int i9, Object obj, Object obj2) {
        this.f6764a = i9;
        this.f6765b = obj;
        this.f6766c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i9 = this.f6764a;
        f2.q1 q1Var = null;
        Object obj = this.f6766c;
        switch (i9) {
            case 0:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((b5) obj).U2.N(true);
                return;
            case 1:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((z4) obj).U2.N(true);
                return;
            case 2:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((a5) obj).U2.N(true);
                return;
            case 3:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((z5) obj).U2.N(true);
                return;
            case 4:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((a6) obj).U2.N(true);
                return;
            case 5:
                ((String[]) this.f6765b)[0] = editable.toString();
                ((b6) obj).U2.N(true);
                return;
            case 6:
                jn jnVar = ((hn) obj).d;
                fn fnVar = (fn) this.f6765b;
                if (fnVar.getTag() == null) {
                    f2.q1 K = jnVar.f29791s.K(jnVar.f29783l0);
                    if (K != null && jnVar.f29798x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, fnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        jnVar.f29798x.setDirection(1);
                        jnVar.f29798x.setDelegate(fnVar);
                        jnVar.f29798x.setTranslationY(K.f5501a.getY());
                        jnVar.f29798x.e();
                    }
                    jnVar.L = editable;
                    if (K != null) {
                        jn.K(jnVar, K.f5501a, jnVar.f29783l0);
                    }
                    jnVar.S();
                    return;
                }
                return;
            case 7:
                jn jnVar2 = ((hn) obj).d;
                va1 va1Var = jnVar2.f29791s;
                gn gnVar = (gn) this.f6765b;
                View F = va1Var.F(gnVar);
                if (F != null) {
                    q1Var = va1Var.T(F);
                }
                if (q1Var != null) {
                    View view = q1Var.f5501a;
                    int b10 = q1Var.b();
                    int i10 = b10 - jnVar2.f29787p0;
                    if (i10 >= 0 && i10 < jnVar2.G.length) {
                        if (jnVar2.f29798x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, gnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                jnVar2.f29798x.setDirection(0);
                                jnVar2.f29798x.setTranslationY(y10);
                            } else {
                                jnVar2.f29798x.setDirection(1);
                                jnVar2.f29798x.setTranslationY(view.getY());
                            }
                            jnVar2.f29798x.setDelegate(gnVar);
                            jnVar2.f29798x.e();
                        }
                        jnVar2.G[i10] = editable;
                        jn.K(jnVar2, gnVar, b10);
                        jnVar2.S();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                return;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f35574x == 1 && passcodeActivity.A == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f35572s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f6765b).get()) {
                            passcodeActivity.f35572s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35572s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f35572s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35572s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                xu0 xu0Var = ((vu0) obj).d;
                su0 su0Var = (su0) this.f6765b;
                if (su0Var.getTag() == null) {
                    f2.q1 K2 = xu0Var.f44611c.K(xu0Var.f44615e0);
                    if (K2 != null && xu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, su0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        xu0Var.M.setDirection(1);
                        xu0Var.M.setDelegate(su0Var);
                        xu0Var.M.setTranslationY(K2.f5501a.getY());
                        xu0Var.M.e();
                    }
                    xu0Var.A = editable;
                    if (K2 != null) {
                        xu0.b0(xu0Var, K2.f5501a, xu0Var.f44615e0);
                    }
                    xu0Var.h0();
                    return;
                }
                return;
            case 11:
                xu0 xu0Var2 = ((vu0) obj).d;
                tu0 tu0Var = (tu0) this.f6765b;
                if (tu0Var.getTag() == null) {
                    f2.q1 K3 = xu0Var2.f44611c.K(xu0Var2.f44615e0);
                    if (K3 != null && xu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, tu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        xu0Var2.M.setDirection(1);
                        xu0Var2.M.setDelegate(tu0Var);
                        xu0Var2.M.setTranslationY(K3.f5501a.getY());
                        xu0Var2.M.e();
                    }
                    xu0Var2.B = editable;
                    if (K3 != null) {
                        xu0.b0(xu0Var2, K3.f5501a, xu0Var2.f44617f0);
                    }
                    xu0Var2.h0();
                    return;
                }
                return;
            case 12:
                xu0 xu0Var3 = ((vu0) obj).d;
                va1 va1Var2 = xu0Var3.f44611c;
                uu0 uu0Var = (uu0) this.f6765b;
                View F2 = va1Var2.F(uu0Var);
                if (F2 != null) {
                    q1Var = va1Var2.T(F2);
                }
                if (q1Var != null) {
                    View view2 = q1Var.f5501a;
                    int b11 = q1Var.b() - xu0Var3.f44621j0;
                    if (b11 >= 0 && b11 < xu0Var3.v.length) {
                        if (xu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, uu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                xu0Var3.M.setDirection(0);
                                xu0Var3.M.setTranslationY(y11);
                            } else {
                                xu0Var3.M.setDirection(1);
                                xu0Var3.M.setTranslationY(view2.getY());
                            }
                            xu0Var3.M.setDelegate(uu0Var);
                            xu0Var3.M.e();
                        }
                        xu0Var3.v[b11] = editable;
                        xu0.b0(xu0Var3, uu0Var, b11);
                        xu0Var3.h0();
                        return;
                    }
                    return;
                }
                return;
            default:
                xf.v vVar = (xf.v) obj;
                xf.x xVar = vVar.f49391f;
                if (!vVar.f49390e && ((String) this.f6765b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f6765b).toString(), editable.toString())) {
                    int b12 = g7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = vVar.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(xVar.f49411f), b12, Color.green(xVar.f49411f), Color.blue(xVar.f49411f));
                        } else {
                            argb = Color.argb(Color.alpha(xVar.f49411f), Color.red(xVar.f49411f), Color.green(xVar.f49411f), b12);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(xVar.f49411f), Color.red(xVar.f49411f), b12, Color.blue(xVar.f49411f));
                    }
                    int i12 = xf.x.f49407s;
                    xVar.m(argb, 5);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.f6764a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
                EditText editText = (EditText) this.f6765b;
                editText.post(new jq(this, editText, (AtomicReference) this.f6766c, 25));
                return;
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            default:
                this.f6765b = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f6764a;
    }

    public t4(Object obj, Object obj2, boolean z10, int i9) {
        this.f6764a = i9;
        this.f6766c = obj;
        this.f6765b = obj2;
    }

    public t4(xf.v vVar) {
        this.f6764a = 13;
        this.f6766c = vVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
