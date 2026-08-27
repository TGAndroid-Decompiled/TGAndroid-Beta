package gh;

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
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.in;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.lq;
import org.telegram.ui.ta1;
import org.telegram.ui.tu0;
import org.telegram.ui.uu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wu0;
import org.telegram.ui.yu0;

public final class n4 implements TextWatcher {

    public final int f7464a;

    public Object f7465b;

    public final Object f7466c;

    public n4(int i10, Object obj, Object obj2) {
        this.f7464a = i10;
        this.f7465b = obj;
        this.f7466c = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        f2.o1 o1VarT;
        int i10 = this.f7464a;
        Object obj = this.f7466c;
        switch (i10) {
            case 0:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((u4) obj).U2.N(true);
                break;
            case 1:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((s4) obj).U2.N(true);
                break;
            case 2:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((t4) obj).U2.N(true);
                break;
            case 3:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((r5) obj).U2.N(true);
                break;
            case 4:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((s5) obj).U2.N(true);
                break;
            case 5:
                ((String[]) this.f7465b)[0] = editable.toString();
                ((t5) obj).U2.N(true);
                break;
            case 6:
                in inVar = ((gn) obj).d;
                en enVar = (en) this.f7465b;
                if (enVar.getTag() == null) {
                    f2.o1 o1VarK = inVar.f29437s.K(inVar.f29429l0);
                    if (o1VarK != null && inVar.f29444x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
                        inVar.f29444x.setDirection(1);
                        inVar.f29444x.setDelegate(enVar);
                        inVar.f29444x.setTranslationY(o1VarK.f5789a.getY());
                        inVar.f29444x.e();
                    }
                    inVar.L = editable;
                    if (o1VarK != null) {
                        in.L(inVar, o1VarK.f5789a, inVar.f29429l0);
                    }
                    inVar.T();
                    break;
                }
                break;
            case 7:
                in inVar2 = ((gn) obj).d;
                ta1 ta1Var = inVar2.f29437s;
                fn fnVar = (fn) this.f7465b;
                View viewF = ta1Var.F(fnVar);
                o1VarT = viewF != null ? ta1Var.T(viewF) : null;
                if (o1VarT != null) {
                    View view = o1VarT.f5789a;
                    int iB = o1VarT.b();
                    int i11 = iB - inVar2.f29433p0;
                    if (i11 >= 0 && i11 < inVar2.G.length) {
                        if (inVar2.f29444x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, fnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                inVar2.f29444x.setDirection(0);
                                inVar2.f29444x.setTranslationY(y10);
                            } else {
                                inVar2.f29444x.setDirection(1);
                                inVar2.f29444x.setTranslationY(view.getY());
                            }
                            inVar2.f29444x.setDelegate(fnVar);
                            inVar2.f29444x.e();
                        }
                        inVar2.G[i11] = editable;
                        in.L(inVar2, fnVar, iB);
                        inVar2.T();
                        break;
                    }
                }
                break;
            case 8:
                break;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f35577x == 1 && passcodeActivity.A == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f35575s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f7465b).get()) {
                            passcodeActivity.f35575s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35575s, false, 0.1f, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f35575s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35575s, true, 0.1f, true);
                        break;
                    }
                }
                break;
            case 10:
                yu0 yu0Var = ((wu0) obj).d;
                tu0 tu0Var = (tu0) this.f7465b;
                if (tu0Var.getTag() == null) {
                    f2.o1 o1VarK2 = yu0Var.f44920c.K(yu0Var.f44924e0);
                    if (o1VarK2 != null && yu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, tu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        yu0Var.M.setDirection(1);
                        yu0Var.M.setDelegate(tu0Var);
                        yu0Var.M.setTranslationY(o1VarK2.f5789a.getY());
                        yu0Var.M.e();
                    }
                    yu0Var.A = editable;
                    if (o1VarK2 != null) {
                        yu0.c0(yu0Var, o1VarK2.f5789a, yu0Var.f44924e0);
                    }
                    yu0Var.i0();
                    break;
                }
                break;
            case 11:
                yu0 yu0Var2 = ((wu0) obj).d;
                uu0 uu0Var = (uu0) this.f7465b;
                if (uu0Var.getTag() == null) {
                    f2.o1 o1VarK3 = yu0Var2.f44920c.K(yu0Var2.f44924e0);
                    if (o1VarK3 != null && yu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, uu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        yu0Var2.M.setDirection(1);
                        yu0Var2.M.setDelegate(uu0Var);
                        yu0Var2.M.setTranslationY(o1VarK3.f5789a.getY());
                        yu0Var2.M.e();
                    }
                    yu0Var2.B = editable;
                    if (o1VarK3 != null) {
                        yu0.c0(yu0Var2, o1VarK3.f5789a, yu0Var2.f44926f0);
                    }
                    yu0Var2.i0();
                    break;
                }
                break;
            case 12:
                yu0 yu0Var3 = ((wu0) obj).d;
                ta1 ta1Var2 = yu0Var3.f44920c;
                vu0 vu0Var = (vu0) this.f7465b;
                View viewF2 = ta1Var2.F(vu0Var);
                o1VarT = viewF2 != null ? ta1Var2.T(viewF2) : null;
                if (o1VarT != null) {
                    View view2 = o1VarT.f5789a;
                    int iB2 = o1VarT.b() - yu0Var3.f44930j0;
                    if (iB2 >= 0 && iB2 < yu0Var3.v.length) {
                        if (yu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, vu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                yu0Var3.M.setDirection(0);
                                yu0Var3.M.setTranslationY(y11);
                            } else {
                                yu0Var3.M.setDirection(1);
                                yu0Var3.M.setTranslationY(view2.getY());
                            }
                            yu0Var3.M.setDelegate(vu0Var);
                            yu0Var3.M.e();
                        }
                        yu0Var3.v[iB2] = editable;
                        yu0.c0(yu0Var3, vu0Var, iB2);
                        yu0Var3.i0();
                        break;
                    }
                }
                break;
            default:
                yf.v vVar = (yf.v) obj;
                yf.x xVar = vVar.f50101f;
                if (!vVar.f50100e && ((String) this.f7465b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f7465b).toString(), editable.toString())) {
                    int iB3 = h7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    int iArgb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(xVar.f50115f), iB3, Color.green(xVar.f50115f), Color.blue(xVar.f50115f)) : Color.argb(Color.alpha(xVar.f50115f), Color.red(xVar.f50115f), Color.green(xVar.f50115f), iB3) : Color.argb(Color.alpha(xVar.f50115f), Color.red(xVar.f50115f), iB3, Color.blue(xVar.f50115f));
                    int i13 = yf.x.f50111s;
                    xVar.m(iArgb, 5);
                }
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f7464a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
                EditText editText = (EditText) this.f7465b;
                editText.post(new lq(this, editText, (AtomicReference) this.f7466c, 25));
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            default:
                this.f7465b = charSequence.toString();
                break;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f7464a;
    }

    public n4(Object obj, Object obj2, boolean z10, int i10) {
        this.f7464a = i10;
        this.f7466c = obj;
        this.f7465b = obj2;
    }

    public n4(yf.v vVar) {
        this.f7464a = 13;
        this.f7466c = vVar;
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
