package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.zf0;
public final class d5 implements c5.h {
    public final int f11843a;
    public final View f11844b;

    public d5(int i7, View view) {
        this.f11843a = i7;
        this.f11844b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f11843a) {
            case 0:
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11844b;
                c5.h hVar = cc0Var.f34139c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                for (int i10 = 0; i10 < cc0Var.d.getChildCount(); i10++) {
                    View childAt = cc0Var.d.getChildAt(i10);
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
        switch (this.f11843a) {
            case 0:
                i5 i5Var = (i5) this.f11844b;
                if (i5Var.f12102x) {
                    b5 b5Var = i5Var.h;
                    b5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = b5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            b5Var.N = null;
                        }
                        int i11 = b5Var.f11931s;
                        float f12 = (i11 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i11 + b5Var.f11929n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = b5Var.f11931s;
                            f11 = (i12 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + b5Var.f11929n));
                        } else {
                            int i13 = b5Var.f11931s;
                            f11 = (i13 / 2.0f) + ((-b5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + b5Var.f11929n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            b5Var.f11927e = f12;
                        } else {
                            b5Var.f11927e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        b5Var.M = false;
                        b5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11844b;
                cc0Var.h = i7;
                cc0Var.f34142n = f10;
                if (cc0Var.d.getChildAt(i7) != null) {
                    cc0.a(cc0Var, i7, (int) (cc0Var.d.getChildAt(i7).getWidth() * f10));
                    cc0Var.invalidate();
                    c5.h hVar = cc0Var.f34139c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                zf0 zf0Var = (zf0) this.f11844b;
                if (!zf0Var.f42755a && Math.abs(i7 - zf0Var.f42764x) == 1) {
                    int i14 = zf0Var.f42764x;
                    if (i7 > i14) {
                        zf0.a(zf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        zf0.a(zf0Var, 1, 0, 0);
                        zf0.a(zf0Var, 2, 0, -1);
                    }
                }
                int i15 = zf0Var.f42764x;
                int i16 = zf0Var.f42765y;
                zf0Var.f42764x = i7;
                zf0Var.f42765y = i10;
                if (i15 != i7 || i16 != i10) {
                    zf0Var.I = true;
                    zf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f11843a) {
            case 0:
                i5 i5Var = (i5) this.f11844b;
                if (i7 == 1) {
                    i5Var.f12102x = true;
                    return;
                }
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11844b;
                if (i7 == 0) {
                    cc0.a(cc0Var, cc0Var.f34140e.getCurrentItem(), 0);
                }
                c5.h hVar = cc0Var.f34139c;
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
