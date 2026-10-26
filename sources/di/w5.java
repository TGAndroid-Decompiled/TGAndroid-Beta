package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.wd0;
public final class w5 implements a5.i {
    public final int f9308a;
    public final View f9309b;

    public w5(int i10, View view) {
        this.f9308a = i10;
        this.f9309b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f9308a) {
            case 0:
                return;
            case 1:
                wd0 wd0Var = (wd0) this.f9309b;
                a5.i iVar = wd0Var.f34420c;
                if (iVar != null) {
                    iVar.a(i10);
                }
                for (int i11 = 0; i11 < wd0Var.d.getChildCount(); i11++) {
                    View childAt = wd0Var.d.getChildAt(i11);
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
        float f10;
        switch (this.f9308a) {
            case 0:
                b6 b6Var = (b6) this.f9309b;
                if (b6Var.f8433w) {
                    u5 u5Var = b6Var.h;
                    u5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = u5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u5Var.M = null;
                        }
                        int i12 = u5Var.f9304s;
                        float f11 = (i12 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i12 + u5Var.f9302n) * i10);
                        if (f7 > 0.0f) {
                            int i13 = u5Var.f9304s;
                            f10 = (i13 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + u5Var.f9302n));
                        } else {
                            int i14 = u5Var.f9304s;
                            f10 = (i14 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + u5Var.f9302n));
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
                wd0 wd0Var = (wd0) this.f9309b;
                wd0Var.h = i10;
                wd0Var.f34422n = f7;
                if (wd0Var.d.getChildAt(i10) != null) {
                    wd0.a(wd0Var, i10, (int) (wd0Var.d.getChildAt(i10).getWidth() * f7));
                    wd0Var.invalidate();
                    a5.i iVar = wd0Var.f34420c;
                    if (iVar != null) {
                        iVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ei0 ei0Var = (ei0) this.f9309b;
                if (!ei0Var.f27873a && Math.abs(i10 - ei0Var.f27880w) == 1) {
                    int i15 = ei0Var.f27880w;
                    if (i10 > i15) {
                        ei0.a(ei0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        ei0.a(ei0Var, 1, 0, 0);
                        ei0.a(ei0Var, 2, 0, -1);
                    }
                }
                int i16 = ei0Var.f27880w;
                int i17 = ei0Var.f27881x;
                ei0Var.f27880w = i10;
                ei0Var.f27881x = i11;
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
        switch (this.f9308a) {
            case 0:
                b6 b6Var = (b6) this.f9309b;
                if (i10 == 1) {
                    b6Var.f8433w = true;
                    return;
                }
                return;
            case 1:
                wd0 wd0Var = (wd0) this.f9309b;
                if (i10 == 0) {
                    wd0.a(wd0Var, wd0Var.e.getCurrentItem(), 0);
                }
                a5.i iVar = wd0Var.f34420c;
                if (iVar != null) {
                    iVar.c(i10);
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
