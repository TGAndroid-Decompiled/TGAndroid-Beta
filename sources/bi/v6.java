package bi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.fh0;
public final class v6 implements z4.e {
    public final int f3927a;
    public final View f3928b;

    public v6(int i10, View view) {
        this.f3927a = i10;
        this.f3928b = view;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        float f10;
        switch (this.f3927a) {
            case 0:
                a7 a7Var = (a7) this.f3928b;
                if (a7Var.f2796w) {
                    t6 t6Var = a7Var.h;
                    t6Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = t6Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            t6Var.M = null;
                        }
                        int i12 = t6Var.f3980s;
                        float f11 = (i12 / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((i12 + t6Var.f3978n) * i10);
                        if (f7 > 0.0f) {
                            int i13 = t6Var.f3980s;
                            f10 = (i13 / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + t6Var.f3978n));
                        } else {
                            int i14 = t6Var.f3980s;
                            f10 = (i14 / 2.0f) + ((-t6Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + t6Var.f3978n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            t6Var.f3976e = f11;
                        } else {
                            t6Var.f3976e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        t6Var.L = false;
                        t6Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ed0 ed0Var = (ed0) this.f3928b;
                ed0Var.h = i10;
                ed0Var.f25686n = f7;
                if (ed0Var.d.getChildAt(i10) != null) {
                    ed0.a(ed0Var, i10, (int) (ed0Var.d.getChildAt(i10).getWidth() * f7));
                    ed0Var.invalidate();
                    z4.e eVar = ed0Var.f25683c;
                    if (eVar != null) {
                        eVar.a(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                fh0 fh0Var = (fh0) this.f3928b;
                if (!fh0Var.f26072a && Math.abs(i10 - fh0Var.f26080w) == 1) {
                    int i15 = fh0Var.f26080w;
                    if (i10 > i15) {
                        fh0.a(fh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        fh0.a(fh0Var, 1, 0, 0);
                        fh0.a(fh0Var, 2, 0, -1);
                    }
                }
                int i16 = fh0Var.f26080w;
                int i17 = fh0Var.f26081x;
                fh0Var.f26080w = i10;
                fh0Var.f26081x = i11;
                if (i16 != i10 || i17 != i11) {
                    fh0Var.H = true;
                    fh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        switch (this.f3927a) {
            case 0:
                return;
            case 1:
                ed0 ed0Var = (ed0) this.f3928b;
                z4.e eVar = ed0Var.f25683c;
                if (eVar != null) {
                    eVar.b(i10);
                }
                for (int i11 = 0; i11 < ed0Var.d.getChildCount(); i11++) {
                    View childAt = ed0Var.d.getChildAt(i11);
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
    public final void c(int i10) {
        switch (this.f3927a) {
            case 0:
                a7 a7Var = (a7) this.f3928b;
                if (i10 == 1) {
                    a7Var.f2796w = true;
                    return;
                }
                return;
            case 1:
                ed0 ed0Var = (ed0) this.f3928b;
                if (i10 == 0) {
                    ed0.a(ed0Var, ed0Var.f25684e.getCurrentItem(), 0);
                }
                z4.e eVar = ed0Var.f25683c;
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
