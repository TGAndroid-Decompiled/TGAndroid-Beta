package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zq1 extends v55 {
    public boolean S;
    public final zu1 T;

    public zq1(zu1 zu1Var, boolean z) {
        super(z);
        this.T = zu1Var;
    }

    @Override
    public final boolean A1(View view) {
        if (view instanceof wb2) {
            return !((wb2) view).getMessageObject().O3();
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
    public final void a0(oh2 oh2Var, c89 c89Var) {
        wq1 wq1Var;
        it1 it1Var;
        int i;
        zu1 zu1Var = this.T;
        int i2 = zu1Var.wb;
        if (i2 != 0 && zu1Var.xb != Integer.MIN_VALUE && (wq1Var = zu1Var.A0) != null && (it1Var = zu1Var.D0) != null && !it1Var.O && !wq1Var.W1) {
            r47 r47Var = (r47) zu1Var.G6[0].get(i2);
            if (r47Var != null) {
                i = zu1Var.M6.indexOf(r47Var);
            } else {
                i = -1;
            }
            if (i >= 0) {
                this.y = zu1Var.D0.K + i;
                this.A = zu1Var.xb - zu1Var.A0.getPaddingTop();
                this.z = false;
                w46 w46Var = this.B;
                if (w46Var != null) {
                    w46Var.a = -1;
                }
            }
        }
        boolean z = f11.a;
        try {
            super.a0(oh2Var, c89Var);
        } catch (Exception e) {
            cc4.g(e, true);
            hl.c3(new go1(this, (byte) 5));
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
    public final int j(c89 c89Var) {
        this.S = true;
        int A0 = A0(c89Var);
        this.S = false;
        return A0;
    }

    @Override
    public final int k(c89 c89Var) {
        this.S = true;
        int B0 = B0(c89Var);
        this.S = false;
        return B0;
    }

    @Override
    public final int l(c89 c89Var) {
        this.S = true;
        int C0 = C0(c89Var);
        this.S = false;
        return C0;
    }

    @Override
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        int i2;
        boolean z;
        int i3;
        float f;
        int b;
        int i4;
        boolean z2 = false;
        zu1 zu1Var = this.T;
        if (i < 0) {
            float f2 = zu1Var.ka;
            if (f2 != 0.0f) {
                float f3 = f2 + i;
                zu1Var.ka = f3;
                if (f3 < 0.0f) {
                    i = (int) f3;
                    zu1Var.ka = 0.0f;
                    zu1Var.A0.invalidate();
                } else {
                    i = 0;
                }
            }
        }
        int childCount = zu1Var.A0.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount) {
                View childAt = zu1Var.A0.getChildAt(i5);
                float f4 = zu1Var.P9;
                zu1Var.A0.getClass();
                int S = RecyclerView.S(childAt);
                if (zu1Var.nb) {
                    b = 0;
                } else {
                    b = zu1Var.D0.b() - 1;
                }
                if (S == b) {
                    if (childAt.getTop() - i > f4) {
                        i4 = (int) (childAt.getTop() - f4);
                    } else {
                        i4 = i;
                    }
                    i2 = super.n0(i4, oh2Var, c89Var);
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
            i2 = super.n0(i, oh2Var, c89Var);
        }
        if (!zu1Var.sd.f) {
            SparseArray[] sparseArrayArr = zu1Var.o6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i > 0 && i2 == 0 && (((xc2.T(zu1Var.e) && !zu1Var.e.megagroup) || (zu1Var.x4 && !lbc.w(zu1Var.f))) && (i3 = zu1Var.g4) != 3 && i3 != 9 && i3 != 1 && zu1Var.A0.getScrollState() == 1)) {
                wq1 wq1Var = zu1Var.A0;
                if (!wq1Var.W1 && !wq1Var.c2 && !zu1Var.c8()) {
                    if (zu1Var.ka == 0.0f && zu1Var.ma != null) {
                        ArrayList arrayList = zu1Var.Qb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            zu1Var.ma.g((TLRPC.Chat) zu1Var.Qb.get(0));
                        } else {
                            boolean z3 = zu1Var.x4;
                            ad2 ad2Var = zu1Var.ma;
                            if (z3) {
                                ad2Var.h();
                            } else {
                                ad2Var.f();
                            }
                        }
                    }
                    Animator animator = zu1Var.na;
                    if (animator != null) {
                        animator.removeAllListeners();
                        zu1Var.na.cancel();
                    }
                    int i6 = (zu1Var.ka > hl.L(110.0f) ? 1 : (zu1Var.ka == hl.L(110.0f) ? 0 : -1));
                    float f5 = zu1Var.ka;
                    if (i6 < 0) {
                        float L = f5 / hl.L(110.0f);
                        f = (L * 0.45f) + ((1.0f - L) * 0.65f);
                    } else {
                        int i7 = (f5 > hl.L(160.0f) ? 1 : (f5 == hl.L(160.0f) ? 0 : -1));
                        f = 0.05f;
                        if (i7 < 0) {
                            float L2 = (zu1Var.ka - hl.L(110.0f)) / hl.L(50.0f);
                            f = (L2 * 0.05f) + ((1.0f - L2) * 0.45f);
                        }
                    }
                    float f6 = i * f;
                    zu1Var.ka += f6;
                    int i8 = (int) f6;
                    s49 s49Var = s49.B;
                    if (s49Var != null) {
                        s49Var.r -= i8;
                        if (i8 != 0) {
                            s49Var.u = true;
                        }
                    }
                    zu1Var.A0.invalidate();
                }
            }
        }
        int i9 = (zu1Var.ka > 0.0f ? 1 : (zu1Var.ka == 0.0f ? 0 : -1));
        wq1 wq1Var2 = zu1Var.A0;
        if (i9 == 0) {
            wq1Var2.setOverScrollMode(0);
        } else {
            wq1Var2.setOverScrollMode(2);
        }
        if (zu1Var.ma != null) {
            fm0 fm0Var = zu1Var.qd;
            if (zu1Var.ka > 0.0f && zu1Var.A0.getScrollState() == 1) {
                z2 = true;
            }
            fm0Var.a(z2, true);
        }
        return i2;
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        this.T.Pa = false;
        z46 z46Var = new z46(recyclerView.getContext(), 0);
        z46Var.a = i;
        v0(z46Var);
    }

    @Override
    public final boolean x0() {
        return true;
    }

    @Override
    public final boolean z1(int i) {
        int i2;
        r47 r47Var;
        m47 v7;
        byte b;
        zu1 zu1Var = this.T;
        it1 it1Var = zu1Var.D0;
        int i3 = it1Var.K;
        if (i >= i3 && i < it1Var.L && (i2 = i - i3) >= 0 && i2 < it1Var.G().size() && (v7 = zu1Var.v7((r47Var = (r47) zu1Var.D0.G().get(i2)))) != null) {
            ArrayList arrayList = v7.e;
            j47 d = v7.d(r47Var);
            if (d.a != d.b && (b = d.c) == d.d && b != 0) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    j47 j47Var = (j47) arrayList.get(i4);
                    if (j47Var != d) {
                        byte b2 = j47Var.c;
                        byte b3 = d.c;
                        if (b2 <= b3 && j47Var.d >= b3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
