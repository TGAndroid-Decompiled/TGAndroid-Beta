package og;

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
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.zn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bw0;
import org.telegram.ui.ic1;
import org.telegram.ui.wv0;
import org.telegram.ui.xv0;
import org.telegram.ui.yv0;
import org.telegram.ui.zq;
import org.telegram.ui.zv0;
import wh.b4;
import wh.c4;
import wh.d3;
import wh.d4;
import wh.e3;
import wh.f3;
public final class x implements TextWatcher {
    public final int f14543a;
    public Object f14544b;
    public final Object f14545c;

    public x(int i10, Object obj, Object obj2) {
        this.f14543a = i10;
        this.f14545c = obj;
        this.f14544b = obj2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int argb;
        int i10 = this.f14543a;
        s4.c1 c1Var = null;
        Object obj = this.f14545c;
        switch (i10) {
            case 0:
                y yVar = (y) obj;
                a0 a0Var = yVar.f14564f;
                if (!yVar.e && ((String) this.f14544b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.f14544b).toString(), editable.toString())) {
                    int b10 = w7.q.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = yVar.d;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            argb = Color.argb(Color.alpha(a0Var.f14319f), b10, Color.green(a0Var.f14319f), Color.blue(a0Var.f14319f));
                        } else {
                            argb = Color.argb(Color.alpha(a0Var.f14319f), Color.red(a0Var.f14319f), Color.green(a0Var.f14319f), b10);
                        }
                    } else {
                        argb = Color.argb(Color.alpha(a0Var.f14319f), Color.red(a0Var.f14319f), b10, Color.blue(a0Var.f14319f));
                    }
                    int i12 = a0.f14316s;
                    a0Var.m(argb, 5);
                    return;
                }
                return;
            case 1:
                zn znVar = ((xn) obj).d;
                vn vnVar = (vn) this.f14544b;
                if (vnVar.getTag() == null) {
                    s4.c1 K = znVar.f29762s.K(znVar.f29758p0);
                    if (K != null && znVar.f29769x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, vnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        znVar.f29769x.setDirection(1);
                        znVar.f29769x.setDelegate(vnVar);
                        znVar.f29769x.setTranslationY(K.f41610a.getY());
                        znVar.f29769x.e();
                    }
                    znVar.P = editable;
                    if (K != null) {
                        zn.L(znVar, K.f41610a, znVar.f29758p0);
                    }
                    znVar.T();
                    return;
                }
                return;
            case 2:
                zn znVar2 = ((xn) obj).d;
                ic1 ic1Var = znVar2.f29762s;
                wn wnVar = (wn) this.f14544b;
                View F = ic1Var.F(wnVar);
                if (F != null) {
                    c1Var = ic1Var.T(F);
                }
                if (c1Var != null) {
                    View view = c1Var.f41610a;
                    int b11 = c1Var.b();
                    int i13 = b11 - znVar2.f29764t0;
                    if (i13 >= 0 && i13 < znVar2.K.length) {
                        if (znVar2.f29769x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, wnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                znVar2.f29769x.setDirection(0);
                                znVar2.f29769x.setTranslationY(y3);
                            } else {
                                znVar2.f29769x.setDirection(1);
                                znVar2.f29769x.setTranslationY(view.getY());
                            }
                            znVar2.f29769x.setDelegate(wnVar);
                            znVar2.f29769x.e();
                        }
                        znVar2.K[i13] = editable;
                        zn.L(znVar2, wnVar, b11);
                        znVar2.T();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.f30005x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.f30003s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.f14544b).get()) {
                            passcodeActivity.f30003s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30003s, false, 0.1f, true);
                        return;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.f30003s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f30003s, true, 0.1f, true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                bw0 bw0Var = ((zv0) obj).d;
                wv0 wv0Var = (wv0) this.f14544b;
                if (wv0Var.getTag() == null) {
                    s4.c1 K2 = bw0Var.f31428c.K(bw0Var.f31436i0);
                    if (K2 != null && bw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        bw0Var.Q.setDirection(1);
                        bw0Var.Q.setDelegate(wv0Var);
                        bw0Var.Q.setTranslationY(K2.f41610a.getY());
                        bw0Var.Q.e();
                    }
                    bw0Var.E = editable;
                    if (K2 != null) {
                        bw0.c0(bw0Var, K2.f41610a, bw0Var.f31436i0);
                    }
                    bw0Var.i0();
                    return;
                }
                return;
            case 6:
                bw0 bw0Var2 = ((zv0) obj).d;
                xv0 xv0Var = (xv0) this.f14544b;
                if (xv0Var.getTag() == null) {
                    s4.c1 K3 = bw0Var2.f31428c.K(bw0Var2.f31436i0);
                    if (K3 != null && bw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, xv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        bw0Var2.Q.setDirection(1);
                        bw0Var2.Q.setDelegate(xv0Var);
                        bw0Var2.Q.setTranslationY(K3.f41610a.getY());
                        bw0Var2.Q.e();
                    }
                    bw0Var2.F = editable;
                    if (K3 != null) {
                        bw0.c0(bw0Var2, K3.f41610a, bw0Var2.f31437j0);
                    }
                    bw0Var2.i0();
                    return;
                }
                return;
            case 7:
                bw0 bw0Var3 = ((zv0) obj).d;
                ic1 ic1Var2 = bw0Var3.f31428c;
                yv0 yv0Var = (yv0) this.f14544b;
                View F2 = ic1Var2.F(yv0Var);
                if (F2 != null) {
                    c1Var = ic1Var2.T(F2);
                }
                if (c1Var != null) {
                    View view2 = c1Var.f41610a;
                    int b12 = c1Var.b() - bw0Var3.f31441n0;
                    if (b12 >= 0 && b12 < bw0Var3.v.length) {
                        if (bw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, yv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                bw0Var3.Q.setDirection(0);
                                bw0Var3.Q.setTranslationY(y10);
                            } else {
                                bw0Var3.Q.setDirection(1);
                                bw0Var3.Q.setTranslationY(view2.getY());
                            }
                            bw0Var3.Q.setDelegate(yv0Var);
                            bw0Var3.Q.e();
                        }
                        bw0Var3.v[b12] = editable;
                        bw0.c0(bw0Var3, yv0Var, b12);
                        bw0Var3.i0();
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((f3) obj).Y2.N(true);
                return;
            case 9:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((d3) obj).Y2.N(true);
                return;
            case 10:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((e3) obj).Y2.N(true);
                return;
            case 11:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((b4) obj).Y2.N(true);
                return;
            case 12:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((c4) obj).Y2.N(true);
                return;
            default:
                ((String[]) this.f14544b)[0] = editable.toString();
                ((d4) obj).Y2.N(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f14543a) {
            case 0:
                this.f14544b = charSequence.toString();
                return;
            case 1:
            case 2:
                return;
            case 3:
                EditText editText = (EditText) this.f14544b;
                editText.post(new zq(this, editText, (AtomicReference) this.f14545c, 25));
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f14543a;
    }

    public x(Object obj, Object obj2, boolean z10, int i10) {
        this.f14543a = i10;
        this.f14544b = obj;
        this.f14545c = obj2;
    }

    public x(y yVar) {
        this.f14543a = 0;
        this.f14545c = yVar;
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
