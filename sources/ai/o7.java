package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ki0;
public final class o7 implements z4.e {
    public final int f1534a;
    public final Object f1535b;

    public o7(Object obj, int i10) {
        this.f1534a = i10;
        this.f1535b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1534a) {
            case 0:
            case 1:
                return;
            case 2:
                ee0 ee0Var = (ee0) this.f1535b;
                z4.e eVar = ee0Var.f26069c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < ee0Var.d.getChildCount(); i11++) {
                    View childAt = ee0Var.d.getChildAt(i11);
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
        int i12;
        int i13;
        float f10;
        int i14;
        switch (this.f1534a) {
            case 0:
                t7 t7Var = (t7) this.f1535b;
                if (t7Var.f1746w) {
                    m7 m7Var = t7Var.h;
                    m7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = m7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            m7Var.M = null;
                        }
                        float f11 = (m7Var.f1473s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i12 + m7Var.f1471n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (m7Var.f1473s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + m7Var.f1471n));
                        } else {
                            f10 = (m7Var.f1473s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + m7Var.f1471n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            m7Var.f1469e = f11;
                        } else {
                            m7Var.f1469e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        m7Var.L = false;
                        m7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((li.e) this.f1535b).f15611f++;
                return;
            case 2:
                ee0 ee0Var = (ee0) this.f1535b;
                ee0Var.h = i10;
                ee0Var.f26072n = f7;
                if (ee0Var.d.getChildAt(i10) != null) {
                    ee0.a(ee0Var, i10, (int) (ee0Var.d.getChildAt(i10).getWidth() * f7));
                    ee0Var.invalidate();
                    z4.e eVar = ee0Var.f26069c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ki0 ki0Var = (ki0) this.f1535b;
                if (!ki0Var.f28013a && Math.abs(i10 - ki0Var.f28021w) == 1) {
                    int i15 = ki0Var.f28021w;
                    if (i10 > i15) {
                        ki0.a(ki0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        ki0.a(ki0Var, 1, 0, 0);
                        ki0.a(ki0Var, 2, 0, -1);
                    }
                }
                int i16 = ki0Var.f28021w;
                int i17 = ki0Var.f28022x;
                ki0Var.f28021w = i10;
                ki0Var.f28022x = i11;
                if (i16 != i10 || i17 != i11) {
                    ki0Var.H = true;
                    ki0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f1534a) {
            case 0:
                t7 t7Var = (t7) this.f1535b;
                if (i10 == 1) {
                    t7Var.f1746w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ee0 ee0Var = (ee0) this.f1535b;
                if (i10 == 0) {
                    ee0.a(ee0Var, ee0Var.f26070e.getCurrentItem(), 0);
                }
                z4.e eVar = ee0Var.f26069c;
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
