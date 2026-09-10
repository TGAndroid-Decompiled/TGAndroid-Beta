package fg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bi.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.Components.y21;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.vw;
import org.telegram.ui.wr;
public final class i0 extends s4.c0 {
    public final int I;
    public final Object J;

    public i0(ViewGroup viewGroup, int i10) {
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
                if (((u81) this.J).V) {
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
                if (((y21) this.J).f26604a3) {
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
                wa0 wa0Var = ((xa0) this.J).f28990b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                wa0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
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
                w70 w70Var = ((vw) ((r00) this.J).J).f37634b.L0;
                if (w70Var != null && w70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                pk0 pk0Var = (pk0) this.J;
                bi.y1 y1Var = pk0Var.f26161b;
                boolean z13 = false;
                if (i10 < 0 && pk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = pk0Var.getPullingLeftProgress();
                    pk0Var.B0 += i10;
                    float pullingLeftProgress2 = pk0Var.getPullingLeftProgress();
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
                            y1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = pk0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        pk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    n7 n7Var = pk0Var.S;
                    if (n7Var != null) {
                        n7Var.invalidate();
                    }
                    y1Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && y1Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.f26201y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.f26201y0.cancel();
                    }
                    int i11 = (pk0Var.getPullingLeftProgress() > 1.0f ? 1 : (pk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    pk0Var.B0 = (i10 * f7) + pk0Var.B0;
                    float pullingLeftProgress3 = pk0Var.getPullingLeftProgress();
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
                            y1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    n7 n7Var2 = pk0Var.S;
                    if (n7Var2 != null) {
                        n7Var2.invalidate();
                    }
                    y1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, of.e eVar, s4.z0 z0Var) {
        switch (this.I) {
            case 1:
                wr wrVar = (wr) this.J;
                if (!wrVar.R && wrVar.O == 0 && wrVar.F.size() == 0) {
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
                k00 k00Var = new k00(this, recyclerView.getContext());
                k00Var.f41760a = i10;
                w0(k00Var);
                return;
            case 6:
                p81 p81Var = new p81(this, recyclerView.getContext());
                p81Var.f41760a = i10;
                w0(p81Var);
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
                iArr[1] = ((StickersActivity) this.J).f30620a.getHeight();
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public i0(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public i0(wr wrVar) {
        super(1, false);
        this.I = 1;
        this.J = wrVar;
    }
}
