package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yr1 extends r55 {
    public boolean S;
    public final yv1 T;

    public yr1(yv1 yv1Var, boolean z) {
        super(z);
        this.T = yv1Var;
    }

    @Override
    public final boolean A1(View view) {
        if (view instanceof rc2) {
            return !((rc2) view).getMessageObject().O3();
        }
        return false;
    }

    @Override
    public final int F() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return 0;
    }

    @Override
    public final int I() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return E();
    }

    @Override
    public final int J() {
        if (this.S) {
            return (int) ((this.n - this.T.P9) - B());
        }
        return super.J();
    }

    @Override
    public final int W0() {
        return (int) this.T.P9;
    }

    @Override
    public final void a0(ki2 ki2Var, r69 r69Var) {
        vr1 vr1Var;
        hu1 hu1Var;
        int i;
        yv1 yv1Var = this.T;
        int i2 = yv1Var.vb;
        if (i2 != 0 && yv1Var.wb != Integer.MIN_VALUE && (vr1Var = yv1Var.A0) != null && (hu1Var = yv1Var.D0) != null && !hu1Var.O && !vr1Var.W1) {
            k47 k47Var = (k47) yv1Var.G6[0].get(i2);
            if (k47Var != null) {
                i = yv1Var.M6.indexOf(k47Var);
            } else {
                i = -1;
            }
            if (i >= 0) {
                this.y = yv1Var.D0.K + i;
                this.A = yv1Var.wb - yv1Var.A0.getPaddingTop();
                this.z = false;
                t46 t46Var = this.B;
                if (t46Var != null) {
                    t46Var.a = -1;
                }
            }
        }
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (Exception e) {
            fc4.g(e, true);
            gm.c3(new fo1(this, (byte) 5));
        }
    }

    @Override
    public final void h1(int i, int i2, boolean z) {
        if (!z) {
            i2 = (int) ((i2 - E()) + this.T.P9);
        }
        super.h1(i, i2, z);
    }

    @Override
    public final int j(r69 r69Var) {
        this.S = true;
        int A0 = A0(r69Var);
        this.S = false;
        return A0;
    }

    @Override
    public final int k(r69 r69Var) {
        this.S = true;
        int B0 = B0(r69Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int l(r69 r69Var) {
        this.S = true;
        int C0 = C0(r69Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int i2;
        boolean z;
        int i3;
        float f;
        int b;
        int i4;
        boolean z2 = false;
        yv1 yv1Var = this.T;
        if (i < 0) {
            float f2 = yv1Var.ka;
            if (f2 != 0.0f) {
                float f3 = f2 + i;
                yv1Var.ka = f3;
                if (f3 < 0.0f) {
                    i = (int) f3;
                    yv1Var.ka = 0.0f;
                    yv1Var.A0.invalidate();
                } else {
                    i = 0;
                }
            }
        }
        int childCount = yv1Var.A0.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount) {
                View childAt = yv1Var.A0.getChildAt(i5);
                float f4 = yv1Var.P9;
                yv1Var.A0.getClass();
                int R = RecyclerView.R(childAt);
                if (yv1Var.nb) {
                    b = 0;
                } else {
                    b = yv1Var.D0.b() - 1;
                }
                if (R == b) {
                    if (childAt.getTop() - i > f4) {
                        i4 = (int) (childAt.getTop() - f4);
                    } else {
                        i4 = i;
                    }
                    i2 = super.n0(i4, ki2Var, r69Var);
                    z = true;
                } else {
                    i5++;
                }
            } else {
                i2 = 0;
                z = false;
                break;
            }
        }
        if (!z) {
            i2 = super.n0(i, ki2Var, r69Var);
        }
        if (!yv1Var.pd.f) {
            SparseArray[] sparseArrayArr = yv1Var.o6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i > 0 && i2 == 0 && (((sd2.T(yv1Var.e) && !yv1Var.e.megagroup) || (yv1Var.x4 && !m9c.w(yv1Var.f))) && (i3 = yv1Var.g4) != 3 && i3 != 9 && i3 != 1 && yv1Var.A0.getScrollState() == 1)) {
                vr1 vr1Var = yv1Var.A0;
                if (!vr1Var.W1 && !vr1Var.c2 && !yv1Var.c8()) {
                    if (yv1Var.ka == 0.0f && yv1Var.ma != null) {
                        ArrayList arrayList = yv1Var.Nb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            yv1Var.ma.g((TLRPC.Chat) yv1Var.Nb.get(0));
                        } else {
                            boolean z3 = yv1Var.x4;
                            vd2 vd2Var = yv1Var.ma;
                            if (z3) {
                                vd2Var.h();
                            } else {
                                vd2Var.f();
                            }
                        }
                    }
                    Animator animator = yv1Var.na;
                    if (animator != null) {
                        animator.removeAllListeners();
                        yv1Var.na.cancel();
                    }
                    int i6 = (yv1Var.ka > gm.L(110.0f) ? 1 : (yv1Var.ka == gm.L(110.0f) ? 0 : -1));
                    float f5 = yv1Var.ka;
                    if (i6 < 0) {
                        float L = f5 / gm.L(110.0f);
                        f = (L * 0.45f) + ((1.0f - L) * 0.65f);
                    } else {
                        int i7 = (f5 > gm.L(160.0f) ? 1 : (f5 == gm.L(160.0f) ? 0 : -1));
                        f = 0.05f;
                        if (i7 < 0) {
                            float L2 = (yv1Var.ka - gm.L(110.0f)) / gm.L(50.0f);
                            f = (L2 * 0.05f) + ((1.0f - L2) * 0.45f);
                        }
                    }
                    float f6 = i * f;
                    yv1Var.ka += f6;
                    int i8 = (int) f6;
                    g39 g39Var = g39.B;
                    if (g39Var != null) {
                        g39Var.r -= i8;
                        if (i8 != 0) {
                            g39Var.u = true;
                        }
                    }
                    yv1Var.A0.invalidate();
                }
            }
        }
        int i9 = (yv1Var.ka > 0.0f ? 1 : (yv1Var.ka == 0.0f ? 0 : -1));
        vr1 vr1Var2 = yv1Var.A0;
        if (i9 == 0) {
            vr1Var2.setOverScrollMode(0);
        } else {
            vr1Var2.setOverScrollMode(2);
        }
        if (yv1Var.ma != null) {
            fn0 fn0Var = yv1Var.nd;
            if (yv1Var.ka > 0.0f && yv1Var.A0.getScrollState() == 1) {
                z2 = true;
            }
            fn0Var.a(z2, true);
        }
        return i2;
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        this.T.Pa = false;
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }

    @Override
    public final boolean x0() {
        return true;
    }

    @Override
    public final boolean z1(int i) {
        int i2;
        k47 k47Var;
        f47 v7;
        byte b;
        yv1 yv1Var = this.T;
        hu1 hu1Var = yv1Var.D0;
        int i3 = hu1Var.K;
        if (i >= i3 && i < hu1Var.L && (i2 = i - i3) >= 0 && i2 < hu1Var.G().size() && (v7 = yv1Var.v7((k47Var = (k47) yv1Var.D0.G().get(i2)))) != null) {
            ArrayList arrayList = v7.e;
            c47 d = v7.d(k47Var);
            if (d.a != d.b && (b = d.c) == d.d && b != 0) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c47 c47Var = (c47) arrayList.get(i4);
                    if (c47Var != d) {
                        byte b2 = c47Var.c;
                        byte b3 = d.c;
                        if (b2 <= b3 && c47Var.d >= b3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
