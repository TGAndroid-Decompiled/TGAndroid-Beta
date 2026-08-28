package of;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x60;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.dw;
import org.telegram.ui.jr;
public final class g0 extends f2.m0 {
    public final int I;
    public final Object J;

    public g0(ViewGroup viewGroup, int i9) {
        super(0, false);
        this.I = i9;
        this.J = viewGroup;
    }

    @Override
    public void S(f2.g1 g1Var, f2.n1 n1Var, s0.d dVar) {
        switch (this.I) {
            case 0:
                super.S(g1Var, n1Var, dVar);
                if (!((o0) this.J).isEnabled()) {
                    dVar.p(false);
                    return;
                }
                return;
            case 6:
                super.S(g1Var, n1Var, dVar);
                if (((m71) this.J).R) {
                    dVar.p(false);
                    return;
                }
                return;
            default:
                super.S(g1Var, n1Var, dVar);
                return;
        }
    }

    @Override
    public int W0(f2.n1 n1Var) {
        switch (this.I) {
            case 5:
                if (((o11) this.J).W2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(n1Var);
            default:
                return super.W0(n1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i9;
        switch (this.I) {
            case 3:
                super.k1(z10);
                v90 v90Var = ((w90) this.J).f34156b;
                if (z10) {
                    i9 = -1;
                } else {
                    i9 = 1;
                }
                v90Var.setTranslationY(AndroidUtilities.dp(6.0f) * i9);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 2:
                x60 x60Var = ((dw) ((vz) this.J).F).f37619b.H0;
                if (x60Var != null && x60Var.D()) {
                    i9 = 0;
                }
                return super.m0(i9, g1Var, n1Var);
            case 3:
            default:
                return super.m0(i9, g1Var, n1Var);
            case 4:
                uj0 uj0Var = (uj0) this.J;
                gh.f1 f1Var = uj0Var.f33045b;
                boolean z13 = false;
                if (i9 < 0 && uj0Var.f33080x0 != 0.0f) {
                    float pullingLeftProgress = uj0Var.getPullingLeftProgress();
                    uj0Var.f33080x0 += i9;
                    float pullingLeftProgress2 = uj0Var.getPullingLeftProgress();
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
                            f1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f11 = uj0Var.f33080x0;
                    if (f11 < 0.0f) {
                        i9 = (int) f11;
                        uj0Var.f33080x0 = 0.0f;
                    } else {
                        i9 = 0;
                    }
                    fh.v vVar = uj0Var.O;
                    if (vVar != null) {
                        vVar.invalidate();
                    }
                    f1Var.invalidate();
                }
                int m0 = super.m0(i9, g1Var, n1Var);
                if (i9 > 0 && m0 == 0 && f1Var.getScrollState() == 1 && uj0Var.q()) {
                    ValueAnimator valueAnimator = uj0Var.f33075u0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        uj0Var.f33075u0.cancel();
                    }
                    int i10 = (uj0Var.getPullingLeftProgress() > 1.0f ? 1 : (uj0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i10 > 0) {
                        f10 = 0.05f;
                    } else {
                        f10 = 0.6f;
                    }
                    uj0Var.f33080x0 = (i9 * f10) + uj0Var.f33080x0;
                    float pullingLeftProgress3 = uj0Var.getPullingLeftProgress();
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
                            f1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    fh.v vVar2 = uj0Var.O;
                    if (vVar2 != null) {
                        vVar2.invalidate();
                    }
                    f1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i9, f2.g1 g1Var, f2.n1 n1Var) {
        switch (this.I) {
            case 1:
                jr jrVar = (jr) this.J;
                if (!jrVar.N && jrVar.K == 0 && jrVar.B.size() == 0) {
                    return 0;
                }
                return super.o0(i9, g1Var, n1Var);
            default:
                return super.o0(i9, g1Var, n1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.n1 n1Var, int i9) {
        switch (this.I) {
            case 2:
                pz pzVar = new pz(this, recyclerView.getContext());
                pzVar.f5443a = i9;
                w0(pzVar);
                return;
            case 6:
                g71 g71Var = new g71(this, recyclerView.getContext());
                g71Var.f5443a = i9;
                w0(g71Var);
                return;
            default:
                super.v0(recyclerView, n1Var, i9);
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
    public void z0(f2.n1 n1Var, int[] iArr) {
        switch (this.I) {
            case 7:
                iArr[1] = ((StickersActivity) this.J).f36186a.getHeight();
                return;
            default:
                super.z0(n1Var, iArr);
                return;
        }
    }

    public g0(Object obj, int i9) {
        this.I = i9;
        this.J = obj;
    }

    public g0(jr jrVar) {
        super(1, false);
        this.I = 1;
        this.J = jrVar;
    }
}
