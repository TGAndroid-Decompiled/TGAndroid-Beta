package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.u00;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.sw;
import org.telegram.ui.tr;
public final class i0 extends s4.d0 {
    public final int I;
    public final Object J;

    public i0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(pf.e eVar, s4.a1 a1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, a1Var, dVar);
                if (!((r0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 6:
                super.S(eVar, a1Var, dVar);
                if (((o91) this.J).V) {
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
    public int W0(s4.a1 a1Var) {
        switch (this.I) {
            case 5:
                if (((r31) this.J).Y2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i10;
        switch (this.I) {
            case 3:
                super.k1(z10);
                pb0 pb0Var = ((qb0) this.J).f30164b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                pb0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, pf.e eVar, s4.a1 a1Var) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                q80 q80Var = ((sw) ((b10) this.J).J).f41824b.L0;
                if (q80Var != null && q80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, a1Var);
            case 3:
            default:
                return super.m0(i10, eVar, a1Var);
            case 4:
                ll0 ll0Var = (ll0) this.J;
                ai.w0 w0Var = ll0Var.f28382b;
                boolean z13 = false;
                if (i10 < 0 && ll0Var.B0 != 0.0f) {
                    float pullingLeftProgress = ll0Var.getPullingLeftProgress();
                    ll0Var.B0 += i10;
                    float pullingLeftProgress2 = ll0Var.getPullingLeftProgress();
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
                    float f10 = ll0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        ll0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    m6 m6Var = ll0Var.S;
                    if (m6Var != null) {
                        m6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, a1Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && ll0Var.q()) {
                    ValueAnimator valueAnimator = ll0Var.f28423y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ll0Var.f28423y0.cancel();
                    }
                    int i11 = (ll0Var.getPullingLeftProgress() > 1.0f ? 1 : (ll0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    ll0Var.B0 = (i10 * f7) + ll0Var.B0;
                    float pullingLeftProgress3 = ll0Var.getPullingLeftProgress();
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
                    m6 m6Var2 = ll0Var.S;
                    if (m6Var2 != null) {
                        m6Var2.invalidate();
                    }
                    w0Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        switch (this.I) {
            case 1:
                tr trVar = (tr) this.J;
                if (!trVar.R && trVar.O == 0 && trVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i10, eVar, a1Var);
            default:
                return super.o0(i10, eVar, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.I) {
            case 2:
                u00 u00Var = new u00(this, recyclerView.getContext());
                u00Var.f47871a = i10;
                w0(u00Var);
                return;
            case 6:
                i91 i91Var = new i91(this, recyclerView.getContext());
                i91Var.f47871a = i10;
                w0(i91Var);
                return;
            default:
                super.v0(recyclerView, a1Var, i10);
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
    public void z0(s4.a1 a1Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).f34524a.getHeight();
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public i0(tr trVar) {
        super(1, false);
        this.I = 1;
        this.J = trVar;
    }
}
