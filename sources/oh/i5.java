package oh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.oh0;
public final class i5 implements m2.f {
    public final int f17219a;
    public final View f17220b;

    public i5(int i10, View view) {
        this.f17219a = i10;
        this.f17220b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        switch (this.f17219a) {
            case 0:
                return;
            case 1:
                hd0 hd0Var = (hd0) this.f17220b;
                m2.f fVar = hd0Var.f27463c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                for (int i11 = 0; i11 < hd0Var.d.getChildCount(); i11++) {
                    View childAt = hd0Var.d.getChildAt(i11);
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
        switch (this.f17219a) {
            case 0:
                n5 n5Var = (n5) this.f17220b;
                if (n5Var.f17495w) {
                    g5 g5Var = n5Var.h;
                    g5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = g5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            g5Var.J = null;
                        }
                        int i12 = g5Var.f17357s;
                        float f12 = (i12 / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((i12 + g5Var.f17355n) * i10);
                        if (f10 > 0.0f) {
                            int i13 = g5Var.f17357s;
                            f11 = (i13 / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + g5Var.f17355n));
                        } else {
                            int i14 = g5Var.f17357s;
                            f11 = (i14 / 2.0f) + ((-g5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + g5Var.f17355n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            g5Var.f17353e = f12;
                        } else {
                            g5Var.f17353e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        g5Var.I = false;
                        g5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                hd0 hd0Var = (hd0) this.f17220b;
                hd0Var.h = i10;
                hd0Var.f27466n = f10;
                if (hd0Var.d.getChildAt(i10) != null) {
                    hd0.a(hd0Var, i10, (int) (hd0Var.d.getChildAt(i10).getWidth() * f10));
                    hd0Var.invalidate();
                    m2.f fVar = hd0Var.f27463c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                oh0 oh0Var = (oh0) this.f17220b;
                if (!oh0Var.f29760a && Math.abs(i10 - oh0Var.f29768w) == 1) {
                    int i15 = oh0Var.f29768w;
                    if (i10 > i15) {
                        oh0.a(oh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        oh0.a(oh0Var, 1, 0, 0);
                        oh0.a(oh0Var, 2, 0, -1);
                    }
                }
                int i16 = oh0Var.f29768w;
                int i17 = oh0Var.f29769x;
                oh0Var.f29768w = i10;
                oh0Var.f29769x = i11;
                if (i16 != i10 || i17 != i11) {
                    oh0Var.E = true;
                    oh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f17219a) {
            case 0:
                n5 n5Var = (n5) this.f17220b;
                if (i10 == 1) {
                    n5Var.f17495w = true;
                    return;
                }
                return;
            case 1:
                hd0 hd0Var = (hd0) this.f17220b;
                if (i10 == 0) {
                    hd0.a(hd0Var, hd0Var.f27464e.getCurrentItem(), 0);
                }
                m2.f fVar = hd0Var.f27463c;
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
