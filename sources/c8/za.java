package c8;

import android.util.SparseBooleanArray;
public abstract class za {
    public static e2.y0 a(e2.y0 y0Var, e2.y0 y0Var2) {
        if (y0Var != null) {
            e2.s sVar = y0Var.f10656a;
            if (y0Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i7 = 0; i7 < sVar.f10542a.size(); i7++) {
                    if (y0Var2.a(sVar.a(i7))) {
                        int a10 = sVar.a(i7);
                        a8.ia.p(!false);
                        sparseBooleanArray.append(a10, true);
                    }
                }
                a8.ia.p(!false);
                return new e2.y0(new e2.s(sparseBooleanArray));
            }
        }
        return e2.y0.f10654b;
    }

    public static void b(e2.c1 c1Var, p4.w wVar) {
        int i7 = wVar.f53367b;
        long j3 = wVar.f53368c;
        h9.i0 i0Var = wVar.f53366a;
        if (i7 == -1) {
            if (c1Var.p0(20)) {
                c1Var.N0(i0Var);
            } else if (!i0Var.isEmpty()) {
                c1Var.I((e2.l0) i0Var.get(0));
            }
        } else if (c1Var.p0(20)) {
            c1Var.V(i0Var, wVar.f53367b, j3);
        } else if (!i0Var.isEmpty()) {
            c1Var.f0((e2.l0) i0Var.get(0), j3);
        }
    }
}
