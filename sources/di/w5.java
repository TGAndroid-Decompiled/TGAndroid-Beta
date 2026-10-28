package di;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.xd0;
public final class w5 implements a5.i {
    public final int f9307a;
    public final View f9308b;

    public w5(int i10, View view) {
        this.f9307a = i10;
        this.f9308b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f9307a) {
            case 0:
                return;
            case 1:
                xd0 xd0Var = (xd0) this.f9308b;
                a5.i iVar = xd0Var.f34734c;
                if (iVar != null) {
                    iVar.a(i10);
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
    public final void b(float f7, int i10, int i11) {
        float f10;
        switch (this.f9307a) {
            case 0:
                b6 b6Var = (b6) this.f9308b;
                if (b6Var.f8433w) {
                    u5 u5Var = b6Var.h;
                    u5Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = u5Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            u5Var.M = null;
                        }
                        int i12 = u5Var.f9303s;
                        float f11 = (i12 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i12 + u5Var.f9301n) * i10);
                        if (f7 > 0.0f) {
                            int i13 = u5Var.f9303s;
                            f10 = (i13 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + u5Var.f9301n));
                        } else {
                            int i14 = u5Var.f9303s;
                            f10 = (i14 / 2.0f) + ((-u5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + u5Var.f9301n));
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
                xd0 xd0Var = (xd0) this.f9308b;
                xd0Var.h = i10;
                xd0Var.f34736n = f7;
                if (xd0Var.d.getChildAt(i10) != null) {
                    xd0.a(xd0Var, i10, (int) (xd0Var.d.getChildAt(i10).getWidth() * f7));
                    xd0Var.invalidate();
                    a5.i iVar = xd0Var.f34734c;
                    if (iVar != null) {
                        iVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                fi0 fi0Var = (fi0) this.f9308b;
                if (!fi0Var.f28166a && Math.abs(i10 - fi0Var.f28173w) == 1) {
                    int i15 = fi0Var.f28173w;
                    if (i10 > i15) {
                        fi0.a(fi0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        fi0.a(fi0Var, 1, 0, 0);
                        fi0.a(fi0Var, 2, 0, -1);
                    }
                }
                int i16 = fi0Var.f28173w;
                int i17 = fi0Var.f28174x;
                fi0Var.f28173w = i10;
                fi0Var.f28174x = i11;
                if (i16 != i10 || i17 != i11) {
                    fi0Var.H = true;
                    fi0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f9307a) {
            case 0:
                b6 b6Var = (b6) this.f9308b;
                if (i10 == 1) {
                    b6Var.f8433w = true;
                    return;
                }
                return;
            case 1:
                xd0 xd0Var = (xd0) this.f9308b;
                if (i10 == 0) {
                    xd0.a(xd0Var, xd0Var.e.getCurrentItem(), 0);
                }
                a5.i iVar = xd0Var.f34734c;
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
