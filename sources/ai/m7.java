package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qh0;
public final class m7 implements z4.e {
    public final int f1255a;
    public final Object f1256b;

    public m7(Object obj, int i10) {
        this.f1255a = i10;
        this.f1256b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1255a) {
            case 0:
            case 1:
                return;
            case 2:
                nd0 nd0Var = (nd0) this.f1256b;
                z4.e eVar = nd0Var.f26667c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < nd0Var.d.getChildCount(); i11++) {
                    View childAt = nd0Var.d.getChildAt(i11);
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
        switch (this.f1255a) {
            case 0:
                r7 r7Var = (r7) this.f1256b;
                if (r7Var.f1478w) {
                    k7 k7Var = r7Var.h;
                    k7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = k7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            k7Var.M = null;
                        }
                        float f11 = (k7Var.f1296s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i12 + k7Var.f1294n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (k7Var.f1296s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + k7Var.f1294n));
                        } else {
                            f10 = (k7Var.f1296s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + k7Var.f1294n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            k7Var.e = f11;
                        } else {
                            k7Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        k7Var.L = false;
                        k7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((li.i) this.f1256b).e++;
                return;
            case 2:
                nd0 nd0Var = (nd0) this.f1256b;
                nd0Var.h = i10;
                nd0Var.f26669n = f7;
                if (nd0Var.d.getChildAt(i10) != null) {
                    nd0.a(nd0Var, i10, (int) (nd0Var.d.getChildAt(i10).getWidth() * f7));
                    nd0Var.invalidate();
                    z4.e eVar = nd0Var.f26667c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                qh0 qh0Var = (qh0) this.f1256b;
                if (!qh0Var.f27604a && Math.abs(i10 - qh0Var.f27611w) == 1) {
                    int i15 = qh0Var.f27611w;
                    if (i10 > i15) {
                        qh0.a(qh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        qh0.a(qh0Var, 1, 0, 0);
                        qh0.a(qh0Var, 2, 0, -1);
                    }
                }
                int i16 = qh0Var.f27611w;
                int i17 = qh0Var.f27612x;
                qh0Var.f27611w = i10;
                qh0Var.f27612x = i11;
                if (i16 != i10 || i17 != i11) {
                    qh0Var.H = true;
                    qh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f1255a) {
            case 0:
                r7 r7Var = (r7) this.f1256b;
                if (i10 == 1) {
                    r7Var.f1478w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                nd0 nd0Var = (nd0) this.f1256b;
                if (i10 == 0) {
                    nd0.a(nd0Var, nd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = nd0Var.f26667c;
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
