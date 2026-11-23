package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.zf0;
public final class e5 implements c5.h {
    public final int f11930a;
    public final View f11931b;

    public e5(int i7, View view) {
        this.f11930a = i7;
        this.f11931b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f11930a) {
            case 0:
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11931b;
                c5.h hVar = cc0Var.f34175c;
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
        switch (this.f11930a) {
            case 0:
                j5 j5Var = (j5) this.f11931b;
                if (j5Var.f12196x) {
                    c5 c5Var = j5Var.h;
                    c5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = c5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c5Var.N = null;
                        }
                        int i11 = c5Var.f11981s;
                        float f12 = (i11 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i11 + c5Var.f11979n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = c5Var.f11981s;
                            f11 = (i12 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + c5Var.f11979n));
                        } else {
                            int i13 = c5Var.f11981s;
                            f11 = (i13 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + c5Var.f11979n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            c5Var.f11977e = f12;
                        } else {
                            c5Var.f11977e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        c5Var.M = false;
                        c5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11931b;
                cc0Var.h = i7;
                cc0Var.f34178n = f10;
                if (cc0Var.d.getChildAt(i7) != null) {
                    cc0.a(cc0Var, i7, (int) (cc0Var.d.getChildAt(i7).getWidth() * f10));
                    cc0Var.invalidate();
                    c5.h hVar = cc0Var.f34175c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                zf0 zf0Var = (zf0) this.f11931b;
                if (!zf0Var.f42795a && Math.abs(i7 - zf0Var.f42804x) == 1) {
                    int i14 = zf0Var.f42804x;
                    if (i7 > i14) {
                        zf0.a(zf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        zf0.a(zf0Var, 1, 0, 0);
                        zf0.a(zf0Var, 2, 0, -1);
                    }
                }
                int i15 = zf0Var.f42804x;
                int i16 = zf0Var.f42805y;
                zf0Var.f42804x = i7;
                zf0Var.f42805y = i10;
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
        switch (this.f11930a) {
            case 0:
                j5 j5Var = (j5) this.f11931b;
                if (i7 == 1) {
                    j5Var.f12196x = true;
                    return;
                }
                return;
            case 1:
                cc0 cc0Var = (cc0) this.f11931b;
                if (i7 == 0) {
                    cc0.a(cc0Var, cc0Var.f34176e.getCurrentItem(), 0);
                }
                c5.h hVar = cc0Var.f34175c;
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
