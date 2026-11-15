package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.qb0;
public final class f5 implements c5.h {
    public final int f11703a;
    public final View f11704b;

    public f5(int i7, View view) {
        this.f11703a = i7;
        this.f11704b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f11703a) {
            case 0:
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f11704b;
                c5.h hVar = qb0Var.f38617c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                for (int i10 = 0; i10 < qb0Var.d.getChildCount(); i10++) {
                    View childAt = qb0Var.d.getChildAt(i10);
                    if (i10 == i7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        float f11;
        switch (this.f11703a) {
            case 0:
                k5 k5Var = (k5) this.f11704b;
                if (k5Var.f11936x) {
                    d5 d5Var = k5Var.h;
                    d5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = d5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            d5Var.N = null;
                        }
                        int i11 = d5Var.f11770s;
                        float f12 = (i11 / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i11 + d5Var.f11768n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = d5Var.f11770s;
                            f11 = (i12 / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + d5Var.f11768n));
                        } else {
                            int i13 = d5Var.f11770s;
                            f11 = (i13 / 2.0f) + ((-d5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + d5Var.f11768n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            d5Var.f11766e = f12;
                        } else {
                            d5Var.f11766e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        d5Var.M = false;
                        d5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f11704b;
                qb0Var.h = i7;
                qb0Var.f38620n = f10;
                if (qb0Var.d.getChildAt(i7) != null) {
                    qb0.a(qb0Var, i7, (int) (qb0Var.d.getChildAt(i7).getWidth() * f10));
                    qb0Var.invalidate();
                    c5.h hVar = qb0Var.f38617c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                nf0 nf0Var = (nf0) this.f11704b;
                if (!nf0Var.f37569a && Math.abs(i7 - nf0Var.f37578x) == 1) {
                    int i14 = nf0Var.f37578x;
                    if (i7 > i14) {
                        nf0.a(nf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        nf0.a(nf0Var, 1, 0, 0);
                        nf0.a(nf0Var, 2, 0, -1);
                    }
                }
                int i15 = nf0Var.f37578x;
                int i16 = nf0Var.f37579y;
                nf0Var.f37578x = i7;
                nf0Var.f37579y = i10;
                if (i15 != i7 || i16 != i10) {
                    nf0Var.I = true;
                    nf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f11703a) {
            case 0:
                k5 k5Var = (k5) this.f11704b;
                if (i7 == 1) {
                    k5Var.f11936x = true;
                    return;
                }
                return;
            case 1:
                qb0 qb0Var = (qb0) this.f11704b;
                if (i7 == 0) {
                    qb0.a(qb0Var, qb0Var.f38618e.getCurrentItem(), 0);
                }
                c5.h hVar = qb0Var.f38617c;
                if (hVar != null) {
                    hVar.c(i7);
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
