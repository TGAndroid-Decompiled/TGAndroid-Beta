package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class pq1 extends i49 {
    public boolean b;
    public final mu1 d;
    public float a = 0.0f;
    public final int c = gl.L(100.0f);

    public pq1(mu1 mu1Var) {
        this.d = mu1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        mu1 mu1Var = this.d;
        if (i == 0) {
            gb2 gb2Var = mu1Var.E2;
            if (gb2Var != null) {
                mu1Var.cc(gb2Var, -1, mu1Var.F2, mu1Var.G2);
                mu1Var.E2 = null;
            }
            mu1Var.y3 = false;
            mu1Var.z3 = false;
            mu1Var.A3 = false;
            mu1Var.B3 = false;
            mu1Var.v7(true);
            mu1Var.w7(true);
            if (gba.o() == 0) {
                int i2 = mu1.md;
                kk7.e().k(kk7.j1, 512);
            }
            kk7.e().k(kk7.l1, new Object[0]);
            mu1Var.A0.setOverScrollMode(0);
            mu1Var.u9.U();
            mu1Var.sd(false);
            mu1Var.Pa = false;
            return;
        }
        je5 je5Var = mu1Var.N1;
        if (je5Var != null && je5Var.W) {
            je5Var.f(true);
        }
        hn hnVar = mu1Var.l3;
        if (hnVar != null && hnVar.getVisibility() == 0 && mu1Var.O7()) {
            gl.t1(mu1Var.getParentActivity().getCurrentFocus());
        }
        if (i == 2) {
            mu1Var.R4 = true;
            mu1Var.A3 = true;
        } else if (i == 1) {
            mu1Var.E2 = null;
            mu1Var.R4 = true;
            mu1Var.y3 = true;
            mu1Var.z3 = true;
            mu1Var.B3 = true;
            mu1Var.A3 = true;
        }
        if (gba.o() == 0) {
            int i3 = mu1.md;
            kk7.e().k(kk7.i1, 512);
        }
        kk7.e().k(kk7.k1, new Object[0]);
        fd2 fd2Var = mu1Var.va;
        if (fd2Var != null && fd2Var.d()) {
            mu1Var.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        mu1 mu1Var = this.d;
        mu1Var.A0.invalidate();
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        int K0 = mu1Var.C0.K0();
        mv6 mv6Var = null;
        if (((i2 != 0 && mu1Var.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && mu1Var.b5 != 0) {
            if (this.b && !mu1Var.c5) {
                if (!mu1Var.A0.W1 && K0 != -1) {
                    int M0 = mu1Var.C0.M0();
                    k27 k27Var = null;
                    while (true) {
                        if (M0 >= K0) {
                            View m = mu1Var.C0.m(M0);
                            if (m instanceof gb2) {
                                k27Var = ((gb2) m).getMessageObject();
                            } else if (m instanceof uk1) {
                                k27Var = ((uk1) m).getMessageObject();
                            }
                            if (k27Var != null && mu1Var.b5 == k27Var.e1()) {
                                z4 = true;
                                break;
                            }
                            M0--;
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    if (!z4 && k27Var != null && k27Var.e1() < mu1Var.b5) {
                        mu1Var.b5 = 0;
                    }
                }
            } else {
                mu1Var.b5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            mu1Var.c5 = false;
            if (!mu1Var.R4 && i2 != 0) {
                mu1Var.R4 = true;
            }
        }
        if (i2 != 0) {
            mu1Var.m1.getClass();
            mu1Var.x7(true);
            if (mu1Var.y3 && !mu1Var.u3) {
                if (mu1Var.d8 != Integer.MAX_VALUE) {
                    mu1Var.Qa();
                    mu1Var.sd(false);
                }
                mu1Var.Tb(true);
            }
        }
        if (mu1Var.I7() && i2 != 0 && mu1Var.z3 && !mu1Var.u3) {
            if (mu1Var.d8 != Integer.MAX_VALUE) {
                mu1Var.Qa();
                mu1Var.sd(false);
            }
            mu1Var.Ub(true);
        }
        mu1Var.f5(true);
        if (K0 != -1) {
            mu1Var.D0.b();
            if (K0 == 0 && mu1Var.W6[0]) {
                if (i2 >= 0) {
                    mu1Var.D9 = false;
                    mu1Var.Pc();
                }
            } else {
                mv6[] mv6VarArr = mu1Var.y1.e;
                if (1 < mv6VarArr.length) {
                    mv6Var = mv6VarArr[1];
                }
                if (mv6Var != null && ((fm0) mv6Var.c).f) {
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
                            mu1Var.D9 = true;
                            mu1Var.Pc();
                            mu1Var.z1 = true;
                        }
                    }
                } else if (mu1Var.z1 && z3) {
                    float f2 = this.a + i2;
                    this.a = f2;
                    if (f2 < (-i3)) {
                        mu1Var.D9 = false;
                        mu1Var.Pc();
                        this.a = 0.0f;
                    }
                }
            }
        }
        mu1Var.G7();
        mu1Var.u9.F();
        ArrayList arrayList = mu1Var.Ua.G;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (!((yu3) arrayList.get(i4)).c) {
                ((yu3) arrayList.get(i4)).b -= i2;
            }
        }
        d19 d19Var = d19.B;
        if (d19Var != null) {
            d19Var.r -= i2;
            if (i2 != 0) {
                d19Var.u = true;
            }
        }
        mu1Var.n5(false);
        je5 je5Var = mu1Var.M1;
        if (je5Var != null) {
            if (je5Var.W) {
                je5Var.f(true);
            } else if (!mu1Var.zc) {
                mu1Var.yc = System.currentTimeMillis();
                gl.r(new ho1(mu1Var, (byte) 1));
                gl.e3(new ho1(mu1Var, (byte) 2), 2000L);
            }
        }
        ks1 ks1Var = mu1Var.Q1;
        if (ks1Var != null && ks1Var.W) {
            ks1Var.f(true);
        }
        je5 je5Var2 = mu1Var.O1;
        if (je5Var2 != null && je5Var2.W) {
            je5Var2.f(true);
        } else {
            gl.r(new ho1(mu1Var, (byte) 3));
            gl.e3(new ho1(mu1Var, (byte) 4), 2000L);
        }
        je5 je5Var3 = mu1Var.P1;
        if (je5Var3 != null) {
            je5Var3.f(true);
        }
        ar1 ar1Var = mu1Var.a0;
        if (ar1Var != null) {
            ar1Var.I0();
        }
        jra jraVar = mu1Var.Xc;
        if (jraVar != null) {
            jraVar.invalidate();
        }
        vu1 vu1Var = mu1Var.uc;
        if (vu1Var != null && vu1Var.b > 0) {
            int childCount = vu1Var.a.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = vu1Var.a.getChildAt(i5);
                if (childAt instanceof gb2) {
                    z2 = vu1Var.a(((gb2) childAt).getMessageObject());
                } else if (childAt instanceof uk1) {
                    z2 = vu1Var.a(((uk1) childAt).getMessageObject());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            vu1Var.b(0, 0L);
        }
    }
}
