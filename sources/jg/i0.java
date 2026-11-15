package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.pw;
import org.telegram.ui.qq;
public final class i0 extends v4.b0 {
    public final int I;
    public final Object J;

    public i0(int i7, Object obj, boolean z10) {
        super(1, false);
        this.I = i7;
        this.J = obj;
    }

    @Override
    public void S(v4.w0 w0Var, v4.b1 b1Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(w0Var, b1Var, cVar);
                if (!((q0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 8:
                super.S(w0Var, b1Var, cVar);
                if (((v61) this.J).W) {
                    cVar.p(false);
                    return;
                }
                return;
            default:
                super.S(w0Var, b1Var, cVar);
                return;
        }
    }

    @Override
    public int W0(v4.b1 b1Var) {
        switch (this.I) {
            case 6:
                if (((u41) this.J).f39894i3) {
                    return org.telegram.messenger.g0.f23611q.y;
                }
                return super.W0(b1Var);
            case 7:
                if (((c11) this.J).f39894i3) {
                    return org.telegram.messenger.g0.f23611q.y;
                }
                return super.W0(b1Var);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i7;
        switch (this.I) {
            case 3:
                super.k1(z10);
                i90 i90Var = ((j90) this.J).f35920b;
                if (z10) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                i90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f) * i7);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                m60 m60Var = ((pw) ((iz) this.J).K).f50376b.M0;
                if (m60Var != null && m60Var.D()) {
                    i7 = 0;
                }
                return super.m0(i7, w0Var, b1Var);
            case 3:
            default:
                return super.m0(i7, w0Var, b1Var);
            case 4:
                mi0 mi0Var = (mi0) this.J;
                di.c1 c1Var = mi0Var.f37258b;
                boolean z13 = false;
                if (i7 < 0 && mi0Var.C0 != 0.0f) {
                    float pullingLeftProgress = mi0Var.getPullingLeftProgress();
                    mi0Var.C0 += i7;
                    float pullingLeftProgress2 = mi0Var.getPullingLeftProgress();
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
                            c1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = mi0Var.C0;
                    if (f11 < 0.0f) {
                        i7 = (int) f11;
                        mi0Var.C0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    ai.k0 k0Var = mi0Var.T;
                    if (k0Var != null) {
                        k0Var.invalidate();
                    }
                    c1Var.invalidate();
                }
                int m0 = super.m0(i7, w0Var, b1Var);
                if (i7 > 0 && m0 == 0 && c1Var.getScrollState() == 1 && mi0Var.q()) {
                    ValueAnimator valueAnimator = mi0Var.f37301z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        mi0Var.f37301z0.cancel();
                    }
                    int i10 = (mi0Var.getPullingLeftProgress() > 1.0f ? 1 : (mi0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    mi0Var.C0 = (i7 * f10) + mi0Var.C0;
                    float pullingLeftProgress3 = mi0Var.getPullingLeftProgress();
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
                            c1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ai.k0 k0Var2 = mi0Var.T;
                    if (k0Var2 != null) {
                        k0Var2.invalidate();
                    }
                    c1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        switch (this.I) {
            case 1:
                qq qqVar = (qq) this.J;
                if (!qqVar.R && qqVar.O == 0 && qqVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i7, w0Var, b1Var);
            case 5:
                it0 it0Var = (it0) this.J;
                if (i7 > 0 && it0Var.O != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((it0Var.getHeight() - it0Var.V) * 0.5f)));
                        float n10 = it0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - it0Var.V)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, w0Var, b1Var);
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
                return super.o0(i7, w0Var, b1Var);
            default:
                return super.o0(i7, w0Var, b1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, v4.b1 b1Var, int i7) {
        switch (this.I) {
            case 2:
                dz dzVar = new dz(this, recyclerView.getContext());
                dzVar.f58480a = i7;
                w0(dzVar);
                return;
            case 8:
                q61 q61Var = new q61(this, recyclerView.getContext());
                q61Var.f58480a = i7;
                w0(q61Var);
                return;
            default:
                super.v0(recyclerView, b1Var, i7);
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
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).f43340a.getHeight();
                return;
            default:
                super.z0(b1Var, iArr);
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

    public i0(u41 u41Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = u41Var;
    }
}
