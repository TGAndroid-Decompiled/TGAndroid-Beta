package ei;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nf0;
public final class n5 implements b5.h {
    public final int f10667a;
    public final View f10668b;

    public n5(int i3, View view) {
        this.f10667a = i3;
        this.f10668b = view;
    }

    @Override
    public final void a(int i3) {
        boolean z10;
        switch (this.f10667a) {
            case 0:
                return;
            case 1:
                lb0 lb0Var = (lb0) this.f10668b;
                b5.h hVar = lb0Var.f35678c;
                if (hVar != null) {
                    hVar.a(i3);
                }
                for (int i10 = 0; i10 < lb0Var.d.getChildCount(); i10++) {
                    View childAt = lb0Var.d.getChildAt(i10);
                    if (i10 == i3) {
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
    public final void b(float f10, int i3, int i10) {
        float f11;
        switch (this.f10667a) {
            case 0:
                s5 s5Var = (s5) this.f10668b;
                if (s5Var.f11006x) {
                    l5 l5Var = s5Var.h;
                    l5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = l5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l5Var.N = null;
                        }
                        int i11 = l5Var.f10765s;
                        float f12 = (i11 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i11 + l5Var.f10763n) * i3);
                        if (f10 > 0.0f) {
                            int i12 = l5Var.f10765s;
                            f11 = (i12 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i3 + 1) * (i12 + l5Var.f10763n));
                        } else {
                            int i13 = l5Var.f10765s;
                            f11 = (i13 / 2.0f) + ((-l5Var.getMeasuredWidth()) / 2.0f) + ((i3 - 1) * (i13 + l5Var.f10763n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            l5Var.f10761e = f12;
                        } else {
                            l5Var.f10761e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        l5Var.M = false;
                        l5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lb0 lb0Var = (lb0) this.f10668b;
                lb0Var.h = i3;
                lb0Var.f35681n = f10;
                if (lb0Var.d.getChildAt(i3) != null) {
                    lb0.a(lb0Var, i3, (int) (lb0Var.d.getChildAt(i3).getWidth() * f10));
                    lb0Var.invalidate();
                    b5.h hVar = lb0Var.f35678c;
                    if (hVar != null) {
                        hVar.b(f10, i3, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                nf0 nf0Var = (nf0) this.f10668b;
                if (!nf0Var.f36498a && Math.abs(i3 - nf0Var.f36507x) == 1) {
                    int i14 = nf0Var.f36507x;
                    if (i3 > i14) {
                        nf0.a(nf0Var, 0, 1, 1);
                    } else if (i3 < i14) {
                        nf0.a(nf0Var, 1, 0, 0);
                        nf0.a(nf0Var, 2, 0, -1);
                    }
                }
                int i15 = nf0Var.f36507x;
                int i16 = nf0Var.f36508y;
                nf0Var.f36507x = i3;
                nf0Var.f36508y = i10;
                if (i15 != i3 || i16 != i10) {
                    nf0Var.I = true;
                    nf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i3) {
        switch (this.f10667a) {
            case 0:
                s5 s5Var = (s5) this.f10668b;
                if (i3 == 1) {
                    s5Var.f11006x = true;
                    return;
                }
                return;
            case 1:
                lb0 lb0Var = (lb0) this.f10668b;
                if (i3 == 0) {
                    lb0.a(lb0Var, lb0Var.f35679e.getCurrentItem(), 0);
                }
                b5.h hVar = lb0Var.f35678c;
                if (hVar != null) {
                    hVar.c(i3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
    }

    private final void f(int i3) {
    }
}
