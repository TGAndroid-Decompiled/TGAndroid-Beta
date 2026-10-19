package ci;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.xd0;
public final class x5 implements z4.e {
    public final int f6168a;
    public final Object f6169b;

    public x5(Object obj, int i10) {
        this.f6168a = i10;
        this.f6169b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        switch (this.f6168a) {
            case 0:
                c6 c6Var = (c6) this.f6169b;
                if (c6Var.f5286w) {
                    v5 v5Var = c6Var.h;
                    v5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = v5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            v5Var.M = null;
                        }
                        float f11 = (v5Var.f6164s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((i12 + v5Var.f6162n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (v5Var.f6164s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + v5Var.f6162n));
                        } else {
                            f10 = (v5Var.f6164s / 2.0f) + ((-v5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + v5Var.f6162n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            v5Var.e = f11;
                        } else {
                            v5Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        v5Var.L = false;
                        v5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ni.e) this.f6169b).f17487f++;
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6169b;
                xd0Var.h = i10;
                xd0Var.f32374n = f7;
                if (xd0Var.d.getChildAt(i10) != null) {
                    xd0.a(xd0Var, i10, (int) (xd0Var.d.getChildAt(i10).getWidth() * f7));
                    xd0Var.invalidate();
                    z4.e eVar = xd0Var.f32372c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                bi0 bi0Var = (bi0) this.f6169b;
                if (!bi0Var.f24959a && Math.abs(i10 - bi0Var.f24966w) == 1) {
                    int i15 = bi0Var.f24966w;
                    if (i10 > i15) {
                        bi0.a(bi0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        bi0.a(bi0Var, 1, 0, 0);
                        bi0.a(bi0Var, 2, 0, -1);
                    }
                }
                int i16 = bi0Var.f24966w;
                int i17 = bi0Var.f24967x;
                bi0Var.f24966w = i10;
                bi0Var.f24967x = i11;
                if (i16 != i10 || i17 != i11) {
                    bi0Var.H = true;
                    bi0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        switch (this.f6168a) {
            case 0:
            case 1:
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6169b;
                z4.e eVar = xd0Var.f32372c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                for (int i11 = 0; i11 < xd0Var.d.getChildCount(); i11++) {
                    View childAt = xd0Var.d.getChildAt(i11);
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
    public final void c(int i10) {
        switch (this.f6168a) {
            case 0:
                c6 c6Var = (c6) this.f6169b;
                if (i10 == 1) {
                    c6Var.f5286w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6169b;
                if (i10 == 0) {
                    xd0.a(xd0Var, xd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = xd0Var.f32372c;
                if (eVar != null) {
                    eVar.c(i10);
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
