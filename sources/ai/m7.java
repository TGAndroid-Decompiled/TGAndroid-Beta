package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.sh0;
public final class m7 implements z4.e {
    public final int f1252a;
    public final Object f1253b;

    public m7(Object obj, int i10) {
        this.f1252a = i10;
        this.f1253b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1252a) {
            case 0:
            case 1:
                return;
            case 2:
                pd0 pd0Var = (pd0) this.f1253b;
                z4.e eVar = pd0Var.f27331c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < pd0Var.d.getChildCount(); i11++) {
                    View childAt = pd0Var.d.getChildAt(i11);
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
        switch (this.f1252a) {
            case 0:
                r7 r7Var = (r7) this.f1253b;
                if (r7Var.f1475w) {
                    k7 k7Var = r7Var.h;
                    k7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = k7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            k7Var.M = null;
                        }
                        float f11 = (k7Var.f1293s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i12 + k7Var.f1291n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (k7Var.f1293s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + k7Var.f1291n));
                        } else {
                            f10 = (k7Var.f1293s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + k7Var.f1291n));
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
                ((li.i) this.f1253b).e++;
                return;
            case 2:
                pd0 pd0Var = (pd0) this.f1253b;
                pd0Var.h = i10;
                pd0Var.f27333n = f7;
                if (pd0Var.d.getChildAt(i10) != null) {
                    pd0.a(pd0Var, i10, (int) (pd0Var.d.getChildAt(i10).getWidth() * f7));
                    pd0Var.invalidate();
                    z4.e eVar = pd0Var.f27331c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                sh0 sh0Var = (sh0) this.f1253b;
                if (!sh0Var.f28189a && Math.abs(i10 - sh0Var.f28196w) == 1) {
                    int i15 = sh0Var.f28196w;
                    if (i10 > i15) {
                        sh0.a(sh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        sh0.a(sh0Var, 1, 0, 0);
                        sh0.a(sh0Var, 2, 0, -1);
                    }
                }
                int i16 = sh0Var.f28196w;
                int i17 = sh0Var.f28197x;
                sh0Var.f28196w = i10;
                sh0Var.f28197x = i11;
                if (i16 != i10 || i17 != i11) {
                    sh0Var.H = true;
                    sh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f1252a) {
            case 0:
                r7 r7Var = (r7) this.f1253b;
                if (i10 == 1) {
                    r7Var.f1475w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                pd0 pd0Var = (pd0) this.f1253b;
                if (i10 == 0) {
                    pd0.a(pd0Var, pd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = pd0Var.f27331c;
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
