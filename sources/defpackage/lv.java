package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.Intro;
public final class lv implements eec {
    public final byte a;
    public final Object b;

    public lv(Object obj, byte b) {
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
                pv pvVar = (pv) obj;
                pvVar.x = i;
                pvVar.d.invalidate();
                return;
            case 1:
                ((wp5) obj).I = i;
                return;
            case 2:
                sr7 sr7Var = (sr7) obj;
                LinearLayout linearLayout = sr7Var.d;
                eec eecVar = sr7Var.c;
                if (eecVar != null) {
                    eecVar.a(i);
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
                ((qmb) obj).c0.invalidate();
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
                pv pvVar = (pv) obj;
                float measuredWidth = pvVar.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    pvVar.w = b00.b(pvVar.x, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
                    pvVar.d.invalidate();
                    return;
                }
                return;
            case 1:
                wp5 wp5Var = (wp5) obj;
                qw0 qw0Var = wp5Var.e;
                qw0Var.b = f;
                qw0Var.c = i;
                qw0Var.invalidate();
                float measuredWidth2 = wp5Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i * measuredWidth2) + i2) - (wp5Var.I * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            case 2:
                sr7 sr7Var = (sr7) obj;
                sr7Var.h = i;
                sr7Var.n = f;
                if (sr7Var.d.getChildAt(i) != null) {
                    sr7Var.d(i, (int) (linearLayout.getChildAt(i).getWidth() * f));
                    sr7Var.invalidate();
                    eec eecVar = sr7Var.c;
                    if (eecVar != null) {
                        eecVar.b(f, i, i2);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kp8 kp8Var = (kp8) obj;
                if (!kp8Var.a && Math.abs(i - kp8Var.x) == 1) {
                    int i6 = kp8Var.x;
                    if (i > i6) {
                        kp8Var.i(0, 1, 1);
                    } else if (i < i6) {
                        kp8Var.i(1, 0, 0);
                        kp8Var.i(2, 0, -1);
                    }
                }
                int i7 = kp8Var.x;
                int i8 = kp8Var.y;
                kp8Var.x = i;
                kp8Var.y = i2;
                if (i7 != i || i8 != i2) {
                    kp8Var.I = true;
                    kp8Var.postInvalidateOnAnimation();
                    return;
                }
                return;
            case 4:
                n0a n0aVar = (n0a) obj;
                if (n0aVar.x) {
                    h0a h0aVar = n0aVar.h;
                    h0aVar.d.abortAnimation();
                    if (Math.abs(f) <= 1.0f) {
                        ValueAnimator valueAnimator = h0aVar.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h0aVar.N = null;
                        }
                        float f3 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((i3 + h0aVar.n) * i);
                        if (f > 0.0f) {
                            f2 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((i + 1) * (i5 + h0aVar.n));
                        } else {
                            f2 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((i - 1) * (i4 + h0aVar.n));
                            f = -f;
                        }
                        if (f == 0.0f) {
                            h0aVar.e = f3;
                        } else {
                            h0aVar.e = gl.R1(f3, f2, f);
                        }
                        h0aVar.M = false;
                        h0aVar.invalidate();
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
                wp5 wp5Var = (wp5) obj;
                if (i == 1) {
                    wp5Var.L = true;
                    wp5Var.d.getCurrentItem();
                    wp5Var.d.getMeasuredWidth();
                    return;
                } else if (i == 0 || i == 2) {
                    if (wp5Var.L) {
                        wp5Var.L = false;
                    }
                    if (wp5Var.x != wp5Var.d.getCurrentItem()) {
                        wp5Var.x = wp5Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 2:
                sr7 sr7Var = (sr7) obj;
                if (i == 0) {
                    sr7Var.d(sr7Var.e.getCurrentItem(), 0);
                }
                eec eecVar = sr7Var.c;
                if (eecVar != null) {
                    eecVar.c(i);
                    return;
                }
                return;
            case 3:
                return;
            case 4:
                n0a n0aVar = (n0a) obj;
                if (i == 1) {
                    n0aVar.x = true;
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
