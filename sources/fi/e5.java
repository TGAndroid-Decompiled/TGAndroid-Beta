package fi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.zb0;
public final class e5 implements c5.h {
    public final int f11892a;
    public final View f11893b;

    public e5(int i7, View view) {
        this.f11892a = i7;
        this.f11893b = view;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f11892a) {
            case 0:
                return;
            case 1:
                zb0 zb0Var = (zb0) this.f11893b;
                c5.h hVar = zb0Var.f42815c;
                if (hVar != null) {
                    hVar.a(i7);
                }
                for (int i10 = 0; i10 < zb0Var.d.getChildCount(); i10++) {
                    View childAt = zb0Var.d.getChildAt(i10);
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
        switch (this.f11892a) {
            case 0:
                j5 j5Var = (j5) this.f11893b;
                if (j5Var.f12158x) {
                    c5 c5Var = j5Var.h;
                    c5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = c5Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            c5Var.N = null;
                        }
                        int i11 = c5Var.f11943s;
                        float f12 = (i11 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i11 + c5Var.f11941n) * i7);
                        if (f10 > 0.0f) {
                            int i12 = c5Var.f11943s;
                            f11 = (i12 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 + 1) * (i12 + c5Var.f11941n));
                        } else {
                            int i13 = c5Var.f11943s;
                            f11 = (i13 / 2.0f) + ((-c5Var.getMeasuredWidth()) / 2.0f) + ((i7 - 1) * (i13 + c5Var.f11941n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            c5Var.f11939e = f12;
                        } else {
                            c5Var.f11939e = org.telegram.messenger.g0.T1(f12, f11, f10);
                        }
                        c5Var.M = false;
                        c5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zb0 zb0Var = (zb0) this.f11893b;
                zb0Var.h = i7;
                zb0Var.f42818n = f10;
                if (zb0Var.d.getChildAt(i7) != null) {
                    zb0.a(zb0Var, i7, (int) (zb0Var.d.getChildAt(i7).getWidth() * f10));
                    zb0Var.invalidate();
                    c5.h hVar = zb0Var.f42815c;
                    if (hVar != null) {
                        hVar.b(f10, i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                yf0 yf0Var = (yf0) this.f11893b;
                if (!yf0Var.f42443a && Math.abs(i7 - yf0Var.f42452x) == 1) {
                    int i14 = yf0Var.f42452x;
                    if (i7 > i14) {
                        yf0.a(yf0Var, 0, 1, 1);
                    } else if (i7 < i14) {
                        yf0.a(yf0Var, 1, 0, 0);
                        yf0.a(yf0Var, 2, 0, -1);
                    }
                }
                int i15 = yf0Var.f42452x;
                int i16 = yf0Var.f42453y;
                yf0Var.f42452x = i7;
                yf0Var.f42453y = i10;
                if (i15 != i7 || i16 != i10) {
                    yf0Var.I = true;
                    yf0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i7) {
        switch (this.f11892a) {
            case 0:
                j5 j5Var = (j5) this.f11893b;
                if (i7 == 1) {
                    j5Var.f12158x = true;
                    return;
                }
                return;
            case 1:
                zb0 zb0Var = (zb0) this.f11893b;
                if (i7 == 0) {
                    zb0.a(zb0Var, zb0Var.f42816e.getCurrentItem(), 0);
                }
                c5.h hVar = zb0Var.f42815c;
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
