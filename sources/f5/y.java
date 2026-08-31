package f5;

import h5.d0;
import j3.g2;
import j3.q2;
public final class y {
    public final int f6107a;
    public final g2[] f6108b;
    public final c[] f6109c;
    public final q2 d;
    public final Object f6110e;

    public y(g2[] g2VarArr, c[] cVarArr, q2 q2Var, s sVar) {
        this.f6108b = g2VarArr;
        this.f6109c = (c[]) cVarArr.clone();
        this.d = q2Var;
        this.f6110e = sVar;
        this.f6107a = g2VarArr.length;
    }

    public final boolean a(y yVar, int i10) {
        if (yVar == null || !d0.a(this.f6108b[i10], yVar.f6108b[i10]) || !d0.a(this.f6109c[i10], yVar.f6109c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f6108b[i10] != null) {
            return true;
        }
        return false;
    }
}
