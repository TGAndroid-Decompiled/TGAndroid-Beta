package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.rq;
import org.telegram.ui.sw;
public final class i0 extends v4.c0 {
    public final int I;
    public final Object J;

    public i0(int i7, Object obj, boolean z10) {
        super(1, false);
        this.I = i7;
        this.J = obj;
    }

    @Override
    public void S(v4.x0 x0Var, v4.c1 c1Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(x0Var, c1Var, cVar);
                if (!((q0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 8:
                super.S(x0Var, c1Var, cVar);
                if (((j71) this.J).W) {
                    cVar.p(false);
                    return;
                }
                return;
            default:
                super.S(x0Var, c1Var, cVar);
                return;
        }
    }

    @Override
    public int W0(v4.c1 c1Var) {
        switch (this.I) {
            case 6:
                if (((g51) this.J).f35325i3) {
                    return org.telegram.messenger.g0.f24226q.y;
                }
                return super.W0(c1Var);
            case 7:
                if (((m11) this.J).f35325i3) {
                    return org.telegram.messenger.g0.f24226q.y;
                }
                return super.W0(c1Var);
            default:
                return super.W0(c1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i7;
        switch (this.I) {
            case 3:
                super.k1(z10);
                r90 r90Var = ((s90) this.J).f39535b;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                r90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f) * i7);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                x60 x60Var = ((sw) ((oz) this.J).K).f52164b.M0;
                if (x60Var != null && x60Var.E()) {
                    i7 = 0;
                }
                return super.m0(i7, x0Var, c1Var);
            case 3:
            default:
                return super.m0(i7, x0Var, c1Var);
            case 4:
                xi0 xi0Var = (xi0) this.J;
                di.b1 b1Var = xi0Var.f42011b;
                boolean z13 = false;
                if (i7 < 0 && xi0Var.C0 != 0.0f) {
                    float pullingLeftProgress = xi0Var.getPullingLeftProgress();
                    xi0Var.C0 += i7;
                    float pullingLeftProgress2 = xi0Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 != z12) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = xi0Var.C0;
                    if (f11 < 0.0f) {
                        i7 = (int) f11;
                        xi0Var.C0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    ai.h0 h0Var = xi0Var.T;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                    b1Var.invalidate();
                }
                int m0 = super.m0(i7, x0Var, c1Var);
                if (i7 > 0 && m0 == 0 && b1Var.getScrollState() == 1 && xi0Var.q()) {
                    ValueAnimator valueAnimator = xi0Var.f42054z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        xi0Var.f42054z0.cancel();
                    }
                    int i10 = (xi0Var.getPullingLeftProgress() > 1.0f ? 1 : (xi0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    xi0Var.C0 = (i7 * f10) + xi0Var.C0;
                    float pullingLeftProgress3 = xi0Var.getPullingLeftProgress();
                    if (i10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z13 = true;
                    }
                    if (z10 != z13) {
                        try {
                            b1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ai.h0 h0Var2 = xi0Var.T;
                    if (h0Var2 != null) {
                        h0Var2.invalidate();
                    }
                    b1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        switch (this.I) {
            case 1:
                rq rqVar = (rq) this.J;
                if (!rqVar.R && rqVar.O == 0 && rqVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i7, x0Var, c1Var);
            case 5:
                st0 st0Var = (st0) this.J;
                if (i7 > 0 && st0Var.O != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((st0Var.getHeight() - st0Var.V) * 0.5f)));
                        float n10 = st0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - st0Var.V)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, x0Var, c1Var);
                            i10 += o02;
                            if (o02 < min) {
                                return i10;
                            }
                        } else {
                            return i10;
                        }
                    }
                    return i10;
                }
                return super.o0(i7, x0Var, c1Var);
            default:
                return super.o0(i7, x0Var, c1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        switch (this.I) {
            case 2:
                iz izVar = new iz(this, recyclerView.getContext());
                izVar.f59190a = i7;
                w0(izVar);
                return;
            case 8:
                e71 e71Var = new e71(this, recyclerView.getContext());
                e71Var.f59190a = i7;
                w0(e71Var);
                return;
            default:
                super.v0(recyclerView, c1Var, i7);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 0:
                return false;
            case 2:
                return true;
            case 3:
                return false;
            case 9:
                return false;
            default:
                return super.y0();
        }
    }

    @Override
    public void z0(v4.c1 c1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).f43912a.getHeight();
                return;
            default:
                super.z0(c1Var, iArr);
                return;
        }
    }

    public i0(ViewGroup viewGroup, int i7) {
        super(0, false);
        this.I = i7;
        this.J = viewGroup;
    }

    public i0(Object obj, int i7) {
        this.I = i7;
        this.J = obj;
    }

    public i0(g51 g51Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = g51Var;
    }
}
