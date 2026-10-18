package ci;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.xd0;
public final class w5 implements z4.e {
    public final int f6054a;
    public final Object f6055b;

    public w5(Object obj, int i10) {
        this.f6054a = i10;
        this.f6055b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        switch (this.f6054a) {
            case 0:
                b6 b6Var = (b6) this.f6055b;
                if (b6Var.f5183w) {
                    u5 u5Var = b6Var.h;
                    u5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = u5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u5Var.M = null;
                        }
                        float f11 = (u5Var.f6050s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i12 + u5Var.f6048n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (u5Var.f6050s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + u5Var.f6048n));
                        } else {
                            f10 = (u5Var.f6050s / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + u5Var.f6048n));
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
                ((ni.e) this.f6055b).f17484f++;
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6055b;
                xd0Var.h = i10;
                xd0Var.f32370n = f7;
                if (xd0Var.d.getChildAt(i10) != null) {
                    xd0.a(xd0Var, i10, (int) (xd0Var.d.getChildAt(i10).getWidth() * f7));
                    xd0Var.invalidate();
                    z4.e eVar = xd0Var.f32368c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                bi0 bi0Var = (bi0) this.f6055b;
                if (!bi0Var.f24975a && Math.abs(i10 - bi0Var.f24982w) == 1) {
                    int i15 = bi0Var.f24982w;
                    if (i10 > i15) {
                        bi0.a(bi0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        bi0.a(bi0Var, 1, 0, 0);
                        bi0.a(bi0Var, 2, 0, -1);
                    }
                }
                int i16 = bi0Var.f24982w;
                int i17 = bi0Var.f24983x;
                bi0Var.f24982w = i10;
                bi0Var.f24983x = i11;
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
        switch (this.f6054a) {
            case 0:
            case 1:
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6055b;
                z4.e eVar = xd0Var.f32368c;
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
        switch (this.f6054a) {
            case 0:
                b6 b6Var = (b6) this.f6055b;
                if (i10 == 1) {
                    b6Var.f5183w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                xd0 xd0Var = (xd0) this.f6055b;
                if (i10 == 0) {
                    xd0.a(xd0Var, xd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = xd0Var.f32368c;
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
