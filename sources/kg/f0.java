package kg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.wy;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.kw;
import org.telegram.ui.nq;
public final class f0 extends u4.b0 {
    public final int I;
    public final Object J;

    public f0(int i3, Object obj, boolean z10) {
        super(1, false);
        this.I = i3;
        this.J = obj;
    }

    @Override
    public void S(tf.e eVar, u4.a1 a1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, a1Var, dVar);
                if (!((n0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 8:
                super.S(eVar, a1Var, dVar);
                if (((m61) this.J).W) {
                    dVar.p(false);
                    return;
                }
                return;
            default:
                super.S(eVar, a1Var, dVar);
                return;
        }
    }

    @Override
    public int W0(u4.a1 a1Var) {
        switch (this.I) {
            case 6:
                if (((l41) this.J).i3) {
                    return org.telegram.messenger.g0.f22608q.y;
                }
                return super.W0(a1Var);
            case 7:
                if (((u01) this.J).i3) {
                    return org.telegram.messenger.g0.f22608q.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i3;
        switch (this.I) {
            case 3:
                super.k1(z10);
                b90 b90Var = ((c90) this.J).f32611b;
                if (z10) {
                    i3 = -1;
                } else {
                    i3 = 1;
                }
                b90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f) * i3);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i3, tf.e eVar, u4.a1 a1Var) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                f60 f60Var = ((kw) ((bz) this.J).K).f47036b.M0;
                if (f60Var != null && f60Var.D()) {
                    i3 = 0;
                }
                return super.m0(i3, eVar, a1Var);
            case 3:
            default:
                return super.m0(i3, eVar, a1Var);
            case 4:
                li0 li0Var = (li0) this.J;
                ci.j1 j1Var = li0Var.f35736b;
                boolean z13 = false;
                if (i3 < 0 && li0Var.C0 != 0.0f) {
                    float pullingLeftProgress = li0Var.getPullingLeftProgress();
                    li0Var.C0 += i3;
                    float pullingLeftProgress2 = li0Var.getPullingLeftProgress();
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
                            j1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = li0Var.C0;
                    if (f11 < 0.0f) {
                        i3 = (int) f11;
                        li0Var.C0 = 0.0f;
                    } else {
                        i3 = 0;
                    }
                    ai.c0 c0Var = li0Var.T;
                    if (c0Var != null) {
                        c0Var.invalidate();
                    }
                    j1Var.invalidate();
                }
                int m0 = super.m0(i3, eVar, a1Var);
                if (i3 > 0 && m0 == 0 && j1Var.getScrollState() == 1 && li0Var.q()) {
                    ValueAnimator valueAnimator = li0Var.f35779z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        li0Var.f35779z0.cancel();
                    }
                    int i10 = (li0Var.getPullingLeftProgress() > 1.0f ? 1 : (li0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    li0Var.C0 = (i3 * f10) + li0Var.C0;
                    float pullingLeftProgress3 = li0Var.getPullingLeftProgress();
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
                            j1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ai.c0 c0Var2 = li0Var.T;
                    if (c0Var2 != null) {
                        c0Var2.invalidate();
                    }
                    j1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        switch (this.I) {
            case 1:
                nq nqVar = (nq) this.J;
                if (!nqVar.R && nqVar.O == 0 && nqVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i3, eVar, a1Var);
            case 5:
                gt0 gt0Var = (gt0) this.J;
                if (i3 > 0 && gt0Var.O != null) {
                    int i10 = 0;
                    while (i10 < i3) {
                        int min = Math.min(i3 - i10, Math.max(1, Math.round((gt0Var.getHeight() - gt0Var.V) * 0.5f)));
                        float k10 = gt0Var.k();
                        if (!Float.isInfinite(k10)) {
                            min = Math.min(min, Math.max(0, Math.round(k10 - gt0Var.V)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, eVar, a1Var);
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
                return super.o0(i3, eVar, a1Var);
            default:
                return super.o0(i3, eVar, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.I) {
            case 2:
                wy wyVar = new wy(this, recyclerView.getContext());
                wyVar.f55704a = i3;
                w0(wyVar);
                return;
            case 8:
                h61 h61Var = new h61(this, recyclerView.getContext());
                h61Var.f55704a = i3;
                w0(h61Var);
                return;
            default:
                super.v0(recyclerView, a1Var, i3);
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
    public void z0(u4.a1 a1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).f41997a.getHeight();
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public f0(ViewGroup viewGroup, int i3) {
        super(0, false);
        this.I = i3;
        this.J = viewGroup;
    }

    public f0(Object obj, int i3) {
        this.I = i3;
        this.J = obj;
    }

    public f0(l41 l41Var, int i3) {
        super(i3, false);
        this.I = 6;
        this.J = l41Var;
    }
}
