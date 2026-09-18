package gg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.na0;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.a7;
import org.telegram.ui.ur;
import org.telegram.ui.vw;
public final class j0 extends s4.c0 {
    public final int I;
    public final Object J;

    public j0(int i10, o2 o2Var) {
        super(1, false);
        this.I = i10;
        this.J = o2Var;
    }

    @Override
    public void P(View view) {
        switch (this.I) {
            case 1:
                a7 a7Var = (a7) this.J;
                if (view == a7Var.M) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(a7Var.f31738b.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a7Var.f31738b.getMeasuredHeight(), 1073741824));
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
    public void S(of.e eVar, s4.z0 z0Var, s0.c cVar) {
        switch (this.I) {
            case 0:
                super.S(eVar, z0Var, cVar);
                if (!((s0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
            case 7:
                super.S(eVar, z0Var, cVar);
                if (((i81) this.J).V) {
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
            case 6:
                if (((m21) this.J).f23798a3) {
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
                ma0 ma0Var = ((na0) this.J).f26428b;
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
            case 3:
                n70 n70Var = ((vw) ((k00) this.J).J).f38516b.L0;
                if (n70Var != null && n70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, eVar, z0Var);
            case 4:
            default:
                return super.m0(i10, eVar, z0Var);
            case 5:
                gk0 gk0Var = (gk0) this.J;
                ai.w0 w0Var = gk0Var.f24271b;
                boolean z13 = false;
                if (i10 < 0 && gk0Var.B0 != 0.0f) {
                    float pullingLeftProgress = gk0Var.getPullingLeftProgress();
                    gk0Var.B0 += i10;
                    float pullingLeftProgress2 = gk0Var.getPullingLeftProgress();
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
                    float f10 = gk0Var.B0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        gk0Var.B0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    n6 n6Var = gk0Var.S;
                    if (n6Var != null) {
                        n6Var.invalidate();
                    }
                    w0Var.invalidate();
                }
                int m0 = super.m0(i10, eVar, z0Var);
                if (i10 > 0 && m0 == 0 && w0Var.getScrollState() == 1 && gk0Var.q()) {
                    ValueAnimator valueAnimator = gk0Var.f24311y0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        gk0Var.f24311y0.cancel();
                    }
                    int i11 = (gk0Var.getPullingLeftProgress() > 1.0f ? 1 : (gk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f7 = 0.05f;
                    } else {
                        f7 = 0.6f;
                    }
                    gk0Var.B0 = (i10 * f7) + gk0Var.B0;
                    float pullingLeftProgress3 = gk0Var.getPullingLeftProgress();
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
                    n6 n6Var2 = gk0Var.S;
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
            case 3:
                d00 d00Var = new d00(this, recyclerView.getContext());
                d00Var.f42852a = i10;
                w0(d00Var);
                return;
            case 7:
                d81 d81Var = new d81(this, recyclerView.getContext());
                d81Var.f42852a = i10;
                w0(d81Var);
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
                iArr[1] = ((StickersActivity) this.J).f31525a.getHeight();
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
