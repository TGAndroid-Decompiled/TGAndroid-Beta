package nh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.nh0;
public final class h5 implements m2.f {
    public final int f15362a;
    public final View f15363b;

    public h5(int i10, View view) {
        this.f15362a = i10;
        this.f15363b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        switch (this.f15362a) {
            case 0:
                return;
            case 1:
                gd0 gd0Var = (gd0) this.f15363b;
                m2.f fVar = gd0Var.f25122c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                for (int i11 = 0; i11 < gd0Var.d.getChildCount(); i11++) {
                    View childAt = gd0Var.d.getChildAt(i11);
                    if (i11 == i10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    childAt.setSelected(z4);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        float f11;
        switch (this.f15362a) {
            case 0:
                m5 m5Var = (m5) this.f15363b;
                if (m5Var.f15595w) {
                    f5 f5Var = m5Var.h;
                    f5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = f5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f5Var.J = null;
                        }
                        int i12 = f5Var.f15394s;
                        float f12 = (i12 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i12 + f5Var.f15392n) * i10);
                        if (f10 > 0.0f) {
                            int i13 = f5Var.f15394s;
                            f11 = (i13 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + f5Var.f15392n));
                        } else {
                            int i14 = f5Var.f15394s;
                            f11 = (i14 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + f5Var.f15392n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            f5Var.e = f12;
                        } else {
                            f5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        f5Var.I = false;
                        f5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gd0 gd0Var = (gd0) this.f15363b;
                gd0Var.h = i10;
                gd0Var.f25124n = f10;
                if (gd0Var.d.getChildAt(i10) != null) {
                    gd0.a(gd0Var, i10, (int) (gd0Var.d.getChildAt(i10).getWidth() * f10));
                    gd0Var.invalidate();
                    m2.f fVar = gd0Var.f25122c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                nh0 nh0Var = (nh0) this.f15363b;
                if (!nh0Var.f27260a && Math.abs(i10 - nh0Var.f27267w) == 1) {
                    int i15 = nh0Var.f27267w;
                    if (i10 > i15) {
                        nh0.a(nh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        nh0.a(nh0Var, 1, 0, 0);
                        nh0.a(nh0Var, 2, 0, -1);
                    }
                }
                int i16 = nh0Var.f27267w;
                int i17 = nh0Var.f27268x;
                nh0Var.f27267w = i10;
                nh0Var.f27268x = i11;
                if (i16 != i10 || i17 != i11) {
                    nh0Var.E = true;
                    nh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f15362a) {
            case 0:
                m5 m5Var = (m5) this.f15363b;
                if (i10 == 1) {
                    m5Var.f15595w = true;
                    return;
                }
                return;
            case 1:
                gd0 gd0Var = (gd0) this.f15363b;
                if (i10 == 0) {
                    gd0.a(gd0Var, gd0Var.e.getCurrentItem(), 0);
                }
                m2.f fVar = gd0Var.f25122c;
                if (fVar != null) {
                    fVar.c(i10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
