package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.x5;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v61;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.pw;
import org.telegram.ui.qq;
public final class i0 extends v4.b0 {
    public final int I;
    public final Object J;

    public i0(int i7, Object obj, boolean z9) {
        super(1, false);
        this.I = i7;
        this.J = obj;
    }

    @Override
    public void S(v4.v0 v0Var, v4.a1 a1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(v0Var, a1Var, dVar);
                if (!((q0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 8:
                super.S(v0Var, a1Var, dVar);
                if (((v61) this.J).V) {
                    dVar.p(false);
                    return;
                }
                return;
            default:
                super.S(v0Var, a1Var, dVar);
                return;
        }
    }

    @Override
    public int W0(v4.a1 a1Var) {
        switch (this.I) {
            case 6:
                if (((r41) this.J).f37558h3) {
                    return org.telegram.messenger.g0.f22563q.y;
                }
                return super.W0(a1Var);
            case 7:
                if (((a11) this.J).f37558h3) {
                    return org.telegram.messenger.g0.f22563q.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void k1(boolean z9) {
        int i7;
        switch (this.I) {
            case 3:
                super.k1(z9);
                g90 g90Var = ((h90) this.J).f34247b;
                if (z9) {
                    i7 = -1;
                } else {
                    i7 = 1;
                }
                g90Var.setTranslationY(org.telegram.messenger.g0.L(6.0f) * i7);
                return;
            default:
                super.k1(z9);
                return;
        }
    }

    @Override
    public int m0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        switch (this.I) {
            case 2:
                l60 l60Var = ((pw) ((fz) this.J).J).f48821b.L0;
                if (l60Var != null && l60Var.D()) {
                    i7 = 0;
                }
                return super.m0(i7, v0Var, a1Var);
            case 3:
            default:
                return super.m0(i7, v0Var, a1Var);
            case 4:
                ji0 ji0Var = (ji0) this.J;
                bi.q1 q1Var = ji0Var.f35028b;
                boolean z12 = false;
                if (i7 < 0 && ji0Var.B0 != 0.0f) {
                    float pullingLeftProgress = ji0Var.getPullingLeftProgress();
                    ji0Var.B0 += i7;
                    float pullingLeftProgress2 = ji0Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 != z11) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = ji0Var.B0;
                    if (f11 < 0.0f) {
                        i7 = (int) f11;
                        ji0Var.B0 = 0.0f;
                    } else {
                        i7 = 0;
                    }
                    x5 x5Var = ji0Var.S;
                    if (x5Var != null) {
                        x5Var.invalidate();
                    }
                    q1Var.invalidate();
                }
                int m0 = super.m0(i7, v0Var, a1Var);
                if (i7 > 0 && m0 == 0 && q1Var.getScrollState() == 1 && ji0Var.q()) {
                    ValueAnimator valueAnimator = ji0Var.f35070y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ji0Var.f35070y0.cancel();
                    }
                    int i10 = (ji0Var.getPullingLeftProgress() > 1.0f ? 1 : (ji0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    ji0Var.B0 = (i7 * f10) + ji0Var.B0;
                    float pullingLeftProgress3 = ji0Var.getPullingLeftProgress();
                    if (i10 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z12 = true;
                    }
                    if (z9 != z12) {
                        try {
                            q1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    x5 x5Var2 = ji0Var.S;
                    if (x5Var2 != null) {
                        x5Var2.invalidate();
                    }
                    q1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        switch (this.I) {
            case 1:
                qq qqVar = (qq) this.J;
                if (!qqVar.Q && qqVar.N == 0 && qqVar.E.size() == 0) {
                    return 0;
                }
                return super.o0(i7, v0Var, a1Var);
            case 5:
                jt0 jt0Var = (jt0) this.J;
                if (i7 > 0 && jt0Var.N != null) {
                    int i10 = 0;
                    while (i10 < i7) {
                        int min = Math.min(i7 - i10, Math.max(1, Math.round((jt0Var.getHeight() - jt0Var.U) * 0.5f)));
                        float n10 = jt0Var.n();
                        if (!Float.isInfinite(n10)) {
                            min = Math.min(min, Math.max(0, Math.round(n10 - jt0Var.U)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, v0Var, a1Var);
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
                return super.o0(i7, v0Var, a1Var);
            default:
                return super.o0(i7, v0Var, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        switch (this.I) {
            case 2:
                az azVar = new az(this, recyclerView.getContext());
                azVar.f57225a = i7;
                w0(azVar);
                return;
            case 8:
                q61 q61Var = new q61(this, recyclerView.getContext());
                q61Var.f57225a = i7;
                w0(q61Var);
                return;
            default:
                super.v0(recyclerView, a1Var, i7);
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
    public void z0(v4.a1 a1Var, int[] iArr) {
        switch (this.I) {
            case 9:
                iArr[1] = ((StickersActivity) this.J).f41975a.getHeight();
                return;
            default:
                super.z0(a1Var, iArr);
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

    public i0(r41 r41Var, int i7) {
        super(i7, false);
        this.I = 6;
        this.J = r41Var;
    }
}
