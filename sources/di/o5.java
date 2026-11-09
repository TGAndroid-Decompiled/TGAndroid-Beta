package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.rb0;
public final class o5 implements c5.g {
    public final int f9437a;
    public final View f9438b;

    public o5(int i7, View view) {
        this.f9437a = i7;
        this.f9438b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        switch (this.f9437a) {
            case 0:
                return;
            case 1:
                rb0 rb0Var = (rb0) this.f9438b;
                c5.g gVar = rb0Var.f37643c;
                if (gVar != null) {
                    gVar.a(i7);
                }
                for (int i10 = 0; i10 < rb0Var.d.getChildCount(); i10++) {
                    View childAt = rb0Var.d.getChildAt(i10);
                    if (i10 == i7) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    childAt.setSelected(z9);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        switch (this.f9437a) {
            case 0:
                t5 t5Var = (t5) this.f9438b;
                if (t5Var.f9793x) {
                    m5 m5Var = t5Var.h;
                    m5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = m5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            m5Var.M = null;
                        }
                        int i11 = m5Var.f9505s;
                        float f12 = (i11 / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((i11 + m5Var.f9503n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = m5Var.f9505s;
                            f11 = (i12 / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + m5Var.f9503n));
                        } else {
                            int i13 = m5Var.f9505s;
                            f11 = (i13 / 2.0f) + ((-m5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + m5Var.f9503n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            m5Var.f9501e = f12;
                        } else {
                            m5Var.f9501e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        m5Var.L = false;
                        m5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rb0 rb0Var = (rb0) this.f9438b;
                rb0Var.h = i7;
                rb0Var.f37646n = f10;
                if (rb0Var.d.getChildAt(i7) != null) {
                    rb0.a(rb0Var, i7, (int) (rb0Var.d.getChildAt(i7).getWidth() * f10));
                    rb0Var.invalidate();
                    c5.g gVar = rb0Var.f37643c;
                    if (gVar != null) {
                        gVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                lf0 lf0Var = (lf0) this.f9438b;
                if (!lf0Var.f35703a && Math.abs(i7 - lf0Var.f35712x) == 1) {
                    int i14 = lf0Var.f35712x;
                    if (i7 > i14) {
                        lf0.a(lf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        lf0.a(lf0Var, 1, 0, 0);
                        lf0.a(lf0Var, 2, 0, -1);
                    }
                }
                int i15 = lf0Var.f35712x;
                int i16 = lf0Var.f35713y;
                lf0Var.f35712x = i7;
                lf0Var.f35713y = i10;
                if (i15 != i7 || i16 != i10) {
                    lf0Var.H = true;
                    lf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f9437a) {
            case 0:
                t5 t5Var = (t5) this.f9438b;
                if (i7 == 1) {
                    t5Var.f9793x = true;
                    return;
                }
                return;
            case 1:
                rb0 rb0Var = (rb0) this.f9438b;
                if (i7 == 0) {
                    rb0.a(rb0Var, rb0Var.f37644e.getCurrentItem(), 0);
                }
                c5.g gVar = rb0Var.f37643c;
                if (gVar != null) {
                    gVar.c(i7);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(int i7) {
    }
}
