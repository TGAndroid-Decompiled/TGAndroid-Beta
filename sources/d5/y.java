package d5;

import f5.d0;
import j3.i2;
import j3.t2;
public final class y {
    public final int f5417a;
    public final i2[] f5418b;
    public final r[] f5419c;
    public final t2 d;
    public final Object f5420e;

    public y(i2[] i2VarArr, r[] rVarArr, t2 t2Var, t tVar) {
        this.f5418b = i2VarArr;
        this.f5419c = (r[]) rVarArr.clone();
        this.d = t2Var;
        this.f5420e = tVar;
        this.f5417a = i2VarArr.length;
    }

    public final boolean a(y yVar, int i10) {
        if (yVar == null || !d0.a(this.f5418b[i10], yVar.f5418b[i10]) || !d0.a(this.f5419c[i10], yVar.f5419c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f5418b[i10] != null) {
            return true;
        }
        return false;
    }
}
