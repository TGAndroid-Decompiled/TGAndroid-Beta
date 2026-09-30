package ai;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.sh0;
public final class n7 implements z4.e {
    public final int f1301a;
    public final Object f1302b;

    public n7(Object obj, int i10) {
        this.f1301a = i10;
        this.f1302b = obj;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        switch (this.f1301a) {
            case 0:
            case 1:
                return;
            case 2:
                qd0 qd0Var = (qd0) this.f1302b;
                z4.e eVar = qd0Var.f27661c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                for (int i11 = 0; i11 < qd0Var.d.getChildCount(); i11++) {
                    View childAt = qd0Var.d.getChildAt(i11);
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
        switch (this.f1301a) {
            case 0:
                s7 s7Var = (s7) this.f1302b;
                if (s7Var.f1505w) {
                    l7 l7Var = s7Var.h;
                    l7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = l7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l7Var.M = null;
                        }
                        float f11 = (l7Var.f1255s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i12 + l7Var.f1253n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (l7Var.f1255s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i14 + l7Var.f1253n));
                        } else {
                            f10 = (l7Var.f1255s / 2.0f) + ((-l7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i13 + l7Var.f1253n));
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
                ((li.e) this.f1302b).f14360f++;
                return;
            case 2:
                qd0 qd0Var = (qd0) this.f1302b;
                qd0Var.h = i10;
                qd0Var.f27663n = f7;
                if (qd0Var.d.getChildAt(i10) != null) {
                    qd0.a(qd0Var, i10, (int) (qd0Var.d.getChildAt(i10).getWidth() * f7));
                    qd0Var.invalidate();
                    z4.e eVar = qd0Var.f27661c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                sh0 sh0Var = (sh0) this.f1302b;
                if (!sh0Var.f28233a && Math.abs(i10 - sh0Var.f28240w) == 1) {
                    int i15 = sh0Var.f28240w;
                    if (i10 > i15) {
                        sh0.a(sh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        sh0.a(sh0Var, 1, 0, 0);
                        sh0.a(sh0Var, 2, 0, -1);
                    }
                }
                int i16 = sh0Var.f28240w;
                int i17 = sh0Var.f28241x;
                sh0Var.f28240w = i10;
                sh0Var.f28241x = i11;
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
        switch (this.f1301a) {
            case 0:
                s7 s7Var = (s7) this.f1302b;
                if (i10 == 1) {
                    s7Var.f1505w = true;
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                qd0 qd0Var = (qd0) this.f1302b;
                if (i10 == 0) {
                    qd0.a(qd0Var, qd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = qd0Var.f27661c;
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
