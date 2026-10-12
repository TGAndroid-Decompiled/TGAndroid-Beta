package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ni0;
public final class o7 implements z4.e {
    public final int f1532a;
    public final Object f1533b;

    public o7(Object obj, int i10) {
        this.f1532a = i10;
        this.f1533b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1532a) {
            case 0:
            case 1:
                return;
            case 2:
                ie0 ie0Var = (ie0) this.f1533b;
                z4.e eVar = ie0Var.f27135c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < ie0Var.d.getChildCount(); i11++) {
                    View childAt = ie0Var.d.getChildAt(i11);
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
        switch (this.f1532a) {
            case 0:
                t7 t7Var = (t7) this.f1533b;
                if (t7Var.f1744w) {
                    m7 m7Var = t7Var.h;
                    m7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = m7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            m7Var.M = null;
                        }
                        float f11 = (m7Var.f1471s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i12 + m7Var.f1469n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (m7Var.f1471s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + m7Var.f1469n));
                        } else {
                            f10 = (m7Var.f1471s / 2.0f) + ((-m7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + m7Var.f1469n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            m7Var.f1467e = f11;
                        } else {
                            m7Var.f1467e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        m7Var.L = false;
                        m7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((li.e) this.f1533b).f15358f++;
                return;
            case 2:
                ie0 ie0Var = (ie0) this.f1533b;
                ie0Var.h = i10;
                ie0Var.f27138n = f7;
                if (ie0Var.d.getChildAt(i10) != null) {
                    ie0.a(ie0Var, i10, (int) (ie0Var.d.getChildAt(i10).getWidth() * f7));
                    ie0Var.invalidate();
                    z4.e eVar = ie0Var.f27135c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ni0 ni0Var = (ni0) this.f1533b;
                if (!ni0Var.f28791a && Math.abs(i10 - ni0Var.f28799w) == 1) {
                    int i15 = ni0Var.f28799w;
                    if (i10 > i15) {
                        ni0.a(ni0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        ni0.a(ni0Var, 1, 0, 0);
                        ni0.a(ni0Var, 2, 0, -1);
                    }
                }
                int i16 = ni0Var.f28799w;
                int i17 = ni0Var.f28800x;
                ni0Var.f28799w = i10;
                ni0Var.f28800x = i11;
                if (i16 != i10 || i17 != i11) {
                    ni0Var.H = true;
                    ni0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f1532a) {
            case 0:
                t7 t7Var = (t7) this.f1533b;
                if (i10 == 1) {
                    t7Var.f1744w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ie0 ie0Var = (ie0) this.f1533b;
                if (i10 == 0) {
                    ie0.a(ie0Var, ie0Var.f27136e.getCurrentItem(), 0);
                }
                z4.e eVar = ie0Var.f27135c;
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
