package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.f31;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.y81;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.bw;
import org.telegram.ui.hr;
public final class i0 extends s4.b0 {
    public final int I;
    public final Object J;

    public i0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(qf.e eVar, s4.y0 y0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, y0Var, cVar);
                if (!((q0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 6:
                super.S(eVar, y0Var, cVar);
                if (((d91) this.J).V) {
                    cVar.p(false);
                    return;
                }
                return;
            default:
                super.S(eVar, y0Var, cVar);
                return;
        }
    }

    @Override
    public int W0(s4.y0 y0Var) {
        switch (this.I) {
            case 5:
                if (((f31) this.J).Y2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(y0Var);
            default:
                return super.W0(y0Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i10;
        switch (this.I) {
            case 3:
                super.k1(z10);
                hb0 hb0Var = ((ib0) this.J).f27221b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                hb0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, qf.e eVar, s4.y0 y0Var) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                i80 i80Var = ((bw) ((s00) this.J).J).f35748b.L0;
                if (i80Var != null && i80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, y0Var);
            case 3:
            default:
                return super.m0(i10, eVar, y0Var);
            case 4:
                dl0 dl0Var = (dl0) this.J;
                ai.u1 u1Var = dl0Var.f25525b;
                boolean z13 = false;
                if (i10 < 0 && dl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = dl0Var.getPullingLeftProgress();
                    dl0Var.B0 += i10;
                    float pullingLeftProgress2 = dl0Var.getPullingLeftProgress();
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
                            u1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = dl0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        dl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ah.v vVar = dl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    u1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, y0Var);
                if (i10 > 0 && m0 == 0 && u1Var.getScrollState() == 1 && dl0Var.q()) {
                    ValueAnimator valueAnimator = dl0Var.f25565y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        dl0Var.f25565y0.cancel();
                    }
                    int i11 = (dl0Var.getPullingLeftProgress() > 1.0f ? 1 : (dl0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    dl0Var.B0 = (i10 * f7) + dl0Var.B0;
                    float pullingLeftProgress3 = dl0Var.getPullingLeftProgress();
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
                            u1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.v vVar2 = dl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    u1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        switch (this.I) {
            case 1:
                hr hrVar = (hr) this.J;
                if (!hrVar.R && hrVar.O == 0 && hrVar.F.size() == 0) {
                    return 0;
                }
                return super.o0(i10, eVar, y0Var);
            default:
                return super.o0(i10, eVar, y0Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.I) {
            case 2:
                m00 m00Var = new m00(this, recyclerView.getContext());
                m00Var.f46058a = i10;
                w0(m00Var);
                return;
            case 6:
                y81 y81Var = new y81(this, recyclerView.getContext());
                y81Var.f46058a = i10;
                w0(y81Var);
                return;
            default:
                super.v0(recyclerView, y0Var, i10);
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
    public void z0(s4.y0 y0Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).f33856a.getHeight();
                return;
            default:
                super.z0(y0Var, iArr);
                return;
        }
    }

    public i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public i0(hr hrVar) {
        super(1, false);
        this.I = 1;
        this.J = hrVar;
    }
}
