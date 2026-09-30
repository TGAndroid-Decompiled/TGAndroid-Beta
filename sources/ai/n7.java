package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.th0;
public final class n7 implements z4.e {
    public final int f1303a;
    public final Object f1304b;

    public n7(Object obj, int i10) {
        this.f1303a = i10;
        this.f1304b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1303a) {
            case 0:
            case 1:
                return;
            case 2:
                rd0 rd0Var = (rd0) this.f1304b;
                z4.e eVar = rd0Var.f27966c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < rd0Var.d.getChildCount(); i11++) {
                    View childAt = rd0Var.d.getChildAt(i11);
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
        switch (this.f1303a) {
            case 0:
                s7 s7Var = (s7) this.f1304b;
                if (s7Var.f1510w) {
                    l7 l7Var = s7Var.h;
                    l7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = l7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l7Var.M = null;
                        }
                        float f11 = (l7Var.f1257s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i12 + l7Var.f1255n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (l7Var.f1257s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + l7Var.f1255n));
                        } else {
                            f10 = (l7Var.f1257s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + l7Var.f1255n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            l7Var.e = f11;
                        } else {
                            l7Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        l7Var.L = false;
                        l7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((li.e) this.f1304b).f14375f++;
                return;
            case 2:
                rd0 rd0Var = (rd0) this.f1304b;
                rd0Var.h = i10;
                rd0Var.f27968n = f7;
                if (rd0Var.d.getChildAt(i10) != null) {
                    rd0.a(rd0Var, i10, (int) (rd0Var.d.getChildAt(i10).getWidth() * f7));
                    rd0Var.invalidate();
                    z4.e eVar = rd0Var.f27966c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                th0 th0Var = (th0) this.f1304b;
                if (!th0Var.f28523a && Math.abs(i10 - th0Var.f28530w) == 1) {
                    int i15 = th0Var.f28530w;
                    if (i10 > i15) {
                        th0.a(th0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        th0.a(th0Var, 1, 0, 0);
                        th0.a(th0Var, 2, 0, -1);
                    }
                }
                int i16 = th0Var.f28530w;
                int i17 = th0Var.f28531x;
                th0Var.f28530w = i10;
                th0Var.f28531x = i11;
                if (i16 != i10 || i17 != i11) {
                    th0Var.H = true;
                    th0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f1303a) {
            case 0:
                s7 s7Var = (s7) this.f1304b;
                if (i10 == 1) {
                    s7Var.f1510w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                rd0 rd0Var = (rd0) this.f1304b;
                if (i10 == 0) {
                    rd0.a(rd0Var, rd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = rd0Var.f27966c;
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
