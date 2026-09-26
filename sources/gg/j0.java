package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.z21;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.za0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.pr;
import org.telegram.ui.pw;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
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
            case 6:
                super.S(eVar, z0Var, dVar);
                if (((w81) this.J).V) {
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
            case 5:
                if (((z21) this.J).f28177a3) {
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
                za0 za0Var = ((ab0) this.J).f22591b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                za0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
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
                z70 z70Var = ((pw) ((m00) this.J).J).f36685b.L0;
                if (z70Var != null && z70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                rk0 rk0Var = (rk0) this.J;
                ai.w0 w0Var = rk0Var.f27951b;
                boolean z13 = false;
                if (i10 < 0 && rk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = rk0Var.getPullingLeftProgress();
                    rk0Var.B0 += i10;
                    float pullingLeftProgress2 = rk0Var.getPullingLeftProgress();
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
                    float f10 = rk0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        rk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = rk0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && rk0Var.q()) {
                    ValueAnimator valueAnimator = rk0Var.f27991y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        rk0Var.f27991y0.cancel();
                    }
                    int i11 = (rk0Var.getPullingLeftProgress() > 1.0f ? 1 : (rk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    rk0Var.B0 = (i10 * f7) + rk0Var.B0;
                    float pullingLeftProgress3 = rk0Var.getPullingLeftProgress();
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
                    m6 m6Var2 = rk0Var.S;
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
                pr prVar = (pr) this.J;
                if (!prVar.R && prVar.O == 0 && prVar.F.size() == 0) {
                    return 0;
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
                f00 f00Var = new f00(this, recyclerView.getContext());
                f00Var.f43109a = i10;
                w0(f00Var);
                return;
            case 6:
                q81 q81Var = new q81(this, recyclerView.getContext());
                q81Var.f43109a = i10;
                w0(q81Var);
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
            case 7:
                return false;
            default:
                return super.y0();
        }
    }

    @Override
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).f31793a.getHeight();
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public j0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public j0(pr prVar) {
        super(1, false);
        this.I = 1;
        this.J = prVar;
    }
}
