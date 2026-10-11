package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.mi0;
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
                ge0 ge0Var = (ge0) this.f1535b;
                z4.e eVar = ge0Var.f26702c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < ge0Var.d.getChildCount(); i11++) {
                    View childAt = ge0Var.d.getChildAt(i11);
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
                ((mi.e) this.f1535b).f16483f++;
                return;
            case 2:
                ge0 ge0Var = (ge0) this.f1535b;
                ge0Var.h = i10;
                ge0Var.f26705n = f7;
                if (ge0Var.d.getChildAt(i10) != null) {
                    ge0.a(ge0Var, i10, (int) (ge0Var.d.getChildAt(i10).getWidth() * f7));
                    ge0Var.invalidate();
                    z4.e eVar = ge0Var.f26702c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                mi0 mi0Var = (mi0) this.f1535b;
                if (!mi0Var.f28712a && Math.abs(i10 - mi0Var.f28720w) == 1) {
                    int i15 = mi0Var.f28720w;
                    if (i10 > i15) {
                        mi0.a(mi0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        mi0.a(mi0Var, 1, 0, 0);
                        mi0.a(mi0Var, 2, 0, -1);
                    }
                }
                int i16 = mi0Var.f28720w;
                int i17 = mi0Var.f28721x;
                mi0Var.f28720w = i10;
                mi0Var.f28721x = i11;
                if (i16 != i10 || i17 != i11) {
                    mi0Var.H = true;
                    mi0Var.postInvalidateOnAnimation();
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
                ge0 ge0Var = (ge0) this.f1535b;
                if (i10 == 0) {
                    ge0.a(ge0Var, ge0Var.f26703e.getCurrentItem(), 0);
                }
                z4.e eVar = ge0Var.f26702c;
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
