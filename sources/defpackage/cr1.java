package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public final class cr1 extends v79 {
    public boolean b;
    public final zu1 d;
    public float a = 0.0f;
    public final int c = hl.L(100.0f);

    public cr1(zu1 zu1Var) {
        this.d = zu1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        zu1 zu1Var = this.d;
        if (i == 0) {
            wb2 wb2Var = zu1Var.E2;
            if (wb2Var != null) {
                zu1Var.qc(wb2Var, -1, zu1Var.F2, zu1Var.G2);
                zu1Var.E2 = null;
            }
            zu1Var.y3 = false;
            zu1Var.z3 = false;
            zu1Var.A3 = false;
            zu1Var.B3 = false;
            zu1Var.F7(true);
            zu1Var.G7(true);
            if (xea.o() == 0) {
                int i2 = zu1.Ad;
                jn7.e().k(jn7.k1, 512);
            }
            jn7.e().k(jn7.m1, new Object[0]);
            zu1Var.A0.setOverScrollMode(0);
            zu1Var.u9.U();
            zu1Var.Gd(false);
            zu1Var.Pa = false;
            return;
        }
        kg5 kg5Var = zu1Var.N1;
        if (kg5Var != null && kg5Var.W) {
            kg5Var.f(true);
        }
        in inVar = zu1Var.l3;
        if (inVar != null && inVar.getVisibility() == 0 && zu1Var.Y7()) {
            hl.t1(zu1Var.getParentActivity().getCurrentFocus());
        }
        zu1Var.wb = 0;
        zu1Var.xb = Integer.MIN_VALUE;
        if (i == 2) {
            zu1Var.R4 = true;
            zu1Var.A3 = true;
        } else if (i == 1) {
            zu1Var.E2 = null;
            zu1Var.R4 = true;
            zu1Var.y3 = true;
            zu1Var.z3 = true;
            zu1Var.B3 = true;
            zu1Var.A3 = true;
        }
        if (xea.o() == 0) {
            int i3 = zu1.Ad;
            jn7.e().k(jn7.j1, 512);
        }
        jn7.e().k(jn7.l1, new Object[0]);
        wd2 wd2Var = zu1Var.va;
        if (wd2Var != null && wd2Var.d()) {
            zu1Var.va.setHiddenByScroll(true);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        zu1 zu1Var = this.d;
        zu1Var.A0.invalidate();
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        int K0 = zu1Var.C0.K0();
        rx6 rx6Var = null;
        if (((i2 != 0 && zu1Var.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && zu1Var.b5 != 0) {
            if (this.b && !zu1Var.c5) {
                if (!zu1Var.A0.W1 && K0 != -1) {
                    int M0 = zu1Var.C0.M0();
                    r47 r47Var = null;
                    while (true) {
                        if (M0 >= K0) {
                            View m = zu1Var.C0.m(M0);
                            if (m instanceof wb2) {
                                r47Var = ((wb2) m).getMessageObject();
                            } else if (m instanceof dl1) {
                                r47Var = ((dl1) m).getMessageObject();
                            }
                            if (r47Var != null && zu1Var.b5 == r47Var.e1()) {
                                z4 = true;
                                break;
                            }
                            M0--;
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                    if (!z4 && r47Var != null && r47Var.e1() < zu1Var.b5) {
                        zu1Var.b5 = 0;
                    }
                }
            } else {
                zu1Var.b5 = 0;
            }
        }
        if (recyclerView.getScrollState() == 1) {
            zu1Var.c5 = false;
            if (!zu1Var.R4 && i2 != 0) {
                zu1Var.R4 = true;
            }
        }
        if (i2 != 0) {
            zu1Var.m1.getClass();
            zu1Var.H7(true);
            if (zu1Var.y3 && !zu1Var.u3) {
                if (zu1Var.d8 != Integer.MAX_VALUE) {
                    zu1Var.db();
                    zu1Var.Gd(false);
                }
                zu1Var.hc(true);
            }
        }
        if (zu1Var.S7() && i2 != 0 && zu1Var.z3 && !zu1Var.u3) {
            if (zu1Var.d8 != Integer.MAX_VALUE) {
                zu1Var.db();
                zu1Var.Gd(false);
            }
            zu1Var.ic(true);
        }
        zu1Var.m5(true);
        if (K0 != -1) {
            zu1Var.D0.b();
            if (K0 == 0 && zu1Var.W6[0]) {
                if (i2 >= 0) {
                    zu1Var.D9 = false;
                    zu1Var.dd();
                }
            } else {
                rx6[] rx6VarArr = zu1Var.y1.e;
                if (1 < rx6VarArr.length) {
                    rx6Var = rx6VarArr[1];
                }
                if (rx6Var != null && ((fm0) rx6Var.c).f) {
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
                            zu1Var.D9 = true;
                            zu1Var.dd();
                            zu1Var.z1 = true;
                        }
                    }
                } else if (zu1Var.z1 && z3) {
                    float f2 = this.a + i2;
                    this.a = f2;
                    if (f2 < (-i3)) {
                        zu1Var.D9 = false;
                        zu1Var.dd();
                        this.a = 0.0f;
                    }
                }
            }
        }
        zu1Var.Q7();
        zu1Var.u9.F();
        ArrayList arrayList = zu1Var.Ua.G;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (!((sv3) arrayList.get(i4)).c) {
                ((sv3) arrayList.get(i4)).b -= i2;
            }
        }
        s49 s49Var = s49.B;
        if (s49Var != null) {
            s49Var.r -= i2;
            if (i2 != 0) {
                s49Var.u = true;
            }
        }
        zu1Var.u5(false);
        kg5 kg5Var = zu1Var.M1;
        if (kg5Var != null) {
            if (kg5Var.W) {
                kg5Var.f(true);
            } else if (!zu1Var.Kc) {
                zu1Var.Jc = System.currentTimeMillis();
                hl.r(new zo1(zu1Var, (byte) 5));
                hl.d3(new zo1(zu1Var, (byte) 5), 2000L);
            }
        }
        ys1 ys1Var = zu1Var.Q1;
        if (ys1Var != null && ys1Var.W) {
            ys1Var.f(true);
        }
        kg5 kg5Var2 = zu1Var.O1;
        if (kg5Var2 != null && kg5Var2.W) {
            kg5Var2.f(true);
        } else {
            hl.r(new zo1(zu1Var, (byte) 6));
            hl.d3(new zo1(zu1Var, (byte) 6), 2000L);
        }
        kg5 kg5Var3 = zu1Var.P1;
        if (kg5Var3 != null) {
            kg5Var3.f(true);
        }
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            nr1Var.M0();
        }
        lva lvaVar = zu1Var.ld;
        if (lvaVar != null) {
            lvaVar.invalidate();
        }
        iv1 iv1Var = zu1Var.Fc;
        if (iv1Var != null && iv1Var.b > 0) {
            int childCount = iv1Var.a.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = iv1Var.a.getChildAt(i5);
                if (childAt instanceof wb2) {
                    z2 = iv1Var.a(((wb2) childAt).getMessageObject());
                } else if (childAt instanceof dl1) {
                    z2 = iv1Var.a(((dl1) childAt).getMessageObject());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            iv1Var.b(0, 0L);
        }
    }
}
