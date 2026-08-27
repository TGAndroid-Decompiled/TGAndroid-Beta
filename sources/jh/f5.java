package jh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.tg0;

public final class f5 implements m2.e {

    public final int f13321a;

    public final View f13322b;

    public f5(int i10, View view) {
        this.f13321a = i10;
        this.f13322b = view;
    }

    @Override
    public final void b(int i10) {
        switch (this.f13321a) {
            case 1:
                oc0 oc0Var = (oc0) this.f13322b;
                m2.e eVar = oc0Var.f31252c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                int i11 = 0;
                while (i11 < oc0Var.d.getChildCount()) {
                    oc0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        float f11;
        switch (this.f13321a) {
            case 0:
                k5 k5Var = (k5) this.f13322b;
                if (k5Var.f13585w) {
                    d5 d5Var = k5Var.h;
                    d5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = d5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            d5Var.I = null;
                        }
                        float f12 = (-d5Var.getMeasuredWidth()) / 2.0f;
                        int i12 = d5Var.f13444s;
                        float f13 = (i12 / 2.0f) + f12 + ((i12 + d5Var.f13442n) * i10);
                        if (f10 > 0.0f) {
                            float f14 = (-d5Var.getMeasuredWidth()) / 2.0f;
                            int i13 = d5Var.f13444s;
                            f11 = (i13 / 2.0f) + f14 + ((i10 + 1) * (i13 + d5Var.f13442n));
                        } else {
                            float f15 = (-d5Var.getMeasuredWidth()) / 2.0f;
                            int i14 = d5Var.f13444s;
                            f11 = (i14 / 2.0f) + f15 + ((i10 - 1) * (i14 + d5Var.f13442n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            d5Var.f13440e = f13;
                        } else {
                            d5Var.f13440e = AndroidUtilities.lerp(f13, f11, f10);
                        }
                        d5Var.H = false;
                        d5Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                oc0 oc0Var = (oc0) this.f13322b;
                oc0Var.h = i10;
                oc0Var.f31255n = f10;
                if (oc0Var.d.getChildAt(i10) != null) {
                    oc0.a(oc0Var, i10, (int) (oc0Var.d.getChildAt(i10).getWidth() * f10));
                    oc0Var.invalidate();
                    m2.e eVar = oc0Var.f31252c;
                    if (eVar != null) {
                        eVar.c(f10, i10, i11);
                    }
                }
                break;
            default:
                tg0 tg0Var = (tg0) this.f13322b;
                if (!tg0Var.f32770a && Math.abs(i10 - tg0Var.f32778w) == 1) {
                    int i15 = tg0Var.f32778w;
                    if (i10 > i15) {
                        tg0.a(tg0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        tg0.a(tg0Var, 1, 0, 0);
                        tg0.a(tg0Var, 2, 0, -1);
                    }
                }
                int i16 = tg0Var.f32778w;
                int i17 = tg0Var.f32779x;
                tg0Var.f32778w = i10;
                tg0Var.f32779x = i11;
                if (i16 != i10 || i17 != i11) {
                    tg0Var.D = true;
                    tg0Var.postInvalidateOnAnimation();
                }
                break;
        }
    }

    @Override
    public final void d(int i10) {
        switch (this.f13321a) {
            case 0:
                k5 k5Var = (k5) this.f13322b;
                if (i10 == 1) {
                    k5Var.f13585w = true;
                }
                break;
            case 1:
                oc0 oc0Var = (oc0) this.f13322b;
                if (i10 == 0) {
                    oc0.a(oc0Var, oc0Var.f31253e.getCurrentItem(), 0);
                }
                m2.e eVar = oc0Var.f31252c;
                if (eVar != null) {
                    eVar.d(i10);
                }
                break;
        }
    }

    private final void a(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
