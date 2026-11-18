package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.rq;
import org.telegram.ui.tw;
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
                if (((f71) this.J).W) {
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
                if (((e51) this.J).f34609i3) {
                    return org.telegram.messenger.g0.f24121q.y;
                }
                return super.W0(c1Var);
            case 7:
                if (((m11) this.J).f34609i3) {
                    return org.telegram.messenger.g0.f24121q.y;
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
                s90 s90Var = ((t90) this.J).f39946b;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                s90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f) * i7);
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
                y60 y60Var = ((tw) ((pz) this.J).K).f52368b.M0;
                if (y60Var != null && y60Var.E()) {
                    i7 = 0;
                }
                return super.m0(i7, x0Var, c1Var);
            case 3:
            default:
                return super.m0(i7, x0Var, c1Var);
            case 4:
                vi0 vi0Var = (vi0) this.J;
                di.b1 b1Var = vi0Var.f40641b;
                boolean z13 = false;
                if (i7 < 0 && vi0Var.C0 != 0.0f) {
                    float pullingLeftProgress = vi0Var.getPullingLeftProgress();
                    vi0Var.C0 += i7;
                    float pullingLeftProgress2 = vi0Var.getPullingLeftProgress();
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
                    float f11 = vi0Var.C0;
                    if (f11 < 0.0f) {
                        i7 = (int) f11;
                        vi0Var.C0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    ai.k0 k0Var = vi0Var.T;
                    if (k0Var != null) {
                        k0Var.invalidate();
                    }
                    b1Var.invalidate();
                }
                int m0 = super.m0(i7, x0Var, c1Var);
                if (i7 > 0 && m0 == 0 && b1Var.getScrollState() == 1 && vi0Var.q()) {
                    ValueAnimator valueAnimator = vi0Var.f40684z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        vi0Var.f40684z0.cancel();
                    }
                    int i10 = (vi0Var.getPullingLeftProgress() > 1.0f ? 1 : (vi0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    vi0Var.C0 = (i7 * f10) + vi0Var.C0;
                    float pullingLeftProgress3 = vi0Var.getPullingLeftProgress();
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
                    ai.k0 k0Var2 = vi0Var.T;
                    if (k0Var2 != null) {
                        k0Var2.invalidate();
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
                qt0 qt0Var = (qt0) this.J;
                if (i7 > 0 && qt0Var.O != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((qt0Var.getHeight() - qt0Var.V) * 0.5f)));
                        float n10 = qt0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - qt0Var.V)));
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
                jz jzVar = new jz(this, recyclerView.getContext());
                jzVar.f59066a = i7;
                w0(jzVar);
                return;
            case 8:
                a71 a71Var = new a71(this, recyclerView.getContext());
                a71Var.f59066a = i7;
                w0(a71Var);
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
                iArr[1] = ((StickersActivity) this.J).f43786a.getHeight();
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

    public i0(e51 e51Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = e51Var;
    }
}
