package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.StickersActivity;
public final class xe2 extends t26 {
    public final byte I;
    public final Object J;

    public xe2(ViewGroup viewGroup, byte b) {
        super(0, false);
        this.I = b;
        this.J = viewGroup;
    }

    @Override
    public final void R(wg2 wg2Var, p49 p49Var, u4 u4Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 2:
                super.R(wg2Var, p49Var, u4Var);
                if (!((tf4) obj).isEnabled()) {
                    u4Var.p(false);
                    return;
                }
                return;
            case 9:
                super.R(wg2Var, p49Var, u4Var);
                if (((vec) obj).W) {
                    u4Var.p(false);
                    return;
                }
                return;
            default:
                super.R(wg2Var, p49Var, u4Var);
                return;
        }
    }

    @Override
    public final int V0(p49 p49Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 7:
                if (((q5c) obj).i3) {
                    return gl.q.y;
                }
                return super.V0(p49Var);
            case 8:
                if (((ywb) obj).i3) {
                    return gl.q.y;
                }
                return super.V0(p49Var);
            default:
                return super.V0(p49Var);
        }
    }

    @Override
    public final void j1(boolean z) {
        int i;
        switch (this.I) {
            case 3:
                super.j1(z);
                tz6 tz6Var = ((uz6) this.J).b;
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                tz6Var.setTranslationY(gl.L(6.0f) * i);
                return;
            default:
                super.j1(z);
                return;
        }
    }

    @Override
    public final int l0(int i, wg2 wg2Var, p49 p49Var) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.I;
        Object obj = this.J;
        boolean z4 = false;
        switch (b) {
            case 1:
                cs5 cs5Var = ((ti3) ((he4) obj).K).b.M0;
                if (cs5Var != null && cs5Var.E()) {
                    i = 0;
                }
                return super.l0(i, wg2Var, p49Var);
            case 4:
                t09 t09Var = (t09) obj;
                fu fuVar = t09Var.b;
                if (i < 0 && t09Var.C0 != 0.0f) {
                    float pullingLeftProgress = t09Var.getPullingLeftProgress();
                    t09Var.C0 += i;
                    float pullingLeftProgress2 = t09Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 != z3) {
                        try {
                            fuVar.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f2 = t09Var.C0;
                    if (f2 < 0.0f) {
                        i = (int) f2;
                        t09Var.C0 = 0.0f;
                    } else {
                        i = 0;
                    }
                    st stVar = t09Var.T;
                    if (stVar != null) {
                        stVar.invalidate();
                    }
                    fuVar.invalidate();
                }
                int l0 = super.l0(i, wg2Var, p49Var);
                if (i > 0 && l0 == 0 && fuVar.getScrollState() == 1 && t09Var.n()) {
                    ValueAnimator valueAnimator = t09Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        t09Var.z0.cancel();
                    }
                    int i2 = (t09Var.getPullingLeftProgress() > 1.0f ? 1 : (t09Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i2 > 0) {
                        f = 0.05f;
                    } else {
                        f = 0.6f;
                    }
                    t09Var.C0 = (i * f) + t09Var.C0;
                    float pullingLeftProgress3 = t09Var.getPullingLeftProgress();
                    if (i2 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z4 = true;
                    }
                    if (z != z4) {
                        try {
                            fuVar.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    st stVar2 = t09Var.T;
                    if (stVar2 != null) {
                        stVar2.invalidate();
                    }
                    fuVar.invalidate();
                }
                return l0;
            default:
                return super.l0(i, wg2Var, p49Var);
        }
    }

    @Override
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                kf2 kf2Var = (kf2) obj;
                if (!kf2Var.R && kf2Var.O == 0 && kf2Var.F.size() == 0) {
                    return 0;
                }
                return super.n0(i, wg2Var, p49Var);
            case 5:
                dha dhaVar = (dha) obj;
                if (i > 0 && dhaVar.O != null) {
                    int i2 = 0;
                    while (i2 < i) {
                        int min = Math.min(i - i2, Math.max(1, Math.round((dhaVar.getHeight() - dhaVar.V) * 0.5f)));
                        float p = dhaVar.p();
                        if (!Float.isInfinite(p)) {
                            min = Math.min(min, Math.max(0, Math.round(p - dhaVar.V)));
                        }
                        if (min != 0) {
                            int n0 = super.n0(min, wg2Var, p49Var);
                            i2 += n0;
                            if (n0 < min) {
                                return i2;
                            }
                        } else {
                            return i2;
                        }
                    }
                    return i2;
                }
                return super.n0(i, wg2Var, p49Var);
            default:
                return super.n0(i, wg2Var, p49Var);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.I) {
            case 1:
                ae4 ae4Var = new ae4(this, recyclerView.getContext());
                ae4Var.a = i;
                v0(ae4Var);
                return;
            case 9:
                qec qecVar = new qec(this, recyclerView.getContext());
                qecVar.a = i;
                v0(qecVar);
                return;
            default:
                super.u0(recyclerView, p49Var, i);
                return;
        }
    }

    @Override
    public final boolean x0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
            default:
                return super.x0();
        }
    }

    @Override
    public final void y0(p49 p49Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                return;
            default:
                super.y0(p49Var, iArr);
                return;
        }
    }

    public xe2(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = obj;
    }

    public xe2(Object obj, byte b) {
        super(1, false);
        this.I = b;
        this.J = obj;
    }

    public xe2(q5c q5cVar, int i) {
        super(i, false);
        this.I = (byte) 7;
        this.J = q5cVar;
    }
}
