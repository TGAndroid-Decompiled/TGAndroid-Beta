package lh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bh0;
import org.telegram.ui.Components.zc0;
public final class g5 implements m2.e {
    public final int f15632a;
    public final View f15633b;

    public g5(int i10, View view) {
        this.f15632a = i10;
        this.f15633b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f15632a) {
            case 0:
                return;
            case 1:
                zc0 zc0Var = (zc0) this.f15633b;
                m2.e eVar = zc0Var.f35315c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < zc0Var.d.getChildCount(); i11++) {
                    View childAt = zc0Var.d.getChildAt(i11);
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
    public final void b(float f9, int i10, int i11) {
        float f10;
        switch (this.f15632a) {
            case 0:
                l5 l5Var = (l5) this.f15633b;
                if (l5Var.f15890w) {
                    e5 e5Var = l5Var.h;
                    e5Var.d.abortAnimation();
                    if (Math.abs(f9) <= 1.0f) {
                        ValueAnimator valueAnimator = e5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            e5Var.I = null;
                        }
                        int i12 = e5Var.f15722s;
                        float f11 = (i12 / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((i12 + e5Var.f15720n) * i10);
                        if (f9 > 0.0f) {
                            int i13 = e5Var.f15722s;
                            f10 = (i13 / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + e5Var.f15720n));
                        } else {
                            int i14 = e5Var.f15722s;
                            f10 = (i14 / 2.0f) + ((-e5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + e5Var.f15720n));
                            f9 = -f9;
                        }
                        if (f9 == 0.0f) {
                            e5Var.f15718e = f11;
                        } else {
                            e5Var.f15718e = AndroidUtilities.lerp(f11, f10, f9);
                        }
                        e5Var.H = false;
                        e5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zc0 zc0Var = (zc0) this.f15633b;
                zc0Var.h = i10;
                zc0Var.f35318n = f9;
                if (zc0Var.d.getChildAt(i10) != null) {
                    zc0.a(zc0Var, i10, (int) (zc0Var.d.getChildAt(i10).getWidth() * f9));
                    zc0Var.invalidate();
                    m2.e eVar = zc0Var.f35315c;
                    if (eVar != null) {
                        eVar.b(f9, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                bh0 bh0Var = (bh0) this.f15633b;
                if (!bh0Var.f27100a && Math.abs(i10 - bh0Var.f27108w) == 1) {
                    int i15 = bh0Var.f27108w;
                    if (i10 > i15) {
                        bh0.a(bh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        bh0.a(bh0Var, 1, 0, 0);
                        bh0.a(bh0Var, 2, 0, -1);
                    }
                }
                int i16 = bh0Var.f27108w;
                int i17 = bh0Var.f27109x;
                bh0Var.f27108w = i10;
                bh0Var.f27109x = i11;
                if (i16 != i10 || i17 != i11) {
                    bh0Var.D = true;
                    bh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f15632a) {
            case 0:
                l5 l5Var = (l5) this.f15633b;
                if (i10 == 1) {
                    l5Var.f15890w = true;
                    return;
                }
                return;
            case 1:
                zc0 zc0Var = (zc0) this.f15633b;
                if (i10 == 0) {
                    zc0.a(zc0Var, zc0Var.f35316e.getCurrentItem(), 0);
                }
                m2.e eVar = zc0Var.f35315c;
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
}
