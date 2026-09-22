package gg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l21;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.na0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.tw;
import org.telegram.ui.ur;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(of.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, cVar);
                if (!((s0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 6:
                super.S(eVar, z0Var, cVar);
                if (((h81) this.J).V) {
                    cVar.p(false);
                    return;
                }
                return;
            default:
                super.S(eVar, z0Var, cVar);
                return;
        }
    }

    @Override
    public int W0(s4.z0 z0Var) {
        switch (this.I) {
            case 5:
                if (((l21) this.J).f23555a3) {
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
                ma0 ma0Var = ((na0) this.J).f26422b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                ma0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
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
                n70 n70Var = ((tw) ((k00) this.J).J).f37741b.L0;
                if (n70Var != null && n70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 3:
            default:
                return super.m0(i10, eVar, z0Var);
            case 4:
                fk0 fk0Var = (fk0) this.J;
                ai.w0 w0Var = fk0Var.f23968b;
                boolean z13 = false;
                if (i10 < 0 && fk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = fk0Var.getPullingLeftProgress();
                    fk0Var.B0 += i10;
                    float pullingLeftProgress2 = fk0Var.getPullingLeftProgress();
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
                    float f10 = fk0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        fk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    n6 n6Var = fk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && fk0Var.q()) {
                    ValueAnimator valueAnimator = fk0Var.f24008y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fk0Var.f24008y0.cancel();
                    }
                    int i11 = (fk0Var.getPullingLeftProgress() > 1.0f ? 1 : (fk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    fk0Var.B0 = (i10 * f7) + fk0Var.B0;
                    float pullingLeftProgress3 = fk0Var.getPullingLeftProgress();
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
                    n6 n6Var2 = fk0Var.S;
                    if (n6Var2 != null) {
                        n6Var2.invalidate();
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
                ur urVar = (ur) this.J;
                if (!urVar.R && urVar.O == 0 && urVar.F.size() == 0) {
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
                d00 d00Var = new d00(this, recyclerView.getContext());
                d00Var.f42821a = i10;
                w0(d00Var);
                return;
            case 6:
                c81 c81Var = new c81(this, recyclerView.getContext());
                c81Var.f42821a = i10;
                w0(c81Var);
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
                iArr[1] = ((StickersActivity) this.J).f31505a.getHeight();
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

    public j0(ur urVar) {
        super(1, false);
        this.I = 1;
        this.J = urVar;
    }
}
