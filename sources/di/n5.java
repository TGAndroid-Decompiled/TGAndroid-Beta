package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.qb0;
public final class n5 implements c5.g {
    public final int f9404a;
    public final View f9405b;

    public n5(int i7, View view) {
        this.f9404a = i7;
        this.f9405b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        switch (this.f9404a) {
            case 0:
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f9405b;
                c5.g gVar = qb0Var.f37247c;
                if (gVar != null) {
                    gVar.a(i7);
                }
                for (int i10 = 0; i10 < qb0Var.d.getChildCount(); i10++) {
                    View childAt = qb0Var.d.getChildAt(i10);
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
        switch (this.f9404a) {
            case 0:
                s5 s5Var = (s5) this.f9405b;
                if (s5Var.f9764x) {
                    l5 l5Var = s5Var.h;
                    l5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = l5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l5Var.M = null;
                        }
                        int i11 = l5Var.f9461s;
                        float f12 = (i11 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i11 + l5Var.f9459n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = l5Var.f9461s;
                            f11 = (i12 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + l5Var.f9459n));
                        } else {
                            int i13 = l5Var.f9461s;
                            f11 = (i13 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + l5Var.f9459n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            l5Var.f9457e = f12;
                        } else {
                            l5Var.f9457e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        l5Var.L = false;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f9405b;
                qb0Var.h = i7;
                qb0Var.f37250n = f10;
                if (qb0Var.d.getChildAt(i7) != null) {
                    qb0.a(qb0Var, i7, (int) (qb0Var.d.getChildAt(i7).getWidth() * f10));
                    qb0Var.invalidate();
                    c5.g gVar = qb0Var.f37247c;
                    if (gVar != null) {
                        gVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                kf0 kf0Var = (kf0) this.f9405b;
                if (!kf0Var.f35268a && Math.abs(i7 - kf0Var.f35277x) == 1) {
                    int i14 = kf0Var.f35277x;
                    if (i7 > i14) {
                        kf0.a(kf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        kf0.a(kf0Var, 1, 0, 0);
                        kf0.a(kf0Var, 2, 0, -1);
                    }
                }
                int i15 = kf0Var.f35277x;
                int i16 = kf0Var.f35278y;
                kf0Var.f35277x = i7;
                kf0Var.f35278y = i10;
                if (i15 != i7 || i16 != i10) {
                    kf0Var.H = true;
                    kf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f9404a) {
            case 0:
                s5 s5Var = (s5) this.f9405b;
                if (i7 == 1) {
                    s5Var.f9764x = true;
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f9405b;
                if (i7 == 0) {
                    qb0.a(qb0Var, qb0Var.f37248e.getCurrentItem(), 0);
                }
                c5.g gVar = qb0Var.f37247c;
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
