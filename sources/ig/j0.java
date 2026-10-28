package ig;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.u91;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.mr;
import org.telegram.ui.ux;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(int i10, Object obj, boolean z10) {
        super(1, false);
        this.I = i10;
        this.J = obj;
    }

    @Override
    public void S(rf.e eVar, s4.b1 b1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, b1Var, dVar);
                if (!((r0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 7:
                super.S(eVar, b1Var, dVar);
                if (((u91) this.J).V) {
                    dVar.p(false);
                    return;
                }
                return;
            default:
                super.S(eVar, b1Var, dVar);
                return;
        }
    }

    @Override
    public int W0(s4.b1 b1Var) {
        switch (this.I) {
            case 6:
                if (((t31) this.J).f32506i3) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(b1Var);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public void l1(boolean z10) {
        int i10;
        switch (this.I) {
            case 3:
                super.l1(z10);
                gb0 gb0Var = ((hb0) this.J).f28941b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                gb0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.l1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, rf.e eVar, s4.b1 b1Var) {
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                l80 l80Var = ((ux) ((s00) this.J).J).f44129b.L0;
                if (l80Var != null && l80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, b1Var);
            case 3:
            default:
                return super.m0(i10, eVar, b1Var);
            case 4:
                gl0 gl0Var = (gl0) this.J;
                bi.r1 r1Var = gl0Var.f28609b;
                boolean z13 = false;
                if (i10 < 0 && gl0Var.B0 != 0.0f) {
                    float pullingLeftProgress = gl0Var.getPullingLeftProgress();
                    gl0Var.B0 += i10;
                    float pullingLeftProgress2 = gl0Var.getPullingLeftProgress();
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
                            r1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = gl0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        gl0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    bh.p pVar = gl0Var.S;
                    if (pVar != null) {
                        pVar.invalidate();
                    }
                    r1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, b1Var);
                if (i10 > 0 && m0 == 0 && r1Var.getScrollState() == 1 && gl0Var.q()) {
                    ValueAnimator valueAnimator = gl0Var.f28650y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gl0Var.f28650y0.cancel();
                    }
                    int i11 = (gl0Var.getPullingLeftProgress() > 1.0f ? 1 : (gl0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    gl0Var.B0 = (i10 * f7) + gl0Var.B0;
                    float pullingLeftProgress3 = gl0Var.getPullingLeftProgress();
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
                            r1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    bh.p pVar2 = gl0Var.S;
                    if (pVar2 != null) {
                        pVar2.invalidate();
                    }
                    r1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        switch (this.I) {
            case 1:
                mr mrVar = (mr) this.J;
                if (!mrVar.Q && mrVar.N == 0 && mrVar.E.size() == 0) {
                    return 0;
                }
                return super.o0(i10, eVar, b1Var);
            case 5:
                mw0 mw0Var = (mw0) this.J;
                if (i10 > 0 && mw0Var.N != null) {
                    int i11 = 0;
                    while (i11 < i10) {
                        int min = Math.min(i10 - i11, Math.max(1, Math.round((mw0Var.getHeight() - mw0Var.U) * 0.5f)));
                        float k10 = mw0Var.k();
                        if (!Float.isInfinite(k10)) {
                            min = Math.min(min, Math.max(0, Math.round(k10 - mw0Var.U)));
                        }
                        if (min != 0) {
                            int o02 = super.o0(min, eVar, b1Var);
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
                return super.o0(i10, eVar, b1Var);
            default:
                return super.o0(i10, eVar, b1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.I) {
            case 2:
                m00 m00Var = new m00(this, recyclerView.getContext());
                m00Var.f47715a = i10;
                w0(m00Var);
                return;
            case 7:
                p91 p91Var = new p91(this, recyclerView.getContext());
                p91Var.f47715a = i10;
                w0(p91Var);
                return;
            default:
                super.v0(recyclerView, b1Var, i10);
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
    public void z0(s4.b1 b1Var, int[] iArr) {
        switch (this.I) {
            case 8:
                iArr[1] = ((StickersActivity) this.J).f36247a.getHeight();
                return;
            default:
                super.z0(b1Var, iArr);
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
