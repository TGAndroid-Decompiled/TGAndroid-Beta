package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z81;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ly;
import org.telegram.ui.rr;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(int i10, Object obj, boolean z10) {
        super(1, false);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public void S(of.e eVar, s4.z0 z0Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, dVar);
                if (!((s0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 7:
                super.S(eVar, z0Var, dVar);
                if (((f91) this.J).V) {
                    dVar.p(false);
                    return;
                }
                return;
            default:
                super.S(eVar, z0Var, dVar);
                return;
        }
    }

    @Override
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 6:
                if (((j31) this.J).f25247h3) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(z0Var);
            default:
                return super.W0(z0Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i10;
        switch (this.I) {
            case 3:
                super.k1(z10);
                ab0 ab0Var = ((bb0) this.J).f24907b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                ab0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, of.e eVar, s4.z0 z0Var) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                b80 b80Var = ((ly) ((n00) this.J).J).f38360b.L0;
                if (b80Var != null && b80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                sk0 sk0Var = (sk0) this.J;
                ai.w0 w0Var = sk0Var.f30757b;
                boolean z13 = false;
                if (i10 < 0 && sk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = sk0Var.getPullingLeftProgress();
                    sk0Var.B0 += i10;
                    float pullingLeftProgress2 = sk0Var.getPullingLeftProgress();
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
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = sk0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        sk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = sk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && sk0Var.q()) {
                    ValueAnimator valueAnimator = sk0Var.f30798y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        sk0Var.f30798y0.cancel();
                    }
                    int i11 = (sk0Var.getPullingLeftProgress() > 1.0f ? 1 : (sk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    sk0Var.B0 = (i10 * f7) + sk0Var.B0;
                    float pullingLeftProgress3 = sk0Var.getPullingLeftProgress();
                    if (i11 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z13 = true;
                    }
                    if (z10 != z13) {
                        try {
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    m6 m6Var2 = sk0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    w0Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                rr rrVar = (rr) this.J;
                if (!rrVar.R && rrVar.O == 0 && rrVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i10, eVar, z0Var);
            case 5:
                aw0 aw0Var = (aw0) this.J;
                if (i10 > 0 && aw0Var.T0 != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((aw0Var.getHeight() - aw0Var.f24686a1) * 0.5f)));
                        float j02 = aw0Var.j0();
                        if (!Float.isInfinite(j02)) {
                            min = Math.min(min, Math.max(0, Math.round(j02 - aw0Var.f24686a1)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, eVar, z0Var);
                            i11 += o02;
                            if (o02 < min) {
                                return i11;
                            }
                        } else {
                            return i11;
                        }
                    }
                    return i11;
                }
                return super.o0(i10, eVar, z0Var);
            default:
                return super.o0(i10, eVar, z0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.I) {
            case 2:
                g00 g00Var = new g00(this, recyclerView.getContext());
                g00Var.f46692a = i10;
                w0(g00Var);
                return;
            case 7:
                z81 z81Var = new z81(this, recyclerView.getContext());
                z81Var.f46692a = i10;
                w0(z81Var);
                return;
            default:
                super.v0(recyclerView, z0Var, i10);
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
            case 8:
                return false;
            default:
                return super.y0();
        }
    }

    @Override
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.I) {
            case 8:
                iArr[1] = ((StickersActivity) this.J).f34477a.getHeight();
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public j0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    public j0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }
}
