package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.Intro;
public final class lw implements egc {
    public final byte a;
    public final Object b;

    public lw(Object obj, byte b) {
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
                pw pwVar = (pw) obj;
                pwVar.x = i;
                pwVar.d.invalidate();
                return;
            case 1:
                ((vr5) obj).I = i;
                return;
            case 2:
                tt7 tt7Var = (tt7) obj;
                LinearLayout linearLayout = tt7Var.d;
                egc egcVar = tt7Var.c;
                if (egcVar != null) {
                    egcVar.a(i);
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
                ((rob) obj).c0.invalidate();
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
                pw pwVar = (pw) obj;
                float measuredWidth = pwVar.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    pwVar.w = b10.b(pwVar.x, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
                    pwVar.d.invalidate();
                    return;
                }
                return;
            case 1:
                vr5 vr5Var = (vr5) obj;
                yx0 yx0Var = vr5Var.e;
                yx0Var.b = f;
                yx0Var.c = i;
                yx0Var.invalidate();
                float measuredWidth2 = vr5Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i * measuredWidth2) + i2) - (vr5Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            case 2:
                tt7 tt7Var = (tt7) obj;
                tt7Var.h = i;
                tt7Var.n = f;
                if (tt7Var.d.getChildAt(i) != null) {
                    tt7Var.d(i, (int) (linearLayout.getChildAt(i).getWidth() * f));
                    tt7Var.invalidate();
                    egc egcVar = tt7Var.c;
                    if (egcVar != null) {
                        egcVar.b(f, i, i2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                lr8 lr8Var = (lr8) obj;
                if (!lr8Var.a && Math.abs(i - lr8Var.x) == 1) {
                    int i6 = lr8Var.x;
                    if (i > i6) {
                        lr8Var.i(0, 1, 1);
                    } else if (i < i6) {
                        lr8Var.i(1, 0, 0);
                        lr8Var.i(2, 0, -1);
                    }
                }
                int i7 = lr8Var.x;
                int i8 = lr8Var.y;
                lr8Var.x = i;
                lr8Var.y = i2;
                if (i7 != i || i8 != i2) {
                    lr8Var.I = true;
                    lr8Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            case 4:
                p2a p2aVar = (p2a) obj;
                if (p2aVar.x) {
                    j2a j2aVar = p2aVar.h;
                    j2aVar.d.abortAnimation();
                    if (Math.abs(f) <= 1.0f) {
                        ValueAnimator valueAnimator = j2aVar.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j2aVar.N = null;
                        }
                        float f3 = (j2aVar.s / 2.0f) + ((-j2aVar.getMeasuredWidth()) / 2.0f) + ((i3 + j2aVar.n) * i);
                        if (f > 0.0f) {
                            f2 = (j2aVar.s / 2.0f) + ((-j2aVar.getMeasuredWidth()) / 2.0f) + ((i + 1) * (i5 + j2aVar.n));
                        } else {
                            f2 = (j2aVar.s / 2.0f) + ((-j2aVar.getMeasuredWidth()) / 2.0f) + ((i - 1) * (i4 + j2aVar.n));
                            f = -f;
                        }
                        if (f == 0.0f) {
                            j2aVar.e = f3;
                        } else {
                            j2aVar.e = gm.R1(f3, f2, f);
                        }
                        j2aVar.M = false;
                        j2aVar.invalidate();
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
                vr5 vr5Var = (vr5) obj;
                if (i == 1) {
                    vr5Var.L = true;
                    vr5Var.d.getCurrentItem();
                    vr5Var.d.getMeasuredWidth();
                    return;
                } else if (i == 0 || i == 2) {
                    if (vr5Var.L) {
                        vr5Var.L = false;
                    }
                    if (vr5Var.x != vr5Var.d.getCurrentItem()) {
                        vr5Var.x = vr5Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                tt7 tt7Var = (tt7) obj;
                if (i == 0) {
                    tt7Var.d(tt7Var.e.getCurrentItem(), 0);
                }
                egc egcVar = tt7Var.c;
                if (egcVar != null) {
                    egcVar.c(i);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                p2a p2aVar = (p2a) obj;
                if (i == 1) {
                    p2aVar.x = true;
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
