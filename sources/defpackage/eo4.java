package defpackage;

import java.util.ArrayList;
public final class eo4 implements do4 {
    public final int a;
    public final go4 b;

    public eo4(go4 go4Var, int i) {
        this.b = go4Var;
        this.a = i;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        go4 go4Var = this.b;
        bn4 bn4Var = go4Var.z;
        int i = this.a;
        if (bn4Var != null && i < 0 && bn4Var.l().T(-1, 0)) {
            return false;
        }
        return go4Var.U(arrayList, arrayList2, i, 1);
    }
}
