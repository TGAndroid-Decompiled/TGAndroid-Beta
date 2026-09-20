package gg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.z21;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.sr;
import org.telegram.ui.tw;
import org.telegram.ui.z6;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(int i10, n2 n2Var) {
        super(1, false);
        this.I = i10;
        this.J = n2Var;
    }

    @Override
    public void P(View view) {
        switch (this.I) {
            case 1:
                z6 z6Var = (z6) this.J;
                if (view == z6Var.M) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(z6Var.f40109b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z6Var.f40109b.getMeasuredHeight(), 1073741824));
                    return;
                } else {
                    super.P(view);
                    return;
                }
            default:
                super.P(view);
                return;
        }
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
            case 6:
                if (((z21) this.J).f28063a3) {
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
            case 4:
                super.k1(z10);
                ua0 ua0Var = ((va0) this.J).f29046b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                ua0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
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
            case 3:
                v70 v70Var = ((tw) ((k00) this.J).J).f37889b.L0;
                if (v70Var != null && v70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 4:
            default:
                return super.m0(i10, eVar, z0Var);
            case 5:
                pk0 pk0Var = (pk0) this.J;
                ai.w0 w0Var = pk0Var.f27338b;
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
                            w0Var.performHapticFeedback(3);
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
                    n6 n6Var = pk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && pk0Var.q()) {
                    ValueAnimator valueAnimator = pk0Var.f27378y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        pk0Var.f27378y0.cancel();
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
                            w0Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    n6 n6Var2 = pk0Var.S;
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
            case 2:
                sr srVar = (sr) this.J;
                if (!srVar.R && srVar.O == 0 && srVar.F.size() == 0) {
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
            case 3:
                d00 d00Var = new d00(this, recyclerView.getContext());
                d00Var.f43124a = i10;
                w0(d00Var);
                return;
            case 7:
                q81 q81Var = new q81(this, recyclerView.getContext());
                q81Var.f43124a = i10;
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
            case 3:
                return true;
            case 4:
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
                iArr[1] = ((StickersActivity) this.J).f31792a.getHeight();
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
