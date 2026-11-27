package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.Intro;
public final class mv implements dic {
    public final byte a;
    public final Object b;

    public mv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i) {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qv qvVar = (qv) obj;
                qvVar.x = i;
                qvVar.d.invalidate();
                return;
            case 1:
                ((yr5) obj).I = i;
                return;
            case 2:
                yu7 yu7Var = (yu7) obj;
                LinearLayout linearLayout = yu7Var.d;
                dic dicVar = yu7Var.c;
                if (dicVar != null) {
                    dicVar.a(i);
                }
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    View childAt = linearLayout.getChildAt(i2);
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                }
                return;
            case 3:
            case 4:
                return;
            default:
                ((pqb) obj).c0.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        LinearLayout linearLayout;
        int i3;
        int i4;
        float f2;
        int i5;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qv qvVar = (qv) obj;
                float measuredWidth = qvVar.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    qvVar.w = c00.c(qvVar.x, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
                    qvVar.d.invalidate();
                    return;
                }
                return;
            case 1:
                yr5 yr5Var = (yr5) obj;
                zw0 zw0Var = yr5Var.e;
                zw0Var.b = f;
                zw0Var.c = i;
                zw0Var.invalidate();
                float measuredWidth2 = yr5Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i * measuredWidth2) + i2) - (yr5Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            case 2:
                yu7 yu7Var = (yu7) obj;
                yu7Var.h = i;
                yu7Var.n = f;
                if (yu7Var.d.getChildAt(i) != null) {
                    yu7Var.d(i, (int) (linearLayout.getChildAt(i).getWidth() * f));
                    yu7Var.invalidate();
                    dic dicVar = yu7Var.c;
                    if (dicVar != null) {
                        dicVar.b(f, i, i2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ws8 ws8Var = (ws8) obj;
                if (!ws8Var.a && Math.abs(i - ws8Var.x) == 1) {
                    int i6 = ws8Var.x;
                    if (i > i6) {
                        ws8Var.i(0, 1, 1);
                    } else if (i < i6) {
                        ws8Var.i(1, 0, 0);
                        ws8Var.i(2, 0, -1);
                    }
                }
                int i7 = ws8Var.x;
                int i8 = ws8Var.y;
                ws8Var.x = i;
                ws8Var.y = i2;
                if (i7 != i || i8 != i2) {
                    ws8Var.I = true;
                    ws8Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            case 4:
                g4a g4aVar = (g4a) obj;
                if (g4aVar.x) {
                    a4a a4aVar = g4aVar.h;
                    a4aVar.d.abortAnimation();
                    if (Math.abs(f) <= 1.0f) {
                        ValueAnimator valueAnimator = a4aVar.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            a4aVar.N = null;
                        }
                        float f3 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((i3 + a4aVar.n) * i);
                        if (f > 0.0f) {
                            f2 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((i + 1) * (i5 + a4aVar.n));
                        } else {
                            f2 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((i - 1) * (i4 + a4aVar.n));
                            f = -f;
                        }
                        if (f == 0.0f) {
                            a4aVar.e = f3;
                        } else {
                            a4aVar.e = hl.R1(f3, f2, f);
                        }
                        a4aVar.M = false;
                        a4aVar.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                yr5 yr5Var = (yr5) obj;
                if (i == 1) {
                    yr5Var.L = true;
                    yr5Var.d.getCurrentItem();
                    yr5Var.d.getMeasuredWidth();
                    return;
                } else if (i == 0 || i == 2) {
                    if (yr5Var.L) {
                        yr5Var.L = false;
                    }
                    if (yr5Var.x != yr5Var.d.getCurrentItem()) {
                        yr5Var.x = yr5Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                yu7 yu7Var = (yu7) obj;
                if (i == 0) {
                    yu7Var.d(yu7Var.e.getCurrentItem(), 0);
                }
                dic dicVar = yu7Var.c;
                if (dicVar != null) {
                    dicVar.c(i);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                g4a g4aVar = (g4a) obj;
                if (i == 1) {
                    g4aVar.x = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void h(int i) {
    }

    private final void i(int i) {
    }

    private final void g(float f, int i, int i2) {
    }
}
