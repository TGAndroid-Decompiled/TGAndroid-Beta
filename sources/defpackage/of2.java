package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.StickersActivity;
public final class of2 extends x46 {
    public final byte I;
    public final Object J;

    public of2(ViewGroup viewGroup, byte b) {
        super(0, false);
        this.I = b;
        this.J = viewGroup;
    }

    @Override
    public final void R(oh2 oh2Var, c89 c89Var, v4 v4Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 2:
                super.R(oh2Var, c89Var, v4Var);
                if (!((rh4) obj).isEnabled()) {
                    v4Var.p(false);
                    return;
                }
                return;
            case 9:
                super.R(oh2Var, c89Var, v4Var);
                if (((uic) obj).W) {
                    v4Var.p(false);
                    return;
                }
                return;
            default:
                super.R(oh2Var, c89Var, v4Var);
                return;
        }
    }

    @Override
    public final int V0(c89 c89Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 7:
                if (((q9c) obj).i3) {
                    return hl.q.y;
                }
                return super.V0(c89Var);
            case 8:
                if (((z0c) obj).i3) {
                    return hl.q.y;
                }
                return super.V0(c89Var);
            default:
                return super.V0(c89Var);
        }
    }

    @Override
    public final void j1(boolean z) {
        int i;
        switch (this.I) {
            case 3:
                super.j1(z);
                a27 a27Var = ((b27) this.J).b;
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                a27Var.setTranslationY(hl.L(6.0f) * i);
                return;
            default:
                super.j1(z);
                return;
        }
    }

    @Override
    public final int l0(int i, oh2 oh2Var, c89 c89Var) {
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.I;
        Object obj = this.J;
        boolean z4 = false;
        switch (b) {
            case 1:
                if (((fg4) obj).K.i()) {
                    i = 0;
                }
                return super.l0(i, oh2Var, c89Var);
            case 4:
                i49 i49Var = (i49) obj;
                gu guVar = i49Var.b;
                if (i < 0 && i49Var.C0 != 0.0f) {
                    float pullingLeftProgress = i49Var.getPullingLeftProgress();
                    i49Var.C0 += i;
                    float pullingLeftProgress2 = i49Var.getPullingLeftProgress();
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
                            guVar.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f2 = i49Var.C0;
                    if (f2 < 0.0f) {
                        i = (int) f2;
                        i49Var.C0 = 0.0f;
                    } else {
                        i = 0;
                    }
                    tt ttVar = i49Var.T;
                    if (ttVar != null) {
                        ttVar.invalidate();
                    }
                    guVar.invalidate();
                }
                int l0 = super.l0(i, oh2Var, c89Var);
                if (i > 0 && l0 == 0 && guVar.getScrollState() == 1 && i49Var.n()) {
                    ValueAnimator valueAnimator = i49Var.z0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        i49Var.z0.cancel();
                    }
                    int i2 = (i49Var.getPullingLeftProgress() > 1.0f ? 1 : (i49Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i2 > 0) {
                        f = 0.05f;
                    } else {
                        f = 0.6f;
                    }
                    i49Var.C0 = (i * f) + i49Var.C0;
                    float pullingLeftProgress3 = i49Var.getPullingLeftProgress();
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
                            guVar.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    tt ttVar2 = i49Var.T;
                    if (ttVar2 != null) {
                        ttVar2.invalidate();
                    }
                    guVar.invalidate();
                }
                return l0;
            default:
                return super.l0(i, oh2Var, c89Var);
        }
    }

    @Override
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                bg2 bg2Var = (bg2) obj;
                if (!bg2Var.R && bg2Var.O == 0 && bg2Var.F.size() == 0) {
                    return 0;
                }
                return super.n0(i, oh2Var, c89Var);
            case 5:
                wka wkaVar = (wka) obj;
                if (i > 0 && wkaVar.O != null) {
                    int i2 = 0;
                    while (i2 < i) {
                        int min = Math.min(i - i2, Math.max(1, Math.round((wkaVar.getHeight() - wkaVar.V) * 0.5f)));
                        float p = wkaVar.p();
                        if (!Float.isInfinite(p)) {
                            min = Math.min(min, Math.max(0, Math.round(p - wkaVar.V)));
                        }
                        if (min != 0) {
                            int n0 = super.n0(min, oh2Var, c89Var);
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
                return super.n0(i, oh2Var, c89Var);
            default:
                return super.n0(i, oh2Var, c89Var);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.I) {
            case 1:
                yf4 yf4Var = new yf4(this, recyclerView.getContext());
                yf4Var.a = i;
                v0(yf4Var);
                return;
            case 9:
                pic picVar = new pic(this, recyclerView.getContext());
                picVar.a = i;
                v0(picVar);
                return;
            default:
                super.u0(recyclerView, c89Var, i);
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
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).a.getHeight();
                return;
            default:
                super.y0(c89Var, iArr);
                return;
        }
    }

    public of2(byte b, Object obj, boolean z) {
        this.I = b;
        this.J = obj;
    }

    public of2(Object obj, byte b) {
        super(1, false);
        this.I = b;
        this.J = obj;
    }

    public of2(q9c q9cVar, int i) {
        super(i, false);
        this.I = (byte) 7;
        this.J = q9cVar;
    }
}
