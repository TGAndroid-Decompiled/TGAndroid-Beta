package ag;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import ih.k5;
import ih.l4;
import ih.l5;
import ih.m4;
import ih.m5;
import ih.n4;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.on;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.lq;
import org.telegram.ui.qu0;
import org.telegram.ui.ru0;
import org.telegram.ui.su0;
import org.telegram.ui.tu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wa1;
public final class c0 implements TextWatcher {
    public final int f422a;
    public Object f423b;
    public final Object f424c;

    public c0(int i10, Object obj, Object obj2) {
        this.f422a = i10;
        this.f423b = obj;
        this.f424c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f422a;
        f2.n1 n1Var = null;
        Object obj = this.f424c;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj;
                f0 f0Var = d0Var.f435f;
                if (!d0Var.f434e && ((String) this.f423b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f423b).toString(), editable.toString())) {
                    int b10 = i7.w.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = d0Var.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(f0Var.f466f), b10, Color.green(f0Var.f466f), Color.blue(f0Var.f466f));
                        } else {
                            argb = Color.argb(Color.alpha(f0Var.f466f), Color.red(f0Var.f466f), Color.green(f0Var.f466f), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(f0Var.f466f), Color.red(f0Var.f466f), b10, Color.blue(f0Var.f466f));
                    }
                    int i12 = f0.f462s;
                    f0Var.m(argb, 5);
                    return;
                }
                return;
            case 1:
                ((String[]) this.f423b)[0] = editable.toString();
                ((n4) obj).U2.N(true);
                return;
            case 2:
                ((String[]) this.f423b)[0] = editable.toString();
                ((l4) obj).U2.N(true);
                return;
            case 3:
                ((String[]) this.f423b)[0] = editable.toString();
                ((m4) obj).U2.N(true);
                return;
            case 4:
                ((String[]) this.f423b)[0] = editable.toString();
                ((k5) obj).U2.N(true);
                return;
            case 5:
                ((String[]) this.f423b)[0] = editable.toString();
                ((l5) obj).U2.N(true);
                return;
            case 6:
                ((String[]) this.f423b)[0] = editable.toString();
                ((m5) obj).U2.N(true);
                return;
            case 7:
                on onVar = ((mn) obj).d;
                kn knVar = (kn) this.f423b;
                if (knVar.getTag() == null) {
                    f2.n1 K = onVar.f31427s.K(onVar.f31419l0);
                    if (K != null && onVar.f31434x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, knVar.getEditField().getPaint().getFontMetricsInt(), false);
                        onVar.f31434x.setDirection(1);
                        onVar.f31434x.setDelegate(knVar);
                        onVar.f31434x.setTranslationY(K.f6432a.getY());
                        onVar.f31434x.e();
                    }
                    onVar.L = editable;
                    if (K != null) {
                        on.K(onVar, K.f6432a, onVar.f31419l0);
                    }
                    onVar.T();
                    return;
                }
                return;
            case 8:
                on onVar2 = ((mn) obj).d;
                wa1 wa1Var = onVar2.f31427s;
                ln lnVar = (ln) this.f423b;
                View F = wa1Var.F(lnVar);
                if (F != null) {
                    n1Var = wa1Var.T(F);
                }
                if (n1Var != null) {
                    View view = n1Var.f6432a;
                    int b11 = n1Var.b();
                    int i13 = b11 - onVar2.f31423p0;
                    if (i13 >= 0 && i13 < onVar2.G.length) {
                        if (onVar2.f31434x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y8 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y8 > 0.0f) {
                                onVar2.f31434x.setDirection(0);
                                onVar2.f31434x.setTranslationY(y8);
                            } else {
                                onVar2.f31434x.setDirection(1);
                                onVar2.f31434x.setTranslationY(view.getY());
                            }
                            onVar2.f31434x.setDelegate(lnVar);
                            onVar2.f31434x.e();
                        }
                        onVar2.G[i13] = editable;
                        on.K(onVar2, lnVar, b11);
                        onVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f35641x == 1 && passcodeActivity.A == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f35639s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f423b).get()) {
                            passcodeActivity.f35639s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35639s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f35639s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35639s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                vu0 vu0Var = ((tu0) obj).d;
                qu0 qu0Var = (qu0) this.f423b;
                if (qu0Var.getTag() == null) {
                    f2.n1 K2 = vu0Var.f43756c.K(vu0Var.f43760e0);
                    if (K2 != null && vu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, qu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        vu0Var.M.setDirection(1);
                        vu0Var.M.setDelegate(qu0Var);
                        vu0Var.M.setTranslationY(K2.f6432a.getY());
                        vu0Var.M.e();
                    }
                    vu0Var.A = editable;
                    if (K2 != null) {
                        vu0.c0(vu0Var, K2.f6432a, vu0Var.f43760e0);
                    }
                    vu0Var.i0();
                    return;
                }
                return;
            case 12:
                vu0 vu0Var2 = ((tu0) obj).d;
                ru0 ru0Var = (ru0) this.f423b;
                if (ru0Var.getTag() == null) {
                    f2.n1 K3 = vu0Var2.f43756c.K(vu0Var2.f43760e0);
                    if (K3 != null && vu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, ru0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        vu0Var2.M.setDirection(1);
                        vu0Var2.M.setDelegate(ru0Var);
                        vu0Var2.M.setTranslationY(K3.f6432a.getY());
                        vu0Var2.M.e();
                    }
                    vu0Var2.B = editable;
                    if (K3 != null) {
                        vu0.c0(vu0Var2, K3.f6432a, vu0Var2.f43762f0);
                    }
                    vu0Var2.i0();
                    return;
                }
                return;
            default:
                vu0 vu0Var3 = ((tu0) obj).d;
                wa1 wa1Var2 = vu0Var3.f43756c;
                su0 su0Var = (su0) this.f423b;
                View F2 = wa1Var2.F(su0Var);
                if (F2 != null) {
                    n1Var = wa1Var2.T(F2);
                }
                if (n1Var != null) {
                    View view2 = n1Var.f6432a;
                    int b12 = n1Var.b() - vu0Var3.f43766j0;
                    if (b12 >= 0 && b12 < vu0Var3.v.length) {
                        if (vu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, su0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                vu0Var3.M.setDirection(0);
                                vu0Var3.M.setTranslationY(y10);
                            } else {
                                vu0Var3.M.setDirection(1);
                                vu0Var3.M.setTranslationY(view2.getY());
                            }
                            vu0Var3.M.setDelegate(su0Var);
                            vu0Var3.M.e();
                        }
                        vu0Var3.v[b12] = editable;
                        vu0.c0(vu0Var3, su0Var, b12);
                        vu0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f422a) {
            case 0:
                this.f423b = charSequence.toString();
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
                EditText editText = (EditText) this.f423b;
                editText.post(new lq(this, editText, (AtomicReference) this.f424c, 25));
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
        int i13 = this.f422a;
    }

    public c0(Object obj, Object obj2, boolean z10, int i10) {
        this.f422a = i10;
        this.f424c = obj;
        this.f423b = obj2;
    }

    public c0(d0 d0Var) {
        this.f422a = 0;
        this.f424c = d0Var;
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
