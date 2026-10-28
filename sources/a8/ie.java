package a8;

import android.util.SparseBooleanArray;
public abstract class ie {
    public static b2.c1 a(b2.c1 c1Var, b2.c1 c1Var2) {
        if (c1Var != null) {
            b2.v vVar = c1Var.f3160a;
            if (c1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < vVar.f3510a.size(); i10++) {
                    if (c1Var2.a(vVar.a(i10))) {
                        int a2 = vVar.a(i10);
                        yb.p(!false);
                        sparseBooleanArray.append(a2, true);
                    }
                }
                yb.p(!false);
                return new b2.c1(new b2.v(sparseBooleanArray));
            }
        }
        return b2.c1.f3158b;
    }

    public static void b(b2.g1 g1Var, m4.x xVar) {
        int i10 = xVar.f18295b;
        long j10 = xVar.f18296c;
        f9.i0 i0Var = xVar.f18294a;
        if (i10 == -1) {
            if (g1Var.o0(20)) {
                g1Var.L0(i0Var);
            } else if (!i0Var.isEmpty()) {
                g1Var.l0((b2.p0) i0Var.get(0));
            }
        } else if (g1Var.o0(20)) {
            g1Var.S(j10, xVar.f18295b, i0Var);
        } else if (!i0Var.isEmpty()) {
            g1Var.k((b2.p0) i0Var.get(0), j10);
        }
    }
}
