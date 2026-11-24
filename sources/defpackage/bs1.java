package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class bs1 extends k69 {
    public boolean b;
    public final yv1 d;
    public float a = 0.0f;
    public final int c = gm.L(100.0f);

    public bs1(yv1 yv1Var) {
        this.d = yv1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        yv1 yv1Var = this.d;
        if (i == 0) {
            rc2 rc2Var = yv1Var.E2;
            if (rc2Var != null) {
                yv1Var.qc(rc2Var, -1, yv1Var.F2, yv1Var.G2);
                yv1Var.E2 = null;
            }
            yv1Var.y3 = false;
            yv1Var.z3 = false;
            yv1Var.A3 = false;
            yv1Var.B3 = false;
            yv1Var.F7(true);
            yv1Var.G7(true);
            if (gda.o() == 0) {
                int i2 = yv1.xd;
                nm7.e().k(nm7.k1, 512);
            }
            nm7.e().k(nm7.m1, new Object[0]);
            yv1Var.A0.setOverScrollMode(0);
            yv1Var.u9.U();
            yv1Var.Gd(false);
            yv1Var.Pa = false;
            return;
        }
        hg5 hg5Var = yv1Var.N1;
        if (hg5Var != null && hg5Var.W) {
            hg5Var.f(true);
        }
        io ioVar = yv1Var.l3;
        if (ioVar != null && ioVar.getVisibility() == 0 && yv1Var.Y7()) {
            gm.t1(yv1Var.getParentActivity().getCurrentFocus());
        }
        yv1Var.vb = 0;
        yv1Var.wb = Integer.MIN_VALUE;
        if (i == 2) {
            yv1Var.R4 = true;
            yv1Var.A3 = true;
        } else if (i == 1) {
            yv1Var.E2 = null;
            yv1Var.R4 = true;
            yv1Var.y3 = true;
            yv1Var.z3 = true;
            yv1Var.B3 = true;
            yv1Var.A3 = true;
        }
        if (gda.o() == 0) {
            int i3 = yv1.xd;
            nm7.e().k(nm7.j1, 512);
        }
        nm7.e().k(nm7.l1, new Object[0]);
        qe2 qe2Var = yv1Var.va;
        if (qe2Var != null && qe2Var.d()) {
            yv1Var.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        yv1 yv1Var = this.d;
        yv1Var.A0.invalidate();
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        int K0 = yv1Var.C0.K0();
        mx6 mx6Var = null;
        if (((i2 != 0 && yv1Var.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && yv1Var.b5 != 0) {
            if (this.b && !yv1Var.c5) {
                if (!yv1Var.A0.W1 && K0 != -1) {
                    int M0 = yv1Var.C0.M0();
                    k47 k47Var = null;
                    while (true) {
                        if (M0 >= K0) {
                            View m = yv1Var.C0.m(M0);
                            if (m instanceof rc2) {
                                k47Var = ((rc2) m).getMessageObject();
                            } else if (m instanceof cm1) {
                                k47Var = ((cm1) m).getMessageObject();
                            }
                            if (k47Var != null && yv1Var.b5 == k47Var.e1()) {
                                z4 = true;
                                break;
                            }
                            M0--;
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    if (!z4 && k47Var != null && k47Var.e1() < yv1Var.b5) {
                        yv1Var.b5 = 0;
                    }
                }
            } else {
                yv1Var.b5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            yv1Var.c5 = false;
            if (!yv1Var.R4 && i2 != 0) {
                yv1Var.R4 = true;
            }
        }
        if (i2 != 0) {
            yv1Var.m1.getClass();
            yv1Var.H7(true);
            if (yv1Var.y3 && !yv1Var.u3) {
                if (yv1Var.d8 != Integer.MAX_VALUE) {
                    yv1Var.cb();
                    yv1Var.Gd(false);
                }
                yv1Var.hc(true);
            }
        }
        if (yv1Var.S7() && i2 != 0 && yv1Var.z3 && !yv1Var.u3) {
            if (yv1Var.d8 != Integer.MAX_VALUE) {
                yv1Var.cb();
                yv1Var.Gd(false);
            }
            yv1Var.ic(true);
        }
        yv1Var.n5(true);
        if (K0 != -1) {
            yv1Var.D0.b();
            if (K0 == 0 && yv1Var.W6[0]) {
                if (i2 >= 0) {
                    yv1Var.D9 = false;
                    yv1Var.dd();
                }
            } else {
                mx6[] mx6VarArr = yv1Var.y1.e;
                if (1 < mx6VarArr.length) {
                    mx6Var = mx6VarArr[1];
                }
                if (mx6Var != null && ((fn0) mx6Var.c).f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i3 = this.c;
                if (i2 > 0) {
                    if (!z3) {
                        float f = this.a + i2;
                        this.a = f;
                        if (f > i3) {
                            this.a = 0.0f;
                            yv1Var.D9 = true;
                            yv1Var.dd();
                            yv1Var.z1 = true;
                        }
                    }
                } else if (yv1Var.z1 && z3) {
                    float f2 = this.a + i2;
                    this.a = f2;
                    if (f2 < (-i3)) {
                        yv1Var.D9 = false;
                        yv1Var.dd();
                        this.a = 0.0f;
                    }
                }
            }
        }
        yv1Var.Q7();
        yv1Var.u9.F();
        ArrayList arrayList = yv1Var.Ua.G;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (!((jw3) arrayList.get(i4)).c) {
                ((jw3) arrayList.get(i4)).b -= i2;
            }
        }
        g39 g39Var = g39.B;
        if (g39Var != null) {
            g39Var.r -= i2;
            if (i2 != 0) {
                g39Var.u = true;
            }
        }
        yv1Var.v5(false);
        hg5 hg5Var = yv1Var.M1;
        if (hg5Var != null) {
            if (hg5Var.W) {
                hg5Var.f(true);
            } else if (!yv1Var.Jc) {
                yv1Var.Ic = System.currentTimeMillis();
                gm.r(new pp1(yv1Var, (byte) 5));
                gm.d3(new pp1(yv1Var, (byte) 6), 2000L);
            }
        }
        xt1 xt1Var = yv1Var.Q1;
        if (xt1Var != null && xt1Var.W) {
            xt1Var.f(true);
        }
        hg5 hg5Var2 = yv1Var.O1;
        if (hg5Var2 != null && hg5Var2.W) {
            hg5Var2.f(true);
        } else {
            gm.r(new pp1(yv1Var, (byte) 7));
            gm.d3(new pp1(yv1Var, (byte) 8), 2000L);
        }
        hg5 hg5Var3 = yv1Var.P1;
        if (hg5Var3 != null) {
            hg5Var3.f(true);
        }
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            ms1Var.I0();
        }
        kta ktaVar = yv1Var.id;
        if (ktaVar != null) {
            ktaVar.invalidate();
        }
        hw1 hw1Var = yv1Var.Ec;
        if (hw1Var != null && hw1Var.b > 0) {
            int childCount = hw1Var.a.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = hw1Var.a.getChildAt(i5);
                if (childAt instanceof rc2) {
                    z2 = hw1Var.a(((rc2) childAt).getMessageObject());
                } else if (childAt instanceof cm1) {
                    z2 = hw1Var.a(((cm1) childAt).getMessageObject());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            hw1Var.b(0, 0L);
        }
    }
}
