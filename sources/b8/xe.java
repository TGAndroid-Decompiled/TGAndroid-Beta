package b8;

import android.util.SparseBooleanArray;
public abstract class xe {
    public static d2.a1 a(d2.a1 a1Var, d2.a1 a1Var2) {
        if (a1Var != null) {
            d2.t tVar = a1Var.f8026a;
            if (a1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i3 = 0; i3 < tVar.f8412a.size(); i3++) {
                    if (a1Var2.a(tVar.a(i3))) {
                        int a10 = tVar.a(i3);
                        zb.p(!false);
                        sparseBooleanArray.append(a10, true);
                    }
                }
                zb.p(!false);
                return new d2.a1(new d2.t(sparseBooleanArray));
            }
        }
        return d2.a1.f8024b;
    }

    public static void b(d2.e1 e1Var, o4.w wVar) {
        int i3 = wVar.f20885b;
        long j10 = wVar.f20886c;
        g9.i0 i0Var = wVar.f20884a;
        if (i3 == -1) {
            if (e1Var.m0(20)) {
                e1Var.M0(i0Var);
            } else if (!i0Var.isEmpty()) {
                e1Var.x0((d2.n0) i0Var.get(0));
            }
        } else if (e1Var.m0(20)) {
            e1Var.T(i0Var, wVar.f20885b, j10);
        } else if (!i0Var.isEmpty()) {
            e1Var.o((d2.n0) i0Var.get(0), j10);
        }
    }
}
