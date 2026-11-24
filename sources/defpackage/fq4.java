package defpackage;

import java.util.ArrayList;
public final class fq4 implements eq4 {
    public final int a;
    public final hq4 b;

    public fq4(hq4 hq4Var, int i) {
        this.b = hq4Var;
        this.a = i;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        hq4 hq4Var = this.b;
        dp4 dp4Var = hq4Var.z;
        int i = this.a;
        if (dp4Var != null && i < 0 && dp4Var.l().T(-1, 0)) {
            return false;
        }
        return hq4Var.U(arrayList, arrayList2, i, 1);
    }
}
