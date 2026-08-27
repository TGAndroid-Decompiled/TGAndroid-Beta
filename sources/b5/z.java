package b5;

import d5.g0;
import h3.i2;
import h3.u2;

public final class z {

    public final int f2028a;

    public final i2[] f2029b;

    public final s[] f2030c;
    public final u2 d;

    public final Object f2031e;

    public z(i2[] i2VarArr, s[] sVarArr, u2 u2Var, u uVar) {
        this.f2029b = i2VarArr;
        this.f2030c = (s[]) sVarArr.clone();
        this.d = u2Var;
        this.f2031e = uVar;
        this.f2028a = i2VarArr.length;
    }

    public final boolean a(z zVar, int i10) {
        return zVar != null && g0.a(this.f2029b[i10], zVar.f2029b[i10]) && g0.a(this.f2030c[i10], zVar.f2030c[i10]);
    }

    public final boolean b(int i10) {
        return this.f2029b[i10] != null;
    }
}
