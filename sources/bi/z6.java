package bi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.gi0;
public final class z6 implements z4.e {
    public final int f4069a;
    public final Object f4070b;

    public z6(Object obj, int i10) {
        this.f4069a = i10;
        this.f4070b = obj;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        switch (this.f4069a) {
            case 0:
                e7 e7Var = (e7) this.f4070b;
                if (e7Var.f2999w) {
                    x6 x6Var = e7Var.h;
                    x6Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = x6Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            x6Var.M = null;
                        }
                        float f11 = (x6Var.f4020s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((i12 + x6Var.f4018n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (x6Var.f4020s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + x6Var.f4018n));
                        } else {
                            f10 = (x6Var.f4020s / 2.0f) + ((-x6Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + x6Var.f4018n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            x6Var.e = f11;
                        } else {
                            x6Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        x6Var.L = false;
                        x6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((mi.e) this.f4070b).f15593f++;
                return;
            case 2:
                de0 de0Var = (de0) this.f4070b;
                de0Var.h = i10;
                de0Var.f24107n = f7;
                if (de0Var.d.getChildAt(i10) != null) {
                    de0.a(de0Var, i10, (int) (de0Var.d.getChildAt(i10).getWidth() * f7));
                    de0Var.invalidate();
                    z4.e eVar = de0Var.f24105c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                gi0 gi0Var = (gi0) this.f4070b;
                if (!gi0Var.f24975a && Math.abs(i10 - gi0Var.f24982w) == 1) {
                    int i15 = gi0Var.f24982w;
                    if (i10 > i15) {
                        gi0.a(gi0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        gi0.a(gi0Var, 1, 0, 0);
                        gi0.a(gi0Var, 2, 0, -1);
                    }
                }
                int i16 = gi0Var.f24982w;
                int i17 = gi0Var.f24983x;
                gi0Var.f24982w = i10;
                gi0Var.f24983x = i11;
                if (i16 != i10 || i17 != i11) {
                    gi0Var.H = true;
                    gi0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        switch (this.f4069a) {
            case 0:
            case 1:
                return;
            case 2:
                de0 de0Var = (de0) this.f4070b;
                z4.e eVar = de0Var.f24105c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                for (int i11 = 0; i11 < de0Var.d.getChildCount(); i11++) {
                    View childAt = de0Var.d.getChildAt(i11);
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
        switch (this.f4069a) {
            case 0:
                e7 e7Var = (e7) this.f4070b;
                if (i10 == 1) {
                    e7Var.f2999w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                de0 de0Var = (de0) this.f4070b;
                if (i10 == 0) {
                    de0.a(de0Var, de0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = de0Var.f24105c;
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
