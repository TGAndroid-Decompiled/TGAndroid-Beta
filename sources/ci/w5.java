package ci;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.yd0;
public final class w5 implements z4.f {
    public final int f6061a;
    public final Object f6062b;

    public w5(Object obj, int i10) {
        this.f6061a = i10;
        this.f6062b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f6061a) {
            case 0:
            case 1:
                return;
            case 2:
                yd0 yd0Var = (yd0) this.f6062b;
                z4.f fVar = yd0Var.f32891c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                for (int i11 = 0; i11 < yd0Var.d.getChildCount(); i11++) {
                    View childAt = yd0Var.d.getChildAt(i11);
                    if (i11 == i10) {
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
    public final void b(float f7, int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        switch (this.f6061a) {
            case 0:
                b6 b6Var = (b6) this.f6062b;
                if (b6Var.f5185w) {
                    u5 u5Var = b6Var.h;
                    u5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = u5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u5Var.M = null;
                        }
                        float f11 = (u5Var.f6057s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i12 + u5Var.f6055n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (u5Var.f6057s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + u5Var.f6055n));
                        } else {
                            f10 = (u5Var.f6057s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + u5Var.f6055n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            u5Var.e = f11;
                        } else {
                            u5Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        u5Var.L = false;
                        u5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ni.e) this.f6062b).f17548f++;
                return;
            case 2:
                yd0 yd0Var = (yd0) this.f6062b;
                yd0Var.h = i10;
                yd0Var.f32893n = f7;
                if (yd0Var.d.getChildAt(i10) != null) {
                    yd0.a(yd0Var, i10, (int) (yd0Var.d.getChildAt(i10).getWidth() * f7));
                    yd0Var.invalidate();
                    z4.f fVar = yd0Var.f32891c;
                    if (fVar != null) {
                        fVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ei0 ei0Var = (ei0) this.f6062b;
                if (!ei0Var.f26051a && Math.abs(i10 - ei0Var.f26058w) == 1) {
                    int i15 = ei0Var.f26058w;
                    if (i10 > i15) {
                        ei0.a(ei0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        ei0.a(ei0Var, 1, 0, 0);
                        ei0.a(ei0Var, 2, 0, -1);
                    }
                }
                int i16 = ei0Var.f26058w;
                int i17 = ei0Var.f26059x;
                ei0Var.f26058w = i10;
                ei0Var.f26059x = i11;
                if (i16 != i10 || i17 != i11) {
                    ei0Var.H = true;
                    ei0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f6061a) {
            case 0:
                b6 b6Var = (b6) this.f6062b;
                if (i10 == 1) {
                    b6Var.f5185w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                yd0 yd0Var = (yd0) this.f6062b;
                if (i10 == 0) {
                    yd0.a(yd0Var, yd0Var.e.getCurrentItem(), 0);
                }
                z4.f fVar = yd0Var.f32891c;
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

    private final void g(int i10) {
    }

    private final void h(int i10) {
    }
}
