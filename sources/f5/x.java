package f5;

import h5.d0;
import j3.g2;
import j3.q2;
public final class x {
    public final int f5989a;
    public final g2[] f5990b;
    public final c[] f5991c;
    public final q2 d;
    public final Object e;

    public x(g2[] g2VarArr, c[] cVarArr, q2 q2Var, s sVar) {
        this.f5990b = g2VarArr;
        this.f5991c = (c[]) cVarArr.clone();
        this.d = q2Var;
        this.e = sVar;
        this.f5989a = g2VarArr.length;
    }

    public final boolean a(x xVar, int i10) {
        if (xVar == null || !d0.a(this.f5990b[i10], xVar.f5990b[i10]) || !d0.a(this.f5991c[i10], xVar.f5991c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f5990b[i10] != null) {
            return true;
        }
        return false;
    }
}
