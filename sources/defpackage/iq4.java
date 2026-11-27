package defpackage;

import java.util.ArrayList;
public final class iq4 implements hq4 {
    public final int a;
    public final kq4 b;

    public iq4(kq4 kq4Var, int i) {
        this.b = kq4Var;
        this.a = i;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        kq4 kq4Var = this.b;
        gp4 gp4Var = kq4Var.z;
        int i = this.a;
        if (gp4Var != null && i < 0 && gp4Var.l().T(-1, 0)) {
            return false;
        }
        return kq4Var.U(arrayList, arrayList2, i, 1);
    }
}
