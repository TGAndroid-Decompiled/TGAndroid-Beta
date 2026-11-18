package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.xf0;
public final class d5 implements c5.h {
    public final int f11851a;
    public final View f11852b;

    public d5(int i7, View view) {
        this.f11851a = i7;
        this.f11852b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f11851a) {
            case 0:
                return;
            case 1:
                bc0 bc0Var = (bc0) this.f11852b;
                c5.h hVar = bc0Var.f33655c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                for (int i10 = 0; i10 < bc0Var.d.getChildCount(); i10++) {
                    View childAt = bc0Var.d.getChildAt(i10);
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
        switch (this.f11851a) {
            case 0:
                i5 i5Var = (i5) this.f11852b;
                if (i5Var.f12110x) {
                    b5 b5Var = i5Var.h;
                    b5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = b5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            b5Var.N = null;
                        }
                        int i11 = b5Var.f11939s;
                        float f12 = (i11 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i11 + b5Var.f11937n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = b5Var.f11939s;
                            f11 = (i12 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + b5Var.f11937n));
                        } else {
                            int i13 = b5Var.f11939s;
                            f11 = (i13 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + b5Var.f11937n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            b5Var.f11935e = f12;
                        } else {
                            b5Var.f11935e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        b5Var.M = false;
                        b5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                bc0 bc0Var = (bc0) this.f11852b;
                bc0Var.h = i7;
                bc0Var.f33658n = f10;
                if (bc0Var.d.getChildAt(i7) != null) {
                    bc0.a(bc0Var, i7, (int) (bc0Var.d.getChildAt(i7).getWidth() * f10));
                    bc0Var.invalidate();
                    c5.h hVar = bc0Var.f33655c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                xf0 xf0Var = (xf0) this.f11852b;
                if (!xf0Var.f41999a && Math.abs(i7 - xf0Var.f42008x) == 1) {
                    int i14 = xf0Var.f42008x;
                    if (i7 > i14) {
                        xf0.a(xf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        xf0.a(xf0Var, 1, 0, 0);
                        xf0.a(xf0Var, 2, 0, -1);
                    }
                }
                int i15 = xf0Var.f42008x;
                int i16 = xf0Var.f42009y;
                xf0Var.f42008x = i7;
                xf0Var.f42009y = i10;
                if (i15 != i7 || i16 != i10) {
                    xf0Var.I = true;
                    xf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f11851a) {
            case 0:
                i5 i5Var = (i5) this.f11852b;
                if (i7 == 1) {
                    i5Var.f12110x = true;
                    return;
                }
                return;
            case 1:
                bc0 bc0Var = (bc0) this.f11852b;
                if (i7 == 0) {
                    bc0.a(bc0Var, bc0Var.f33656e.getCurrentItem(), 0);
                }
                c5.h hVar = bc0Var.f33655c;
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
