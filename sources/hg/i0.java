package hg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.w00;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.xw;
import org.telegram.ui.yr;
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
                if (!((r0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 6:
                super.S(eVar, y0Var, cVar);
                if (((k91) this.J).V) {
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
                if (((m31) this.J).Y2) {
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
                nb0 nb0Var = ((ob0) this.J).f27625b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                nb0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
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
                l80 l80Var = ((xw) ((w00) this.J).J).f41671b.L0;
                if (l80Var != null && l80Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, y0Var);
            case 3:
            default:
                return super.m0(i10, eVar, y0Var);
            case 4:
                gl0 gl0Var = (gl0) this.J;
                bi.o0 o0Var = gl0Var.f25009b;
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
                            o0Var.performHapticFeedback(3);
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
                    ah.v vVar = gl0Var.S;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    o0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, y0Var);
                if (i10 > 0 && m0 == 0 && o0Var.getScrollState() == 1 && gl0Var.q()) {
                    ValueAnimator valueAnimator = gl0Var.f25049y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gl0Var.f25049y0.cancel();
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
                            o0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    ah.v vVar2 = gl0Var.S;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    o0Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        switch (this.I) {
            case 1:
                yr yrVar = (yr) this.J;
                if (!yrVar.R && yrVar.O == 0 && yrVar.F.size() == 0) {
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
                p00 p00Var = new p00(this, recyclerView.getContext());
                p00Var.f44979a = i10;
                w0(p00Var);
                return;
            case 6:
                f91 f91Var = new f91(this, recyclerView.getContext());
                f91Var.f44979a = i10;
                w0(f91Var);
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
                iArr[1] = ((StickersActivity) this.J).f32501a.getHeight();
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

    public i0(yr yrVar) {
        super(1, false);
        this.I = 1;
        this.J = yrVar;
    }
}
